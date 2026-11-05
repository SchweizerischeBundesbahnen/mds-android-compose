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

public val SBBIcons.BarrierConstructionMedium: ImageVector
    get() {
        if (_barrierConstructionMedium != null) {
            return _barrierConstructionMedium!!
        }
        _barrierConstructionMedium = Builder(name = "BarrierConstructionMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.75f, 5.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.75f, 7.75f)
                verticalLineToRelative(-2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(-2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(5.002f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(5.998f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.998f)
                horizontalLineToRelative(-12.5f)
                verticalLineToRelative(5.998f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.998f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.5f)
                lineTo(7.75f, 14.75f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(4.5f)
                moveToRelative(19.5f, -2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                moveToRelative(0.0f, 14.502f)
                lineTo(27.25f, 14.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.002f)
                close()
                moveTo(11.75f, 14.75f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(5.002f)
                horizontalLineToRelative(-12.5f)
                close()
                moveTo(8.75f, 19.752f)
                lineTo(8.75f, 14.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.002f)
                close()
                moveTo(4.25f, 8.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.793f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(14.457f, 8.75f)
                lineTo(9.457f, 13.75f)
                horizontalLineToRelative(12.086f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(31.75f, 13.75f)
                horizontalLineToRelative(-8.793f)
                lineToRelative(5.0f, -5.0f)
                horizontalLineToRelative(3.793f)
                close()
                moveTo(27.25f, 26.752f)
                verticalLineToRelative(4.998f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.998f)
                close()
                moveTo(8.75f, 26.752f)
                verticalLineToRelative(4.998f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.998f)
                close()
                moveTo(4.25f, 20.752f)
                verticalLineToRelative(4.29f)
                lineToRelative(4.291f, -4.29f)
                close()
                moveTo(14.041f, 25.752f)
                lineTo(4.955f, 25.752f)
                lineToRelative(5.0f, -5.0f)
                horizontalLineToRelative(9.086f)
                close()
                moveTo(20.456f, 20.752f)
                lineTo(15.456f, 25.752f)
                horizontalLineToRelative(9.085f)
                lineToRelative(5.0f, -5.0f)
                close()
                moveTo(30.956f, 20.752f)
                lineTo(25.956f, 25.752f)
                horizontalLineToRelative(5.794f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _barrierConstructionMedium!!
    }

private var _barrierConstructionMedium: ImageVector? = null
