package ch.sbb.compose_mds.composables.picker

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme
import java.text.DateFormatSymbols
import java.util.Locale
import kotlin.math.abs
import kotlinx.datetime.LocalDate
import kotlinx.datetime.format.DateTimeFormat
import kotlinx.datetime.format.DayOfWeekNames
import kotlinx.datetime.format.MonthNames
import kotlinx.datetime.format.char

data class SBBPickerColorVariants(
    val light: SBBPickerColors,
    val dark: SBBPickerColors,
)

data class SBBPickerColors(
    val backgroundSelected: Color,
    val line: Color,
    val text: Color,
    val textClose: Color,
    val textFar: Color,
    val textFaded: Color,
    val subtext: Color,
    val background: Color,
    val boxedBackground: Color,
) {
    fun pickerItem(distanceFromCenter: Int) =
        when (abs(distanceFromCenter)) {
            0 -> text
            1 -> textClose
            2 -> textFar
            else -> textFaded
        }
}

data class SBBPickerLayout(
    val textStyle: TextStyle,
    val separatorTextStyle: TextStyle,
    val horizontalPadding: Dp,
    val selectedShape: Shape,
    val dateFormat: (Locale) -> DateTimeFormat<LocalDate>,
) {
    @Composable
    fun rememberDateFormat(): DateTimeFormat<LocalDate> {
        val locale = LocalConfiguration.current.locales[0]
        return remember(locale) { dateFormat(locale) }
    }
}

data class SBBPickerItemSizes(
    val selected: Dp,
    val near: Dp,
    val far: Dp,
    val distant: Dp,
) {
    fun height(distance: Int) =
        when (abs(distance)) {
            0 -> selected
            1 -> near
            2 -> far
            else -> distant
        }

    val padding get() = near + far + distant
    val pickerHeight get() = padding * 2 + selected
}

interface SBBPickerStyle {
    val colors: SBBPickerColorVariants @Composable get
    val layout: SBBPickerLayout @Composable get
    val itemSizes: SBBPickerItemSizes get

    @Composable
    fun resolvedColors(): State<SBBPickerColors> {
        val isDark = SBBTheme.isDarkMode
        val colors = if (isDark) colors.dark else colors.light

        val backgroundSelected by animateColorAsState(colors.backgroundSelected)
        val line by animateColorAsState(colors.line)
        val text by animateColorAsState(colors.text)
        val textClose by animateColorAsState(colors.textClose)
        val textFar by animateColorAsState(colors.textFar)
        val textFaded by animateColorAsState(colors.textFaded)
        val subtext by animateColorAsState(colors.subtext)
        val background by animateColorAsState(colors.background)
        val boxedBackground by animateColorAsState(colors.boxedBackground)

        return remember {
            derivedStateOf {
                SBBPickerColors(
                    backgroundSelected = backgroundSelected,
                    line = line,
                    text = text,
                    textClose = textClose,
                    textFar = textFar,
                    textFaded = textFaded,
                    subtext = subtext,
                    background = background,
                    boxedBackground = boxedBackground,
                )
            }
        }
    }
}

class DefaultPickerStyle : SBBPickerStyle by defaultSBBPickerStyle()

fun defaultSBBPickerStyle(): SBBPickerStyle =
    object : SBBPickerStyle {
        override val colors: SBBPickerColorVariants
            @Composable get() =
                SBBPickerColorVariants(
                    light =
                        SBBPickerColors(
                            backgroundSelected = SBBTheme.colors.cloud,
                            line = SBBTheme.colors.cloud,
                            text = SBBTheme.colors.black,
                            textClose = SBBTheme.colors.storm,
                            textFar = SBBTheme.colors.cement,
                            textFaded = SBBTheme.colors.cement,
                            subtext = SBBTheme.colors.granite,
                            background = MaterialTheme.colorScheme.surface,
                            boxedBackground = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                    dark =
                        SBBPickerColors(
                            backgroundSelected = SBBTheme.colors.iron,
                            line = SBBTheme.colors.iron,
                            text = SBBTheme.colors.white,
                            textClose = SBBTheme.colors.cement,
                            textFar = SBBTheme.colors.storm,
                            textFaded = SBBTheme.colors.storm,
                            subtext = SBBTheme.colors.graphite,
                            background = MaterialTheme.colorScheme.surface,
                            boxedBackground = MaterialTheme.colorScheme.surfaceVariant,
                        ),
                )

        override val layout: SBBPickerLayout
            @Composable get() =
                SBBPickerLayout(
                    textStyle =
                        SBBTheme.sbbTypography.XLargeLight.copy(
                            lineHeight = 26.sp,
                            fontWeight = FontWeight.Normal,
                        ),
                    separatorTextStyle = SBBTheme.sbbTypography.smallLight,
                    horizontalPadding = SBBSpacing.Medium,
                    selectedShape = RoundedCornerShape(8.dp),
                    dateFormat = { locale ->
                        val symbols = DateFormatSymbols(locale)
                        val shortWeekdays = symbols.shortWeekdays.drop(1).take(7)
                        val dayOfWeekNames =
                            DayOfWeekNames(shortWeekdays - shortWeekdays.first() + shortWeekdays.first())
                        val monthNames = MonthNames(symbols.shortMonths.take(12))

                        LocalDate.Format {
                            dayOfWeek(dayOfWeekNames)
                            char(' ')
                            day()
                            char(' ')
                            monthName(monthNames)
                            char(' ')
                            year()
                        }
                    },
                )

        override val itemSizes: SBBPickerItemSizes
            get() =
                SBBPickerItemSizes(
                    selected = 34.dp,
                    near = 28.dp,
                    far = 27.dp,
                    distant = 26.dp,
                )
    }

val LocalSBBPickerStyle = staticCompositionLocalOf<SBBPickerStyle> { DefaultPickerStyle() }
