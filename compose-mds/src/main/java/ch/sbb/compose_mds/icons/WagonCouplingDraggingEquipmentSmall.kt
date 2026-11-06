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

public val SBBIcons.WagonCouplingDraggingEquipmentSmall: ImageVector
    get() {
        if (_wagonCouplingDraggingEquipmentSmall != null) {
            return _wagonCouplingDraggingEquipmentSmall!!
        }
        _wagonCouplingDraggingEquipmentSmall = Builder(name = "WagonCouplingDraggingEquipmentSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.605f)
                lineToRelative(2.327f, 2.017f)
                lineToRelative(-0.654f, 0.756f)
                lineToRelative(-2.5f, -2.167f)
                lineToRelative(-0.173f, -0.15f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(0.75f)
                arcTo(4.37f, 4.37f, 0.0f, false, true, 9.578f, 20.0f)
                horizontalLineToRelative(1.737f)
                lineToRelative(3.36f, -2.88f)
                lineToRelative(0.325f, -0.278f)
                lineToRelative(0.325f, 0.278f)
                lineToRelative(3.36f, 2.88f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.422f)
                arcTo(4.37f, 4.37f, 0.0f, false, true, 3.0f, 16.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(4.0f, 16.75f)
                curveTo(4.0f, 18.578f, 5.375f, 20.0f, 7.0f, 20.0f)
                reflectiveCurveToRelative(3.0f, -1.422f, 3.0f, -3.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(12.852f, 20.0f)
                horizontalLineToRelative(4.296f)
                lineTo(15.0f, 18.158f)
                close()
                moveTo(21.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _wagonCouplingDraggingEquipmentSmall!!
    }

private var _wagonCouplingDraggingEquipmentSmall: ImageVector? = null
