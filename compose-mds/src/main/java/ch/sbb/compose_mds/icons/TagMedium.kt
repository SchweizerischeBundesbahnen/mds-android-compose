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
        _tagMedium = Builder(
            name = "TagMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(8.25f, 9.25f)
                horizontalLineToRelative(-0.501f)
                verticalLineToRelative(0.501f)
                lineToRelative(0.01f, 6.45f)
                verticalLineToRelative(0.207f)
                lineToRelative(0.146f, 0.146f)
                lineToRelative(14.241f, 14.248f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(6.45f, -6.448f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-14.268f, -14.25f)
                lineToRelative(-0.146f, -0.146f)
                lineTo(8.25f, 9.25f)
                moveToRelative(0.508f, 6.743f)
                lineTo(8.75f, 10.25f)
                horizontalLineToRelative(5.725f)
                lineTo(28.242f, 24.0f)
                lineTo(22.5f, 29.743f)
                close()
                moveTo(11.75f, 13.499f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.001f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(0.25f, -1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.501f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
            }
        }
            .build()
        return _tagMedium!!
    }

private var _tagMedium: ImageVector? = null
