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

public val SBBIcons.DocumentDocMedium: ImageVector
    get() {
        if (_documentDocMedium != null) {
            return _documentDocMedium!!
        }
        _documentDocMedium = Builder(
            name = "DocumentDocMedium",
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
                pathFillType = NonZero,
            ) {
                moveTo(26.75f, 14.043f)
                lineTo(26.75f, 29.75f)
                lineTo(9.25f, 29.75f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.014f, -22.5f)
                lineToRelative(0.001f, -0.5f)
                horizontalLineToRelative(9.691f)
                close()
                moveTo(10.25f, 28.75f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-7.986f)
                close()
                moveTo(22.215f, 22.335f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, 1.335f, 0.555f)
                curveToRelative(0.233f, 0.232f, 0.371f, 0.542f, 0.39f, 0.87f)
                horizontalLineToRelative(-0.855f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.3f, -0.51f)
                arcToRelative(0.974f, 0.974f, 0.0f, false, false, -1.5f, 0.285f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -0.21f, 0.885f)
                curveToRelative(-0.017f, 0.314f, 0.056f, 0.626f, 0.21f, 0.9f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, false, 0.84f, 0.465f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.615f, -0.24f)
                curveToRelative(0.176f, -0.181f, 0.278f, -0.422f, 0.285f, -0.675f)
                lineToRelative(0.976f, 0.015f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, -0.421f, 1.065f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.365f, 0.57f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, true, -1.5f, -0.66f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -0.45f, -1.425f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.54f, -1.5f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, 1.41f, -0.6f)
                moveTo(18.0f, 22.35f)
                curveToRelative(0.497f, -0.01f, 0.977f, 0.18f, 1.334f, 0.525f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.585f, 1.5f)
                curveToRelative(0.02f, 0.508f, -0.14f, 1.007f, -0.45f, 1.41f)
                arcToRelative(1.83f, 1.83f, 0.0f, false, true, -1.5f, 0.675f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, -1.5f, -0.69f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.434f, -1.395f)
                arcToRelative(2.02f, 2.02f, 0.0f, false, true, 0.57f, -1.5f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 18.0f, 22.35f)
                moveToRelative(-4.395f, 0.15f)
                curveToRelative(0.259f, -0.008f, 0.518f, 0.027f, 0.765f, 0.105f)
                curveToRelative(0.213f, 0.057f, 0.409f, 0.165f, 0.57f, 0.315f)
                arcToRelative(1.92f, 1.92f, 0.0f, false, true, 0.6f, 1.5f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, true, -0.57f, 1.5f)
                curveToRelative(-0.156f, 0.16f, -0.346f, 0.283f, -0.555f, 0.36f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.795f, 0.105f)
                lineTo(12.0f, 26.385f)
                lineTo(12.0f, 22.5f)
                close()
                moveTo(17.91f, 23.07f)
                lineTo(18.0f, 23.07f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -0.78f, 0.375f)
                curveToRelative(-0.215f, 0.284f, -0.321f, 0.636f, -0.3f, 0.99f)
                curveToRelative(-0.025f, 0.36f, 0.082f, 0.718f, 0.3f, 1.005f)
                curveToRelative(0.094f, 0.11f, 0.213f, 0.197f, 0.345f, 0.255f)
                curveToRelative(0.144f, 0.072f, 0.304f, 0.108f, 0.465f, 0.105f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, 0.75f, -0.33f)
                curveToRelative(0.223f, -0.297f, 0.335f, -0.663f, 0.314f, -1.034f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.3f, -0.99f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, -0.884f, -0.376f)
                moveToRelative(-5.04f, 2.67f)
                horizontalLineToRelative(0.63f)
                quadToRelative(0.247f, 0.03f, 0.495f, 0.0f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.345f, -0.24f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.315f, -1.005f)
                arcToRelative(1.33f, 1.33f, 0.0f, false, false, -0.285f, -0.93f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -0.87f, -0.3f)
                lineToRelative(-0.63f, -0.03f)
                close()
                moveTo(19.25f, 13.75f)
                horizontalLineToRelative(5.793f)
                lineTo(19.25f, 7.957f)
                close()
            }
        }
            .build()
        return _documentDocMedium!!
    }

private var _documentDocMedium: ImageVector? = null
