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

public val SBBIcons.MagicWandMedium: ImageVector
    get() {
        if (_magicWandMedium != null) {
            return _magicWandMedium!!
        }
        _magicWandMedium = Builder(name = "MagicWandMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 10.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                lineTo(15.0f, 7.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(11.5f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(29.5f, 10.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(28.5f, 3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.5f)
                lineTo(33.0f, 6.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(26.5f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1.0f)
                lineTo(26.5f, 26.0f)
                lineTo(30.0f, 26.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(25.457f, 14.25f)
                lineTo(6.75f, 32.957f)
                lineTo(3.043f, 29.25f)
                lineTo(21.75f, 10.543f)
                close()
                moveTo(4.457f, 29.25f)
                lineTo(6.75f, 31.543f)
                lineTo(18.043f, 20.25f)
                lineToRelative(-2.293f, -2.293f)
                close()
                moveTo(18.75f, 19.543f)
                lineTo(24.043f, 14.25f)
                lineTo(21.75f, 11.957f)
                lineTo(16.457f, 17.25f)
                close()
            }
        }
        .build()
        return _magicWandMedium!!
    }

private var _magicWandMedium: ImageVector? = null
