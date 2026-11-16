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
                moveTo(22.0f, 9.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.31f)
                lineToRelative(-0.273f, 0.283f)
                curveToRelative(-1.521f, 1.578f, -2.95f, 3.06f, -5.114f, 4.244f)
                curveTo(12.26f, 9.985f, 8.455f, 11.0f, 2.0f, 11.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(6.455f, 0.0f, 10.261f, 1.015f, 12.923f, 2.473f)
                curveToRelative(2.164f, 1.185f, 3.593f, 2.666f, 5.114f, 4.243f)
                quadToRelative(0.135f, 0.143f, 0.273f, 0.284f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.274f)
                lineToRelative(-0.207f, -0.215f)
                curveToRelative(-1.53f, -1.588f, -3.08f, -3.2f, -5.39f, -4.464f)
                curveToRelative(-1.669f, -0.914f, -3.722f, -1.645f, -6.445f, -2.095f)
                curveToRelative(2.723f, -0.45f, 4.776f, -1.181f, 6.444f, -2.095f)
                curveToRelative(2.31f, -1.265f, 3.862f, -2.876f, 5.39f, -4.464f)
                lineTo(21.0f, 4.726f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _splitSmall!!
    }

private var _splitSmall: ImageVector? = null
