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

public val SBBIcons.OpenSourceMedium: ImageVector
    get() {
        if (_openSourceMedium != null) {
            return _openSourceMedium!!
        }
        _openSourceMedium = Builder(name = "OpenSourceMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 31.23f, 25.071f)
                lineToRelative(-0.319f, 0.566f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -7.17f, 6.221f)
                lineToRelative(-4.018f, -9.7f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.151f, -1.867f)
                lineToRelative(0.096f, -0.17f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -0.966f, -5.473f)
                lineToRelative(-0.148f, -0.127f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -5.71f, 0.0f)
                lineToRelative(-0.148f, 0.127f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.41f, 2.474f)
                lineToRelative(-0.034f, 0.192f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.726f, 4.843f)
                lineToRelative(-4.019f, 9.701f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -7.17f, -6.221f)
                lineToRelative(-0.318f, -0.566f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 3.22f, -18.244f)
                lineToRelative(0.493f, -0.422f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 18.0f, 3.0f)
                moveToRelative(0.0f, 1.0f)
                arcTo(14.002f, 14.002f, 0.0f, false, false, 5.654f, 24.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 6.08f, 5.916f)
                lineToRelative(3.273f, -7.904f)
                arcToRelative(5.499f, 5.499f, 0.0f, true, true, 6.483f, -8.864f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 1.361f, 6.845f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -1.858f, 2.02f)
                lineToRelative(3.273f, 7.903f)
                arcTo(13.996f, 13.996f, 0.0f, false, false, 18.0f, 4.0f)
            }
        }
        .build()
        return _openSourceMedium!!
    }

private var _openSourceMedium: ImageVector? = null
