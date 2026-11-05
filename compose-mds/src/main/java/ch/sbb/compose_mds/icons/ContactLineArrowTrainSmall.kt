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

public val SBBIcons.ContactLineArrowTrainSmall: ImageVector
    get() {
        if (_contactLineArrowTrainSmall != null) {
            return _contactLineArrowTrainSmall!!
        }
        _contactLineArrowTrainSmall = Builder(name = "ContactLineArrowTrainSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.901f, 6.5f)
                lineTo(11.651f, 8.0f)
                lineTo(14.0f, 8.0f)
                curveToRelative(2.19f, 0.0f, 4.028f, 1.416f, 4.706f, 3.366f)
                lineToRelative(2.105f, 5.802f)
                curveToRelative(0.114f, 0.248f, 0.189f, 0.527f, 0.189f, 0.832f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.075f, 0.37f, -0.235f, 0.709f, -0.454f, 1.0f)
                lineTo(22.0f, 21.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.504f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.454f, -1.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.108f, -0.44f)
                lineToRelative(-0.012f, -0.025f)
                lineToRelative(-0.01f, -0.025f)
                lineToRelative(-0.548f, -1.51f)
                lineTo(13.0f, 16.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.441f)
                arcTo(3.97f, 3.97f, 0.0f, false, false, 14.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineToRelative(0.849f)
                lineToRelative(2.25f, -1.5f)
                lineToRelative(-2.376f, -1.584f)
                lineToRelative(0.554f, -0.832f)
                close()
                moveTo(4.087f, 20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.826f, 0.0f)
                close()
                moveTo(7.95f, 20.0f)
                curveToRelative(-0.075f, 0.37f, -0.235f, 0.709f, -0.454f, 1.0f)
                horizontalLineToRelative(5.008f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.454f, -1.0f)
                close()
                moveTo(13.087f, 20.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.826f, 0.0f)
                close()
                moveTo(14.0f, 15.0f)
                horizontalLineToRelative(4.96f)
                lineToRelative(-1.089f, -3.0f)
                lineTo(14.0f, 12.0f)
                close()
                moveTo(8.354f, 6.646f)
                lineToRelative(-0.708f, 0.708f)
                lineTo(6.0f, 5.707f)
                lineTo(6.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 5.707f)
                lineTo(3.354f, 7.354f)
                lineToRelative(-0.708f, -0.708f)
                lineTo(5.5f, 3.793f)
                close()
                moveTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                lineTo(2.0f, 2.0f)
                horizontalLineToRelative(20.0f)
                close()
            }
        }
        .build()
        return _contactLineArrowTrainSmall!!
    }

private var _contactLineArrowTrainSmall: ImageVector? = null
