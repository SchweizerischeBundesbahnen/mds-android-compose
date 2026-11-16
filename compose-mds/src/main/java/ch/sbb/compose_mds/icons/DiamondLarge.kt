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

public val SBBIcons.DiamondLarge: ImageVector
    get() {
        if (_diamondLarge != null) {
            return _diamondLarge!!
        }
        _diamondLarge = Builder(name = "DiamondLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.395f, 5.116f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 9.938f, 6.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 11.5f, 8.062f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.384f, -1.457f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.489f, -1.489f)
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                moveToRelative(22.047f, 3.222f)
                lineTo(36.898f, 10.0f)
                lineTo(16.102f, 10.0f)
                lineToRelative(-0.149f, 0.222f)
                lineToRelative(-7.368f, 11.0f)
                lineToRelative(-0.197f, 0.294f)
                lineToRelative(0.21f, 0.283f)
                lineToRelative(17.502f, 23.5f)
                lineToRelative(0.401f, 0.538f)
                lineToRelative(0.4f, -0.538f)
                lineToRelative(17.5f, -23.5f)
                lineToRelative(0.211f, -0.283f)
                lineToRelative(-0.197f, -0.294f)
                close()
                moveTo(9.996f, 22.0f)
                lineToRelative(15.24f, 20.465f)
                lineTo(19.226f, 22.0f)
                close()
                moveTo(27.766f, 42.462f)
                lineTo(43.003f, 22.0f)
                horizontalLineToRelative(-9.228f)
                close()
                moveTo(43.064f, 21.0f)
                lineToRelative(-6.254f, -9.334f)
                lineTo(34.07f, 21.0f)
                close()
                moveTo(35.964f, 11.0f)
                horizontalLineToRelative(-8.56f)
                lineToRelative(5.83f, 9.293f)
                close()
                moveTo(19.766f, 20.293f)
                lineTo(25.596f, 11.0f)
                horizontalLineToRelative(-8.56f)
                close()
                moveTo(26.5f, 11.44f)
                lineTo(20.504f, 21.0f)
                horizontalLineToRelative(11.993f)
                close()
                moveTo(16.19f, 11.665f)
                lineTo(9.935f, 21.0f)
                horizontalLineToRelative(8.997f)
                close()
                moveTo(20.267f, 22.0f)
                lineToRelative(6.234f, 21.221f)
                lineTo(32.734f, 22.0f)
                close()
                moveTo(5.66f, 13.5f)
                curveToRelative(0.333f, -0.222f, 0.62f, -0.508f, 0.841f, -0.841f)
                curveToRelative(0.222f, 0.333f, 0.508f, 0.62f, 0.841f, 0.841f)
                curveToRelative(-0.333f, 0.222f, -0.62f, 0.508f, -0.841f, 0.841f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.841f, -0.841f)
                moveTo(6.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(6.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
            }
        }
        .build()
        return _diamondLarge!!
    }

private var _diamondLarge: ImageVector? = null
