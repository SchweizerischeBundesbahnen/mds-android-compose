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

public val SBBIcons.MilkBrickDisabledSmall: ImageVector
    get() {
        if (_milkBrickDisabledSmall != null) {
            return _milkBrickDisabledSmall!!
        }
        _milkBrickDisabledSmall = Builder(name = "MilkBrickDisabledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(2.348f)
                lineTo(7.884f, 6.023f)
                lineToRelative(0.832f, 0.554f)
                lineToRelative(0.784f, -1.176f)
                lineToRelative(1.5f, 2.25f)
                lineTo(11.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.0f, 7.349f)
                lineToRelative(-0.084f, -0.126f)
                lineTo(15.0f, 4.349f)
                lineTo(15.0f, 2.0f)
                lineTo(9.5f, 2.0f)
                moveToRelative(2.268f, 5.0f)
                horizontalLineToRelative(3.798f)
                lineToRelative(-1.334f, -2.0f)
                horizontalLineToRelative(-3.798f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(16.0f, 16.707f)
                lineTo(16.0f, 21.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-8.293f)
                close()
                moveTo(11.0f, 11.707f)
                lineTo(11.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 8.707f)
                close()
                moveTo(7.5f, 22.0f)
                lineTo(17.0f, 22.0f)
                verticalLineToRelative(-4.293f)
                lineToRelative(3.646f, 3.647f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-18.0f, -18.0f)
                lineToRelative(-0.708f, 0.708f)
                lineTo(7.0f, 7.707f)
                lineTo(7.0f, 22.0f)
                close()
            }
        }
        .build()
        return _milkBrickDisabledSmall!!
    }

private var _milkBrickDisabledSmall: ImageVector? = null
