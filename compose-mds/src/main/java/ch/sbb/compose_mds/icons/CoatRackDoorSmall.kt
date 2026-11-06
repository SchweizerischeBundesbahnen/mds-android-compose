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

public val SBBIcons.CoatRackDoorSmall: ImageVector
    get() {
        if (_coatRackDoorSmall != null) {
            return _coatRackDoorSmall!!
        }
        _coatRackDoorSmall = Builder(name = "CoatRackDoorSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                horizontalLineToRelative(2.001f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 20.0f)
                lineToRelative(0.001f, -1.0f)
                lineTo(4.05f, 19.0f)
                curveToRelative(0.199f, -0.98f, 0.97f, -1.751f, 1.95f, -1.95f)
                verticalLineToRelative(-5.6f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 9.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.653f, 0.418f, 1.206f, 1.0f, 1.412f)
                lineTo(6.0f, 7.45f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.653f, 0.418f, 1.206f, 1.0f, 1.412f)
                lineTo(6.0f, 4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.912f)
                curveToRelative(0.582f, -0.206f, 1.0f, -0.76f, 1.0f, -1.412f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, 2.45f)
                verticalLineToRelative(2.962f)
                curveToRelative(0.582f, -0.206f, 1.0f, -0.76f, 1.0f, -1.412f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.0f, 2.45f)
                verticalLineToRelative(3.6f)
                curveToRelative(0.98f, 0.199f, 1.751f, 0.97f, 1.95f, 1.95f)
                lineTo(12.0f, 19.0f)
                lineTo(12.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(6.5f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.413f, 1.0f)
                horizontalLineToRelative(2.826f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 18.0f)
                moveToRelative(6.5f, 1.0f)
                horizontalLineToRelative(6.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(18.0f, 13.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _coatRackDoorSmall!!
    }

private var _coatRackDoorSmall: ImageVector? = null
