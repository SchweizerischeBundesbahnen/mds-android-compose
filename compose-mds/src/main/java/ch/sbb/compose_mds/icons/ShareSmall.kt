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

public val SBBIcons.ShareSmall: ImageVector
    get() {
        if (_shareSmall != null) {
            return _shareSmall!!
        }
        _shareSmall = Builder(
            name = "ShareSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(15.0f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(16.5f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.377f, 3.277f)
                lineToRelative(-5.87f, 3.44f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.095f, 3.466f)
                lineToRelative(5.798f, 3.474f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.52f, -0.855f)
                lineTo(8.86f, 12.325f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.048f, -1.776f)
                lineToRelative(5.805f, -3.403f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 16.5f, 3.0f)
                moveToRelative(0.0f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveTo(5.0f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
            }
        }
            .build()
        return _shareSmall!!
    }

private var _shareSmall: ImageVector? = null
