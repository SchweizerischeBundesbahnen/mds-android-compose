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

public val SBBIcons.BulbOnMedium: ImageVector
    get() {
        if (_bulbOnMedium != null) {
            return _bulbOnMedium!!
        }
        _bulbOnMedium = Builder(name = "BulbOnMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.5f, 8.25f)
                lineTo(18.5f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.25f)
                close()
                moveTo(23.304f, 9.746f)
                lineTo(24.357f, 7.816f)
                lineTo(23.479f, 7.336f)
                lineTo(22.426f, 9.268f)
                close()
                moveTo(24.25f, 18.0f)
                arcTo(6.22f, 6.22f, 0.0f, false, false, 18.0f, 11.75f)
                arcTo(6.22f, 6.22f, 0.0f, false, false, 11.75f, 18.0f)
                curveToRelative(0.0f, 2.305f, 1.332f, 4.363f, 3.236f, 5.5f)
                horizontalLineToRelative(6.043f)
                curveToRelative(1.872f, -0.99f, 3.221f, -3.175f, 3.221f, -5.5f)
                moveToRelative(-13.5f, 0.0f)
                curveToRelative(0.0f, 2.387f, 1.216f, 4.515f, 3.0f, 5.87f)
                verticalLineToRelative(3.635f)
                lineToRelative(0.335f, 0.117f)
                lineToRelative(2.665f, 0.932f)
                verticalLineToRelative(1.196f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1.196f)
                lineToRelative(2.665f, -0.932f)
                lineToRelative(0.335f, -0.117f)
                verticalLineToRelative(-3.59f)
                curveToRelative(1.8f, -1.299f, 3.0f, -3.548f, 3.0f, -5.915f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 18.0f, 10.75f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 10.75f, 18.0f)
                moveToRelative(4.0f, 8.795f)
                lineToRelative(2.665f, 0.933f)
                lineToRelative(0.335f, 0.118f)
                verticalLineToRelative(0.904f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.904f)
                lineToRelative(0.335f, -0.117f)
                lineToRelative(2.665f, -0.934f)
                lineTo(21.25f, 24.5f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(28.507f, 12.365f)
                lineTo(26.582f, 13.425f)
                lineTo(26.1f, 12.55f)
                lineTo(28.024f, 11.488f)
                close()
                moveTo(30.0f, 18.504f)
                lineToRelative(0.002f, -1.0f)
                lineToRelative(-2.25f, -0.005f)
                lineToRelative(-0.002f, 1.0f)
                close()
                moveTo(28.517f, 23.626f)
                lineTo(28.046f, 24.508f)
                lineTo(26.098f, 23.469f)
                lineTo(26.568f, 22.586f)
                close()
                moveTo(7.821f, 24.484f)
                lineTo(9.785f, 23.314f)
                lineTo(9.274f, 22.455f)
                lineTo(7.309f, 23.625f)
                close()
                moveTo(8.251f, 17.499f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 18.499f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(9.317f, 13.639f)
                lineTo(9.858f, 12.799f)
                lineTo(7.936f, 11.564f)
                lineTo(7.396f, 12.404f)
                close()
                moveTo(13.573f, 9.272f)
                lineTo(12.698f, 9.754f)
                lineTo(11.634f, 7.821f)
                lineTo(12.51f, 7.338f)
                close()
            }
        }
        .build()
        return _bulbOnMedium!!
    }

private var _bulbOnMedium: ImageVector? = null
