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

public val SBBIcons.SplitMedium: ImageVector
    get() {
        if (_splitMedium != null) {
            return _splitMedium!!
        }
        _splitMedium = Builder(name = "SplitMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.25f, 4.75f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.056f)
                quadToRelative(-0.41f, 0.422f, -0.812f, 0.84f)
                curveToRelative(-2.284f, 2.369f, -4.457f, 4.623f, -7.74f, 6.42f)
                curveToRelative(-4.042f, 2.214f, -9.797f, 3.74f, -19.504f, 3.74f)
                verticalLineToRelative(1.0f)
                curveToRelative(9.707f, 0.0f, 15.462f, 1.526f, 19.504f, 3.74f)
                curveToRelative(3.282f, 1.797f, 5.456f, 4.051f, 7.74f, 6.42f)
                quadToRelative(0.402f, 0.419f, 0.812f, 0.84f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.75f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(7.029f)
                lineToRelative(-0.75f, -0.776f)
                curveToRelative(-2.291f, -2.38f, -4.587f, -4.763f, -8.016f, -6.64f)
                curveToRelative(-2.804f, -1.536f, -6.352f, -2.73f, -11.273f, -3.363f)
                curveToRelative(4.92f, -0.632f, 8.469f, -1.827f, 11.273f, -3.362f)
                curveTo(26.413f, 12.01f, 28.709f, 9.626f, 31.0f, 7.247f)
                quadToRelative(0.374f, -0.389f, 0.749f, -0.776f)
                verticalLineTo(13.5f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _splitMedium!!
    }

private var _splitMedium: ImageVector? = null
