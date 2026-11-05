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

public val SBBIcons.HammerWrenchSmall: ImageVector
    get() {
        if (_hammerWrenchSmall != null) {
            return _hammerWrenchSmall!!
        }
        _hammerWrenchSmall = Builder(
            name = "HammerWrenchSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(8.494f, 4.03f)
                curveToRelative(-0.307f, 0.062f, -0.663f, 0.23f, -1.043f, 0.61f)
                lineTo(4.623f, 7.467f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(0.572f, 0.572f)
                lineToRelative(-0.767f, 0.256f)
                lineToRelative(-1.354f, 0.451f)
                lineToRelative(1.684f, 1.685f)
                lineToRelative(0.452f, -1.354f)
                lineToRelative(0.255f, -0.768f)
                lineToRelative(0.572f, 0.572f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(1.718f, -1.717f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.506f, -0.239f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.876f, -0.067f)
                moveToRelative(2.14f, 0.256f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-1.768f, 1.768f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, 0.354f)
                lineToRelative(2.566f, 2.566f)
                lineToRelative(2.203f, -2.204f)
                curveToRelative(-0.605f, -1.47f, -0.269f, -3.32f, 0.85f, -4.385f)
                curveToRelative(1.18f, -1.122f, 3.179f, -1.494f, 4.71f, -0.67f)
                lineToRelative(0.59f, 0.319f)
                lineToRelative(-0.474f, 0.475f)
                lineToRelative(-2.36f, 2.36f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(2.36f, -2.36f)
                lineToRelative(0.475f, -0.475f)
                lineToRelative(0.319f, 0.592f)
                curveToRelative(0.824f, 1.53f, 0.452f, 3.53f, -0.67f, 4.71f)
                curveToRelative(-1.065f, 1.118f, -2.915f, 1.454f, -4.385f, 0.849f)
                lineToRelative(-2.204f, 2.203f)
                lineToRelative(5.03f, 5.03f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-1.414f, 1.415f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-5.03f, -5.03f)
                lineToRelative(-5.025f, 5.025f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-1.415f, -1.415f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(5.025f, -5.024f)
                lineToRelative(-2.566f, -2.566f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.135f, -0.135f)
                lineToRelative(-0.45f, 1.353f)
                lineToRelative(-0.257f, 0.768f)
                lineToRelative(-0.572f, -0.572f)
                lineToRelative(-2.828f, -2.829f)
                lineToRelative(-0.572f, -0.572f)
                lineToRelative(0.767f, -0.255f)
                lineToRelative(1.354f, -0.452f)
                lineToRelative(-0.135f, -0.135f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(3.182f, -3.182f)
                curveToRelative(0.504f, -0.504f, 1.032f, -0.778f, 1.554f, -0.882f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, true, 1.388f, 0.098f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 1.268f, 0.753f)
                lineToRelative(0.022f, 0.02f)
                lineToRelative(0.007f, 0.007f)
                lineToRelative(0.002f, 0.002f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(10.724f, 12.154f)
                lineTo(11.431f, 11.447f)
                lineTo(8.865f, 8.881f)
                lineTo(8.158f, 9.588f)
                close()
                moveTo(12.845f, 14.275f)
                lineTo(17.522f, 18.952f)
                lineTo(18.229f, 18.245f)
                lineTo(13.552f, 13.568f)
                close()
                moveTo(15.88f, 4.875f)
                curveToRelative(0.725f, -0.69f, 1.877f, -0.996f, 2.884f, -0.762f)
                lineToRelative(-2.168f, 2.168f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(1.415f, 1.414f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(2.168f, -2.168f)
                curveToRelative(0.234f, 1.007f, -0.073f, 2.158f, -0.763f, 2.884f)
                curveToRelative(-0.822f, 0.864f, -2.39f, 1.11f, -3.528f, 0.496f)
                lineToRelative(-0.328f, -0.176f)
                lineToRelative(-0.263f, 0.263f)
                lineToRelative(-9.244f, 9.244f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(9.244f, -9.244f)
                lineToRelative(0.263f, -0.263f)
                lineToRelative(-0.176f, -0.328f)
                curveToRelative(-0.613f, -1.137f, -0.368f, -2.706f, 0.496f, -3.528f)
            }
        }
            .build()
        return _hammerWrenchSmall!!
    }

private var _hammerWrenchSmall: ImageVector? = null
