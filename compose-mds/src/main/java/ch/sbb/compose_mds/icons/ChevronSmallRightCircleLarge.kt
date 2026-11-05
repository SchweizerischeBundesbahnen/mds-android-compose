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

public val SBBIcons.ChevronSmallRightCircleLarge: ImageVector
    get() {
        if (_chevronSmallRightCircleLarge != null) {
            return _chevronSmallRightCircleLarge!!
        }
        _chevronSmallRightCircleLarge = Builder(name = "ChevronSmallRightCircleLarge", defaultWidth
                = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.5f, 8.999f)
                curveToRelative(8.562f, 0.0f, 15.5f, 6.94f, 15.5f, 15.5f)
                curveToRelative(0.0f, 8.562f, -6.938f, 15.5f, -15.5f, 15.5f)
                curveToRelative(-8.56f, 0.0f, -15.5f, -6.938f, -15.5f, -15.5f)
                curveToRelative(0.0f, -8.56f, 6.94f, -15.5f, 15.5f, -15.5f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-8.008f, 0.0f, -14.5f, 6.492f, -14.5f, 14.5f)
                curveToRelative(0.0f, 8.01f, 6.492f, 14.5f, 14.5f, 14.5f)
                curveToRelative(8.01f, 0.0f, 14.5f, -6.49f, 14.5f, -14.5f)
                curveToRelative(0.0f, -8.008f, -6.49f, -14.5f, -14.5f, -14.5f)
                moveToRelative(4.902f, 14.146f)
                lineToRelative(0.36f, 0.355f)
                lineToRelative(-0.36f, 0.356f)
                lineToRelative(-7.9f, 7.808f)
                lineToRelative(-0.703f, -0.71f)
                lineToRelative(7.54f, -7.455f)
                lineToRelative(-7.538f, -7.451f)
                lineToRelative(0.703f, -0.711f)
                close()
            }
        }
        .build()
        return _chevronSmallRightCircleLarge!!
    }

private var _chevronSmallRightCircleLarge: ImageVector? = null
