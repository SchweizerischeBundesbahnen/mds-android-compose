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

public val SBBIcons.WagonCouplingDraggingEquipmentLarge: ImageVector
    get() {
        if (_wagonCouplingDraggingEquipmentLarge != null) {
            return _wagonCouplingDraggingEquipmentLarge!!
        }
        _wagonCouplingDraggingEquipmentLarge = Builder(name = "WagonCouplingDraggingEquipmentLarge",
                defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f,
                viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 7.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(7.521f)
                lineToRelative(5.327f, 4.6f)
                lineToRelative(-0.654f, 0.757f)
                lineToRelative(-5.5f, -4.75f)
                lineToRelative(-0.173f, -0.15f)
                lineTo(33.0f, 27.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.124f, 7.0f)
                horizontalLineToRelative(5.936f)
                lineToRelative(7.859f, -6.876f)
                lineToRelative(0.329f, -0.288f)
                lineToRelative(0.33f, 0.288f)
                lineTo(39.187f, 44.0f)
                lineTo(46.0f, 44.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 45.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.124f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 5.0f, 37.0f)
                verticalLineToRelative(-2.0f)
                lineTo(2.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.0f)
                close()
                moveTo(31.0f, 38.164f)
                lineTo(37.67f, 44.0f)
                lineTo(24.33f, 44.0f)
                close()
                moveTo(13.0f, 44.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 7.0f, -7.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 35.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 7.0f, 7.0f)
                moveToRelative(29.0f, -23.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _wagonCouplingDraggingEquipmentLarge!!
    }

private var _wagonCouplingDraggingEquipmentLarge: ImageVector? = null
