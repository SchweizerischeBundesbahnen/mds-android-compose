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
                moveTo(7.0f, 23.5f)
                curveTo(7.0f, 13.835f, 14.835f, 6.0f, 24.5f, 6.0f)
                reflectiveCurveTo(42.0f, 13.835f, 42.0f, 23.5f)
                reflectiveCurveTo(34.165f, 41.0f, 24.5f, 41.0f)
                reflectiveCurveTo(7.0f, 33.165f, 7.0f, 23.5f)
                moveTo(24.5f, 5.0f)
                curveTo(14.283f, 5.0f, 6.0f, 13.283f, 6.0f, 23.5f)
                reflectiveCurveTo(14.283f, 42.0f, 24.5f, 42.0f)
                reflectiveCurveTo(43.0f, 33.717f, 43.0f, 23.5f)
                reflectiveCurveTo(34.717f, 5.0f, 24.5f, 5.0f)
                moveToRelative(0.0f, 22.0f)
                curveToRelative(-3.929f, 0.0f, -7.385f, 1.825f, -9.568f, 4.698f)
                lineToRelative(0.796f, 0.605f)
                curveTo(17.725f, 29.675f, 20.89f, 28.0f, 24.5f, 28.0f)
                reflectiveCurveToRelative(6.775f, 1.675f, 8.772f, 4.303f)
                lineToRelative(0.796f, -0.605f)
                curveTo(31.885f, 28.825f, 28.43f, 27.0f, 24.5f, 27.0f)
                moveToRelative(-6.0f, -7.793f)
                lineToRelative(-2.646f, 2.647f)
                lineToRelative(-0.708f, -0.708f)
                lineToRelative(2.647f, -2.646f)
                lineToRelative(-2.647f, -2.646f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(2.646f, 2.647f)
                lineToRelative(2.646f, -2.647f)
                lineToRelative(0.708f, 0.708f)
                lineToRelative(-2.647f, 2.646f)
                lineToRelative(2.647f, 2.646f)
                lineToRelative(-0.708f, 0.708f)
                close()
                moveTo(30.5f, 19.207f)
                lineTo(27.854f, 21.854f)
                lineTo(27.146f, 21.146f)
                lineTo(29.793f, 18.5f)
                lineTo(27.146f, 15.854f)
                lineTo(27.854f, 15.146f)
                lineTo(30.5f, 17.793f)
                lineTo(33.146f, 15.146f)
                lineTo(33.854f, 15.854f)
                lineTo(31.207f, 18.5f)
                lineTo(33.854f, 21.146f)
                lineTo(33.146f, 21.854f)
                close()
            }
        }
        .build()
        return _faceDisagreeLarge!!
    }

private var _faceDisagreeLarge: ImageVector? = null
