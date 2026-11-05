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

public val SBBIcons.ParliamentSmall: ImageVector
    get() {
        if (_parliamentSmall != null) {
            return _parliamentSmall!!
        }
        _parliamentSmall = Builder(name = "ParliamentSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.5f, 2.0f)
                lineTo(11.0f, 2.0f)
                verticalLineToRelative(3.035f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 8.5f)
                verticalLineToRelative(2.862f)
                lineToRelative(-1.686f, 0.674f)
                lineToRelative(-0.314f, 0.126f)
                lineTo(6.0f, 15.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.838f)
                lineToRelative(-0.314f, -0.126f)
                lineTo(15.0f, 11.36f)
                lineTo(15.0f, 8.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.0f, -3.465f)
                lineTo(12.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineToRelative(-2.5f)
                moveTo(16.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(7.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                lineTo(7.0f, 21.0f)
                close()
                moveTo(9.0f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(-0.001f, -2.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                lineTo(12.999f, 21.0f)
                lineTo(14.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(17.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.001f, -2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                close()
                moveTo(16.0f, 12.839f)
                lineTo(16.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(-0.161f)
                lineToRelative(4.5f, -1.8f)
                close()
                moveTo(14.0f, 10.961f)
                lineTo(14.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                verticalLineToRelative(1.962f)
                lineToRelative(2.314f, -0.926f)
                lineToRelative(0.186f, -0.075f)
                lineToRelative(0.186f, 0.075f)
                close()
                moveTo(11.5f, 6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.45f, 2.0f)
                horizontalLineToRelative(-4.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.45f, -2.0f)
            }
        }
        .build()
        return _parliamentSmall!!
    }

private var _parliamentSmall: ImageVector? = null
