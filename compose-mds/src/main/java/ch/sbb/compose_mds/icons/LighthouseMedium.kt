package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.LighthouseMedium: ImageVector
    get() {
        if (_lighthouseMedium != null) {
            return _lighthouseMedium!!
        }
        _lighthouseMedium = Builder(name = "LighthouseMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 3.25f, 3.25f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(-6.5f)
                lineTo(14.75f, 7.5f)
                arcTo(3.25f, 3.25f, 0.0f, false, true, 18.0f, 4.25f)
                moveToRelative(-4.25f, 3.5f)
                lineTo(12.0f, 7.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(5.0f)
                lineTo(12.0f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.66f)
                lineToRelative(-2.834f, 17.0f)
                lineTo(7.5f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.326f)
                lineToRelative(-2.834f, -17.0f)
                lineTo(24.0f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-5.0f)
                lineTo(24.0f, 8.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.75f)
                lineTo(22.25f, 7.5f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, false, -8.5f, 0.0f)
                close()
                moveTo(21.25f, 8.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(11.84f, 31.75f)
                lineTo(14.674f, 14.75f)
                horizontalLineToRelative(6.653f)
                lineToRelative(2.833f, 17.0f)
                close()
                moveTo(30.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 10.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(27.248f, 8.684f)
                lineTo(32.498f, 5.684f)
                lineTo(32.002f, 4.815f)
                lineTo(26.752f, 7.815f)
                close()
                moveTo(32.498f, 16.815f)
                lineTo(32.002f, 17.685f)
                lineTo(26.752f, 14.685f)
                lineTo(27.248f, 13.815f)
                close()
                moveTo(9.0f, 11.749f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 10.749f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(4.5f, 10.749f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 11.749f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(8.752f, 8.684f)
                lineTo(9.248f, 7.815f)
                lineTo(3.998f, 4.815f)
                lineTo(3.502f, 5.685f)
                close()
                moveTo(9.248f, 14.684f)
                lineTo(3.998f, 17.684f)
                lineTo(3.502f, 16.815f)
                lineTo(8.752f, 13.815f)
                close()
            }
        }
        .build()
        return _lighthouseMedium!!
    }

private var _lighthouseMedium: ImageVector? = null
