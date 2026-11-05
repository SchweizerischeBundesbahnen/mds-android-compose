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
                moveTo(4.318f, 3.318f)
                curveTo(4.136f, 3.5f, 4.0f, 3.822f, 4.0f, 4.403f)
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
                curveToRelative(0.0f, -0.717f, 0.166f, -1.347f, 0.611f, -1.792f)
                reflectiveCurveTo(4.686f, 2.0f, 5.403f, 2.0f)
                lineTo(12.5f, 2.0f)
                curveToRelative(0.718f, 0.0f, 1.362f, 0.166f, 1.827f, 0.598f)
                curveToRelative(0.472f, 0.439f, 0.673f, 1.069f, 0.673f, 1.805f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 4.403f)
                curveToRelative(0.0f, -0.562f, -0.15f, -0.883f, -0.353f, -1.072f)
                curveTo(13.437f, 3.136f, 13.08f, 3.0f, 12.5f, 3.0f)
                lineTo(5.403f, 3.0f)
                curveToRelative(-0.581f, 0.0f, -0.903f, 0.136f, -1.085f, 0.318f)
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 15.0f)
                close()
                moveTo(12.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(18.646f, 4.646f)
                lineTo(3.646f, 19.646f)
                lineTo(4.354f, 20.354f)
                lineTo(19.354f, 5.354f)
                close()
                moveTo(16.5f, 12.0f)
                lineTo(16.0f, 12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.637f)
                lineToRelative(0.252f, 0.708f)
                lineToRelative(0.01f, 0.028f)
                lineToRelative(0.014f, 0.027f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.087f, 0.377f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, -0.84f, 0.86f)
                lineTo(10.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.076f, 0.369f, 0.233f, 0.709f, 0.453f, 1.0f)
                lineTo(10.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.503f)
                curveToRelative(0.22f, -0.291f, 0.377f, -0.631f, 0.453f, -1.0f)
                horizontalLineToRelative(2.21f)
                arcTo(1.85f, 1.85f, 0.0f, false, false, 22.0f, 18.14f)
                curveToRelative(0.0f, -0.287f, -0.063f, -0.553f, -0.178f, -0.794f)
                lineToRelative(-1.87f, -5.24f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -2.557f, -2.746f)
                lineToRelative(-0.39f, 0.92f)
                arcTo(3.6f, 3.6f, 0.0f, false, true, 18.828f, 12.0f)
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
                moveTo(15.0f, 16.5f)
                lineTo(15.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
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
