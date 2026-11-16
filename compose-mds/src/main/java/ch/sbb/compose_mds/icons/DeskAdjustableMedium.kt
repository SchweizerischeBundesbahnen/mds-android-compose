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

public val SBBIcons.DeskAdjustableMedium: ImageVector
    get() {
        if (_deskAdjustableMedium != null) {
            return _deskAdjustableMedium!!
        }
        _deskAdjustableMedium = Builder(name = "DeskAdjustableMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.75f, 4.499f)
                verticalLineToRelative(6.743f)
                lineToRelative(2.146f, -2.146f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-3.353f, 3.353f)
                lineToRelative(-3.354f, -3.353f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(2.147f, 2.146f)
                lineTo(19.75f, 4.5f)
                close()
                moveTo(30.397f, 8.903f)
                lineTo(31.104f, 8.196f)
                lineTo(27.75f, 4.842f)
                lineTo(24.396f, 8.196f)
                lineTo(25.103f, 8.903f)
                lineTo(27.25f, 6.756f)
                lineTo(27.25f, 13.5f)
                horizontalLineToRelative(1.0f)
                lineTo(28.25f, 6.756f)
                close()
                moveTo(31.25f, 15.249f)
                verticalLineToRelative(16.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-12.25f)
                lineTo(5.75f, 19.249f)
                verticalLineToRelative(12.25f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-16.25f)
                close()
                moveTo(5.75f, 18.249f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(-2.0f)
                lineTo(5.75f, 16.249f)
                close()
            }
        }
        .build()
        return _deskAdjustableMedium!!
    }

private var _deskAdjustableMedium: ImageVector? = null
