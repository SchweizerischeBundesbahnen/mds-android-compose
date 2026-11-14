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
                moveTo(22.25f, 6.599f)
                lineTo(22.25f, 3.25f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(3.348f)
                lineToRelative(-1.716f, 2.575f)
                lineToRelative(0.832f, 0.555f)
                lineTo(14.25f, 7.65f)
                lineToRelative(2.5f, 3.75f)
                lineTo(16.75f, 13.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(6.5f)
                lineTo(24.25f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-9.901f)
                close()
                moveTo(17.518f, 10.75f)
                horizontalLineToRelative(6.298f)
                lineToRelative(-2.333f, -3.5f)
                horizontalLineToRelative(-6.299f)
                close()
                moveTo(14.75f, 4.25f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(31.147f, 31.854f)
                lineTo(31.854f, 31.147f)
                lineTo(4.854f, 4.147f)
                lineTo(4.147f, 4.854f)
                lineTo(10.75f, 11.457f)
                lineTo(10.75f, 32.75f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-6.793f)
                close()
                moveTo(11.75f, 31.75f)
                lineTo(11.75f, 12.457f)
                lineToRelative(5.0f, 5.0f)
                lineTo(16.75f, 31.75f)
                close()
                moveTo(17.75f, 31.75f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-6.793f)
                lineToRelative(-6.5f, -6.5f)
                close()
            }
        }
        .build()
        return _milkBrickDisabledMedium!!
    }

private var _milkBrickDisabledMedium: ImageVector? = null
