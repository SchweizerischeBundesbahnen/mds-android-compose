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

public val SBBIcons.ChevronSmallEndRightSmall: ImageVector
    get() {
        if (_chevronSmallEndRightSmall != null) {
            return _chevronSmallEndRightSmall!!
        }
        _chevronSmallEndRightSmall = Builder(name = "ChevronSmallEndRightSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.986f, 12.0f)
                lineToRelative(-0.36f, -0.355f)
                lineTo(7.679f, 7.74f)
                lineToRelative(-0.703f, 0.71f)
                lineTo(10.564f, 12.0f)
                lineToRelative(-3.59f, 3.55f)
                lineToRelative(0.703f, 0.711f)
                lineToRelative(3.95f, -3.904f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _chevronSmallEndRightSmall!!
    }

private var _chevronSmallEndRightSmall: ImageVector? = null
