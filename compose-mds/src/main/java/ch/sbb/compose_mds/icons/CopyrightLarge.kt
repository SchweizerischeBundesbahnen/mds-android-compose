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

public val SBBIcons.CopyrightLarge: ImageVector
    get() {
        if (_copyrightLarge != null) {
            return _copyrightLarge!!
        }
        _copyrightLarge = Builder(name = "CopyrightLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 4.0f)
                curveTo(34.385f, 4.0f, 43.0f, 12.613f, 43.0f, 23.5f)
                curveTo(43.0f, 34.385f, 34.385f, 43.0f, 23.5f, 43.0f)
                reflectiveCurveTo(4.0f, 34.385f, 4.0f, 23.5f)
                curveTo(4.0f, 12.613f, 12.615f, 4.0f, 23.5f, 4.0f)
                moveToRelative(0.0f, 1.0f)
                curveTo(13.167f, 5.0f, 5.0f, 13.165f, 5.0f, 23.5f)
                curveTo(5.0f, 33.833f, 13.167f, 42.0f, 23.5f, 42.0f)
                reflectiveCurveTo(42.0f, 33.833f, 42.0f, 23.5f)
                curveTo(42.0f, 13.165f, 33.833f, 5.0f, 23.5f, 5.0f)
                moveToRelative(-0.023f, 12.5f)
                quadToRelative(2.272f, 0.0f, 3.644f, 1.184f)
                quadToRelative(1.371f, 1.184f, 1.629f, 3.363f)
                horizontalLineToRelative(-2.121f)
                quadToRelative(-0.211f, -1.078f, -0.762f, -1.723f)
                quadToRelative(-0.89f, -1.03f, -2.402f, -1.031f)
                quadToRelative(-2.04f, 0.0f, -3.059f, 1.688f)
                quadToRelative(-0.808f, 1.336f, -0.808f, 3.304f)
                quadToRelative(0.0f, 2.063f, 0.82f, 3.363f)
                quadToRelative(1.02f, 1.594f, 2.93f, 1.594f)
                quadToRelative(1.394f, 0.001f, 2.273f, -0.844f)
                quadToRelative(0.879f, -0.844f, 1.113f, -2.39f)
                horizontalLineToRelative(2.086f)
                quadToRelative(-0.316f, 2.39f, -1.746f, 3.715f)
                quadToRelative(-1.43f, 1.323f, -3.68f, 1.324f)
                quadToRelative(-3.023f, 0.0f, -4.617f, -2.18f)
                quadToRelative(-1.276f, -1.758f, -1.277f, -4.418f)
                quadToRelative(0.0f, -3.457f, 1.84f, -5.308f)
                quadToRelative(1.617f, -1.64f, 4.137f, -1.641f)
            }
        }
        .build()
        return _copyrightLarge!!
    }

private var _copyrightLarge: ImageVector? = null
