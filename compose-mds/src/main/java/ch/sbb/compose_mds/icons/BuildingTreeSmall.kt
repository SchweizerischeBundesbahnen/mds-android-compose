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
        _buildingTreeSmall = Builder(name = "BuildingTreeSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                lineTo(22.0f, 4.0f)
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
                verticalLineToRelative(-4.052f)
                quadToRelative(0.135f, 0.03f, 0.271f, 0.044f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.217f, -4.795f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.012f, -0.19f)
                lineTo(7.5f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(0.007f)
                quadToRelative(0.001f, 0.095f, 0.011f, 0.19f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.534f, 2.125f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.0f, 16.948f)
                lineTo(5.0f, 21.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(18.0f, 10.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(17.0f, 9.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(18.0f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(17.0f, 19.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(4.792f, 11.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.64f, 1.074f)
                lineToRelative(0.468f, 0.173f)
                lineToRelative(-0.093f, 0.491f)
                arcToRelative(1.501f, 1.501f, 0.0f, false, true, 0.213f, 2.892f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.263f, -0.132f)
                lineToRelative(-0.257f, -0.154f)
                lineToRelative(-0.257f, 0.154f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, -2.175f, -0.752f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.125f, -2.008f)
                lineToRelative(0.58f, -0.11f)
                lineToRelative(-0.204f, -0.554f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.224f, -1.074f)
                moveToRelative(-0.223f, 1.074f)
                lineToRelative(-0.469f, 0.173f)
                close()
            }
        }
        .build()
        return _buildingTreeSmall!!
    }

private var _buildingTreeSmall: ImageVector? = null
