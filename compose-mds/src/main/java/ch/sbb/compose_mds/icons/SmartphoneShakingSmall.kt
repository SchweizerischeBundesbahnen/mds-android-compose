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

public val SBBIcons.SmartphoneShakingSmall: ImageVector
    get() {
        if (_smartphoneShakingSmall != null) {
            return _smartphoneShakingSmall!!
        }
        _smartphoneShakingSmall = Builder(name = "SmartphoneShakingSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(5.568f, 3.69f)
                lineToRelative(0.86f, -1.433f)
                lineToRelative(-0.857f, -0.514f)
                lineToRelative(-1.5f, 2.5f)
                lineToRelative(-0.257f, 0.429f)
                lineToRelative(0.43f, 0.256f)
                lineToRelative(2.5f, 1.5f)
                lineToRelative(0.513f, -0.857f)
                lineToRelative(-1.496f, -0.898f)
                arcTo(24.2f, 24.2f, 0.0f, false, true, 11.5f, 4.0f)
                curveToRelative(1.96f, 0.0f, 3.906f, 0.228f, 5.737f, 0.674f)
                lineToRelative(-1.494f, 0.897f)
                lineToRelative(0.514f, 0.857f)
                lineToRelative(2.5f, -1.5f)
                lineToRelative(0.429f, -0.256f)
                lineToRelative(-0.257f, -0.43f)
                lineToRelative(-1.5f, -2.5f)
                lineToRelative(-0.858f, 0.515f)
                lineToRelative(0.862f, 1.436f)
                curveTo(15.533f, 3.233f, 13.52f, 3.0f, 11.5f, 3.0f)
                curveToRelative(-2.032f, 0.0f, -4.03f, 0.229f, -5.932f, 0.69f)
                moveTo(7.0f, 20.5f)
                lineTo(7.0f, 8.498f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.4f, -0.49f)
                lineToRelative(-0.1f, -0.01f)
                lineToRelative(-6.0f, -0.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(13.0f, 7.998f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(3.312f, 9.628f)
                lineToRelative(2.86f, -1.048f)
                lineToRelative(-0.344f, -0.94f)
                lineToRelative(-2.86f, 1.049f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.896f, 1.922f)
                lineToRelative(0.001f, 0.003f)
                lineToRelative(3.459f, 9.31f)
                lineToRelative(0.936f, -0.348f)
                lineToRelative(-3.456f, -9.307f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.299f, -0.64f)
                close()
                moveTo(16.767f, 8.58f)
                lineToRelative(2.86f, 1.048f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.3f, 0.64f)
                lineToRelative(-3.456f, 9.308f)
                lineToRelative(0.936f, 0.348f)
                lineToRelative(3.458f, -9.31f)
                lineToRelative(0.001f, -0.003f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.896f, -1.921f)
                verticalLineToRelative(-0.001f)
                lineTo(17.11f, 7.64f)
                close()
            }
        }
        .build()
        return _smartphoneShakingSmall!!
    }

private var _smartphoneShakingSmall: ImageVector? = null
