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

public val SBBIcons.FreightWagonContainerPairMedium: ImageVector
    get() {
        if (_freightWagonContainerPairMedium != null) {
            return _freightWagonContainerPairMedium!!
        }
        _freightWagonContainerPairMedium = Builder(
            name = "FreightWagonContainerPairMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(16.25f, 24.25f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.0f)
                lineTo(24.25f, 7.75f)
                lineTo(33.0f, 7.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.75f)
                verticalLineToRelative(15.5f)
                lineTo(33.0f, 24.25f)
                verticalLineToRelative(1.0f)
                lineTo(22.25f, 25.25f)
                verticalLineToRelative(2.0f)
                lineTo(33.0f, 27.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(0.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(0.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                verticalLineToRelative(-0.25f)
                lineTo(3.0f, 28.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.25f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.25f)
                lineTo(15.25f, 8.75f)
                lineTo(3.0f, 8.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.25f)
                close()
                moveTo(13.25f, 28.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(23.75f, 28.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
            .build()
        return _freightWagonContainerPairMedium!!
    }

private var _freightWagonContainerPairMedium: ImageVector? = null
