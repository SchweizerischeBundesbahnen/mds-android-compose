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

public val SBBIcons.CarPowerPlugSmall: ImageVector
    get() {
        if (_carPowerPlugSmall != null) {
            return _carPowerPlugSmall!!
        }
        _carPowerPlugSmall = Builder(name = "CarPowerPlugSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.92f, 3.994f)
                arcTo(1.68f, 1.68f, 0.0f, false, false, 5.994f, 5.92f)
                lineTo(6.0f, 5.96f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(6.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(18.0f, 8.0f)
                lineTo(18.0f, 5.96f)
                lineToRelative(0.006f, -0.04f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, -1.926f, -1.926f)
                lineTo(16.04f, 4.0f)
                lineTo(7.96f, 4.0f)
                close()
                moveTo(15.914f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.828f, 0.0f)
                close()
                moveTo(18.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(19.0f, 13.5f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-0.962f)
                arcTo(2.68f, 2.68f, 0.0f, false, false, 15.962f, 3.0f)
                lineTo(8.038f, 3.0f)
                arcTo(2.68f, 2.68f, 0.0f, false, false, 5.0f, 6.038f)
                lineTo(5.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.5f)
                moveTo(6.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-1.0f, 7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.45f, 2.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.45f, 2.0f)
                lineTo(14.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.44f, 18.44f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 18.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.06f, -2.56f)
            }
        }
        .build()
        return _carPowerPlugSmall!!
    }

private var _carPowerPlugSmall: ImageVector? = null
