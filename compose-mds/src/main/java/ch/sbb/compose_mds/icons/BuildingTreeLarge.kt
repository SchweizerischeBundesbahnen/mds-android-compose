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

public val SBBIcons.BuildingTreeLarge: ImageVector
    get() {
        if (_buildingTreeLarge != null) {
            return _buildingTreeLarge!!
        }
        _buildingTreeLarge = Builder(
            name = "BuildingTreeLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(9.5f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.619f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(33.0f)
                lineTo(12.0f, 41.0f)
                verticalLineToRelative(-3.428f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, 2.83f, -2.46f)
                arcToRelative(3.054f, 3.054f, 0.0f, false, false, 4.806f, -3.032f)
                arcToRelative(4.748f, 4.748f, 0.0f, false, false, -3.685f, -8.608f)
                arcToRelative(5.266f, 5.266f, 0.0f, true, false, -9.24f, 3.806f)
                arcTo(5.808f, 5.808f, 0.0f, false, false, 11.0f, 37.877f)
                lineTo(11.0f, 41.0f)
                lineTo(3.999f, 41.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(42.999f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(44.999f, 5.0f)
                lineTo(9.5f, 5.0f)
                moveTo(12.0f, 36.472f)
                verticalLineToRelative(-4.236f)
                lineToRelative(3.774f, -2.823f)
                lineToRelative(-0.6f, -0.801f)
                lineTo(12.0f, 30.987f)
                lineTo(12.0f, 27.43f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(5.795f)
                lineToRelative(-1.007f, -1.008f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(11.0f, 34.638f)
                verticalLineToRelative(2.213f)
                quadToRelative(-0.573f, 0.147f, -1.192f, 0.149f)
                arcToRelative(4.808f, 4.808f, 0.0f, false, true, -2.065f, -9.15f)
                lineToRelative(0.68f, -0.324f)
                lineToRelative(-0.562f, -0.502f)
                arcToRelative(4.266f, 4.266f, 0.0f, true, true, 7.093f, -2.9f)
                lineToRelative(-0.054f, 0.8f)
                lineToRelative(0.742f, -0.305f)
                arcToRelative(3.748f, 3.748f, 0.0f, false, true, 3.18f, 6.779f)
                lineToRelative(-0.373f, 0.2f)
                lineToRelative(0.134f, 0.4f)
                quadToRelative(0.105f, 0.306f, 0.106f, 0.65f)
                arcToRelative(2.054f, 2.054f, 0.0f, false, true, -3.625f, 1.325f)
                lineToRelative(-0.52f, -0.615f)
                lineToRelative(-0.32f, 0.74f)
                arcTo(4.83f, 4.83f, 0.0f, false, true, 12.0f, 36.471f)
                moveTo(10.0f, 7.0f)
                lineTo(10.0f, 6.0f)
                horizontalLineToRelative(34.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(32.0f, 31.0f)
                horizontalLineToRelative(7.002f)
                lineToRelative(-0.002f, 0.502f)
                lineToRelative(-0.018f, 6.0f)
                lineToRelative(-0.002f, 0.498f)
                lineTo(32.0f, 38.0f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.983f)
                lineTo(38.0f, 32.0f)
                close()
                moveTo(32.5f, 21.0f)
                lineTo(32.0f, 21.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.98f)
                lineToRelative(0.002f, -0.498f)
                lineToRelative(0.018f, -6.0f)
                lineToRelative(0.002f, -0.502f)
                lineTo(32.5f, 21.0f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.999f)
                lineToRelative(-0.016f, 5.0f)
                close()
                moveTo(27.997f, 22.0f)
                lineTo(17.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.003f)
                lineToRelative(-0.003f, 0.503f)
                lineToRelative(-0.036f, 6.0f)
                lineToRelative(-0.003f, 0.497f)
                horizontalLineToRelative(-5.97f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.976f)
                close()
                moveTo(21.95f, 32.0f)
                horizontalLineToRelative(6.047f)
                lineToRelative(-0.03f, 5.0f)
                lineTo(15.0f, 37.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(13.961f)
                lineToRelative(0.003f, -0.497f)
                lineToRelative(0.036f, -6.0f)
                lineToRelative(0.003f, -0.503f)
                lineTo(21.95f, 31.0f)
                close()
                moveTo(32.5f, 11.0f)
                lineTo(32.0f, 11.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(6.98f)
                lineToRelative(0.002f, -0.498f)
                lineToRelative(0.018f, -6.0f)
                lineToRelative(0.002f, -0.502f)
                lineTo(32.5f, 11.0f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.999f)
                lineToRelative(-0.016f, 5.0f)
                close()
                moveTo(15.0f, 11.0f)
                horizontalLineToRelative(14.003f)
                lineToRelative(-0.003f, 0.503f)
                lineToRelative(-0.036f, 6.0f)
                lineToRelative(-0.003f, 0.497f)
                lineTo(15.0f, 18.0f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(11.967f)
                lineToRelative(0.03f, -5.0f)
                close()
            }
        }
            .build()
        return _buildingTreeLarge!!
    }

private var _buildingTreeLarge: ImageVector? = null
