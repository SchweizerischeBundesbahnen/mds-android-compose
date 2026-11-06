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

public val SBBIcons.OfficeChairMedium: ImageVector
    get() {
        if (_officeChairMedium != null) {
            return _officeChairMedium!!
        }
        _officeChairMedium = Builder(name = "OfficeChairMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.75f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                lineTo(12.0f, 30.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-11.0f)
                moveToRelative(5.5f, 13.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(19.25f, 18.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(6.0f)
                moveToRelative(-1.0f, 7.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(16.75f, 24.25f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-12.5f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(26.75f, 16.5f)
                lineTo(26.75f, 21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(10.25f, 21.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(9.25f, 21.0f)
                close()
            }
        }
        .build()
        return _officeChairMedium!!
    }

private var _officeChairMedium: ImageVector? = null
