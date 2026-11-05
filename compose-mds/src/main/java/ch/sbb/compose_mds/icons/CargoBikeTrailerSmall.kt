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

public val SBBIcons.CargoBikeTrailerSmall: ImageVector
    get() {
        if (_cargoBikeTrailerSmall != null) {
            return _cargoBikeTrailerSmall!!
        }
        _cargoBikeTrailerSmall = Builder(
            name = "CargoBikeTrailerSmall",
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
                moveTo(8.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.877f)
                lineToRelative(0.104f, 0.363f)
                curveToRelative(0.13f, 0.457f, 0.284f, 1.05f, 0.431f, 1.639f)
                lineTo(19.5f, 6.0f)
                curveTo(20.879f, 6.0f, 22.0f, 7.121f, 22.0f, 8.5f)
                reflectiveCurveTo(20.879f, 11.0f, 19.5f, 11.0f)
                reflectiveCurveTo(17.0f, 9.879f, 17.0f, 8.5f)
                curveToRelative(0.0f, -1.0f, 0.59f, -1.865f, 1.44f, -2.264f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, false, -0.227f, -0.889f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, -2.456f, 2.043f)
                arcToRelative(112.0f, 112.0f, 0.0f, false, false, -1.544f, 1.365f)
                lineToRelative(-0.094f, 0.086f)
                lineToRelative(-0.025f, 0.022f)
                lineToRelative(-0.006f, 0.005f)
                lineToRelative(-0.001f, 0.001f)
                lineToRelative(-0.337f, -0.369f)
                lineToRelative(0.336f, 0.37f)
                lineToRelative(-0.143f, 0.13f)
                lineTo(6.95f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, 2.0f)
                curveTo(3.12f, 11.0f, 2.0f, 9.879f, 2.0f, 8.5f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 3.443f, -2.316f)
                lineTo(6.0f, 5.35f)
                lineTo(6.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.651f)
                lineToRelative(-0.084f, 0.126f)
                lineToRelative(-0.642f, 0.963f)
                curveToRelative(0.337f, 0.34f, 0.577f, 0.774f, 0.676f, 1.26f)
                lineTo(9.0f, 8.0f)
                lineTo(9.0f, 3.0f)
                lineTo(8.0f, 3.0f)
                close()
                moveTo(5.914f, 9.0f)
                curveToRelative(-0.206f, 0.582f, -0.762f, 1.0f, -1.414f, 1.0f)
                curveTo(3.673f, 10.0f, 3.0f, 9.327f, 3.0f, 8.5f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, true, 1.869f, -1.454f)
                lineToRelative(-0.785f, 1.177f)
                lineTo(3.566f, 9.0f)
                horizontalLineToRelative(2.348f)
                moveTo(5.7f, 7.601f)
                lineTo(5.434f, 8.0f)
                horizontalLineToRelative(0.48f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.214f, -0.399f)
                moveTo(21.0f, 8.5f)
                curveToRelative(0.0f, -0.773f, -0.588f, -1.411f, -1.34f, -1.492f)
                arcToRelative(161.0f, 161.0f, 0.0f, false, true, 0.3f, 1.263f)
                lineToRelative(0.02f, 0.086f)
                lineToRelative(0.005f, 0.022f)
                lineToRelative(0.002f, 0.006f)
                verticalLineToRelative(0.002f)
                lineTo(19.5f, 8.5f)
                lineToRelative(-0.487f, 0.113f)
                lineTo(19.013f, 8.61f)
                lineToRelative(-0.002f, -0.006f)
                lineToRelative(-0.005f, -0.022f)
                lineToRelative(-0.02f, -0.085f)
                arcToRelative(129.0f, 129.0f, 0.0f, false, false, -0.299f, -1.258f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 21.0f, 8.5f)
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(3.557f)
                arcToRelative(109.0f, 109.0f, 0.0f, false, true, 1.545f, -1.365f)
                curveToRelative(0.593f, -0.515f, 1.28f, -1.1f, 1.942f, -1.635f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(2.902f)
                lineToRelative(-0.478f, 0.765f)
                lineToRelative(-1.09f, 1.744f)
                lineToRelative(0.364f, 0.623f)
                quadToRelative(0.379f, -0.13f, 0.802f, -0.132f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveTo(20.879f, 22.0f, 19.5f, 22.0f)
                reflectiveCurveTo(17.0f, 20.879f, 17.0f, 19.5f)
                curveToRelative(0.0f, -0.74f, 0.322f, -1.405f, 0.834f, -1.863f)
                lineTo(17.463f, 17.0f)
                lineTo(14.86f, 17.0f)
                lineToRelative(-0.111f, 0.335f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 22.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, -2.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.732f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.728f, -1.12f)
                lineTo(2.0f, 19.88f)
                lineTo(2.0f, 15.0f)
                horizontalLineToRelative(3.185f)
                lineToRelative(0.14f, 0.12f)
                lineToRelative(3.5f, 3.0f)
                lineToRelative(0.175f, 0.15f)
                lineTo(9.0f, 19.0f)
                horizontalLineToRelative(2.05f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, true, 2.75f, -1.982f)
                lineToRelative(0.226f, -0.676f)
                lineToRelative(0.114f, -0.342f)
                lineTo(13.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.473f)
                lineToRelative(0.625f, -1.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(3.0f, 18.268f)
                lineTo(3.0f, 16.0f)
                horizontalLineToRelative(1.815f)
                lineTo(8.0f, 18.73f)
                lineTo(8.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.0f, -1.732f)
                moveToRelative(16.22f, -0.242f)
                lineToRelative(0.712f, 1.222f)
                lineToRelative(-0.864f, 0.504f)
                lineToRelative(-0.712f, -1.221f)
                arcTo(1.502f, 1.502f, 0.0f, false, false, 19.5f, 21.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                arcToRelative(1.502f, 1.502f, 0.0f, false, false, -1.78f, -1.474f)
                moveTo(15.0f, 19.5f)
                curveToRelative(0.0f, -0.48f, -0.227f, -0.908f, -0.579f, -1.183f)
                lineToRelative(-0.447f, 1.341f)
                lineToRelative(-0.114f, 0.342f)
                horizontalLineToRelative(-1.774f)
                curveToRelative(0.206f, 0.582f, 0.762f, 1.0f, 1.414f, 1.0f)
                curveToRelative(0.827f, 0.0f, 1.5f, -0.673f, 1.5f, -1.5f)
                moveTo(13.473f, 18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.387f, 1.0f)
                horizontalLineToRelative(1.054f)
                close()
                moveTo(3.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
            }
        }
            .build()
        return _cargoBikeTrailerSmall!!
    }

private var _cargoBikeTrailerSmall: ImageVector? = null
