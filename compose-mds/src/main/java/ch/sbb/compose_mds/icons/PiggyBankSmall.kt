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
        _piggyBankSmall = Builder(name = "PiggyBankSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 3.0f)
                moveToRelative(0.0f, 4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -0.001f, -5.001f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.5f, 7.0f)
                moveToRelative(-3.472f, 6.424f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 12.0f)
                horizontalLineTo(2.0f)
                curveToRelative(0.0f, 1.215f, 0.868f, 2.228f, 2.018f, 2.453f)
                curveToRelative(0.153f, 1.977f, 1.3f, 3.702f, 2.982f, 4.879f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.314f)
                curveToRelative(0.79f, 0.202f, 1.629f, 0.314f, 2.5f, 0.314f)
                curveToRelative(0.517f, 0.0f, 1.017f, -0.048f, 1.5f, -0.124f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.08f)
                curveToRelative(1.355f, -0.698f, 2.477f, -1.7f, 3.182f, -2.92f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-1.361f)
                curveToRelative(-0.338f, -0.936f, -0.908f, -1.777f, -1.639f, -2.494f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, false, -2.487f, 2.358f)
                lineToRelative(0.998f, 0.056f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 7.088f)
                verticalLineToRelative(2.847f)
                lineToRelative(0.16f, 0.148f)
                curveToRelative(0.791f, 0.732f, 1.36f, 1.605f, 1.637f, 2.557f)
                lineToRelative(0.104f, 0.36f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.42f)
                lineToRelative(-0.14f, 0.271f)
                curveToRelative(-0.616f, 1.201f, -1.73f, 2.214f, -3.154f, 2.887f)
                lineToRelative(-0.286f, 0.135f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.338f)
                lineToRelative(-0.602f, 0.127f)
                curveToRelative(-0.617f, 0.13f, -1.247f, 0.211f, -1.898f, 0.211f)
                arcToRelative(9.1f, 9.1f, 0.0f, false, true, -2.844f, -0.452f)
                lineTo(9.0f, 19.332f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-2.202f)
                lineToRelative(-0.227f, -0.148f)
                curveTo(6.056f, 17.531f, 5.0f, 15.848f, 5.0f, 14.0f)
                curveToRelative(0.0f, -2.163f, 1.452f, -4.107f, 3.713f, -5.17f)
                lineToRelative(-0.426f, -0.905f)
                curveToRelative(-2.332f, 1.097f, -4.023f, 3.106f, -4.259f, 5.5f)
                moveToRelative(15.769f, -0.784f)
                lineToRelative(0.48f, -0.141f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(14.0f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.0f, 8.5f)
                moveToRelative(0.36f, 1.67f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -3.719f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -1.297f, 0.332f)
                lineToRelative(0.312f, 0.95f)
                arcTo(9.1f, 9.1f, 0.0f, false, true, 12.5f, 11.0f)
                curveToRelative(1.008f, 0.0f, 1.966f, 0.164f, 2.844f, 0.453f)
                lineToRelative(0.312f, -0.95f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -1.296f, -0.332f)
                moveTo(18.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _piggyBankSmall!!
    }

private var _piggyBankSmall: ImageVector? = null
