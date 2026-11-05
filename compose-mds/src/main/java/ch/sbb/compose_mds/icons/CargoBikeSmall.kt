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

public val SBBIcons.CargoBikeSmall: ImageVector
    get() {
        if (_cargoBikeSmall != null) {
            return _cargoBikeSmall!!
        }
        _cargoBikeSmall = Builder(
            name = "CargoBikeSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveTo(8.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.877f)
                lineToRelative(0.104f, 0.363f)
                curveToRelative(0.13f, 0.457f, 0.284f, 1.05f, 0.431f, 1.639f)
                lineTo(19.5f, 12.0f)
                curveToRelative(1.379f, 0.0f, 2.5f, 1.121f, 2.5f, 2.5f)
                reflectiveCurveTo(20.879f, 17.0f, 19.5f, 17.0f)
                reflectiveCurveTo(17.0f, 15.879f, 17.0f, 14.5f)
                curveToRelative(0.0f, -1.0f, 0.59f, -1.865f, 1.44f, -2.264f)
                arcToRelative(77.0f, 77.0f, 0.0f, false, false, -0.227f, -0.889f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, -2.456f, 2.043f)
                arcToRelative(111.0f, 111.0f, 0.0f, false, false, -1.544f, 1.365f)
                lineToRelative(-0.094f, 0.086f)
                lineToRelative(-0.025f, 0.022f)
                lineToRelative(-0.006f, 0.005f)
                lineToRelative(-0.001f, 0.002f)
                lineToRelative(-0.337f, -0.37f)
                lineToRelative(0.336f, 0.37f)
                lineToRelative(-0.143f, 0.13f)
                lineTo(6.95f, 15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, 2.0f)
                curveTo(3.12f, 17.0f, 2.0f, 15.879f, 2.0f, 14.5f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 3.443f, -2.316f)
                lineTo(6.0f, 11.35f)
                lineTo(6.0f, 10.0f)
                lineTo(5.0f, 10.0f)
                lineTo(5.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.651f)
                lineToRelative(-0.084f, 0.126f)
                lineToRelative(-0.642f, 0.963f)
                curveToRelative(0.337f, 0.34f, 0.577f, 0.774f, 0.676f, 1.26f)
                lineTo(9.0f, 14.0f)
                lineTo(9.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(5.914f, 14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.214f, -0.399f)
                lineTo(5.434f, 14.0f)
                close()
                moveTo(4.869f, 13.046f)
                arcTo(1.502f, 1.502f, 0.0f, false, false, 3.0f, 14.5f)
                curveToRelative(0.0f, 0.827f, 0.673f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.652f, 0.0f, 1.208f, -0.418f, 1.414f, -1.0f)
                lineTo(3.566f, 15.0f)
                lineToRelative(0.518f, -0.777f)
                close()
                moveTo(18.912f, 14.182f)
                curveToRelative(-0.057f, -0.244f, -0.136f, -0.573f, -0.225f, -0.942f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.973f, -0.232f)
                arcToRelative(161.0f, 161.0f, 0.0f, false, true, 0.3f, 1.263f)
                lineToRelative(0.02f, 0.086f)
                lineToRelative(0.005f, 0.022f)
                lineToRelative(0.002f, 0.006f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.487f, 0.113f)
                lineToRelative(-0.487f, 0.113f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.002f, -0.006f)
                lineToRelative(-0.005f, -0.022f)
                lineToRelative(-0.02f, -0.085f)
                close()
                moveTo(10.0f, 14.0f)
                horizontalLineToRelative(3.557f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 1.545f, -1.365f)
                arcTo(77.0f, 77.0f, 0.0f, false, true, 17.044f, 11.0f)
                lineTo(10.0f, 11.0f)
                close()
            }
        }
            .build()
        return _cargoBikeSmall!!
    }

private var _cargoBikeSmall: ImageVector? = null
