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

public val SBBIcons.OfficeChairSmall: ImageVector
    get() {
        if (_officeChairSmall != null) {
            return _officeChairSmall!!
        }
        _officeChairSmall = Builder(name = "OfficeChairSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.5f, 4.0f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(16.0f, 4.0f)
                lineTo(8.5f, 4.0f)
                moveToRelative(4.5f, 8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(15.0f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(4.0f)
                moveToRelative(-2.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 11.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 14.0f)
                verticalLineToRelative(-3.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _officeChairSmall!!
    }

private var _officeChairSmall: ImageVector? = null
