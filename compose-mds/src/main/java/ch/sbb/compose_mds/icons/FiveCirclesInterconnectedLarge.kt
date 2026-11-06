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

public val SBBIcons.FiveCirclesInterconnectedLarge: ImageVector
    get() {
        if (_fiveCirclesInterconnectedLarge != null) {
            return _fiveCirclesInterconnectedLarge!!
        }
        _fiveCirclesInterconnectedLarge = Builder(name = "FiveCirclesInterconnectedLarge",
                defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f,
                viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.085f, 3.878f)
                lineToRelative(10.536f, 10.536f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 4.17f)
                lineTo(26.585f, 37.122f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -4.17f, 0.0f)
                lineTo(11.877f, 26.585f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -4.17f)
                lineToRelative(10.536f, -10.537f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 24.5f, 8.0f)
                moveToRelative(0.0f, 29.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.5f, 37.0f)
                moveTo(12.95f, 24.999f)
                curveToRelative(-0.064f, 0.32f, -0.191f, 0.616f, -0.365f, 0.879f)
                lineToRelative(10.536f, 10.536f)
                curveToRelative(0.262f, -0.174f, 0.56f, -0.3f, 0.878f, -0.364f)
                verticalLineToRelative(-7.08f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 20.029f, 25.0f)
                close()
                moveTo(28.972f, 25.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -3.973f, 3.97f)
                verticalLineToRelative(7.08f)
                curveToRelative(0.32f, 0.065f, 0.616f, 0.19f, 0.879f, 0.364f)
                lineToRelative(10.536f, -10.536f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 36.05f, 25.0f)
                close()
                moveTo(24.5f, 21.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveToRelative(-14.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 23.0f)
                moveToRelative(28.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 38.5f, 23.0f)
                moveTo(25.878f, 12.585f)
                curveToRelative(-0.262f, 0.174f, -0.559f, 0.3f, -0.878f, 0.364f)
                verticalLineToRelative(7.08f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 28.972f, 24.0f)
                horizontalLineToRelative(7.078f)
                curveToRelative(0.065f, -0.32f, 0.19f, -0.616f, 0.364f, -0.879f)
                close()
                moveTo(12.585f, 23.121f)
                curveToRelative(0.174f, 0.262f, 0.3f, 0.559f, 0.364f, 0.878f)
                horizontalLineToRelative(7.08f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 24.0f, 20.029f)
                verticalLineToRelative(-7.08f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.879f, -0.364f)
                close()
                moveTo(24.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 24.5f, 9.0f)
            }
        }
        .build()
        return _fiveCirclesInterconnectedLarge!!
    }

private var _fiveCirclesInterconnectedLarge: ImageVector? = null
