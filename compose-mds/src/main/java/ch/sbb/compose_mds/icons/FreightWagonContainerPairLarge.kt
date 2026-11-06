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

public val SBBIcons.FreightWagonContainerPairLarge: ImageVector
    get() {
        if (_freightWagonContainerPairLarge != null) {
            return _freightWagonContainerPairLarge!!
        }
        _freightWagonContainerPairLarge = Builder(name = "FreightWagonContainerPairLarge",
                defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f,
                viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.0f, 37.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                lineTo(30.0f, 10.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(1.0f)
                lineTo(31.0f, 11.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(1.0f)
                lineTo(31.0f, 37.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.036f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.928f, 0.0f)
                lineTo(30.0f, 40.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.036f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -6.928f, 0.0f)
                lineTo(2.0f, 40.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(22.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 37.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(22.0f)
                lineTo(24.0f, 11.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(15.052f, 40.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.896f, 0.0f)
                close()
                moveTo(36.052f, 40.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.896f, 0.0f)
                close()
                moveTo(5.0f, 34.0f)
                lineTo(4.0f, 34.0f)
                lineTo(4.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 34.0f)
                lineTo(8.0f, 34.0f)
                lineTo(8.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 34.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(12.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 34.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(21.0f, 34.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(35.0f, 34.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(34.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(39.0f, 34.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(38.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(43.0f, 34.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(42.0f, 13.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _freightWagonContainerPairLarge!!
    }

private var _freightWagonContainerPairLarge: ImageVector? = null
