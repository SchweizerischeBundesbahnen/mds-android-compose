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

public val SBBIcons.FaceThinkingMedium: ImageVector
    get() {
        if (_faceThinkingMedium != null) {
            return _faceThinkingMedium!!
        }
        _faceThinkingMedium = Builder(
            name = "FaceThinkingMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(18.0f, 5.75f)
                curveTo(11.241f, 5.75f, 5.75f, 11.241f, 5.75f, 18.0f)
                curveToRelative(0.0f, 5.102f, 3.098f, 9.469f, 7.522f, 11.314f)
                lineToRelative(-0.384f, 0.922f)
                arcTo(13.24f, 13.24f, 0.0f, false, true, 4.75f, 18.0f)
                curveToRelative(0.0f, -7.311f, 5.939f, -13.25f, 13.25f, -13.25f)
                reflectiveCurveTo(31.25f, 10.689f, 31.25f, 18.0f)
                curveToRelative(0.0f, 0.515f, -0.031f, 1.012f, -0.077f, 1.488f)
                lineToRelative(-0.996f, -0.096f)
                curveToRelative(0.044f, -0.454f, 0.073f, -0.917f, 0.073f, -1.392f)
                curveToRelative(0.0f, -6.759f, -5.491f, -12.25f, -12.25f, -12.25f)
                moveToRelative(13.022f, 17.677f)
                arcToRelative(1.225f, 1.225f, 0.0f, false, false, -1.575f, -0.572f)
                lineToRelative(-9.0f, 3.854f)
                lineToRelative(-0.213f, 0.092f)
                lineToRelative(-0.207f, -0.104f)
                lineToRelative(-5.295f, -2.64f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -0.977f, 0.0f)
                curveToRelative(-0.693f, 0.352f, -0.808f, 1.3f, -0.23f, 1.798f)
                curveToRelative(0.827f, 0.704f, 1.782f, 1.628f, 2.579f, 2.695f)
                curveToRelative(0.708f, 0.948f, 1.308f, 2.034f, 1.563f, 3.2f)
                horizontalLineToRelative(5.583f)
                curveToRelative(1.374f, 0.0f, 2.5f, -1.126f, 2.5f, -2.5f)
                verticalLineTo(27.44f)
                lineToRelative(0.276f, -0.138f)
                lineToRelative(4.455f, -2.235f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, false, 0.54f, -1.641f)
                moveToRelative(-1.969f, -1.492f)
                curveToRelative(1.083f, -0.464f, 2.34f, 0.0f, 2.864f, 1.046f)
                lineToRelative(0.002f, 0.003f)
                curveToRelative(0.539f, 1.098f, 0.1f, 2.433f, -0.99f, 2.978f)
                lineToRelative(-4.179f, 2.096f)
                verticalLineToRelative(1.192f)
                curveToRelative(0.0f, 1.926f, -1.574f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-6.434f)
                lineToRelative(-0.061f, -0.43f)
                curveToRelative(-0.156f, -1.101f, -0.713f, -2.181f, -1.453f, -3.172f)
                curveToRelative(-0.737f, -0.988f, -1.633f, -1.857f, -2.426f, -2.532f)
                lineToRelative(-0.002f, -0.002f)
                curveToRelative(-1.13f, -0.972f, -0.886f, -2.782f, 0.43f, -3.45f)
                lineToRelative(0.002f, -0.001f)
                arcToRelative(2.09f, 2.09f, 0.0f, false, true, 1.872f, 0.0f)
                lineToRelative(5.088f, 2.536f)
                close()
                moveTo(13.25f, 13.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(0.25f, -1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveToRelative(9.0f, 1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(-10.652f, 7.99f)
                lineToRelative(15.0f, -3.0f)
                lineToRelative(-0.196f, -0.98f)
                lineToRelative(-15.0f, 3.0f)
                close()
            }
        }
            .build()
        return _faceThinkingMedium!!
    }

private var _faceThinkingMedium: ImageVector? = null
