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

public val SBBIcons.BuildingTreeSmall: ImageVector
    get() {
        if (_buildingTreeSmall != null) {
            return _buildingTreeSmall!!
        }
        _buildingTreeSmall = Builder(
            name = "BuildingTreeSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(22.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(16.0f)
                lineTo(8.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 21.0f)
                verticalLineToRelative(-4.051f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.347f, -0.081f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.142f, -4.671f)
                quadToRelative(0.01f, -0.095f, 0.01f, -0.19f)
                lineTo(7.499f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(0.006f)
                quadToRelative(0.002f, 0.097f, 0.012f, 0.19f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.534f, 2.126f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.0f, 16.949f)
                lineTo(5.0f, 21.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(19.0f)
                lineTo(21.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.5f, 6.0f)
                lineTo(10.0f, 6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-7.5f)
                moveToRelative(0.5f, 3.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 11.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.5f, 16.0f)
                lineTo(10.0f, 16.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-7.5f)
                moveToRelative(6.5f, 3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(6.43f, 12.367f)
                lineToRelative(0.47f, 0.173f)
                lineToRelative(-0.093f, 0.491f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.05f, 2.76f)
                lineToRelative(-0.257f, -0.154f)
                lineToRelative(-0.258f, 0.154f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.05f, -2.76f)
                lineToRelative(0.582f, -0.11f)
                lineToRelative(-0.205f, -0.554f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.862f, 0.0f)
            }
        }
            .build()
        return _buildingTreeSmall!!
    }

private var _buildingTreeSmall: ImageVector? = null
