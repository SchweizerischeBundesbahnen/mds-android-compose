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

public val SBBIcons.WagonCouplingDraggingEquipmentMedium: ImageVector
    get() {
        if (_wagonCouplingDraggingEquipmentMedium != null) {
            return _wagonCouplingDraggingEquipmentMedium!!
        }
        _wagonCouplingDraggingEquipmentMedium = Builder(name =
                "WagonCouplingDraggingEquipmentMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.25f, 18.25f)
                horizontalLineToRelative(5.0f)
                lineTo(27.25f, 15.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.272f)
                lineToRelative(3.577f, 3.1f)
                lineToRelative(-0.654f, 0.756f)
                lineToRelative(-3.75f, -3.25f)
                lineToRelative(-0.173f, -0.15f)
                lineTo(24.25f, 19.25f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.375f)
                curveToRelative(0.0f, 2.13f, -1.028f, 4.025f, -2.6f, 5.125f)
                horizontalLineToRelative(3.415f)
                lineToRelative(5.11f, -4.38f)
                lineToRelative(0.325f, -0.278f)
                lineToRelative(0.325f, 0.278f)
                lineToRelative(5.11f, 4.38f)
                lineTo(33.0f, 30.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 31.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.35f)
                curveToRelative(-1.572f, -1.1f, -2.6f, -2.996f, -2.6f, -5.125f)
                lineTo(4.75f, 23.75f)
                lineTo(3.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(18.25f)
                verticalLineToRelative(-17.0f)
                lineTo(3.0f, 5.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.25f)
                close()
                moveTo(5.75f, 25.125f)
                curveToRelative(0.0f, 2.863f, 2.159f, 5.125f, 4.75f, 5.125f)
                reflectiveCurveToRelative(4.75f, -2.262f, 4.75f, -5.125f)
                lineTo(15.25f, 23.75f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(18.602f, 30.25f)
                horizontalLineToRelative(7.796f)
                lineTo(22.5f, 26.908f)
                close()
                moveTo(31.25f, 18.25f)
                lineTo(33.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-1.0f)
                lineTo(30.25f, 15.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _wagonCouplingDraggingEquipmentMedium!!
    }

private var _wagonCouplingDraggingEquipmentMedium: ImageVector? = null
