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

public val SBBIcons.TravelBackpackSmall: ImageVector
    get() {
        if (_travelBackpackSmall != null) {
            return _travelBackpackSmall!!
        }
        _travelBackpackSmall = Builder(name = "TravelBackpackSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 17.9f)
                curveToRelative(0.0f, -0.776f, -0.32f, -1.225f, -0.7f, -1.498f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -1.1f, -0.395f)
                lineTo(18.07f, 16.0f)
                lineTo(18.0f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.895f)
                quadToRelative(0.045f, -0.001f, 0.076f, -0.031f)
                arcTo(0.1f, 0.1f, 0.0f, false, false, 20.0f, 20.9f)
                close()
                moveTo(17.0f, 11.184f)
                arcToRelative(7.79f, 7.79f, 0.0f, false, true, -4.5f, 1.799f)
                lineTo(12.5f, 14.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.018f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 7.0f, 11.184f)
                lineTo(7.0f, 21.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(7.0f, 9.804f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 2.19f, 1.587f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 2.31f, 0.588f)
                lineTo(11.5f, 11.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.979f)
                arcTo(6.8f, 6.8f, 0.0f, false, false, 17.0f, 9.805f)
                lineTo(17.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                close()
                moveTo(4.0f, 20.9f)
                quadToRelative(0.0f, 0.039f, 0.03f, 0.069f)
                reflectiveQuadToRelative(0.075f, 0.031f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-0.078f)
                curveToRelative(-0.511f, 0.0f, -1.0f, 0.201f, -1.36f, 0.558f)
                curveToRelative(-0.36f, 0.356f, -0.562f, 0.84f, -0.562f, 1.342f)
                close()
                moveTo(19.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(16.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(5.0f, 6.501f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 5.499f, 7.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 3.0f)
                lineTo(5.501f, 3.0f)
                curveToRelative(-0.277f, 0.0f, -0.5f, 0.224f, -0.501f, 0.501f)
                close()
                moveTo(20.0f, 6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 8.0f)
                lineTo(18.0f, 8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(0.087f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 1.797f, 0.59f)
                curveToRelative(0.63f, 0.453f, 1.116f, 1.198f, 1.116f, 2.31f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, true, -1.105f, 1.1f)
                lineTo(4.105f, 22.0f)
                arcTo(1.098f, 1.098f, 0.0f, false, true, 3.0f, 20.9f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.77f, 0.31f, -1.509f, 0.857f, -2.052f)
                arcTo(2.93f, 2.93f, 0.0f, false, true, 5.922f, 15.0f)
                lineTo(6.0f, 15.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(-0.501f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 6.501f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.829f, 0.672f, -1.5f, 1.501f, -1.501f)
                lineTo(18.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 3.5f)
                close()
            }
        }
        .build()
        return _travelBackpackSmall!!
    }

private var _travelBackpackSmall: ImageVector? = null
