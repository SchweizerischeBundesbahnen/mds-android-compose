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

public val SBBIcons.PiggyBankSmall: ImageVector
    get() {
        if (_piggyBankSmall != null) {
            return _piggyBankSmall!!
        }
        _piggyBankSmall = Builder(
            name = "PiggyBankSmall",
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
                moveTo(6.0f, 4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 4.5f)
                moveTo(7.5f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.001f, 5.001f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.5f, 2.0f)
                moveTo(4.028f, 13.424f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveToRelative(0.0f, 1.215f, 0.868f, 2.228f, 2.017f, 2.453f)
                curveToRelative(0.154f, 1.978f, 1.3f, 3.705f, 2.983f, 4.882f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.311f)
                curveToRelative(0.79f, 0.201f, 1.63f, 0.311f, 2.5f, 0.311f)
                curveToRelative(0.517f, 0.0f, 1.017f, -0.046f, 1.5f, -0.122f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.08f)
                curveToRelative(1.355f, -0.698f, 2.477f, -1.7f, 3.182f, -2.92f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.36f)
                curveToRelative(-0.338f, -0.937f, -0.908f, -1.78f, -1.64f, -2.498f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, false, -2.487f, 2.358f)
                lineToRelative(0.998f, 0.056f)
                curveToRelative(0.035f, -0.615f, 0.437f, -1.13f, 0.989f, -1.328f)
                verticalLineToRelative(2.848f)
                lineToRelative(0.16f, 0.149f)
                curveToRelative(0.791f, 0.732f, 1.36f, 1.604f, 1.637f, 2.556f)
                lineTo(19.9f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.42f)
                lineToRelative(-0.14f, 0.271f)
                curveToRelative(-0.617f, 1.201f, -1.73f, 2.214f, -3.154f, 2.887f)
                lineToRelative(-0.286f, 0.135f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.338f)
                lineToRelative(-0.603f, 0.127f)
                arcTo(9.2f, 9.2f, 0.0f, false, true, 12.5f, 20.0f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, -2.844f, -0.452f)
                lineTo(9.0f, 19.332f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.201f)
                lineToRelative(-0.227f, -0.149f)
                curveTo(6.056f, 17.53f, 5.0f, 15.848f, 5.0f, 14.0f)
                curveToRelative(0.0f, -2.163f, 1.452f, -4.107f, 3.713f, -5.17f)
                lineToRelative(-0.426f, -0.905f)
                curveToRelative(-2.332f, 1.097f, -4.023f, 3.106f, -4.259f, 5.5f)
                moveTo(12.5f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 7.0f)
                moveTo(10.0f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 4.36f, 1.67f)
                quadToRelative(0.67f, 0.126f, 1.296f, 0.332f)
                lineToRelative(-0.312f, 0.95f)
                arcTo(9.1f, 9.1f, 0.0f, false, false, 12.5f, 11.0f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, false, -2.844f, 0.452f)
                lineToRelative(-0.312f, -0.95f)
                quadToRelative(0.626f, -0.207f, 1.296f, -0.332f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 10.0f, 8.5f)
                moveToRelative(8.0f, 4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _piggyBankSmall!!
    }

private var _piggyBankSmall: ImageVector? = null
