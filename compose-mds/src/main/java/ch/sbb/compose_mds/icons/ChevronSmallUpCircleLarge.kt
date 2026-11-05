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

public val SBBIcons.ChevronSmallUpCircleLarge: ImageVector
    get() {
        if (_chevronSmallUpCircleLarge != null) {
            return _chevronSmallUpCircleLarge!!
        }
        _chevronSmallUpCircleLarge = Builder(
            name = "ChevronSmallUpCircleLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
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
                moveTo(23.5f, 8.999f)
                curveToRelative(8.562f, 0.0f, 15.5f, 6.94f, 15.5f, 15.5f)
                curveToRelative(0.0f, 8.562f, -6.938f, 15.5f, -15.5f, 15.5f)
                curveToRelative(-8.56f, 0.0f, -15.5f, -6.938f, -15.5f, -15.5f)
                curveToRelative(0.0f, -8.56f, 6.94f, -15.5f, 15.5f, -15.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-8.008f, 0.0f, -14.5f, 6.492f, -14.5f, 14.5f)
                curveToRelative(0.0f, 8.01f, 6.492f, 14.5f, 14.5f, 14.5f)
                curveToRelative(8.01f, 0.0f, 14.5f, -6.49f, 14.5f, -14.5f)
                curveToRelative(0.0f, -8.008f, -6.49f, -14.5f, -14.5f, -14.5f)
                moveToRelative(0.349f, 9.599f)
                lineToRelative(7.807f, 7.9f)
                lineToRelative(-0.71f, 0.703f)
                lineToRelative(-7.455f, -7.54f)
                lineToRelative(-7.451f, 7.538f)
                lineToRelative(-0.71f, -0.703f)
                lineToRelative(7.807f, -7.898f)
                lineToRelative(0.355f, -0.36f)
                close()
            }
        }
            .build()
        return _chevronSmallUpCircleLarge!!
    }

private var _chevronSmallUpCircleLarge: ImageVector? = null
