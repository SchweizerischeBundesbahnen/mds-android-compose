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

public val SBBIcons.TagLarge: ImageVector
    get() {
        if (_tagLarge != null) {
            return _tagLarge!!
        }
        _tagLarge = Builder(
            name = "TagLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(19.43f, 12.147f)
                lineToRelative(19.023f, 19.0f)
                lineToRelative(0.355f, 0.353f)
                lineToRelative(-0.355f, 0.354f)
                lineToRelative(-8.6f, 8.597f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-18.988f, -18.998f)
                lineToRelative(-0.145f, -0.145f)
                lineToRelative(-0.001f, -0.207f)
                lineTo(10.0f, 12.5f)
                lineTo(9.999f, 12.0f)
                horizontalLineToRelative(9.284f)
                close()
                moveTo(11.01f, 20.892f)
                lineTo(29.5f, 39.39f)
                lineToRelative(7.893f, -7.891f)
                lineTo(18.869f, 13.0f)
                horizontalLineToRelative(-7.868f)
                close()
                moveTo(15.5f, 15.999f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
            }
        }
            .build()
        return _tagLarge!!
    }

private var _tagLarge: ImageVector? = null
