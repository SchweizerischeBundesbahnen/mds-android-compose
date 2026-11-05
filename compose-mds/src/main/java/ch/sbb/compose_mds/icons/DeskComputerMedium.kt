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

public val SBBIcons.DeskComputerMedium: ImageVector
    get() {
        if (_deskComputerMedium != null) {
            return _deskComputerMedium!!
        }
        _deskComputerMedium = Builder(name = "DeskComputerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.75f, 14.75f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-15.0f)
                horizontalLineToRelative(-17.0f)
                lineTo(4.25f, 33.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(3.25f, 16.75f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(14.5f)
                close()
                moveTo(22.25f, 31.75f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(28.501f, 28.25f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.25f, 24.25f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(28.501f, 20.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(16.25f, 14.75f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(10.25f, 13.75f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-12.5f)
                close()
            }
        }
        .build()
        return _deskComputerMedium!!
    }

private var _deskComputerMedium: ImageVector? = null
