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

public val SBBIcons.ChevronSmallDownCircleLarge: ImageVector
    get() {
        if (_chevronSmallDownCircleLarge != null) {
            return _chevronSmallDownCircleLarge!!
        }
        _chevronSmallDownCircleLarge = Builder(
            name = "ChevronSmallDownCircleLarge",
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
                moveToRelative(-0.008f, 18.39f)
                lineToRelative(7.453f, -7.536f)
                lineToRelative(0.711f, 0.703f)
                lineToRelative(-7.808f, 7.896f)
                lineToRelative(-0.356f, 0.36f)
                lineToRelative(-0.355f, -0.36f)
                lineToRelative(-7.808f, -7.9f)
                lineToRelative(0.711f, -0.703f)
                close()
            }
        }
            .build()
        return _chevronSmallDownCircleLarge!!
    }

private var _chevronSmallDownCircleLarge: ImageVector? = null
