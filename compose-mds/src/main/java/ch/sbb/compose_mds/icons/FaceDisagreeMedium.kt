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

public val SBBIcons.FaceDisagreeMedium: ImageVector
    get() {
        if (_faceDisagreeMedium != null) {
            return _faceDisagreeMedium!!
        }
        _faceDisagreeMedium = Builder(name = "FaceDisagreeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.75f, 18.0f)
                curveToRelative(0.0f, -6.765f, 5.485f, -12.25f, 12.25f, -12.25f)
                reflectiveCurveTo(30.25f, 11.235f, 30.25f, 18.0f)
                reflectiveCurveTo(24.765f, 30.25f, 18.0f, 30.25f)
                reflectiveCurveTo(5.75f, 24.765f, 5.75f, 18.0f)
                moveTo(18.0f, 4.75f)
                curveTo(10.682f, 4.75f, 4.75f, 10.682f, 4.75f, 18.0f)
                reflectiveCurveTo(10.682f, 31.25f, 18.0f, 31.25f)
                reflectiveCurveTo(31.25f, 25.318f, 31.25f, 18.0f)
                reflectiveCurveTo(25.318f, 4.75f, 18.0f, 4.75f)
                moveToRelative(-6.396f, 12.104f)
                lineToRelative(1.896f, -1.897f)
                lineToRelative(1.896f, 1.897f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-1.897f, -1.896f)
                lineToRelative(1.897f, -1.896f)
                lineToRelative(-0.708f, -0.708f)
                lineToRelative(-1.896f, 1.897f)
                lineToRelative(-1.896f, -1.897f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(1.897f, 1.896f)
                lineToRelative(-1.897f, 1.896f)
                close()
                moveTo(20.604f, 16.854f)
                lineTo(22.5f, 14.957f)
                lineTo(24.396f, 16.854f)
                lineTo(25.104f, 16.146f)
                lineTo(23.207f, 14.25f)
                lineTo(25.104f, 12.354f)
                lineTo(24.396f, 11.646f)
                lineTo(22.5f, 13.543f)
                lineTo(20.604f, 11.646f)
                lineTo(19.896f, 12.354f)
                lineTo(21.793f, 14.25f)
                lineTo(19.896f, 16.146f)
                close()
                moveTo(18.09f, 18.25f)
                curveToRelative(-3.313f, 0.0f, -6.069f, 1.972f, -7.284f, 4.803f)
                lineToRelative(0.919f, 0.394f)
                curveToRelative(1.064f, -2.48f, 3.469f, -4.197f, 6.365f, -4.197f)
                reflectiveCurveToRelative(5.301f, 1.718f, 6.366f, 4.197f)
                lineToRelative(0.919f, -0.394f)
                curveToRelative(-1.216f, -2.83f, -3.971f, -4.803f, -7.285f, -4.803f)
            }
        }
        .build()
        return _faceDisagreeMedium!!
    }

private var _faceDisagreeMedium: ImageVector? = null
