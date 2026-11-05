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

public val SBBIcons.LotusSmall: ImageVector
    get() {
        if (_lotusSmall != null) {
            return _lotusSmall!!
        }
        _lotusSmall = Builder(
            name = "LotusSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(12.342f, 2.635f)
                lineTo(12.0f, 2.315f)
                lineToRelative(-0.342f, 0.32f)
                curveTo(9.603f, 4.562f, 8.54f, 6.426f, 8.138f, 8.161f)
                curveToRelative(-0.403f, 1.736f, -0.132f, 3.295f, 0.4f, 4.591f)
                curveToRelative(0.529f, 1.291f, 1.319f, 2.325f, 1.969f, 3.032f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 1.09f, 1.036f)
                lineToRelative(0.073f, 0.057f)
                lineToRelative(0.02f, 0.016f)
                lineToRelative(0.007f, 0.005f)
                lineToRelative(0.002f, 0.001f)
                lineToRelative(0.3f, -0.399f)
                lineToRelative(-0.3f, 0.4f)
                lineToRelative(0.3f, 0.225f)
                lineToRelative(0.3f, -0.225f)
                lineToRelative(-0.3f, -0.4f)
                lineToRelative(0.301f, 0.4f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(0.006f, -0.005f)
                lineToRelative(0.02f, -0.016f)
                lineToRelative(0.073f, -0.057f)
                arcToRelative(11.158f, 11.158f, 0.0f, false, false, 1.09f, -1.036f)
                curveToRelative(0.651f, -0.707f, 1.441f, -1.741f, 1.97f, -3.032f)
                curveToRelative(0.532f, -1.296f, 0.803f, -2.855f, 0.4f, -4.591f)
                curveToRelative(-0.402f, -1.735f, -1.465f, -3.6f, -3.52f, -5.526f)
                moveToRelative(0.415f, 12.472f)
                curveToRelative(-0.298f, 0.324f, -0.565f, 0.574f, -0.757f, 0.743f)
                curveToRelative(-0.192f, -0.169f, -0.46f, -0.42f, -0.757f, -0.743f)
                curveToRelative(-0.6f, -0.652f, -1.31f, -1.587f, -1.78f, -2.734f)
                curveToRelative(-0.469f, -1.142f, -0.698f, -2.488f, -0.351f, -3.987f)
                curveToRelative(0.327f, -1.409f, 1.174f, -2.993f, 2.888f, -4.692f)
                curveToRelative(1.714f, 1.699f, 2.561f, 3.283f, 2.888f, 4.692f)
                curveToRelative(0.347f, 1.499f, 0.118f, 2.845f, -0.35f, 3.987f)
                curveToRelative(-0.471f, 1.147f, -1.181f, 2.082f, -1.781f, 2.734f)
                moveTo(7.177f, 6.74f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, false, -3.507f, -0.603f)
                lineToRelative(-0.391f, 0.012f)
                lineToRelative(-0.082f, 0.383f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, false, 6.805f, 10.603f)
                lineToRelative(0.219f, -0.976f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, -6.119f, -9.025f)
                curveToRelative(0.93f, 0.018f, 1.847f, 0.204f, 2.715f, 0.539f)
                close()
                moveTo(21.344f, 12.537f)
                quadToRelative(0.902f, 0.497f, 1.668f, 1.181f)
                lineToRelative(0.293f, 0.262f)
                lineToRelative(-0.185f, 0.346f)
                arcToRelative(8.97f, 8.97f, 0.0f, false, true, -9.19f, 4.662f)
                lineToRelative(0.141f, -0.99f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, 7.97f, -3.793f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.18f, -0.792f)
                close()
                moveTo(0.988f, 13.718f)
                curveToRelative(0.51f, -0.455f, 1.07f, -0.85f, 1.667f, -1.18f)
                lineToRelative(0.484f, 0.875f)
                quadToRelative(-0.625f, 0.346f, -1.18f, 0.792f)
                arcTo(7.975f, 7.975f, 0.0f, false, false, 9.93f, 18.0f)
                lineToRelative(0.142f, 0.99f)
                arcTo(8.975f, 8.975f, 0.0f, false, true, 0.88f, 14.327f)
                lineToRelative(-0.185f, -0.347f)
                close()
                moveTo(19.898f, 7.134f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.715f, 0.539f)
                lineToRelative(-0.36f, -0.933f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, true, 3.507f, -0.603f)
                lineToRelative(0.392f, 0.012f)
                lineToRelative(0.081f, 0.383f)
                arcToRelative(8.96f, 8.96f, 0.0f, false, true, -6.805f, 10.603f)
                lineToRelative(-0.218f, -0.976f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, 6.118f, -9.025f)
            }
        }
            .build()
        return _lotusSmall!!
    }

private var _lotusSmall: ImageVector? = null
