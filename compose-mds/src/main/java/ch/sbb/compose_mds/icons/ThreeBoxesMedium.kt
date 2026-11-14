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

public val SBBIcons.ThreeBoxesMedium: ImageVector
    get() {
        if (_threeBoxesMedium != null) {
            return _threeBoxesMedium!!
        }
        _threeBoxesMedium = Builder(name = "ThreeBoxesMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.75f, 18.25f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(5.75f, 30.25f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(17.75f, 30.25f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(13.501f, 22.25f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(25.501f, 22.25f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(11.75f, 18.25f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(19.501f, 10.25f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
            }
        }
        .build()
        return _threeBoxesMedium!!
    }

private var _threeBoxesMedium: ImageVector? = null
