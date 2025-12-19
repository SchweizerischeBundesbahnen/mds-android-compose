@file:OptIn(ExperimentalComposeUiApi::class)

package ch.sbb.compose_mds.beta.text

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.hideFromAccessibility
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.beta.ExperimentalSBBComponent
import ch.sbb.compose_mds.theme.PrimitiveColors

@ExperimentalSBBComponent
@Composable
fun SBBTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: ImageVector? = null,
    trailingIcon: ImageVector? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    errorText: String? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val isFocused by interactionSource.collectIsFocusedAsState()

    val inputTextColor = when {
        !enabled -> themedValue(PrimitiveColors.granite, PrimitiveColors.graphite)
        isError -> themedValue(PrimitiveColors.red, PrimitiveColors.redDarkMode)
        else -> themedValue(PrimitiveColors.black, PrimitiveColors.white)
    }

    val labelColor = themedValue(PrimitiveColors.granite, PrimitiveColors.graphite)

    val indicatorColor = when {
        isError -> PrimitiveColors.red
        isFocused -> themedValue(PrimitiveColors.black, PrimitiveColors.white)
        else -> themedValue(PrimitiveColors.cloud, PrimitiveColors.iron)
    }

    val placeholderColor = themedValue(PrimitiveColors.granite, PrimitiveColors.graphite)
    val cursorColor = Color(0xFF007AFF)

    val selectionColors = TextSelectionColors(
        handleColor = PrimitiveColors.red,
        backgroundColor = PrimitiveColors.red.copy(alpha = 0.38f)
    )

    val iconColor = when {
        !enabled -> themedValue(PrimitiveColors.granite, PrimitiveColors.graphite)
        isError -> PrimitiveColors.red
        else -> themedValue(PrimitiveColors.black, PrimitiveColors.white)
    }

    val trailingIconColor = when {
        !enabled -> themedValue(PrimitiveColors.granite, PrimitiveColors.graphite)
        else -> themedValue(PrimitiveColors.black, PrimitiveColors.white)
    }

    val errorSupportingTextColor = themedValue(PrimitiveColors.red, PrimitiveColors.redDarkMode)

    CompositionLocalProvider(LocalTextSelectionColors provides selectionColors) {
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier.fillMaxWidth(),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = textStyle.copy(color = inputTextColor),
            cursorBrush = SolidColor(cursorColor),
            visualTransformation = visualTransformation,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            interactionSource = interactionSource,
            singleLine = singleLine,
            maxLines = maxLines,
            minLines = minLines,
            decorationBox = @Composable { innerTextField ->
                Column {
                    if (label != null) {
                        CompositionLocalProvider(LocalContentColor provides labelColor) {
                            ProvideTextStyle(SBBTheme.sbbTypography.helpersLabel) {
                                label()
                            }
                        }
                    }

                    Row(
                        modifier = Modifier.padding(top = 4.dp, bottom = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        if (leadingIcon != null) {
                            Icon(
                                modifier = Modifier.semantics { hideFromAccessibility() },
                                imageVector = leadingIcon,
                                contentDescription = null,
                                tint = iconColor
                            )
                            Spacer(Modifier.width(8.dp))
                        }
                        if (prefix != null) {
                            CompositionLocalProvider(LocalContentColor provides inputTextColor) {
                                ProvideTextStyle(textStyle) {
                                    prefix()
                                }
                            }
                            Spacer(Modifier.width(4.dp))
                        }

                        Box(modifier = Modifier.weight(1f)) {
                            if (value.isEmpty() && placeholder != null) {
                                CompositionLocalProvider(LocalContentColor provides placeholderColor) {
                                    ProvideTextStyle(textStyle) {
                                        placeholder()
                                    }
                                }
                            }
                            innerTextField()
                        }

                        if (suffix != null) {
                            Spacer(Modifier.width(4.dp))
                            CompositionLocalProvider(LocalContentColor provides inputTextColor) {
                                ProvideTextStyle(textStyle) {
                                    suffix()
                                }
                            }
                        }
                        if (trailingIcon != null) {
                            Spacer(Modifier.width(8.dp))
                            Icon(
                                modifier = Modifier.semantics { hideFromAccessibility() },
                                imageVector = trailingIcon,
                                contentDescription = null,
                                tint = trailingIconColor
                            )
                        }
                    }

                    if (isError && !errorText.isNullOrEmpty()) {
                        Text(
                            text = errorText,
                            color = errorSupportingTextColor,
                            style = SBBTheme.sbbTypography.helpersLabel,
                            modifier = Modifier.padding(bottom = 4.dp)
                        )
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(if (isFocused || isError) 2.dp else 1.dp)
                            .background(indicatorColor)
                    )

                    if (supportingText != null && (!isError || errorText.isNullOrEmpty())) {
                        Box(modifier = Modifier.padding(top = 4.dp)) {
                            CompositionLocalProvider(LocalContentColor provides labelColor) {
                                ProvideTextStyle(SBBTheme.sbbTypography.helpersLabel) {
                                    supportingText()
                                }
                            }
                        }
                    }
                }
            }
        )
    }
}

@Composable
private fun <T> themedValue(lightThemeValue: T, darkThemeValue: T): T {
    if (SBBTheme.isDarkMode) {
        return darkThemeValue
    }
    return lightThemeValue
}
