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

public val SBBIcons.PlatformDisplayMedium: ImageVector
    get() {
        if (_platformDisplayMedium != null) {
            return _platformDisplayMedium!!
        }
        _platformDisplayMedium = Builder(name = "PlatformDisplayMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.75f, 13.75f)
                horizontalLineToRelative(2.5f)
                lineTo(6.25f, 12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(21.502f)
                lineTo(28.752f, 12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(2.998f)
                verticalLineToRelative(10.0f)
                lineTo(3.25f, 23.75f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(4.25f, 14.75f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(6.0f, 17.75f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 16.75f)
                close()
                moveTo(30.0f, 17.75f)
                lineTo(10.5f, 17.75f)
                verticalLineToRelative(-1.0f)
                lineTo(30.0f, 16.75f)
                close()
                moveTo(10.5f, 20.751f)
                lineTo(30.0f, 20.751f)
                verticalLineToRelative(-1.0f)
                lineTo(10.5f, 19.751f)
                close()
            }
        }
        .build()
        return _platformDisplayMedium!!
    }

private var _platformDisplayMedium: ImageVector? = null
