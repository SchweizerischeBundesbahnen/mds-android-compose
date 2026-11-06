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

public val SBBIcons.ScreenInsideTrainSmall: ImageVector
    get() {
        if (_screenInsideTrainSmall != null) {
            return _screenInsideTrainSmall!!
        }
        _screenInsideTrainSmall = Builder(name = "ScreenInsideTrainSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(1.293f)
                lineTo(20.0f, 7.707f)
                lineTo(20.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 7.293f)
                lineToRelative(-0.146f, -0.146f)
                lineToRelative(-4.0f, -4.0f)
                lineTo(16.707f, 3.0f)
                lineTo(3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(13.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(15.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 11.0f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _screenInsideTrainSmall!!
    }

private var _screenInsideTrainSmall: ImageVector? = null
