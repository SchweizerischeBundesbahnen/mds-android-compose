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

public val SBBIcons.ChevronSmallRightCircleSmall: ImageVector
    get() {
        if (_chevronSmallRightCircleSmall != null) {
            return _chevronSmallRightCircleSmall!!
        }
        _chevronSmallRightCircleSmall = Builder(name = "ChevronSmallRightCircleSmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 5.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 7.0f, 7.0f)
                curveToRelative(0.0f, 3.867f, -3.133f, 7.0f, -7.0f, 7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, true, 0.0f, -14.0f)
                moveToRelative(0.0f, 15.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.581f, 8.0f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                moveToRelative(2.986f, -8.0f)
                lineToRelative(-0.359f, -0.355f)
                lineToRelative(-3.95f, -3.904f)
                lineToRelative(-0.702f, 0.71f)
                lineTo(14.564f, 12.0f)
                lineToRelative(-3.59f, 3.55f)
                lineToRelative(0.703f, 0.711f)
                lineToRelative(3.95f, -3.904f)
                close()
            }
        }
        .build()
        return _chevronSmallRightCircleSmall!!
    }

private var _chevronSmallRightCircleSmall: ImageVector? = null
