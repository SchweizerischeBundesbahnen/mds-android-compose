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

public val SBBIcons.DoubleChevronSmallRightSmall: ImageVector
    get() {
        if (_doubleChevronSmallRightSmall != null) {
            return _doubleChevronSmallRightSmall!!
        }
        _doubleChevronSmallRightSmall = Builder(name = "DoubleChevronSmallRightSmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.986f, 12.0f)
                lineToRelative(-0.36f, -0.355f)
                lineTo(8.679f, 7.74f)
                lineToRelative(-0.703f, 0.71f)
                lineTo(11.563f, 12.0f)
                lineToRelative(-3.59f, 3.55f)
                lineToRelative(0.703f, 0.71f)
                lineToRelative(3.95f, -3.903f)
                close()
                moveTo(16.986f, 12.0f)
                lineTo(16.627f, 11.645f)
                lineTo(12.679f, 7.741f)
                lineTo(11.976f, 8.451f)
                lineTo(15.563f, 12.0f)
                lineToRelative(-3.59f, 3.55f)
                lineToRelative(0.704f, 0.71f)
                lineToRelative(3.95f, -3.903f)
                close()
            }
        }
        .build()
        return _doubleChevronSmallRightSmall!!
    }

private var _doubleChevronSmallRightSmall: ImageVector? = null
