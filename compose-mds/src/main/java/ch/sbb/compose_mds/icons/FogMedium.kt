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

public val SBBIcons.FogMedium: ImageVector
    get() {
        if (_fogMedium != null) {
            return _fogMedium!!
        }
        _fogMedium = Builder(name = "FogMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.5f, 10.25f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 9.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.5f, 12.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.5f, 16.25f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 15.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(28.5f, 15.25f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.5f, 19.265f)
                lineTo(28.5f, 19.25f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-18.0f, 0.015f)
                close()
            }
        }
        .build()
        return _fogMedium!!
    }

private var _fogMedium: ImageVector? = null
