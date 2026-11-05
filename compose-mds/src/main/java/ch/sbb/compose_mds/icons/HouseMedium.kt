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

public val SBBIcons.HouseMedium: ImageVector
    get() {
        if (_houseMedium != null) {
            return _houseMedium!!
        }
        _houseMedium = Builder(name = "HouseMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.354f, 5.646f)
                lineTo(18.0f, 5.292f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(-12.0f, 12.0f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(1.396f, -1.396f)
                lineTo(7.75f, 29.75f)
                horizontalLineToRelative(6.985f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.015f)
                lineTo(28.25f, 16.957f)
                lineToRelative(1.396f, 1.396f)
                lineToRelative(0.708f, -0.707f)
                close()
                moveTo(27.25f, 15.956f)
                lineTo(18.0f, 6.707f)
                lineToRelative(-9.25f, 9.25f)
                lineTo(8.75f, 28.75f)
                horizontalLineToRelative(4.985f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(5.015f)
                close()
            }
        }
        .build()
        return _houseMedium!!
    }

private var _houseMedium: ImageVector? = null
