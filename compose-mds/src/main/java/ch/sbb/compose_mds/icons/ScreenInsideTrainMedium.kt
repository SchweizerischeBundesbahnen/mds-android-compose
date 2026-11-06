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

public val SBBIcons.ScreenInsideTrainMedium: ImageVector
    get() {
        if (_screenInsideTrainMedium != null) {
            return _screenInsideTrainMedium!!
        }
        _screenInsideTrainMedium = Builder(name = "ScreenInsideTrainMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.25f, 5.75f)
                horizontalLineToRelative(2.293f)
                lineToRelative(5.707f, 5.708f)
                lineTo(30.25f, 31.5f)
                horizontalLineToRelative(1.0f)
                lineTo(31.25f, 11.043f)
                lineToRelative(-0.146f, -0.146f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-0.147f, -0.147f)
                lineTo(4.5f, 4.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(21.25f, 5.75f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(7.25f, 22.75f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(22.5f, 14.75f)
                lineTo(9.0f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.5f)
                close()
                moveTo(9.0f, 17.75f)
                horizontalLineToRelative(13.5f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 16.75f)
                close()
                moveTo(22.5f, 20.751f)
                lineTo(9.0f, 20.751f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.5f)
                close()
            }
        }
        .build()
        return _screenInsideTrainMedium!!
    }

private var _screenInsideTrainMedium: ImageVector? = null
