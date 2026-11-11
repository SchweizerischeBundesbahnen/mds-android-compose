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

public val SBBIcons.ClipboardUsersSmall: ImageVector
    get() {
        if (_clipboardUsersSmall != null) {
            return _clipboardUsersSmall!!
        }
        _clipboardUsersSmall = Builder(name = "ClipboardUsersSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 3.0f)
                lineTo(16.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 3.0f)
                close()
                moveTo(16.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 5.0f)
                lineTo(9.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(11.0f, 7.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 7.0f)
                close()
                moveTo(9.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 10.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.0f, 13.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.615f, 17.0f)
                curveToRelative(0.141f, -1.52f, 0.912f, -2.928f, 2.08f, -3.517f)
                curveToRelative(0.344f, 0.25f, 0.757f, 0.397f, 1.215f, 0.397f)
                curveToRelative(0.454f, 0.0f, 0.864f, -0.145f, 1.206f, -0.391f)
                curveToRelative(1.169f, 0.587f, 1.954f, 1.992f, 2.098f, 3.51f)
                close()
                moveTo(18.112f, 16.24f)
                curveToRelative(0.085f, 0.417f, 0.128f, 0.842f, 0.128f, 1.26f)
                verticalLineToRelative(0.5f)
                lineTo(9.59f, 18.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.849f, 0.835f, -3.85f, 2.425f, -4.786f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.365f, -1.394f)
                curveToRelative(0.0f, -1.177f, 0.728f, -2.26f, 1.796f, -2.508f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, 0.624f, -1.214f)
                curveToRelative(0.423f, -0.403f, 0.994f, -0.598f, 1.6f, -0.598f)
                curveToRelative(1.354f, 0.0f, 2.26f, 1.249f, 2.26f, 2.56f)
                curveToRelative(0.0f, 0.51f, -0.138f, 1.012f, -0.386f, 1.434f)
                curveTo(19.127f, 11.92f, 20.0f, 13.881f, 20.0f, 15.74f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(17.821f, 15.24f)
                horizontalLineToRelative(1.152f)
                curveToRelative(-0.146f, -1.513f, -0.947f, -2.902f, -2.125f, -3.485f)
                curveToRelative(-0.231f, 0.159f, -0.494f, 0.273f, -0.782f, 0.328f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.266f, 0.64f)
                curveToRelative(0.938f, 0.55f, 1.62f, 1.472f, 2.02f, 2.516f)
                moveTo(16.15f, 11.0f)
                curveToRelative(-0.113f, -1.015f, -0.764f, -1.906f, -1.688f, -2.165f)
                curveToRelative(0.06f, -0.22f, 0.167f, -0.389f, 0.297f, -0.513f)
                curveToRelative(0.207f, -0.197f, 0.516f, -0.322f, 0.91f, -0.322f)
                curveToRelative(0.645f, 0.0f, 1.26f, 0.63f, 1.26f, 1.56f)
                curveToRelative(0.0f, 0.69f, -0.34f, 1.216f, -0.778f, 1.44f)
                moveToRelative(-0.981f, 0.32f)
                curveToRelative(0.0f, -0.94f, -0.637f, -1.56f, -1.26f, -1.56f)
                curveToRelative(-0.624f, 0.0f, -1.26f, 0.62f, -1.26f, 1.56f)
                reflectiveCurveToRelative(0.636f, 1.56f, 1.26f, 1.56f)
                curveToRelative(0.623f, 0.0f, 1.26f, -0.62f, 1.26f, -1.56f)
            }
        }
        .build()
        return _clipboardUsersSmall!!
    }

private var _clipboardUsersSmall: ImageVector? = null
