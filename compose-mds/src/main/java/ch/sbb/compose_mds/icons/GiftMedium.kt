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

public val SBBIcons.GiftMedium: ImageVector
    get() {
        if (_giftMedium != null) {
            return _giftMedium!!
        }
        _giftMedium = Builder(
            name = "GiftMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(18.001f, 4.718f)
                arcToRelative(3.07f, 3.07f, 0.0f, false, false, -1.3f, -1.2f)
                curveToRelative(-0.805f, -0.383f, -1.707f, -0.355f, -2.475f, -0.045f)
                reflectiveCurveToRelative(-1.435f, 0.915f, -1.757f, 1.73f)
                curveToRelative(-0.327f, 0.827f, -0.278f, 1.817f, 0.295f, 2.841f)
                lineToRelative(0.015f, 0.028f)
                lineToRelative(0.019f, 0.025f)
                lineToRelative(1.96f, 2.653f)
                lineTo(4.75f, 10.75f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(-16.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-5.5f)
                lineTo(21.241f, 10.75f)
                lineToRelative(1.961f, -2.652f)
                lineToRelative(0.017f, -0.023f)
                lineToRelative(0.014f, -0.024f)
                curveToRelative(0.584f, -1.009f, 0.639f, -1.992f, 0.31f, -2.817f)
                curveToRelative(-0.322f, -0.81f, -0.991f, -1.413f, -1.76f, -1.725f)
                curveToRelative(-0.768f, -0.312f, -1.672f, -0.348f, -2.48f, 0.027f)
                arcToRelative(3.03f, 3.03f, 0.0f, false, false, -1.302f, 1.182f)
                moveToRelative(-0.5f, 1.35f)
                curveToRelative(-0.258f, -0.91f, -0.733f, -1.41f, -1.23f, -1.647f)
                curveToRelative(-0.52f, -0.247f, -1.127f, -0.24f, -1.67f, -0.02f)
                curveToRelative(-0.545f, 0.22f, -0.992f, 0.638f, -1.202f, 1.169f)
                curveToRelative(-0.202f, 0.512f, -0.205f, 1.179f, 0.223f, 1.96f)
                lineToRelative(2.38f, 3.22f)
                horizontalLineToRelative(1.493f)
                close()
                moveTo(18.501f, 6.068f)
                lineTo(18.495f, 10.75f)
                horizontalLineToRelative(1.503f)
                lineToRelative(2.383f, -3.224f)
                curveToRelative(0.434f, -0.762f, 0.434f, -1.417f, 0.233f, -1.922f)
                curveToRelative(-0.208f, -0.525f, -0.657f, -0.945f, -1.207f, -1.168f)
                curveToRelative(-0.549f, -0.223f, -1.161f, -0.235f, -1.682f, 0.007f)
                curveToRelative(-0.498f, 0.232f, -0.972f, 0.723f, -1.225f, 1.624f)
                moveTo(22.25f, 16.25f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-15.5f)
                close()
                moveTo(21.25f, 31.75f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(22.25f, 15.25f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-8.0f)
                moveToRelative(-1.0f, 0.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(13.75f, 15.25f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(8.0f)
                moveToRelative(0.0f, 16.5f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(15.5f)
                close()
            }
        }
            .build()
        return _giftMedium!!
    }

private var _giftMedium: ImageVector? = null
