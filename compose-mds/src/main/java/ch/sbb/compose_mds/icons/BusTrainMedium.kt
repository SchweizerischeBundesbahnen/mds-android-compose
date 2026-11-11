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

public val SBBIcons.BusTrainMedium: ImageVector
    get() {
        if (_busTrainMedium != null) {
            return _busTrainMedium!!
        }
        _busTrainMedium = Builder(name = "BusTrainMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.25f, 6.605f)
                curveToRelative(0.0f, -0.886f, -0.238f, -1.446f, -0.61f, -1.792f)
                curveToRelative(-0.378f, -0.351f, -0.984f, -0.563f, -1.89f, -0.563f)
                lineTo(8.105f, 4.25f)
                curveToRelative(-0.906f, 0.0f, -1.465f, 0.212f, -1.804f, 0.55f)
                curveToRelative(-0.34f, 0.34f, -0.551f, 0.9f, -0.551f, 1.805f)
                verticalLineToRelative(5.646f)
                lineTo(19.5f, 12.251f)
                verticalLineToRelative(1.0f)
                lineTo(5.75f, 13.251f)
                verticalLineToRelative(6.499f)
                lineTo(12.0f, 19.75f)
                verticalLineToRelative(1.0f)
                lineTo(8.75f, 20.75f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.5f)
                lineTo(4.75f, 6.605f)
                curveToRelative(0.0f, -1.042f, 0.242f, -1.91f, 0.844f, -2.511f)
                curveToRelative(0.601f, -0.602f, 1.47f, -0.844f, 2.511f, -0.844f)
                lineTo(18.75f, 3.25f)
                curveToRelative(1.043f, 0.0f, 1.937f, 0.241f, 2.571f, 0.83f)
                curveToRelative(0.641f, 0.595f, 0.929f, 1.464f, 0.929f, 2.525f)
                lineTo(22.25f, 9.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(5.75f, 20.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(4.75f, 10.25f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(18.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 6.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.354f, 30.354f)
                lineToRelative(22.5f, -22.5f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(-22.5f, 22.5f)
                close()
                moveTo(25.25f, 19.25f)
                horizontalLineToRelative(3.74f)
                lineToRelative(1.785f, 5.0f)
                lineTo(25.25f, 24.25f)
                close()
                moveTo(24.25f, 25.25f)
                horizontalLineToRelative(6.881f)
                lineToRelative(0.438f, 1.228f)
                lineToRelative(0.01f, 0.028f)
                lineToRelative(0.014f, 0.027f)
                curveToRelative(0.1f, 0.202f, 0.157f, 0.426f, 0.157f, 0.677f)
                curveToRelative(0.0f, 0.856f, -0.683f, 1.54f, -1.51f, 1.54f)
                lineTo(15.0f, 28.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.786f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.02f, 2.0f)
                lineTo(15.0f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.306f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.02f, -2.0f)
                horizontalLineToRelative(3.526f)
                curveToRelative(1.393f, 0.0f, 2.51f, -1.146f, 2.51f, -2.54f)
                curveToRelative(0.0f, -0.395f, -0.088f, -0.76f, -0.247f, -1.09f)
                lineToRelative(-2.813f, -7.883f)
                arcToRelative(6.64f, 6.64f, 0.0f, false, false, -3.695f, -3.967f)
                lineToRelative(-0.39f, 0.92f)
                arcToRelative(5.64f, 5.64f, 0.0f, false, true, 3.023f, 3.06f)
                lineTo(24.25f, 18.25f)
                close()
                moveTo(23.25f, 31.75f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, false, 2.45f, -2.0f)
                horizontalLineToRelative(-4.9f)
                arcToRelative(2.51f, 2.51f, 0.0f, false, false, 2.45f, 2.0f)
                moveToRelative(-1.0f, -6.5f)
                lineTo(22.25f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.25f)
                lineTo(15.0f, 24.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 16.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, -0.25f, 0.25f)
                curveToRelative(0.0f, -0.138f, 0.113f, -0.25f, 0.25f, -0.25f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.501f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _busTrainMedium!!
    }

private var _busTrainMedium: ImageVector? = null
