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

public val SBBIcons.ThermometerMedium: ImageVector
    get() {
        if (_thermometerMedium != null) {
            return _thermometerMedium!!
        }
        _thermometerMedium = Builder(name = "ThermometerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.75f, 22.45f)
                arcTo(5.73f, 5.73f, 0.0f, false, true, 23.0f, 27.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -11.5f, 0.0f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, 2.25f, -4.55f)
                lineTo(13.75f, 4.75f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(14.75f, 22.96f)
                lineTo(14.536f, 23.11f)
                arcTo(4.74f, 4.74f, 0.0f, false, false, 12.5f, 27.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 9.5f, 0.0f)
                curveToRelative(0.0f, -1.51f, -0.708f, -2.852f, -1.81f, -3.723f)
                lineToRelative(-0.226f, -0.168f)
                lineToRelative(-0.214f, -0.148f)
                lineTo(19.75f, 5.75f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(17.75f, 24.297f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -1.0f, 0.0f)
                lineTo(16.75f, 12.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.25f, 25.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveToRelative(8.25f, -6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(25.5f, 16.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(25.5f, 13.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(25.5f, 10.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _thermometerMedium!!
    }

private var _thermometerMedium: ImageVector? = null
