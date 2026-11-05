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

public val SBBIcons.SmartphoneLarge: ImageVector
    get() {
        if (_smartphoneLarge != null) {
            return _smartphoneLarge!!
        }
        _smartphoneLarge = Builder(name = "SmartphoneLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.643f, 5.0f)
                curveTo(15.196f, 5.0f, 14.0f, 6.202f, 14.0f, 7.682f)
                lineTo(14.0f, 38.0f)
                horizontalLineToRelative(20.0f)
                lineTo(34.0f, 7.682f)
                curveTo(34.0f, 6.202f, 32.804f, 5.0f, 31.357f, 5.0f)
                close()
                moveTo(34.0f, 39.0f)
                lineTo(14.0f, 39.0f)
                verticalLineToRelative(2.319f)
                curveToRelative(0.0f, 1.479f, 1.196f, 2.68f, 2.643f, 2.68f)
                horizontalLineToRelative(14.714f)
                curveTo(32.804f, 44.0f, 34.0f, 42.799f, 34.0f, 41.32f)
                close()
                moveTo(13.0f, 7.682f)
                curveTo(13.0f, 5.662f, 14.632f, 4.0f, 16.643f, 4.0f)
                horizontalLineToRelative(14.714f)
                curveTo(33.368f, 4.0f, 35.0f, 5.66f, 35.0f, 7.682f)
                verticalLineToRelative(33.637f)
                curveToRelative(0.0f, 2.02f, -1.632f, 3.68f, -3.643f, 3.68f)
                lineTo(16.643f, 44.999f)
                curveTo(14.633f, 45.0f, 13.0f, 43.34f, 13.0f, 41.32f)
                close()
                moveTo(26.0f, 42.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(28.0f, 8.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(20.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _smartphoneLarge!!
    }

private var _smartphoneLarge: ImageVector? = null
