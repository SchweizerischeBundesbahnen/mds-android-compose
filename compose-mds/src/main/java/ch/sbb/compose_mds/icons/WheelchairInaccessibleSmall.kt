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

public val SBBIcons.WheelchairInaccessibleSmall: ImageVector
    get() {
        if (_wheelchairInaccessibleSmall != null) {
            return _wheelchairInaccessibleSmall!!
        }
        _wheelchairInaccessibleSmall = Builder(name = "WheelchairInaccessibleSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.5f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(7.647f, 14.854f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-12.5f, -12.5f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(2.825f, 2.826f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 6.0f, 14.5f)
                curveToRelative(0.0f, 2.476f, 2.026f, 4.5f, 4.5f, 4.5f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, 3.318f, -1.476f)
                lineTo(15.0f, 18.707f)
                lineTo(15.0f, 19.0f)
                horizontalLineToRelative(0.293f)
                close()
                moveTo(13.109f, 16.816f)
                lineTo(8.18f, 11.888f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 7.0f, 14.5f)
                curveToRelative(0.0f, 1.922f, 1.577f, 3.5f, 3.5f, 3.5f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 2.61f, -1.185f)
                moveTo(16.0f, 15.5f)
                lineTo(16.0f, 13.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 14.0f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(11.0f, 8.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _wheelchairInaccessibleSmall!!
    }

private var _wheelchairInaccessibleSmall: ImageVector? = null
