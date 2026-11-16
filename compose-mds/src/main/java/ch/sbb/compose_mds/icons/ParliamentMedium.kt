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

public val SBBIcons.ParliamentMedium: ImageVector
    get() {
        if (_parliamentMedium != null) {
            return _parliamentMedium!!
        }
        _parliamentMedium = Builder(name = "ParliamentMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.75f, 5.75f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.525f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.5f, 4.975f)
                verticalLineToRelative(4.462f)
                lineToRelative(-2.686f, 1.074f)
                lineToRelative(-0.314f, 0.126f)
                verticalLineToRelative(4.338f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(28.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-4.338f)
                lineToRelative(-0.314f, -0.126f)
                lineToRelative(-2.686f, -1.074f)
                lineTo(22.25f, 12.75f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.5f, -4.975f)
                lineTo(17.75f, 5.75f)
                close()
                moveTo(24.25f, 22.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(9.25f, 23.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(10.25f, 23.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(13.25f, 23.75f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-0.002f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                lineToRelative(0.002f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(22.25f, 23.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(25.25f, 23.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(19.75f, 4.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.25f, 8.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.97f, 3.5f)
                horizontalLineToRelative(-7.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.97f, -3.5f)
                moveToRelative(-4.0f, 8.062f)
                lineTo(13.25f, 13.25f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.562f)
                lineToRelative(-4.0f, -1.6f)
                close()
                moveTo(18.25f, 31.75f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.002f, -4.0f)
                lineToRelative(0.005f, -0.102f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.995f, 0.102f)
                close()
                moveTo(24.25f, 19.089f)
                verticalLineToRelative(0.661f)
                horizontalLineToRelative(-14.0f)
                verticalLineToRelative(-0.661f)
                lineToRelative(7.0f, -2.8f)
                close()
            }
        }
        .build()
        return _parliamentMedium!!
    }

private var _parliamentMedium: ImageVector? = null
