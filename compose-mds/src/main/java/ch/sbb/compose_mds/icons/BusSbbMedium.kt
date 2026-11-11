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

public val SBBIcons.BusSbbMedium: ImageVector
    get() {
        if (_busSbbMedium != null) {
            return _busSbbMedium!!
        }
        _busSbbMedium = Builder(name = "BusSbbMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.75f, 9.0f)
                curveToRelative(0.0f, -1.211f, -0.282f, -1.995f, -0.769f, -2.481f)
                curveToRelative(-0.486f, -0.487f, -1.27f, -0.769f, -2.481f, -0.769f)
                horizontalLineToRelative(-15.0f)
                curveToRelative(-1.211f, 0.0f, -1.995f, 0.282f, -2.481f, 0.769f)
                curveToRelative(-0.487f, 0.486f, -0.769f, 1.27f, -0.769f, 2.481f)
                verticalLineToRelative(7.75f)
                horizontalLineToRelative(21.5f)
                close()
                moveTo(7.25f, 27.25f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(9.5f)
                close()
                moveTo(29.75f, 28.25f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.498f)
                verticalLineToRelative(-3.0f)
                lineTo(11.75f, 28.25f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-15.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.5f)
                lineTo(6.25f, 9.0f)
                curveToRelative(0.0f, -1.348f, 0.313f, -2.44f, 1.062f, -3.188f)
                curveToRelative(0.748f, -0.75f, 1.84f, -1.062f, 3.188f, -1.062f)
                horizontalLineToRelative(15.0f)
                curveToRelative(1.348f, 0.0f, 2.44f, 0.313f, 3.189f, 1.062f)
                curveToRelative(0.748f, 0.748f, 1.061f, 1.84f, 1.061f, 3.188f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(29.75f, 15.25f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(6.25f, 14.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(25.252f, 28.25f)
                horizontalLineToRelative(3.498f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.498f)
                close()
                moveTo(7.25f, 28.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(25.5f, 7.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.75f, 24.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.25f, 0.25f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, -0.001f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                moveToRelative(13.75f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.501f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                moveToRelative(-3.899f, -3.5f)
                lineTo(19.2f, 19.5f)
                lineTo(21.0f, 19.5f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(-1.8f)
                lineToRelative(2.401f, -2.25f)
                lineTo(18.75f, 23.25f)
                verticalLineToRelative(2.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.25f)
                lineTo(14.4f, 23.25f)
                lineToRelative(2.4f, 2.25f)
                lineTo(15.0f, 25.5f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(1.8f)
                lineToRelative(-2.4f, 2.25f)
                horizontalLineToRelative(2.85f)
                lineTo(17.25f, 19.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.25f)
                close()
            }
        }
        .build()
        return _busSbbMedium!!
    }

private var _busSbbMedium: ImageVector? = null
