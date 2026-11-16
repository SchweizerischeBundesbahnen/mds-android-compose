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

public val SBBIcons.PowerPlugMedium: ImageVector
    get() {
        if (_powerPlugMedium != null) {
            return _powerPlugMedium!!
        }
        _powerPlugMedium = Builder(name = "PowerPlugMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.25f, 4.5f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(11.0f)
                lineTo(24.25f, 4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(3.0f)
                lineTo(28.25f, 18.0f)
                curveToRelative(0.0f, 3.334f, -2.73f, 5.75f, -5.75f, 5.75f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.5f)
                lineTo(15.0f, 23.75f)
                curveToRelative(-3.423f, 0.0f, -5.75f, -2.876f, -5.75f, -5.75f)
                verticalLineToRelative(-7.25f)
                horizontalLineToRelative(3.0f)
                lineTo(12.25f, 4.5f)
                close()
                moveTo(16.25f, 23.75f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(27.25f, 11.75f)
                horizontalLineToRelative(-17.0f)
                lineTo(10.25f, 18.0f)
                curveToRelative(0.0f, 2.383f, 1.939f, 4.75f, 4.75f, 4.75f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.503f, 0.0f, 4.75f, -2.003f, 4.75f, -4.75f)
                close()
            }
        }
        .build()
        return _powerPlugMedium!!
    }

private var _powerPlugMedium: ImageVector? = null
