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

public val SBBIcons.SunshineLarge: ImageVector
    get() {
        if (_sunshineLarge != null) {
            return _sunshineLarge!!
        }
        _sunshineLarge = Builder(name = "SunshineLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.0f, 12.0f)
                lineTo(25.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(15.647f, 15.354f)
                lineTo(10.647f, 10.354f)
                lineTo(11.354f, 9.646f)
                lineTo(16.354f, 14.646f)
                close()
                moveTo(24.469f, 14.0f)
                curveTo(19.208f, 14.0f, 15.0f, 18.262f, 15.0f, 23.504f)
                curveTo(15.0f, 28.75f, 19.264f, 33.0f, 24.52f, 33.0f)
                curveToRelative(5.26f, 0.0f, 9.48f, -4.25f, 9.48f, -9.493f)
                curveTo(34.0f, 18.26f, 29.725f, 14.0f, 24.469f, 14.0f)
                moveToRelative(0.051f, 18.0f)
                curveTo(19.815f, 32.0f, 16.0f, 28.195f, 16.0f, 23.504f)
                curveTo(16.0f, 18.809f, 19.766f, 15.0f, 24.469f, 15.0f)
                curveToRelative(4.706f, 0.0f, 8.53f, 3.816f, 8.531f, 8.507f)
                arcTo(8.47f, 8.47f, 0.0f, false, true, 24.52f, 32.0f)
                moveTo(13.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 23.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(38.353f, 10.354f)
                lineTo(33.353f, 15.354f)
                lineTo(32.647f, 14.647f)
                lineTo(37.647f, 9.647f)
                close()
                moveTo(44.0f, 24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.0f, 35.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(11.35f, 37.357f)
                lineTo(16.35f, 32.464f)
                lineTo(15.65f, 31.749f)
                lineTo(10.65f, 36.643f)
                close()
                moveTo(38.353f, 36.647f)
                lineTo(37.647f, 37.353f)
                lineTo(32.647f, 32.353f)
                lineTo(33.353f, 31.646f)
                close()
                moveTo(25.041f, 29.998f)
                curveToRelative(3.164f, -0.26f, 5.7f, -2.798f, 5.957f, -5.958f)
                lineToRelative(-0.996f, -0.08f)
                curveToRelative(-0.217f, 2.67f, -2.366f, 4.822f, -5.043f, 5.042f)
                close()
            }
        }
        .build()
        return _sunshineLarge!!
    }

private var _sunshineLarge: ImageVector? = null
