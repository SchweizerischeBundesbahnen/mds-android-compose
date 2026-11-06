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

public val SBBIcons.DocumentXlsMedium: ImageVector
    get() {
        if (_documentXlsMedium != null) {
            return _documentXlsMedium!!
        }
        _documentXlsMedium = Builder(name = "DocumentXlsMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.75f, 14.044f)
                lineTo(26.75f, 29.75f)
                lineTo(9.25f, 29.75f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.013f, -22.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(9.693f)
                close()
                moveTo(10.25f, 28.75f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-7.987f)
                close()
                moveTo(22.27f, 22.396f)
                quadToRelative(0.644f, 0.0f, 1.077f, 0.255f)
                quadToRelative(0.623f, 0.367f, 0.66f, 1.186f)
                horizontalLineToRelative(-0.937f)
                quadToRelative(-0.027f, -0.327f, -0.245f, -0.503f)
                quadToRelative(-0.217f, -0.174f, -0.607f, -0.173f)
                quadToRelative(-0.349f, -0.001f, -0.54f, 0.134f)
                arcToRelative(0.45f, 0.45f, 0.0f, false, false, -0.192f, 0.385f)
                quadToRelative(0.0f, 0.221f, 0.184f, 0.318f)
                quadToRelative(0.18f, 0.1f, 0.904f, 0.279f)
                quadToRelative(0.767f, 0.19f, 1.063f, 0.384f)
                quadToRelative(0.542f, 0.355f, 0.543f, 0.993f)
                quadToRelative(0.0f, 0.698f, -0.548f, 1.1f)
                quadToRelative(-0.482f, 0.357f, -1.307f, 0.356f)
                quadToRelative(-0.916f, 0.0f, -1.422f, -0.42f)
                quadToRelative(-0.51f, -0.419f, -0.527f, -1.19f)
                horizontalLineToRelative(0.977f)
                quadToRelative(0.022f, 0.374f, 0.194f, 0.557f)
                quadToRelative(0.27f, 0.29f, 0.815f, 0.288f)
                quadToRelative(0.367f, 0.001f, 0.585f, -0.143f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.243f, -0.453f)
                quadToRelative(0.0f, -0.285f, -0.34f, -0.418f)
                quadToRelative(-0.189f, -0.074f, -0.887f, -0.267f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.683f, -0.228f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.394f, -0.24f)
                quadToRelative(-0.345f, -0.308f, -0.345f, -0.85f)
                quadToRelative(0.0f, -0.646f, 0.54f, -1.025f)
                quadToRelative(0.458f, -0.325f, 1.19f, -0.325f)
                moveToRelative(-8.104f, 1.55f)
                lineToRelative(0.904f, -1.442f)
                horizontalLineToRelative(1.09f)
                lineToRelative(-1.446f, 2.145f)
                lineTo(16.292f, 27.0f)
                horizontalLineToRelative(-1.181f)
                lineToRelative(-0.985f, -1.563f)
                lineToRelative(-1.002f, 1.564f)
                lineTo(12.0f, 27.001f)
                lineToRelative(1.588f, -2.353f)
                lineToRelative(-1.465f, -2.145f)
                horizontalLineToRelative(1.15f)
                close()
                moveTo(17.725f, 26.17f)
                horizontalLineToRelative(2.201f)
                verticalLineToRelative(0.831f)
                horizontalLineToRelative(-3.182f)
                verticalLineToRelative(-4.497f)
                horizontalLineToRelative(0.98f)
                close()
                moveTo(19.251f, 13.75f)
                horizontalLineToRelative(5.792f)
                lineTo(19.25f, 7.96f)
                close()
            }
        }
        .build()
        return _documentXlsMedium!!
    }

private var _documentXlsMedium: ImageVector? = null
