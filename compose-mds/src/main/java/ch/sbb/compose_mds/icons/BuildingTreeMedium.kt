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

public val SBBIcons.BuildingTreeMedium: ImageVector
    get() {
        if (_buildingTreeMedium != null) {
            return _buildingTreeMedium!!
        }
        _buildingTreeMedium = Builder(name = "BuildingTreeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.0f, 6.25f)
                lineTo(9.0f, 6.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                lineTo(10.75f, 15.0f)
                horizontalLineToRelative(1.0f)
                lineTo(11.75f, 7.25f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(24.5f)
                horizontalLineToRelative(-18.5f)
                lineTo(11.75f, 27.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.651f)
                arcToRelative(3.502f, 3.502f, 0.0f, false, false, 4.535f, -3.598f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.326f, -3.043f)
                quadToRelative(0.038f, -0.224f, 0.04f, -0.452f)
                lineTo(10.999f, 18.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, -5.5f, 0.0f)
                verticalLineToRelative(0.006f)
                quadToRelative(0.004f, 0.228f, 0.042f, 0.452f)
                arcToRelative(3.497f, 3.497f, 0.0f, false, false, -2.107f, 4.545f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.316f, 2.096f)
                verticalLineToRelative(6.651f)
                lineTo(3.0f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(28.25f)
                lineTo(31.25f, 7.25f)
                lineTo(33.0f, 7.25f)
                close()
                moveTo(15.75f, 9.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-11.0f)
                moveToRelative(0.5f, 4.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(15.25f, 16.75f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-5.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(15.75f, 24.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-11.0f)
                moveToRelative(10.0f, 4.5f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(9.5f)
                close()
                moveTo(9.88f, 18.637f)
                lineToRelative(0.47f, 0.173f)
                lineToRelative(-0.093f, 0.491f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -1.75f, 4.6f)
                lineToRelative(-0.257f, -0.154f)
                lineToRelative(-0.258f, 0.154f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -1.75f, -4.6f)
                lineToRelative(0.582f, -0.11f)
                lineToRelative(-0.205f, -0.554f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.262f, 0.0f)
            }
        }
        .build()
        return _buildingTreeMedium!!
    }

private var _buildingTreeMedium: ImageVector? = null
