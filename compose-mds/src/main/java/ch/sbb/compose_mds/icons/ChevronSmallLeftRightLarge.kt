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

public val SBBIcons.ChevronSmallLeftRightLarge: ImageVector
    get() {
        if (_chevronSmallLeftRightLarge != null) {
            return _chevronSmallLeftRightLarge!!
        }
        _chevronSmallLeftRightLarge = Builder(name = "ChevronSmallLeftRightLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.194f, 17.048f)
                lineTo(7.653f, 24.5f)
                lineToRelative(7.537f, 7.453f)
                lineToRelative(-0.351f, 0.355f)
                lineToRelative(-0.353f, 0.356f)
                lineToRelative(-7.896f, -7.809f)
                lineToRelative(-0.359f, -0.355f)
                lineToRelative(0.36f, -0.356f)
                lineToRelative(7.9f, -7.807f)
                close()
                moveTo(40.49f, 24.144f)
                lineTo(40.85f, 24.5f)
                lineTo(40.49f, 24.855f)
                lineTo(32.593f, 32.664f)
                lineTo(31.89f, 31.953f)
                lineTo(39.426f, 24.5f)
                lineTo(31.886f, 17.047f)
                lineTo(32.59f, 16.337f)
                close()
            }
        }
        .build()
        return _chevronSmallLeftRightLarge!!
    }

private var _chevronSmallLeftRightLarge: ImageVector? = null
