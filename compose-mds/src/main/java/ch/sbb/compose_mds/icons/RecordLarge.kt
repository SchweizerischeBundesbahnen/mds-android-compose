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

public val SBBIcons.RecordLarge: ImageVector
    get() {
        if (_recordLarge != null) {
            return _recordLarge!!
        }
        _recordLarge = Builder(
            name = "RecordLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
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
                moveTo(23.5f, 10.0f)
                curveTo(30.956f, 10.0f, 37.0f, 16.044f, 37.0f, 23.5f)
                reflectiveCurveTo(30.956f, 37.0f, 23.5f, 37.0f)
                reflectiveCurveTo(10.0f, 30.956f, 10.0f, 23.5f)
                reflectiveCurveTo(16.044f, 10.0f, 23.5f, 10.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(16.596f, 11.0f, 11.0f, 16.596f, 11.0f, 23.5f)
                reflectiveCurveTo(16.596f, 36.0f, 23.5f, 36.0f)
                reflectiveCurveTo(36.0f, 30.404f, 36.0f, 23.5f)
                reflectiveCurveTo(30.404f, 11.0f, 23.5f, 11.0f)
            }
        }
            .build()
        return _recordLarge!!
    }

private var _recordLarge: ImageVector? = null
