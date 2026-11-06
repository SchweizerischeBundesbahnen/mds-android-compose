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

public val SBBIcons.WaraWarnAppSmall: ImageVector
    get() {
        if (_waraWarnAppSmall != null) {
            return _waraWarnAppSmall!!
        }
        _waraWarnAppSmall = Builder(name = "WaraWarnAppSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(16.479f, 6.048f)
                lineToRelative(-3.203f, -1.6f)
                lineToRelative(0.448f, -0.895f)
                lineToRelative(4.0f, 2.0f)
                lineToRelative(0.797f, 0.398f)
                lineToRelative(-0.756f, 0.473f)
                lineTo(15.243f, 8.0f)
                lineTo(18.0f, 8.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.96f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                lineTo(3.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(7.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(8.357f)
                close()
                moveTo(14.5f, 13.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3.0f)
                lineTo(9.0f, 10.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.5f)
                moveToRelative(-0.5f, -2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.957f, 11.297f)
                lineTo(17.5f, 10.269f)
                lineTo(17.043f, 11.297f)
                lineTo(13.043f, 20.297f)
                lineTo(12.731f, 21.0f)
                horizontalLineToRelative(9.539f)
                lineToRelative(-0.313f, -0.703f)
                close()
                moveTo(17.5f, 12.73f)
                lineTo(20.73f, 20.0f)
                horizontalLineToRelative(-6.46f)
                close()
                moveTo(17.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _waraWarnAppSmall!!
    }

private var _waraWarnAppSmall: ImageVector? = null
