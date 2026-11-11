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

public val SBBIcons.LayersWithArrowsMedium: ImageVector
    get() {
        if (_layersWithArrowsMedium != null) {
            return _layersWithArrowsMedium!!
        }
        _layersWithArrowsMedium = Builder(name = "LayersWithArrowsMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(32.422f, 7.03f)
                lineToRelative(-14.25f, -5.25f)
                lineToRelative(-0.173f, -0.064f)
                lineToRelative(-0.173f, 0.065f)
                lineToRelative(-14.25f, 5.25f)
                lineToRelative(-1.273f, 0.468f)
                lineToRelative(1.273f, 0.47f)
                lineToRelative(14.25f, 5.25f)
                lineToRelative(0.173f, 0.064f)
                lineToRelative(0.173f, -0.065f)
                lineToRelative(14.25f, -5.25f)
                lineToRelative(1.273f, -0.469f)
                close()
                moveTo(17.999f, 12.216f)
                lineTo(5.193f, 7.5f)
                lineTo(18.0f, 2.782f)
                lineToRelative(12.805f, 4.717f)
                close()
                moveTo(32.423f, 28.031f)
                lineTo(18.173f, 22.781f)
                lineTo(18.0f, 22.717f)
                lineTo(17.827f, 22.781f)
                lineTo(3.577f, 28.031f)
                lineTo(2.304f, 28.5f)
                lineTo(3.577f, 28.968f)
                lineTo(17.827f, 34.218f)
                lineTo(18.0f, 34.283f)
                lineTo(18.173f, 34.218f)
                lineTo(32.423f, 28.968f)
                lineTo(33.696f, 28.5f)
                close()
                moveTo(18.0f, 33.217f)
                lineTo(5.194f, 28.5f)
                lineTo(18.0f, 23.782f)
                lineTo(30.805f, 28.5f)
                close()
                moveTo(10.25f, 14.345f)
                lineTo(10.25f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.652f)
                lineToRelative(-3.408f, 3.471f)
                lineToRelative(-0.713f, -0.7f)
                lineToRelative(4.264f, -4.345f)
                lineToRelative(0.356f, 0.35f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-0.357f, -0.35f)
                lineToRelative(0.356f, -0.362f)
                lineToRelative(0.358f, 0.362f)
                lineToRelative(4.277f, 4.341f)
                lineToRelative(-0.712f, 0.702f)
                close()
                moveTo(26.75f, 21.653f)
                lineTo(30.16f, 18.178f)
                lineTo(30.873f, 18.879f)
                lineTo(26.611f, 23.224f)
                lineTo(26.253f, 22.874f)
                lineTo(25.898f, 23.225f)
                lineTo(21.618f, 18.885f)
                lineTo(22.33f, 18.182f)
                lineTo(25.75f, 21.651f)
                lineTo(25.75f, 15.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(25.898f, 23.225f)
                lineTo(26.253f, 22.875f)
                lineTo(26.611f, 23.225f)
                lineTo(26.254f, 23.587f)
                close()
            }
        }
        .build()
        return _layersWithArrowsMedium!!
    }

private var _layersWithArrowsMedium: ImageVector? = null
