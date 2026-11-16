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

public val SBBIcons.BusTrainSmall: ImageVector
    get() {
        if (_busTrainSmall != null) {
            return _busTrainSmall!!
        }
        _busTrainSmall = Builder(name = "BusTrainSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 4.403f)
                curveToRelative(0.0f, -0.562f, -0.15f, -0.883f, -0.354f, -1.072f)
                curveTo(13.436f, 3.136f, 13.082f, 3.0f, 12.5f, 3.0f)
                lineTo(5.403f, 3.0f)
                curveToRelative(-0.581f, 0.0f, -0.902f, 0.136f, -1.085f, 0.318f)
                curveTo(4.136f, 3.501f, 4.0f, 3.822f, 4.0f, 4.403f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(3.0f, 4.403f)
                curveToRelative(0.0f, -0.717f, 0.167f, -1.347f, 0.611f, -1.792f)
                curveTo(4.056f, 2.167f, 4.686f, 2.0f, 5.403f, 2.0f)
                lineTo(12.5f, 2.0f)
                curveToRelative(0.718f, 0.0f, 1.362f, 0.167f, 1.827f, 0.599f)
                curveToRelative(0.472f, 0.438f, 0.673f, 1.068f, 0.673f, 1.804f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 15.0f)
                close()
                moveTo(12.0f, 5.0f)
                lineTo(12.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(4.354f, 20.354f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(-15.0f, 15.0f)
                close()
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(2.829f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -1.824f, -1.72f)
                lineToRelative(0.39f, -0.92f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 2.555f, 2.742f)
                horizontalLineToRelative(0.001f)
                lineToRelative(1.877f, 5.264f)
                arcTo(1.85f, 1.85f, 0.0f, false, true, 20.16f, 20.0f)
                horizontalLineToRelative(-2.21f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.453f, 1.0f)
                lineTo(22.0f, 21.0f)
                verticalLineToRelative(1.0f)
                lineTo(10.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.503f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.453f, -1.0f)
                lineTo(10.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.16f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, 0.84f, -0.86f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.087f, -0.377f)
                lineToRelative(-0.014f, -0.026f)
                lineToRelative(-0.01f, -0.03f)
                lineToRelative(0.471f, -0.167f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(-0.472f, 0.168f)
                lineToRelative(-0.253f, -0.707f)
                lineTo(16.0f, 17.0f)
                close()
                moveTo(15.5f, 21.0f)
                curveToRelative(0.649f, 0.0f, 1.206f, -0.42f, 1.414f, -1.0f)
                horizontalLineToRelative(-2.828f)
                curveToRelative(0.208f, 0.58f, 0.765f, 1.0f, 1.414f, 1.0f)
                moveToRelative(3.71f, -8.0f)
                lineToRelative(1.07f, 3.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, false, 6.002f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 10.0f)
            }
        }
        .build()
        return _busTrainSmall!!
    }

private var _busTrainSmall: ImageVector? = null
