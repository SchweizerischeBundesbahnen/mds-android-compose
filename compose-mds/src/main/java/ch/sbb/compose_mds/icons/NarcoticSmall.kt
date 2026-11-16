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

public val SBBIcons.NarcoticSmall: ImageVector
    get() {
        if (_narcoticSmall != null) {
            return _narcoticSmall!!
        }
        _narcoticSmall = Builder(name = "NarcoticSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(20.0f, 4.999f)
                lineToRelative(0.002f, -3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(2.001f)
                lineTo(19.0f, 21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 18.0f)
                lineTo(22.0f, 18.0f)
                lineTo(22.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 4.999f)
                close()
                moveTo(14.967f, 3.035f)
                arcToRelative(3.533f, 3.533f, 0.0f, false, false, -4.997f, 0.0f)
                lineTo(3.036f, 9.967f)
                arcToRelative(3.533f, 3.533f, 0.0f, false, false, 2.235f, 6.023f)
                curveToRelative(-0.173f, 0.47f, -0.271f, 0.977f, -0.271f, 1.51f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 4.973f, -4.475f)
                lineToRelative(4.994f, -4.994f)
                arcToRelative(3.533f, 3.533f, 0.0f, false, false, 0.0f, -4.996f)
                moveToRelative(-8.974f, 11.92f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, false, 1.333f, -0.698f)
                lineToRelative(1.003f, -1.003f)
                lineToRelative(0.027f, -0.027f)
                lineToRelative(0.107f, -0.106f)
                lineToRelative(1.977f, -1.977f)
                lineToRelative(-3.583f, -3.582f)
                lineToRelative(-3.114f, 3.113f)
                arcToRelative(2.533f, 2.533f, 0.0f, false, false, 2.147f, 4.3f)
                close()
                moveTo(7.564f, 6.855f)
                lineTo(11.146f, 10.437f)
                lineTo(14.26f, 7.324f)
                arcToRelative(2.534f, 2.534f, 0.0f, false, false, -3.39f, -3.756f)
                lineToRelative(-0.192f, 0.174f)
                close()
                moveTo(6.037f, 17.002f)
                curveToRelative(0.06f, -0.394f, 0.188f, -0.767f, 0.37f, -1.111f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.423f, -0.738f)
                lineToRelative(0.006f, -0.006f)
                quadToRelative(0.094f, -0.08f, 0.184f, -0.17f)
                lineToRelative(0.013f, -0.012f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.604f, -0.605f)
                lineToRelative(0.315f, -0.316f)
                quadToRelative(0.268f, -0.043f, 0.547f, -0.043f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, 3.001f)
                close()
                moveTo(6.036f, 18.002f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, false, 6.928f, 0.0f)
                close()
                moveTo(20.0f, 5.999f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(19.0f, 5.999f)
                close()
                moveTo(18.0f, 17.0f)
                horizontalLineToRelative(3.0f)
                lineTo(21.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _narcoticSmall!!
    }

private var _narcoticSmall: ImageVector? = null
