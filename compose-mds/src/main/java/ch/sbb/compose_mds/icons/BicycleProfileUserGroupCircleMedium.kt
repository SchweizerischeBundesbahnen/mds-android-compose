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

public val SBBIcons.BicycleProfileUserGroupCircleMedium: ImageVector
    get() {
        if (_bicycleProfileUserGroupCircleMedium != null) {
            return _bicycleProfileUserGroupCircleMedium!!
        }
        _bicycleProfileUserGroupCircleMedium = Builder(
            name = "BicycleProfileUserGroupCircleMedium",
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
                moveTo(19.5f, 4.25f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.794f)
                lineToRelative(-0.143f, 0.257f)
                lineToRelative(-1.697f, 3.055f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, false, -5.866f, 3.93f)
                arcToRelative(4.255f, 4.255f, 0.0f, false, false, 4.25f, 4.25f)
                arcToRelative(4.248f, 4.248f, 0.0f, false, false, 2.489f, -7.693f)
                lineToRelative(1.555f, -2.799f)
                horizontalLineToRelative(5.346f)
                lineToRelative(0.802f, 2.404f)
                arcTo(4.25f, 4.25f, 0.0f, false, false, 19.75f, 13.5f)
                arcTo(4.254f, 4.254f, 0.0f, false, false, 24.0f, 17.75f)
                arcToRelative(4.254f, 4.254f, 0.0f, false, false, 4.25f, -4.25f)
                arcToRelative(4.253f, 4.253f, 0.0f, false, false, -5.11f, -4.163f)
                lineToRelative(-0.89f, -2.668f)
                lineTo(22.25f, 3.25f)
                lineTo(19.5f, 3.25f)
                close()
                moveTo(16.5f, 5.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.511f, 10.611f)
                lineTo(23.526f, 13.651f)
                lineTo(24.474f, 13.334f)
                lineTo(23.46f, 10.294f)
                arcToRelative(3.253f, 3.253f, 0.0f, false, true, 3.79f, 3.205f)
                arcTo(3.254f, 3.254f, 0.0f, false, true, 24.0f, 16.751f)
                arcToRelative(3.254f, 3.254f, 0.0f, false, true, -3.25f, -3.25f)
                curveToRelative(0.0f, -1.256f, 0.716f, -2.348f, 1.761f, -2.889f)
                moveToRelative(-9.385f, -0.167f)
                lineToRelative(-1.563f, 2.813f)
                lineToRelative(0.874f, 0.486f)
                lineTo(14.0f, 10.933f)
                arcTo(3.247f, 3.247f, 0.0f, false, true, 12.0f, 16.742f)
                curveToRelative(-1.79f, 0.0f, -3.25f, -1.46f, -3.25f, -3.25f)
                arcToRelative(3.255f, 3.255f, 0.0f, false, true, 4.376f, -3.049f)
                moveToRelative(-0.817f, 10.984f)
                curveToRelative(-0.336f, 0.449f, -0.559f, 1.09f, -0.559f, 1.821f)
                reflectiveCurveToRelative(0.223f, 1.374f, 0.559f, 1.822f)
                reflectiveCurveToRelative(0.762f, 0.678f, 1.191f, 0.678f)
                curveToRelative(0.404f, 0.0f, 0.806f, -0.205f, 1.131f, -0.601f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.131f, -1.149f)
                curveToRelative(0.0f, -0.751f, 0.166f, -1.478f, 0.463f, -2.111f)
                curveToRelative(-0.34f, -0.74f, -0.909f, -1.139f, -1.463f, -1.139f)
                curveToRelative(-0.429f, 0.0f, -0.855f, 0.23f, -1.19f, 0.68f)
                moveTo(13.5f, 26.75f)
                arcToRelative(2.34f, 2.34f, 0.0f, false, false, 1.5f, -0.56f)
                quadToRelative(0.177f, 0.359f, 0.41f, 0.671f)
                curveToRelative(-0.913f, 0.81f, -1.645f, 1.957f, -2.063f, 3.389f)
                horizontalLineToRelative(-3.04f)
                curveToRelative(0.24f, -1.745f, 0.948f, -3.062f, 1.85f, -3.94f)
                curveToRelative(0.388f, 0.274f, 0.844f, 0.44f, 1.343f, 0.44f)
                moveToRelative(0.55f, 5.0f)
                curveToRelative(0.256f, -1.89f, 1.053f, -3.294f, 2.055f, -4.169f)
                curveToRelative(0.536f, 0.42f, 1.18f, 0.67f, 1.895f, 0.67f)
                curveToRelative(0.71f, 0.0f, 1.352f, -0.247f, 1.887f, -0.664f)
                curveToRelative(0.998f, 0.874f, 1.793f, 2.277f, 2.05f, 4.164f)
                close()
                moveTo(22.64f, 30.25f)
                curveToRelative(-0.418f, -1.427f, -1.147f, -2.572f, -2.055f, -3.38f)
                quadToRelative(0.235f, -0.316f, 0.415f, -0.681f)
                curveToRelative(0.42f, 0.346f, 0.932f, 0.56f, 1.5f, 0.56f)
                curveToRelative(0.497f, 0.0f, 0.95f, -0.164f, 1.338f, -0.437f)
                curveToRelative(0.901f, 0.88f, 1.61f, 2.194f, 1.85f, 3.939f)
                close()
                moveTo(24.542f, 25.602f)
                curveToRelative(1.178f, 1.152f, 2.027f, 2.882f, 2.2f, 5.11f)
                lineToRelative(0.043f, 0.539f)
                horizontalLineToRelative(-3.913f)
                quadToRelative(0.081f, 0.465f, 0.12f, 0.96f)
                lineToRelative(0.042f, 0.54f)
                horizontalLineToRelative(-10.08f)
                lineToRelative(0.041f, -0.539f)
                quadToRelative(0.039f, -0.497f, 0.12f, -0.962f)
                lineTo(9.21f, 31.25f)
                lineToRelative(0.042f, -0.539f)
                curveToRelative(0.174f, -2.23f, 1.022f, -3.961f, 2.203f, -5.114f)
                curveToRelative(-0.445f, -0.629f, -0.705f, -1.456f, -0.705f, -2.347f)
                curveToRelative(0.0f, -0.925f, 0.281f, -1.783f, 0.759f, -2.42f)
                curveToRelative(0.478f, -0.638f, 1.177f, -1.08f, 1.991f, -1.08f)
                curveToRelative(0.862f, 0.0f, 1.584f, 0.486f, 2.068f, 1.189f)
                curveToRelative(0.616f, -0.727f, 1.46f, -1.189f, 2.432f, -1.189f)
                curveToRelative(0.973f, 0.0f, 1.816f, 0.462f, 2.432f, 1.189f)
                curveToRelative(0.484f, -0.703f, 1.206f, -1.19f, 2.068f, -1.19f)
                curveToRelative(0.814f, 0.0f, 1.513f, 0.442f, 1.991f, 1.08f)
                curveToRelative(0.478f, 0.637f, 0.76f, 1.495f, 0.76f, 2.42f)
                curveToRelative(0.0f, 0.894f, -0.262f, 1.723f, -0.71f, 2.353f)
                moveToRelative(-3.505f, -3.713f)
                curveToRelative(0.297f, 0.633f, 0.463f, 1.36f, 0.463f, 2.111f)
                curveToRelative(0.0f, 0.393f, -0.045f, 0.779f, -0.13f, 1.148f)
                curveToRelative(0.324f, 0.397f, 0.726f, 0.602f, 1.13f, 0.602f)
                curveToRelative(0.429f, 0.0f, 0.855f, -0.23f, 1.191f, -0.679f)
                curveToRelative(0.336f, -0.448f, 0.56f, -1.09f, 0.56f, -1.822f)
                curveToRelative(0.0f, -0.73f, -0.224f, -1.372f, -0.56f, -1.82f)
                curveToRelative(-0.336f, -0.449f, -0.762f, -0.68f, -1.19f, -0.68f)
                curveToRelative(-0.556f, 0.0f, -1.125f, 0.401f, -1.464f, 1.14f)
                moveTo(18.0f, 20.75f)
                curveToRelative(-1.282f, 0.0f, -2.5f, 1.345f, -2.5f, 3.25f)
                reflectiveCurveToRelative(1.218f, 3.25f, 2.5f, 3.25f)
                reflectiveCurveToRelative(2.5f, -1.345f, 2.5f, -3.25f)
                reflectiveCurveToRelative(-1.218f, -3.25f, -2.5f, -3.25f)
                moveToRelative(12.351f, -8.696f)
                curveToRelative(1.488f, 1.467f, 2.399f, 3.248f, 2.399f, 5.197f)
                curveToRelative(0.0f, 3.078f, -2.234f, 5.724f, -5.52f, 7.42f)
                lineToRelative(-0.46f, -0.89f)
                curveToRelative(3.119f, -1.607f, 4.98f, -3.98f, 4.98f, -6.53f)
                curveToRelative(0.0f, -1.618f, -0.753f, -3.155f, -2.101f, -4.485f)
                close()
                moveTo(5.649f, 12.054f)
                curveTo(4.162f, 13.52f, 3.25f, 15.3f, 3.25f, 17.25f)
                curveToRelative(0.0f, 3.076f, 2.234f, 5.724f, 5.521f, 7.418f)
                lineToRelative(0.458f, -0.89f)
                curveTo(6.111f, 22.174f, 4.25f, 19.8f, 4.25f, 17.252f)
                curveToRelative(0.0f, -1.62f, 0.753f, -3.156f, 2.101f, -4.487f)
                close()
            }
        }
            .build()
        return _bicycleProfileUserGroupCircleMedium!!
    }

private var _bicycleProfileUserGroupCircleMedium: ImageVector? = null
