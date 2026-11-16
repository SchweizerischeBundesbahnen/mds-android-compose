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

public val SBBIcons.SwisspassSmall: ImageVector
    get() {
        if (_swisspassSmall != null) {
            return _swisspassSmall!!
        }
        _swisspassSmall = Builder(name = "SwisspassSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 8.5f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 15.5f)
                verticalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.5f, 7.0f)
                close()
                moveTo(18.5f, 18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.5f, 6.0f)
                horizontalLineToRelative(-13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 3.0f, 8.5f)
                verticalLineToRelative(7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.5f, 18.0f)
                close()
                moveTo(17.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 9.0f)
                close()
                moveTo(10.242f, 12.294f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -3.482f, 0.001f)
                curveToRelative(-0.49f, 0.271f, -0.89f, 0.622f, -1.185f, 1.065f)
                curveTo(5.177f, 13.958f, 5.0f, 14.679f, 5.0f, 15.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.821f, -0.177f, -1.543f, -0.575f, -2.142f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -1.184f, -1.065f)
                moveTo(8.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.501f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.5f, 12.0f)
                moveToRelative(0.0f, 1.0f)
                horizontalLineToRelative(-0.898f)
                curveToRelative(-0.561f, 0.233f, -0.945f, 0.539f, -1.195f, 0.913f)
                curveToRelative(-0.193f, 0.291f, -0.323f, 0.648f, -0.378f, 1.087f)
                horizontalLineToRelative(4.942f)
                curveToRelative(-0.055f, -0.44f, -0.184f, -0.797f, -0.378f, -1.089f)
                curveToRelative(-0.25f, -0.375f, -0.633f, -0.68f, -1.194f, -0.91f)
                close()
            }
        }
        .build()
        return _swisspassSmall!!
    }

private var _swisspassSmall: ImageVector? = null
