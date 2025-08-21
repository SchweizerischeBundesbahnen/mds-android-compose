package ch.sbb.compose_mds.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

internal val LocalSBBTypography = staticCompositionLocalOf<SBBTypography> { SBBTypography() }

// Font sizes
val xxLargeFontSize = 30.sp
val xLargeFontSize = 24.sp
val largeFontSize = 18.sp
val mediumFontSize = 16.sp
val smallFontSize = 14.sp
val xSmallFontSize = 12.sp
val xxSmallFontSize = 10.sp

// Font heights
val xxLargeFontHeight = 32.sp
val xLargeFontHeight = 32.sp
val largeFontHeight = 24.sp
val mediumFontHeight = 20.sp
val smallFontHeight = 20.sp
val xSmallFontHeight = 16.sp
val xxSmallFontHeight = 12.sp

internal interface SBBTypographyTokens {
    val XXLargeLight: TextStyle
    val XXLargeBold: TextStyle
    val XLargeLight: TextStyle
    val XLargeBold: TextStyle
    val largeLight: TextStyle
    val largeBold: TextStyle
    val mediumLight: TextStyle
    val mediumBold: TextStyle
    val smallLight: TextStyle
    val smallBold: TextStyle
    val XSmallLight: TextStyle
    val XSmallBold: TextStyle
    val XXSmallLight: TextStyle
    val XXSmallBold: TextStyle
    val helpersLabel: TextStyle
}

@Stable
internal fun configSBBTypographyTokens(fontFamily: FontFamily? = null): SBBTypographyTokens =
    object : SBBTypographyTokens {
        override val XXLargeLight: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = xxLargeFontSize,
                    lineHeight = xxLargeFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Light,
                )
        override val XXLargeBold: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = xxLargeFontSize,
                    lineHeight = xxLargeFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                )
        override val XLargeLight: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = xLargeFontSize,
                    lineHeight = xLargeFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Light,
                )
        override val XLargeBold: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = xLargeFontSize,
                    lineHeight = xLargeFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                )
        override val largeLight: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = largeFontSize,
                    lineHeight = largeFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Light,
                )

        override val largeBold: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = largeFontSize,
                    lineHeight = largeFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                )
        override val mediumLight: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = mediumFontSize,
                    lineHeight = mediumFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Light,
                )
        override val mediumBold: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = mediumFontSize,
                    lineHeight = mediumFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                )
        override val smallLight: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = smallFontSize,
                    lineHeight = smallFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Light,
                )
        override val smallBold: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = smallFontSize,
                    lineHeight = smallFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                )
        override val XSmallLight: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = xSmallFontSize,
                    lineHeight = xSmallFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Light,
                )
        override val XSmallBold: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = xSmallFontSize,
                    lineHeight = xSmallFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                )
        override val XXSmallLight: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = xxSmallFontSize,
                    lineHeight = xxSmallFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                )
        override val XXSmallBold: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = xxSmallFontSize,
                    lineHeight = xxSmallFontHeight,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                )
        override val helpersLabel: TextStyle
            get() =
                TextStyle(
                    fontFamily = fontFamily,
                    fontSize = 10.sp,
                    lineHeight = 12.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Normal,
                )
    }

@Immutable
class SBBTypography(
    val fontFamily: FontFamily? = null,
) : SBBTypographyTokens by configSBBTypographyTokens(fontFamily) {
    val materialTypography: Typography =
        Typography(
            displayLarge = // TODO needs mapping
                TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.W300,
                    fontSize = 30.sp,
                    lineHeight = 38.sp,
                ),
            displayMedium = // TODO needs mapping
                TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.W300,
                    fontSize = 28.sp,
                    lineHeight = 36.sp,
                ),
            displaySmall = // TODO needs mapping
                TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.W300,
                    fontSize = 26.sp,
                    lineHeight = 34.sp,
                ),
            headlineLarge = // TODO needs mapping
                TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.W700,
                    fontSize = 18.sp,
                    lineHeight = 24.sp,
                ),
            headlineMedium = // TODO needs mapping
                TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.W700,
                    fontSize = 16.sp,
                    lineHeight = 22.sp,
                ),
            headlineSmall = // TODO needs mapping
                TextStyle(
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.W700,
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                ),
            titleLarge = largeBold,
            titleMedium = mediumBold,
            titleSmall = smallBold,
            bodyLarge = largeLight,
            bodyMedium = mediumLight,
            bodySmall = smallLight,
            labelLarge = largeLight,
            labelMedium = mediumLight,
            labelSmall = smallLight,
        )
}
