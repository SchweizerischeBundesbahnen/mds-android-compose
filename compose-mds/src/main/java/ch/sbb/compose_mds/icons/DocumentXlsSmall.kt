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

public val SBBIcons.DocumentXlsSmall: ImageVector
    get() {
        if (_documentXlsSmall != null) {
            return _documentXlsSmall!!
        }
        _documentXlsSmall = Builder(name = "DocumentXlsSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 9.293f)
                lineTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.008f, -15.0f)
                lineTo(6.01f, 4.0f)
                horizontalLineToRelative(6.698f)
                close()
                moveTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                lineTo(7.009f, 5.0f)
                close()
                moveTo(14.847f, 14.93f)
                quadToRelative(0.429f, 0.001f, 0.718f, 0.17f)
                quadToRelative(0.415f, 0.246f, 0.44f, 0.792f)
                horizontalLineToRelative(-0.625f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.163f, -0.336f)
                quadToRelative(-0.145f, -0.116f, -0.405f, -0.115f)
                quadToRelative(-0.232f, -0.002f, -0.36f, 0.09f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.128f, 0.255f)
                quadToRelative(0.0f, 0.15f, 0.123f, 0.212f)
                quadToRelative(0.12f, 0.067f, 0.603f, 0.187f)
                quadToRelative(0.51f, 0.127f, 0.708f, 0.256f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.362f, 0.662f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, -0.365f, 0.733f)
                quadToRelative(-0.322f, 0.239f, -0.87f, 0.238f)
                quadToRelative(-0.612f, -0.001f, -0.95f, -0.28f)
                quadToRelative(-0.34f, -0.28f, -0.35f, -0.794f)
                horizontalLineToRelative(0.65f)
                quadToRelative(0.015f, 0.25f, 0.13f, 0.371f)
                quadToRelative(0.18f, 0.194f, 0.543f, 0.193f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.39f, -0.097f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.162f, -0.3f)
                quadToRelative(0.0f, -0.192f, -0.227f, -0.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.59f, -0.178f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.456f, -0.151f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.263f, -0.16f)
                quadToRelative(-0.23f, -0.206f, -0.23f, -0.568f)
                quadToRelative(0.0f, -0.43f, 0.36f, -0.682f)
                quadToRelative(0.305f, -0.217f, 0.793f, -0.217f)
                moveToRelative(-3.031f, 2.517f)
                horizontalLineToRelative(1.467f)
                lineTo(13.283f, 18.0f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(-2.998f)
                horizontalLineToRelative(0.653f)
                close()
                moveTo(9.445f, 15.966f)
                lineTo(10.046f, 15.004f)
                horizontalLineToRelative(0.728f)
                lineToRelative(-0.965f, 1.43f)
                lineTo(10.862f, 18.0f)
                horizontalLineToRelative(-0.788f)
                lineToRelative(-0.657f, -1.042f)
                lineTo(8.75f, 18.0f)
                lineTo(8.0f, 18.0f)
                lineToRelative(1.058f, -1.567f)
                lineToRelative(-0.975f, -1.43f)
                horizontalLineToRelative(0.766f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineToRelative(3.292f)
                lineTo(13.0f, 5.708f)
                close()
            }
        }
        .build()
        return _documentXlsSmall!!
    }

private var _documentXlsSmall: ImageVector? = null
