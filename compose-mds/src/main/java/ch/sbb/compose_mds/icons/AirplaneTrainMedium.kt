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

public val SBBIcons.AirplaneTrainMedium: ImageVector
    get() {
        if (_airplaneTrainMedium != null) {
            return _airplaneTrainMedium!!
        }
        _airplaneTrainMedium = Builder(name = "AirplaneTrainMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.632f, 3.25f)
                lineToRelative(0.1f, 0.368f)
                lineToRelative(2.25f, 8.25f)
                lineToRelative(-0.965f, 0.264f)
                lineToRelative(-2.149f, -7.882f)
                horizontalLineToRelative(-2.802f)
                lineToRelative(1.5f, 12.0f)
                lineTo(8.691f, 16.25f)
                lineToRelative(-0.138f, -0.276f)
                lineTo(7.19f, 13.25f)
                lineTo(5.26f, 13.25f)
                lineToRelative(1.95f, 4.553f)
                lineToRelative(0.085f, 0.197f)
                lineToRelative(-0.084f, 0.197f)
                lineToRelative(-1.951f, 4.553f)
                lineTo(7.19f, 22.75f)
                lineToRelative(1.362f, -2.724f)
                lineToRelative(0.138f, -0.276f)
                lineTo(12.0f, 19.75f)
                verticalLineToRelative(1.0f)
                lineTo(9.309f, 20.75f)
                lineToRelative(-1.362f, 2.724f)
                lineToRelative(-0.138f, 0.276f)
                lineTo(3.742f, 23.75f)
                lineToRelative(0.298f, -0.697f)
                lineTo(6.205f, 18.0f)
                lineTo(4.04f, 12.947f)
                lineToRelative(-0.298f, -0.697f)
                lineTo(7.81f, 12.25f)
                lineToRelative(0.138f, 0.276f)
                lineTo(9.31f, 15.25f)
                horizontalLineToRelative(5.125f)
                lineToRelative(-1.5f, -12.0f)
                close()
                moveTo(28.853f, 7.854f)
                lineTo(6.353f, 30.354f)
                lineTo(5.646f, 29.647f)
                lineTo(28.146f, 7.147f)
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
            }
        }
        .build()
        return _airplaneTrainMedium!!
    }

private var _airplaneTrainMedium: ImageVector? = null
