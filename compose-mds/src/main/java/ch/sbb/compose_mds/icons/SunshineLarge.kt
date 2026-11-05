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
                moveTo(24.0f, 4.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(1.0f)
                lineTo(25.0f, 4.0f)
                close()
                moveTo(15.646f, 15.354f)
                lineTo(10.646f, 10.354f)
                lineTo(11.354f, 9.646f)
                lineTo(16.354f, 14.646f)
                close()
                moveTo(16.0f, 23.504f)
                curveTo(16.0f, 18.809f, 19.766f, 15.0f, 24.468f, 15.0f)
                curveTo(29.176f, 15.0f, 33.0f, 18.816f, 33.0f, 23.507f)
                arcTo(8.47f, 8.47f, 0.0f, false, true, 24.52f, 32.0f)
                curveTo(19.813f, 32.0f, 16.0f, 28.195f, 16.0f, 23.504f)
                moveTo(24.468f, 14.0f)
                curveTo(19.209f, 14.0f, 15.0f, 18.262f, 15.0f, 23.504f)
                curveTo(15.0f, 28.75f, 19.264f, 33.0f, 24.52f, 33.0f)
                curveToRelative(5.26f, 0.0f, 9.48f, -4.25f, 9.48f, -9.493f)
                curveTo(34.0f, 18.261f, 29.725f, 14.0f, 24.468f, 14.0f)
                moveTo(5.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 23.0f)
                close()
                moveTo(32.646f, 14.646f)
                lineTo(37.646f, 9.646f)
                lineTo(38.354f, 10.354f)
                lineTo(33.354f, 15.354f)
                close()
                moveTo(44.0f, 23.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(24.0f, 43.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(11.35f, 37.357f)
                lineTo(16.35f, 32.464f)
                lineTo(15.65f, 31.749f)
                lineTo(10.65f, 36.643f)
                close()
                moveTo(33.354f, 31.647f)
                lineTo(38.354f, 36.647f)
                lineTo(37.646f, 37.354f)
                lineTo(32.646f, 32.354f)
                close()
                moveTo(30.002f, 23.96f)
                curveToRelative(-0.217f, 2.67f, -2.366f, 4.821f, -5.043f, 5.042f)
                lineToRelative(0.082f, 0.996f)
                curveToRelative(3.164f, -0.26f, 5.7f, -2.798f, 5.957f, -5.957f)
                close()
            }
        }
        .build()
        return _sunshineLarge!!
    }

private var _sunshineLarge: ImageVector? = null
