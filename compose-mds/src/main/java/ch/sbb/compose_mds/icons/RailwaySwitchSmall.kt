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

public val SBBIcons.RailwaySwitchSmall: ImageVector
    get() {
        if (_railwaySwitchSmall != null) {
            return _railwaySwitchSmall!!
        }
        _railwaySwitchSmall = Builder(name = "RailwaySwitchSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 21.0f)
                verticalLineToRelative(-1.892f)
                lineToRelative(9.418f, -14.334f)
                lineToRelative(-0.836f, -0.548f)
                lineTo(13.416f, 6.0f)
                lineTo(13.0f, 6.0f)
                verticalLineToRelative(0.634f)
                lineTo(11.445f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(11.0f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.2f)
                lineToRelative(-0.522f, 0.795f)
                lineTo(7.0f, 11.995f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.82f)
                lineToRelative(-1.314f, 2.0f)
                lineTo(7.0f, 14.995f)
                verticalLineToRelative(0.77f)
                lineToRelative(-1.0f, 1.522f)
                lineTo(6.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(14.234f, 15.0f)
                lineTo(15.639f, 13.0f)
                lineTo(17.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.659f)
                lineToRelative(1.406f, -2.0f)
                lineTo(19.0f, 10.0f)
                lineTo(19.0f, 9.0f)
                horizontalLineToRelative(-0.55f)
                lineToRelative(1.404f, -2.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 6.0f)
                horizontalLineToRelative(-0.443f)
                lineToRelative(0.852f, -1.213f)
                lineToRelative(-0.818f, -0.574f)
                lineTo(19.335f, 6.0f)
                lineTo(16.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.632f)
                lineToRelative(-1.405f, 2.0f)
                lineTo(14.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.524f)
                lineToRelative(-1.405f, 2.0f)
                lineTo(12.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.416f)
                lineToRelative(-1.405f, 2.0f)
                lineTo(10.0f, 15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.309f)
                lineToRelative(-1.406f, 2.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.398f)
                lineToRelative(0.423f, -0.602f)
                lineTo(13.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.874f)
                lineToRelative(1.405f, -2.0f)
                lineTo(15.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _railwaySwitchSmall!!
    }

private var _railwaySwitchSmall: ImageVector? = null
