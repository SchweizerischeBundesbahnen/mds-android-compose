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

public val SBBIcons.FreightWagonTruckContainerMedium: ImageVector
    get() {
        if (_freightWagonTruckContainerMedium != null) {
            return _freightWagonTruckContainerMedium!!
        }
        _freightWagonTruckContainerMedium = Builder(
            name = "FreightWagonTruckContainerMedium",
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
                moveTo(33.0f, 8.75f)
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
                horizontalLineToRelative(16.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.0f)
                lineTo(24.25f, 7.75f)
                lineTo(33.0f, 7.75f)
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
                moveTo(7.256f, 9.25f)
                horizontalLineToRelative(6.797f)
                curveToRelative(0.165f, 0.0f, 0.296f, 0.068f, 0.368f, 0.112f)
                curveToRelative(0.082f, 0.05f, 0.158f, 0.113f, 0.225f, 0.175f)
                curveToRelative(0.133f, 0.125f, 0.277f, 0.293f, 0.422f, 0.483f)
                curveToRelative(0.294f, 0.385f, 0.635f, 0.914f, 0.974f, 1.515f)
                curveToRelative(0.676f, 1.199f, 1.379f, 2.745f, 1.695f, 4.102f)
                lineToRelative(0.013f, 0.055f)
                verticalLineToRelative(6.558f)
                horizontalLineToRelative(-3.303f)
                curveToRelative(-0.455f, 0.89f, -1.38f, 1.5f, -2.447f, 1.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.447f, -1.5f)
                lineTo(3.006f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.25f)
                lineTo(6.256f, 8.75f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.25f)
                close()
                moveTo(12.0f, 19.25f)
                arcTo(1.75f, 1.75f, 0.0f, true, false, 13.75f, 21.0f)
                curveToRelative(0.0f, -0.962f, -0.785f, -1.75f, -1.75f, -1.75f)
                moveToRelative(-4.744f, 2.0f)
                horizontalLineToRelative(2.007f)
                arcToRelative(2.754f, 2.754f, 0.0f, false, true, 2.737f, -3.0f)
                arcToRelative(2.754f, 2.754f, 0.0f, false, true, 2.737f, 3.0f)
                horizontalLineToRelative(2.013f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-6.0f)
                lineTo(7.256f, 10.25f)
                close()
                moveTo(11.75f, 15.25f)
                horizontalLineToRelative(4.843f)
                curveToRelative(-0.332f, -1.079f, -0.877f, -2.256f, -1.422f, -3.224f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -0.898f, -1.399f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.311f, -0.36f)
                lineToRelative(-0.02f, -0.017f)
                lineTo(11.75f, 10.25f)
                close()
            }
        }
            .build()
        return _freightWagonTruckContainerMedium!!
    }

private var _freightWagonTruckContainerMedium: ImageVector? = null
