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
                moveToRelative(5.569f, 3.69f)
                lineToRelative(0.86f, -1.433f)
                lineToRelative(-0.858f, -0.515f)
                lineToRelative(-1.5f, 2.5f)
                lineToRelative(-0.257f, 0.43f)
                lineToRelative(0.429f, 0.256f)
                lineToRelative(2.5f, 1.5f)
                lineToRelative(0.514f, -0.857f)
                lineToRelative(-1.496f, -0.898f)
                arcTo(24.2f, 24.2f, 0.0f, false, true, 11.5f, 4.0f)
                curveToRelative(1.96f, 0.0f, 3.907f, 0.228f, 5.737f, 0.674f)
                lineToRelative(-1.494f, 0.897f)
                lineToRelative(0.514f, 0.857f)
                lineToRelative(2.5f, -1.5f)
                lineToRelative(0.429f, -0.257f)
                lineToRelative(-0.257f, -0.429f)
                lineToRelative(-1.5f, -2.5f)
                lineToRelative(-0.858f, 0.515f)
                lineToRelative(0.862f, 1.436f)
                arcTo(25.4f, 25.4f, 0.0f, false, false, 11.5f, 3.0f)
                curveToRelative(-2.032f, 0.0f, -4.03f, 0.229f, -5.931f, 0.69f)
                moveTo(7.0f, 8.499f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.673f, 1.5f, 1.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 7.999f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-12.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(13.0f, 7.999f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(5.828f, 7.642f)
                lineTo(2.968f, 8.689f)
                lineTo(3.14f, 9.159f)
                lineTo(2.968f, 8.689f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.896f, 1.923f)
                lineToRelative(0.001f, 0.003f)
                lineToRelative(3.458f, 9.31f)
                lineToRelative(0.938f, -0.348f)
                lineToRelative(-3.457f, -9.307f)
                verticalLineToRelative(-0.002f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.299f, -0.64f)
                lineToRelative(2.86f, -1.048f)
                close()
                moveTo(19.97f, 8.688f)
                lineToRelative(-2.86f, -1.047f)
                lineToRelative(-0.343f, 0.938f)
                lineToRelative(2.86f, 1.048f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.3f, 0.64f)
                verticalLineToRelative(0.002f)
                lineToRelative(-3.457f, 9.307f)
                lineToRelative(0.938f, 0.348f)
                lineToRelative(3.457f, -9.31f)
                lineToRelative(0.001f, -0.003f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.896f, -1.923f)
                lineToRelative(-0.171f, 0.47f)
                close()
            }
        }
        .build()
        return _smartphoneShakingSmall!!
    }

private var _smartphoneShakingSmall: ImageVector? = null
