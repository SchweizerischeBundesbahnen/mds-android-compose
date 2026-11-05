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

public val SBBIcons.CargoBikeMedium: ImageVector
    get() {
        if (_cargoBikeMedium != null) {
            return _cargoBikeMedium!!
        }
        _cargoBikeMedium = Builder(
            name = "CargoBikeMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(12.0f, 12.25f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(13.377f)
                lineToRelative(0.104f, 0.363f)
                curveToRelative(0.21f, 0.734f, 0.46f, 1.705f, 0.696f, 2.652f)
                arcToRelative(3.503f, 3.503f, 0.0f, false, true, 3.823f, 3.485f)
                curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.931f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0.0f, -1.473f, 0.913f, -2.736f, 2.204f, -3.252f)
                curveToRelative(-0.163f, -0.656f, -0.333f, -1.32f, -0.49f, -1.906f)
                curveToRelative(-1.268f, 0.975f, -2.755f, 2.231f, -3.992f, 3.305f)
                arcToRelative(170.0f, 170.0f, 0.0f, false, false, -2.32f, 2.05f)
                lineToRelative(-0.142f, 0.129f)
                lineToRelative(-0.036f, 0.033f)
                lineToRelative(-0.01f, 0.008f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.337f, -0.369f)
                lineToRelative(0.336f, 0.37f)
                lineToRelative(-0.143f, 0.13f)
                lineTo(10.215f, 22.25f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, true, -3.465f, 3.0f)
                curveToRelative(-1.931f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f)
                arcToRelative(3.503f, 3.503f, 0.0f, false, true, 5.005f, -3.16f)
                lineTo(9.25f, 17.1f)
                lineTo(9.25f, 14.75f)
                lineTo(7.5f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(3.651f)
                lineToRelative(-0.084f, 0.126f)
                lineToRelative(-1.08f, 1.62f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.128f, 2.103f)
                horizontalLineToRelative(3.536f)
                verticalLineToRelative(-8.0f)
                lineTo(12.0f, 13.25f)
                close()
                moveTo(9.2f, 21.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.676f, -1.26f)
                lineToRelative(-0.84f, 1.26f)
                close()
                moveTo(7.693f, 19.435f)
                arcTo(2.503f, 2.503f, 0.0f, false, false, 4.25f, 21.75f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.207f, 0.0f, 2.217f, -0.86f, 2.45f, -2.0f)
                lineTo(5.816f, 22.25f)
                lineToRelative(0.518f, -0.777f)
                close()
                moveTo(28.233f, 19.637f)
                lineTo(28.196f, 19.483f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.446f, 2.267f)
                curveToRelative(0.0f, 1.378f, 1.121f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.378f, 0.0f, 2.5f, -1.122f, 2.5f, -2.5f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, false, -2.58f, -2.499f)
                lineToRelative(0.036f, 0.15f)
                arcToRelative(260.0f, 260.0f, 0.0f, false, true, 0.49f, 2.062f)
                lineToRelative(0.03f, 0.129f)
                lineToRelative(0.008f, 0.034f)
                lineToRelative(0.002f, 0.008f)
                lineToRelative(0.001f, 0.003f)
                lineToRelative(-0.487f, 0.113f)
                lineToRelative(-0.487f, 0.113f)
                verticalLineToRelative(-0.003f)
                lineToRelative(-0.003f, -0.008f)
                lineToRelative(-0.007f, -0.034f)
                lineToRelative(-0.03f, -0.128f)
                arcToRelative(253.0f, 253.0f, 0.0f, false, false, -0.49f, -2.053f)
                moveTo(14.75f, 21.25f)
                horizontalLineToRelative(5.682f)
                lineToRelative(0.05f, -0.045f)
                lineToRelative(0.532f, -0.477f)
                curveToRelative(0.452f, -0.404f, 1.084f, -0.963f, 1.802f, -1.587f)
                curveToRelative(1.058f, -0.917f, 2.311f, -1.98f, 3.461f, -2.891f)
                lineTo(14.75f, 16.25f)
                close()
            }
        }
            .build()
        return _cargoBikeMedium!!
    }

private var _cargoBikeMedium: ImageVector? = null
