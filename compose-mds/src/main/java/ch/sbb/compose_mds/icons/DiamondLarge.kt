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
        _diamondLarge = Builder(
            name = "DiamondLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(11.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                lineTo(15.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                close()
                moveTo(12.884f, 6.605f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 11.5f, 8.062f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.938f, 6.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.457f, -1.384f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.489f, 1.489f)
                moveTo(16.368f, 10.0f)
                horizontalLineToRelative(-0.266f)
                lineToRelative(-0.149f, 0.222f)
                lineToRelative(-7.368f, 11.0f)
                lineToRelative(-0.197f, 0.293f)
                lineToRelative(0.211f, 0.284f)
                lineToRelative(17.5f, 23.5f)
                lineToRelative(0.402f, 0.538f)
                lineToRelative(0.4f, -0.538f)
                lineToRelative(17.5f, -23.5f)
                lineToRelative(0.211f, -0.284f)
                lineToRelative(-0.197f, -0.293f)
                lineToRelative(-7.368f, -11.0f)
                lineToRelative(-0.148f, -0.222f)
                lineTo(16.368f, 10.0f)
                moveToRelative(-0.178f, 1.665f)
                lineTo(9.937f, 21.0f)
                horizontalLineToRelative(8.995f)
                close()
                moveTo(9.996f, 22.0f)
                lineToRelative(15.24f, 20.466f)
                lineTo(19.227f, 22.0f)
                close()
                moveTo(27.766f, 42.465f)
                lineTo(43.003f, 22.0f)
                horizontalLineToRelative(-9.228f)
                close()
                moveTo(43.062f, 21.0f)
                lineToRelative(-6.253f, -9.334f)
                lineTo(34.07f, 21.0f)
                close()
                moveTo(35.962f, 11.0f)
                horizontalLineToRelative(-8.559f)
                lineToRelative(5.83f, 9.293f)
                close()
                moveTo(19.765f, 20.293f)
                lineTo(25.596f, 11.0f)
                horizontalLineToRelative(-8.56f)
                close()
                moveTo(26.499f, 11.441f)
                lineTo(20.503f, 21.0f)
                horizontalLineToRelative(11.994f)
                close()
                moveTo(32.733f, 22.0f)
                lineToRelative(-6.232f, 21.221f)
                lineTo(20.268f, 22.0f)
                close()
                moveTo(6.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(6.5f, 14.341f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.841f, -0.841f)
                curveToRelative(0.333f, -0.222f, 0.62f, -0.508f, 0.841f, -0.841f)
                curveToRelative(0.222f, 0.333f, 0.508f, 0.62f, 0.841f, 0.841f)
                curveToRelative(-0.333f, 0.222f, -0.62f, 0.508f, -0.841f, 0.841f)
            }
        }
            .build()
        return _diamondLarge!!
    }

private var _diamondLarge: ImageVector? = null
