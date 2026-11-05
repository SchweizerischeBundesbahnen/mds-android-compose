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

public val SBBIcons.WeightMedium: ImageVector
    get() {
        if (_weightMedium != null) {
            return _weightMedium!!
        }
        _weightMedium = Builder(name = "WeightMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.448f, 6.0f)
                horizontalLineToRelative(7.73f)
                lineToRelative(0.066f, 0.424f)
                lineToRelative(3.0f, 19.5f)
                lineToRelative(0.09f, 0.576f)
                lineTo(4.666f, 31.25f)
                lineToRelative(0.089f, -0.576f)
                lineToRelative(3.0f, -19.5f)
                lineToRelative(0.065f, -0.424f)
                horizontalLineToRelative(7.73f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.448f, -6.0f)
                moveTo(5.833f, 30.25f)
                horizontalLineToRelative(24.334f)
                lineToRelative(-2.846f, -18.5f)
                lineTo(8.68f, 11.75f)
                close()
                moveTo(22.168f, 17.81f)
                quadToRelative(1.688f, 0.001f, 2.748f, 1.09f)
                quadToRelative(0.792f, 0.822f, 0.91f, 1.934f)
                horizontalLineToRelative(-1.811f)
                quadToRelative(-0.141f, -0.692f, -0.63f, -1.078f)
                quadToRelative(-0.49f, -0.386f, -1.24f, -0.386f)
                quadToRelative(-1.136f, 0.0f, -1.757f, 0.878f)
                quadToRelative(-0.545f, 0.767f, -0.545f, 2.074f)
                quadToRelative(0.0f, 1.278f, 0.509f, 2.029f)
                quadToRelative(0.628f, 0.918f, 1.852f, 0.919f)
                quadToRelative(0.886f, -0.001f, 1.45f, -0.533f)
                quadToRelative(0.566f, -0.536f, 0.595f, -1.401f)
                horizontalLineToRelative(-1.903f)
                verticalLineToRelative(-1.371f)
                horizontalLineToRelative(3.597f)
                verticalLineToRelative(4.617f)
                horizontalLineToRelative(-1.196f)
                lineToRelative(-0.187f, -0.977f)
                quadToRelative(-0.95f, 1.182f, -2.56f, 1.183f)
                quadToRelative(-1.964f, 0.001f, -3.1f, -1.454f)
                quadToRelative(-0.944f, -1.213f, -0.944f, -2.994f)
                quadToRelative(0.0f, -2.02f, 1.23f, -3.31f)
                quadToRelative(1.155f, -1.22f, 2.982f, -1.22f)
                moveToRelative(-10.141f, 3.75f)
                lineToRelative(3.357f, -3.543f)
                horizontalLineToRelative(2.367f)
                lineToRelative(-3.357f, 3.386f)
                lineToRelative(3.674f, 5.18f)
                horizontalLineToRelative(-2.362f)
                lineToRelative(-2.6f, -3.845f)
                lineToRelative(-1.08f, 1.078f)
                verticalLineToRelative(2.767f)
                horizontalLineToRelative(-1.868f)
                verticalLineToRelative(-8.566f)
                horizontalLineToRelative(1.869f)
                close()
                moveTo(18.0f, 5.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
        .build()
        return _weightMedium!!
    }

private var _weightMedium: ImageVector? = null
