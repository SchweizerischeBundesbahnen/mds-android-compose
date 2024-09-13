package ch.sbb.compose_mds.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver

object SBBColors {
    // colors
    val red = Color(0xFFEB0000)
    val red125 = Color(0xFFC60018)
    val red150 = Color(0xFFA20013)
    val redDarkMode = Color(0xFFFF3838)
    val white = Color(0xFFFFFFFF)
    val milk = Color(0xFFF6F6F6)
    val cloud = Color(0xFFE5E5E5)
    val silver = Color(0xFFDCDCDC)
    val aluminum = Color(0xFFD2D2D2)
    val platinum = Color(0xFFCDCDCD)
    val cement = Color(0xFFBDBDBD)
    val graphite = Color(0xFFB7B7B7)
    val storm = Color(0xFFA8A8A8)
    val smoke = Color(0xFF8D8D8D)
    val metal = Color(0xFF767676)
    val granite = Color(0xFF686868)
    val anthracite = Color(0xFF5A5A5A)
    val iron = Color(0xFF444444)
    val charcoal = Color(0xFF212121)
    val midnight = Color(0xFF151515)
    val black = Color(0xFF000000)
    val blue = Color(0xFF2D327D)
    val transparent = Color(0x00000000)

    // functional colors
    val sky = Color(0xFF0079C7)
    val night = Color(0xFF143A85)
    val violet = Color(0xFF6F2282)
    val pink = Color(0xFFCF4082)
    val autumn = Color(0xFFE84E10)
    val orange = Color(0xFFF27E00)
    val peach = Color(0xFFFCBB00)
    val lemon = Color(0xFFFFDE15)
    val brown = Color(0xFFB76000)
    val green = Color(0xFF008A36)
    val turquoise = Color(0xFF00a59b)

    // off brand colors
    val royal: Color = Color(0xFF06348B)
    val royal125 = Color(0xFF032668)
    val royal150 = Color(0xFF021C4E)
}

val Color.disabledOnSurface @Composable get() = copy(alpha = .5f).compositeOver(MaterialTheme.colorScheme.surface)