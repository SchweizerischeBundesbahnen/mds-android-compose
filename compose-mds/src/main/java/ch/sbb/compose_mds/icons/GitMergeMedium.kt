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

public val SBBIcons.GitMergeMedium: ImageVector
    get() {
        if (_gitMergeMedium != null) {
            return _gitMergeMedium!!
        }
        _gitMergeMedium = Builder(
            name = "GitMergeMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(11.25f, 2.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.5f, 6.964f)
                verticalLineToRelative(15.571f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineTo(9.464f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.5f, -6.964f)
                moveToRelative(11.048f, 8.481f)
                lineToRelative(0.13f, 0.483f)
                lineToRelative(-5.286f, 1.423f)
                lineToRelative(2.303f, 1.152f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, 5.805f, 9.392f)
                verticalLineToRelative(1.604f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -1.0f, 0.0f)
                verticalLineToRelative(-1.604f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -5.252f, -8.497f)
                lineToRelative(-2.345f, -1.173f)
                lineToRelative(1.41f, 5.262f)
                lineToRelative(-0.965f, 0.258f)
                lineToRelative(-1.725f, -6.436f)
                lineToRelative(-0.13f, -0.483f)
                lineToRelative(0.484f, -0.13f)
                lineToRelative(6.441f, -1.735f)
                close()
                moveTo(11.25f, 26.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(13.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveTo(11.25f, 3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
            .build()
        return _gitMergeMedium!!
    }

private var _gitMergeMedium: ImageVector? = null
