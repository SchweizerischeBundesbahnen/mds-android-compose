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

public val SBBIcons.DogSmall: ImageVector
    get() {
        if (_dogSmall != null) {
            return _dogSmall!!
        }
        _dogSmall = Builder(name = "DogSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.207f, 10.5f)
                lineTo(18.0f, 7.293f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-0.854f, 0.853f)
                lineToRelative(-3.882f, 3.882f)
                lineTo(6.46f, 10.0f)
                horizontalLineToRelative(-0.002f)
                quadToRelative(-0.039f, 0.0f, -0.114f, -0.003f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, true, -1.7f, -0.267f)
                curveToRelative(-0.46f, -0.14f, -0.88f, -0.344f, -1.177f, -0.623f)
                arcTo(1.43f, 1.43f, 0.0f, false, true, 3.0f, 8.009f)
                lineTo(2.0f, 8.009f)
                curveToRelative(0.0f, 0.785f, 0.316f, 1.388f, 0.782f, 1.826f)
                curveToRelative(0.453f, 0.426f, 1.034f, 0.687f, 1.572f, 0.851f)
                arcTo(7.6f, 7.6f, 0.0f, false, false, 6.0f, 10.98f)
                lineTo(6.0f, 20.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-9.066f)
                lineToRelative(6.57f, -0.939f)
                lineToRelative(0.165f, -0.023f)
                lineTo(17.0f, 6.707f)
                verticalLineToRelative(1.0f)
                lineToRelative(2.793f, 2.793f)
                lineToRelative(-1.293f, 1.293f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-1.5f, 1.5f)
                lineTo(16.0f, 20.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.293f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(1.0f, 1.0f)
                close()
                moveTo(15.0f, 20.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.507f)
                curveToRelative(-0.795f, 0.01f, -1.324f, 0.533f, -1.656f, 1.128f)
                curveToRelative(-0.33f, 0.591f, -0.525f, 1.344f, -0.643f, 2.05f)
                curveToRelative(-0.12f, 0.715f, -0.168f, 1.423f, -0.186f, 1.949f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, -0.009f, 0.82f)
                verticalLineToRelative(0.067f)
                lineToRelative(1.0f, -0.029f)
                verticalLineToRelative(-0.069f)
                lineToRelative(-0.002f, -0.153f)
                curveToRelative(0.0f, -0.144f, 0.002f, -0.352f, 0.01f, -0.601f)
                curveToRelative(0.019f, -0.5f, 0.064f, -1.162f, 0.174f, -1.819f)
                curveToRelative(0.11f, -0.665f, 0.282f, -1.285f, 0.529f, -1.727f)
                curveToRelative(0.215f, -0.385f, 0.443f, -0.565f, 0.69f, -0.607f)
                lineToRelative(0.107f, -0.01f)
                lineTo(14.0f, 14.999f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.5f, 9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
            }
        }
        .build()
        return _dogSmall!!
    }

private var _dogSmall: ImageVector? = null
