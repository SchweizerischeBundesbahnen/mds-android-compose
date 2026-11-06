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
                moveTo(17.5f, 6.0f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(1.0f)
                lineTo(18.5f, 6.0f)
                close()
                moveTo(23.479f, 7.337f)
                lineTo(22.426f, 9.267f)
                lineTo(23.304f, 9.747f)
                lineTo(24.357f, 7.816f)
                close()
                moveTo(18.0f, 11.75f)
                arcTo(6.22f, 6.22f, 0.0f, false, false, 11.75f, 18.0f)
                curveToRelative(0.0f, 2.304f, 1.332f, 4.363f, 3.235f, 5.5f)
                horizontalLineToRelative(6.044f)
                curveToRelative(1.872f, -0.99f, 3.221f, -3.175f, 3.221f, -5.5f)
                arcTo(6.22f, 6.22f, 0.0f, false, false, 18.0f, 11.75f)
                moveTo(10.75f, 18.0f)
                curveToRelative(0.0f, 2.387f, 1.217f, 4.514f, 3.0f, 5.87f)
                verticalLineToRelative(3.635f)
                lineToRelative(0.335f, 0.117f)
                lineToRelative(2.665f, 0.933f)
                verticalLineToRelative(1.195f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1.195f)
                lineToRelative(2.665f, -0.933f)
                lineToRelative(0.335f, -0.117f)
                verticalLineToRelative(-3.59f)
                curveToRelative(1.8f, -1.299f, 3.0f, -3.548f, 3.0f, -5.915f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 18.0f, 10.75f)
                arcTo(7.22f, 7.22f, 0.0f, false, false, 10.75f, 18.0f)
                moveToRelative(4.0f, 6.5f)
                verticalLineToRelative(2.295f)
                lineToRelative(2.665f, 0.933f)
                lineToRelative(0.335f, 0.117f)
                verticalLineToRelative(0.905f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-0.905f)
                lineToRelative(0.335f, -0.117f)
                lineToRelative(2.665f, -0.933f)
                lineTo(21.25f, 24.5f)
                close()
                moveTo(26.1f, 12.55f)
                lineToRelative(1.924f, -1.062f)
                lineToRelative(0.483f, 0.876f)
                lineToRelative(-1.924f, 1.062f)
                close()
                moveTo(27.749f, 18.5f)
                lineTo(29.999f, 18.506f)
                lineTo(30.001f, 17.506f)
                lineTo(27.751f, 17.5f)
                close()
                moveTo(28.045f, 24.51f)
                lineTo(26.097f, 23.47f)
                lineTo(26.567f, 22.588f)
                lineTo(28.516f, 23.628f)
                close()
                moveTo(7.82f, 24.484f)
                lineToRelative(1.965f, -1.17f)
                lineToRelative(-0.512f, -0.859f)
                lineToRelative(-1.965f, 1.17f)
                close()
                moveTo(8.25f, 18.499f)
                lineTo(6.0f, 18.499f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.25f)
                close()
                moveTo(7.394f, 12.404f)
                lineTo(9.316f, 13.64f)
                lineTo(9.856f, 12.8f)
                lineTo(7.936f, 11.563f)
                close()
                moveTo(12.696f, 9.754f)
                lineTo(11.633f, 7.821f)
                lineTo(12.509f, 7.339f)
                lineTo(13.573f, 9.272f)
                close()
            }
        }
        .build()
        return _bulbOnMedium!!
    }

private var _bulbOnMedium: ImageVector? = null
