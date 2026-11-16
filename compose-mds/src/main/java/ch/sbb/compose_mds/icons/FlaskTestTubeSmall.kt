package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.FlaskTestTubeSmall: ImageVector
    get() {
        if (_flaskTestTubeSmall != null) {
            return _flaskTestTubeSmall!!
        }
        _flaskTestTubeSmall = Builder(name = "FlaskTestTubeSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.852f)
                lineToRelative(2.175f, 3.378f)
                lineToRelative(0.002f, 0.001f)
                lineToRelative(1.568f, 2.464f)
                curveToRelative(0.634f, 0.999f, -0.084f, 2.305f, -1.267f, 2.305f)
                lineTo(3.52f, 22.0f)
                curveToRelative(-1.183f, 0.0f, -1.9f, -1.306f, -1.266f, -2.305f)
                lineToRelative(1.567f, -2.464f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(2.175f, -3.375f)
                lineTo(5.998f, 11.0f)
                lineTo(5.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(3.099f, 20.231f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.422f, 0.769f)
                horizontalLineToRelative(8.957f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.422f, -0.769f)
                lineTo(11.48f, 18.0f)
                lineTo(4.519f, 18.0f)
                close()
                moveTo(6.999f, 14.147f)
                lineTo(6.92f, 14.27f)
                lineTo(5.162f, 17.0f)
                horizontalLineToRelative(5.676f)
                lineTo(9.08f, 14.27f)
                lineTo(9.0f, 14.149f)
                lineTo(9.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(15.796f, 3.554f)
                lineTo(15.089f, 4.261f)
                lineTo(21.453f, 10.625f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.829f, 2.828f)
                lineTo(12.261f, 7.09f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(-0.707f, -0.708f)
                lineToRelative(4.243f, -4.242f)
                close()
                moveTo(16.631f, 10.046f)
                lineTo(19.331f, 12.746f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.415f, -1.414f)
                lineToRelative(-1.33f, -1.33f)
                close()
                moveTo(12.968f, 6.382f)
                lineTo(15.647f, 9.061f)
                lineTo(18.432f, 9.018f)
                lineTo(14.382f, 4.968f)
                close()
                moveTo(7.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 7.5f, 8.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 5.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.001f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(5.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.001f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 2.0f)
            }
        }
        .build()
        return _flaskTestTubeSmall!!
    }

private var _flaskTestTubeSmall: ImageVector? = null
