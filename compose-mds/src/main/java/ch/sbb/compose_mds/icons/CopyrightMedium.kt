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

public val SBBIcons.CopyrightMedium: ImageVector
    get() {
        if (_copyrightMedium != null) {
            return _copyrightMedium!!
        }
        _copyrightMedium = Builder(name = "CopyrightMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.25f)
                curveToRelative(8.233f, 0.0f, 14.75f, 6.516f, 14.75f, 14.75f)
                reflectiveCurveTo(26.233f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(3.25f, 26.233f, 3.25f, 18.0f)
                reflectiveCurveTo(9.767f, 3.25f, 18.0f, 3.25f)
                moveToRelative(0.0f, 1.0f)
                curveTo(10.32f, 4.25f, 4.25f, 10.318f, 4.25f, 18.0f)
                curveToRelative(0.0f, 7.68f, 6.07f, 13.75f, 13.75f, 13.75f)
                reflectiveCurveTo(31.75f, 25.68f, 31.75f, 18.0f)
                curveToRelative(0.0f, -7.682f, -6.07f, -13.75f, -13.75f, -13.75f)
                moveToRelative(-0.018f, 9.25f)
                quadToRelative(1.705f, 0.0f, 2.734f, 0.888f)
                quadToRelative(1.028f, 0.887f, 1.221f, 2.522f)
                horizontalLineToRelative(-1.59f)
                quadToRelative(-0.159f, -0.809f, -0.572f, -1.292f)
                quadToRelative(-0.667f, -0.773f, -1.801f, -0.773f)
                quadToRelative(-1.53f, 0.0f, -2.294f, 1.265f)
                quadToRelative(-0.607f, 1.002f, -0.607f, 2.479f)
                quadToRelative(0.0f, 1.547f, 0.615f, 2.522f)
                quadToRelative(0.765f, 1.196f, 2.198f, 1.196f)
                quadToRelative(1.045f, 0.0f, 1.705f, -0.633f)
                reflectiveQuadToRelative(0.835f, -1.793f)
                horizontalLineToRelative(1.564f)
                quadToRelative(-0.236f, 1.793f, -1.31f, 2.786f)
                quadToRelative(-1.071f, 0.993f, -2.76f, 0.993f)
                quadToRelative(-2.266f, 0.0f, -3.462f, -1.635f)
                quadToRelative(-0.958f, -1.318f, -0.958f, -3.313f)
                quadToRelative(0.0f, -2.593f, 1.38f, -3.982f)
                quadToRelative(1.213f, -1.23f, 3.102f, -1.23f)
            }
        }
        .build()
        return _copyrightMedium!!
    }

private var _copyrightMedium: ImageVector? = null
