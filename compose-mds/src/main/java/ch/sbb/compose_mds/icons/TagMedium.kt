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

public val SBBIcons.TagMedium: ImageVector
    get() {
        if (_tagMedium != null) {
            return _tagMedium!!
        }
        _tagMedium = Builder(name = "TagMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.035f, 9.397f)
                lineToRelative(-0.147f, -0.147f)
                horizontalLineToRelative(-7.14f)
                lineToRelative(0.002f, 0.501f)
                lineToRelative(0.009f, 6.45f)
                verticalLineToRelative(0.206f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(14.241f, 14.248f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(6.45f, -6.448f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-0.354f, -0.353f)
                close()
                moveTo(22.5f, 29.74f)
                lineTo(8.758f, 15.993f)
                lineTo(8.75f, 10.25f)
                horizontalLineToRelative(5.724f)
                lineTo(28.242f, 24.0f)
                close()
                moveTo(12.0f, 13.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _tagMedium!!
    }

private var _tagMedium: ImageVector? = null
