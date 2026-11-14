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

public val SBBIcons.FaceDisagreeLarge: ImageVector
    get() {
        if (_faceDisagreeLarge != null) {
            return _faceDisagreeLarge!!
        }
        _faceDisagreeLarge = Builder(name = "FaceDisagreeLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.5f, 6.0f)
                curveTo(34.165f, 6.0f, 42.0f, 13.835f, 42.0f, 23.5f)
                reflectiveCurveTo(34.165f, 41.0f, 24.5f, 41.0f)
                reflectiveCurveTo(7.0f, 33.165f, 7.0f, 23.5f)
                reflectiveCurveTo(14.835f, 6.0f, 24.5f, 6.0f)
                moveToRelative(0.0f, 36.0f)
                curveTo(34.717f, 42.0f, 43.0f, 33.717f, 43.0f, 23.5f)
                reflectiveCurveTo(34.717f, 5.0f, 24.5f, 5.0f)
                reflectiveCurveTo(6.0f, 13.283f, 6.0f, 23.5f)
                reflectiveCurveTo(14.283f, 42.0f, 24.5f, 42.0f)
                moveToRelative(9.568f, -10.303f)
                curveTo(31.886f, 28.825f, 28.43f, 27.0f, 24.5f, 27.0f)
                curveToRelative(-3.93f, 0.0f, -7.386f, 1.825f, -9.568f, 4.697f)
                lineToRelative(0.797f, 0.606f)
                curveTo(17.726f, 29.675f, 20.889f, 28.0f, 24.5f, 28.0f)
                curveToRelative(3.61f, 0.0f, 6.775f, 1.675f, 8.773f, 4.303f)
                close()
                moveTo(18.5f, 19.207f)
                lineToRelative(-2.646f, 2.646f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(2.646f, -2.646f)
                lineToRelative(-2.646f, -2.646f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(2.646f, 2.646f)
                lineToRelative(2.646f, -2.646f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.646f, 2.646f)
                lineToRelative(2.646f, 2.646f)
                lineToRelative(-0.707f, 0.707f)
                close()
                moveTo(30.5f, 19.207f)
                lineTo(27.854f, 21.853f)
                lineTo(27.147f, 21.146f)
                lineTo(29.793f, 18.5f)
                lineTo(27.147f, 15.854f)
                lineTo(27.854f, 15.147f)
                lineTo(30.5f, 17.793f)
                lineTo(33.147f, 15.147f)
                lineTo(33.853f, 15.854f)
                lineTo(31.207f, 18.5f)
                lineTo(33.853f, 21.146f)
                lineTo(33.147f, 21.853f)
                close()
            }
        }
        .build()
        return _faceDisagreeLarge!!
    }

private var _faceDisagreeLarge: ImageVector? = null
