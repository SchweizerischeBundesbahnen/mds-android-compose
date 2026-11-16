package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ToiletShowerMedium: ImageVector
    get() {
        if (_toiletShowerMedium != null) {
            return _toiletShowerMedium!!
        }
        _toiletShowerMedium = Builder(name = "ToiletShowerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 22.75f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(0.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -6.5f, 6.5f)
                curveToRelative(-0.34f, 0.0f, -0.674f, -0.03f, -1.0f, -0.08f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-17.5f)
                horizontalLineToRelative(5.5f)
                close()
                moveTo(32.75f, 32.75f)
                horizontalLineToRelative(-13.0f)
                lineTo(19.75f, 3.25f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(4.25f, 31.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(20.75f, 31.75f)
                horizontalLineToRelative(11.0f)
                lineTo(31.75f, 4.25f)
                horizontalLineToRelative(-4.999f)
                verticalLineToRelative(2.065f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 28.25f, 8.25f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.932f, 0.638f, -1.713f, 1.501f, -1.935f)
                lineTo(25.751f, 4.25f)
                lineTo(20.75f, 4.25f)
                close()
                moveTo(8.75f, 28.657f)
                quadToRelative(0.486f, 0.091f, 1.0f, 0.093f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 5.477f, -5.0f)
                lineTo(8.75f, 23.75f)
                close()
                moveTo(28.251f, 16.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(27.251f, 15.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(25.251f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(28.25f, 13.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(27.25f, 12.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(25.251f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(26.25f, 7.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.865f, 0.5f)
                horizontalLineToRelative(1.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.865f, -0.5f)
            }
        }
        .build()
        return _toiletShowerMedium!!
    }

private var _toiletShowerMedium: ImageVector? = null
