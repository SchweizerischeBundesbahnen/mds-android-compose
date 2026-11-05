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
        _clipboardUsersSmall = Builder(
            name = "ClipboardUsersSmall",
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
                moveTo(9.5f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(16.0f, 2.0f)
                lineTo(9.5f, 2.0f)
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
                moveTo(11.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 10.0f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(4.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(11.65f, 11.32f)
                curveToRelative(0.0f, 0.5f, 0.132f, 0.985f, 0.365f, 1.394f)
                curveToRelative(-1.59f, 0.937f, -2.425f, 2.938f, -2.425f, 4.786f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(8.65f)
                verticalLineToRelative(-0.5f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, -0.129f, -1.26f)
                lineTo(20.0f, 16.24f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.859f, -0.873f, -3.82f, -2.456f, -4.746f)
                curveToRelative(0.248f, -0.422f, 0.386f, -0.923f, 0.386f, -1.434f)
                curveToRelative(0.0f, -1.31f, -0.906f, -2.56f, -2.26f, -2.56f)
                curveToRelative(-0.606f, 0.0f, -1.177f, 0.195f, -1.6f, 0.598f)
                arcToRelative(2.13f, 2.13f, 0.0f, false, false, -0.624f, 1.214f)
                curveToRelative(-1.069f, 0.247f, -1.796f, 1.331f, -1.796f, 2.508f)
                moveToRelative(5.198f, 0.435f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, -0.782f, 0.328f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, -0.266f, 0.64f)
                curveToRelative(0.938f, 0.551f, 1.62f, 1.473f, 2.02f, 2.517f)
                horizontalLineToRelative(1.156f)
                curveToRelative(-0.147f, -1.513f, -0.949f, -2.902f, -2.128f, -3.485f)
                moveToRelative(0.082f, -2.195f)
                curveToRelative(0.0f, 0.69f, -0.339f, 1.216f, -0.778f, 1.44f)
                curveToRelative(-0.114f, -1.015f, -0.765f, -1.907f, -1.689f, -2.165f)
                curveToRelative(0.06f, -0.22f, 0.167f, -0.39f, 0.297f, -0.513f)
                curveToRelative(0.207f, -0.197f, 0.516f, -0.322f, 0.91f, -0.322f)
                curveToRelative(0.646f, 0.0f, 1.26f, 0.63f, 1.26f, 1.56f)
                moveToRelative(-1.814f, 3.93f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, -1.206f, 0.39f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, -1.215f, -0.397f)
                curveToRelative(-1.168f, 0.59f, -1.941f, 1.997f, -2.082f, 3.517f)
                horizontalLineToRelative(6.603f)
                curveToRelative(-0.143f, -1.519f, -0.93f, -2.924f, -2.1f, -3.51f)
                moveTo(13.91f, 9.76f)
                curveToRelative(-0.624f, 0.0f, -1.26f, 0.62f, -1.26f, 1.56f)
                reflectiveCurveToRelative(0.636f, 1.56f, 1.26f, 1.56f)
                reflectiveCurveToRelative(1.26f, -0.62f, 1.26f, -1.56f)
                reflectiveCurveToRelative(-0.636f, -1.56f, -1.26f, -1.56f)
            }
        }
            .build()
        return _clipboardUsersSmall!!
    }

private var _clipboardUsersSmall: ImageVector? = null
