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
                moveTo(18.0f, 5.75f)
                curveToRelative(6.765f, 0.0f, 12.25f, 5.485f, 12.25f, 12.25f)
                reflectiveCurveTo(24.765f, 30.25f, 18.0f, 30.25f)
                reflectiveCurveTo(5.75f, 24.765f, 5.75f, 18.0f)
                reflectiveCurveTo(11.235f, 5.75f, 18.0f, 5.75f)
                moveToRelative(0.0f, 25.5f)
                curveToRelative(7.318f, 0.0f, 13.25f, -5.932f, 13.25f, -13.25f)
                reflectiveCurveTo(25.318f, 4.75f, 18.0f, 4.75f)
                reflectiveCurveTo(4.75f, 10.682f, 4.75f, 18.0f)
                reflectiveCurveTo(10.682f, 31.25f, 18.0f, 31.25f)
                moveToRelative(-6.396f, -14.396f)
                lineToRelative(1.896f, -1.897f)
                lineToRelative(1.896f, 1.896f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-1.896f, -1.896f)
                lineToRelative(1.896f, -1.896f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-1.896f, 1.896f)
                lineToRelative(-1.896f, -1.896f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(1.896f, 1.896f)
                lineToRelative(-1.896f, 1.896f)
                close()
                moveTo(20.604f, 16.854f)
                lineTo(22.5f, 14.957f)
                lineTo(24.396f, 16.853f)
                lineTo(25.103f, 16.146f)
                lineTo(23.207f, 14.25f)
                lineTo(25.103f, 12.354f)
                lineTo(24.396f, 11.647f)
                lineTo(22.5f, 13.543f)
                lineTo(20.604f, 11.647f)
                lineTo(19.897f, 12.354f)
                lineTo(21.793f, 14.25f)
                lineTo(19.897f, 16.146f)
                close()
                moveTo(25.374f, 23.053f)
                curveToRelative(-1.215f, -2.83f, -3.97f, -4.803f, -7.284f, -4.803f)
                reflectiveCurveToRelative(-6.068f, 1.972f, -7.284f, 4.803f)
                lineToRelative(0.918f, 0.394f)
                curveToRelative(1.065f, -2.48f, 3.47f, -4.197f, 6.366f, -4.197f)
                curveToRelative(2.897f, 0.0f, 5.3f, 1.718f, 6.365f, 4.197f)
                close()
            }
        }
        .build()
        return _faceDisagreeMedium!!
    }

private var _faceDisagreeMedium: ImageVector? = null
