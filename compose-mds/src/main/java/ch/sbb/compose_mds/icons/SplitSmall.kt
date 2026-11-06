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

public val SBBIcons.SplitSmall: ImageVector
    get() {
        if (_splitSmall != null) {
            return _splitSmall!!
        }
        _splitSmall = Builder(name = "SplitSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.5f, 3.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.31f)
                lineToRelative(-0.271f, 0.28f)
                lineToRelative(-0.002f, 0.002f)
                verticalLineToRelative(0.002f)
                curveToRelative(-1.522f, 1.577f, -2.95f, 3.059f, -5.115f, 4.244f)
                curveTo(12.261f, 9.985f, 8.455f, 11.0f, 2.0f, 11.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(6.455f, 0.0f, 10.26f, 1.015f, 12.922f, 2.472f)
                curveToRelative(2.165f, 1.185f, 3.593f, 2.667f, 5.114f, 4.244f)
                lineToRelative(0.274f, 0.284f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.274f)
                lineToRelative(-0.207f, -0.215f)
                curveToRelative(-1.529f, -1.588f, -3.08f, -3.199f, -5.39f, -4.464f)
                curveToRelative(-1.669f, -0.913f, -3.722f, -1.645f, -6.446f, -2.095f)
                curveToRelative(2.724f, -0.45f, 4.777f, -1.182f, 6.446f, -2.095f)
                curveToRelative(2.31f, -1.265f, 3.861f, -2.876f, 5.39f, -4.464f)
                lineTo(21.0f, 4.726f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _splitSmall!!
    }

private var _splitSmall: ImageVector? = null
