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

public val SBBIcons.MilkBrickDisabledMedium: ImageVector
    get() {
        if (_milkBrickDisabledMedium != null) {
            return _milkBrickDisabledMedium!!
        }
        _milkBrickDisabledMedium = Builder(name = "MilkBrickDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.25f, 3.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.348f)
                lineToRelative(-1.716f, 2.575f)
                lineToRelative(0.832f, 0.554f)
                lineToRelative(1.384f, -2.076f)
                lineToRelative(2.5f, 3.75f)
                lineTo(16.75f, 13.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(6.5f)
                lineTo(24.25f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-9.901f)
                lineToRelative(-0.084f, -0.126f)
                lineToRelative(-2.916f, -4.374f)
                lineTo(22.25f, 3.25f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(3.268f, 7.5f)
                horizontalLineToRelative(6.298f)
                lineToRelative(-2.334f, -3.5f)
                horizontalLineToRelative(-6.298f)
                close()
                moveTo(21.25f, 6.25f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(17.75f, 18.457f)
                lineTo(24.25f, 24.957f)
                verticalLineToRelative(6.793f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(16.75f, 17.457f)
                lineTo(16.75f, 31.75f)
                horizontalLineToRelative(-5.0f)
                lineTo(11.75f, 12.457f)
                close()
                moveTo(11.25f, 32.75f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-6.793f)
                lineToRelative(5.897f, 5.897f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(-27.0f, -27.0f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(6.604f, 6.603f)
                lineTo(10.75f, 32.75f)
                close()
            }
        }
        .build()
        return _milkBrickDisabledMedium!!
    }

private var _milkBrickDisabledMedium: ImageVector? = null
