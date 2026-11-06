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

public val SBBIcons.RobotMedium: ImageVector
    get() {
        if (_robotMedium != null) {
            return _robotMedium!!
        }
        _robotMedium = Builder(name = "RobotMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.75f, 5.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.5f, 3.937f)
                lineTo(18.25f, 9.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(19.25f, 7.187f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.5f, -3.937f)
                moveToRelative(9.5f, 10.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(9.25f, 13.25f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(10.25f, 10.25f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-12.5f)
                close()
                moveTo(4.75f, 28.763f)
                curveToRelative(0.0f, -1.693f, 1.45f, -3.013f, 3.172f, -3.013f)
                horizontalLineToRelative(21.656f)
                curveToRelative(1.723f, 0.0f, 3.172f, 1.32f, 3.172f, 3.013f)
                lineTo(32.75f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.237f)
                curveToRelative(0.0f, -1.083f, -0.943f, -2.013f, -2.172f, -2.013f)
                lineTo(7.922f, 26.75f)
                curveToRelative(-1.229f, 0.0f, -2.172f, 0.93f, -2.172f, 2.013f)
                lineTo(5.75f, 33.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(13.815f, 18.247f)
                curveToRelative(0.862f, 1.518f, 2.752f, 2.503f, 4.935f, 2.503f)
                reflectiveCurveToRelative(4.073f, -0.985f, 4.935f, -2.503f)
                lineToRelative(-0.87f, -0.494f)
                curveToRelative(-0.645f, 1.136f, -2.154f, 1.997f, -4.065f, 1.997f)
                reflectiveCurveToRelative(-3.42f, -0.861f, -4.065f, -1.997f)
                close()
                moveTo(15.75f, 15.05f)
                arcToRelative(0.05f, 0.05f, 0.0f, true, false, 0.0f, -0.1f)
                arcToRelative(0.05f, 0.05f, 0.0f, false, false, 0.0f, 0.1f)
                moveTo(14.8f, 15.0f)
                arcToRelative(0.95f, 0.95f, 0.0f, true, true, 1.9f, 0.0f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -1.9f, 0.0f)
                moveToRelative(7.0f, 0.0f)
                arcToRelative(0.05f, 0.05f, 0.0f, true, true, -0.1f, 0.0f)
                arcToRelative(0.05f, 0.05f, 0.0f, false, true, 0.1f, 0.0f)
                moveToRelative(-0.05f, -0.95f)
                arcToRelative(0.95f, 0.95f, 0.0f, true, false, 0.0f, 1.9f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, 0.0f, -1.9f)
            }
        }
        .build()
        return _robotMedium!!
    }

private var _robotMedium: ImageVector? = null
