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
                moveTo(31.25f, 7.25f)
                lineTo(33.0f, 7.25f)
                verticalLineToRelative(-1.0f)
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
                verticalLineToRelative(-6.652f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, false, 2.189f, -0.033f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.127f, -2.062f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.109f, -4.545f)
                quadToRelative(0.039f, -0.224f, 0.043f, -0.451f)
                lineTo(11.0f, 18.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -5.5f, 0.0f)
                verticalLineToRelative(0.007f)
                quadToRelative(0.004f, 0.226f, 0.042f, 0.45f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 2.208f, 6.64f)
                verticalLineToRelative(6.653f)
                lineTo(3.0f, 31.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(28.25f)
                close()
                moveTo(26.75f, 14.75f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(25.75f, 13.75f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(9.5f)
                close()
                moveTo(26.75f, 16.75f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(16.25f, 21.25f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(15.25f, 29.75f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-11.5f)
                close()
                moveTo(25.75f, 28.75f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(9.5f)
                close()
                moveTo(7.012f, 16.763f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, true, 2.98f, 1.064f)
                lineTo(10.0f, 18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.119f, 0.637f)
                lineToRelative(0.469f, 0.173f)
                lineToRelative(-0.093f, 0.492f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -1.75f, 4.6f)
                lineToRelative(-0.257f, -0.155f)
                lineToRelative(-0.258f, 0.154f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -3.028f, -0.348f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.278f, -4.251f)
                lineToRelative(0.581f, -0.11f)
                lineToRelative(-0.204f, -0.555f)
                lineToRelative(-0.05f, -0.157f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.443f, -1.718f)
                moveToRelative(0.98f, 7.138f)
                lineToRelative(0.258f, 0.43f)
                close()
            }
        }
        .build()
        return _buildingTreeMedium!!
    }

private var _buildingTreeMedium: ImageVector? = null
