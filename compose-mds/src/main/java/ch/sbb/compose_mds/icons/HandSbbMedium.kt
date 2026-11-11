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

public val SBBIcons.HandSbbMedium: ImageVector
    get() {
        if (_handSbbMedium != null) {
            return _handSbbMedium!!
        }
        _handSbbMedium = Builder(name = "HandSbbMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.829f, 10.056f)
                lineTo(15.71f, 6.0f)
                horizontalLineToRelative(3.06f)
                lineToRelative(5.23f, 5.25f)
                lineToRelative(-5.23f, 5.25f)
                horizontalLineToRelative(-3.06f)
                lineToRelative(4.118f, -4.03f)
                lineTo(14.71f, 12.47f)
                verticalLineToRelative(4.03f)
                lineTo(12.29f, 16.5f)
                verticalLineToRelative(-4.03f)
                lineTo(7.2f, 12.47f)
                lineToRelative(4.116f, 4.03f)
                horizontalLineToRelative(-3.06f)
                lineTo(3.0f, 11.25f)
                lineTo(8.256f, 6.0f)
                horizontalLineToRelative(3.06f)
                lineTo(7.2f, 10.056f)
                horizontalLineToRelative(5.09f)
                lineTo(12.29f, 6.0f)
                horizontalLineToRelative(2.42f)
                verticalLineToRelative(4.056f)
                close()
                moveTo(6.475f, 20.17f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, -2.493f, 3.123f)
                lineToRelative(8.886f, 7.83f)
                lineToRelative(0.142f, 0.126f)
                horizontalLineToRelative(5.898f)
                lineToRelative(1.365f, 1.354f)
                lineToRelative(0.147f, 0.146f)
                horizontalLineToRelative(12.582f)
                lineToRelative(-0.847f, -0.853f)
                lineToRelative(-7.542f, -7.595f)
                lineToRelative(-0.008f, -0.008f)
                curveToRelative(-1.756f, -1.69f, -4.04f, -2.999f, -6.431f, -3.044f)
                lineTo(15.0f, 21.249f)
                curveToRelative(-0.88f, 0.0f, -1.581f, 0.337f, -2.058f, 0.869f)
                curveToRelative(-0.468f, 0.523f, -0.697f, 1.207f, -0.702f, 1.877f)
                quadToRelative(0.0f, 0.103f, 0.007f, 0.206f)
                lineTo(6.476f, 20.17f)
                close()
                moveTo(32.155f, 31.896f)
                lineTo(31.801f, 32.249f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(20.273f, 32.603f)
                lineTo(20.626f, 32.247f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(12.868f, 31.123f)
                lineTo(13.199f, 30.748f)
                close()
                moveTo(4.471f, 21.123f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.406f, -0.153f)
                lineToRelative(0.013f, 0.01f)
                lineToRelative(0.013f, 0.01f)
                lineToRelative(7.069f, 4.937f)
                curveToRelative(0.475f, 0.505f, 1.163f, 0.822f, 2.029f, 0.822f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.629f, 0.0f, -1.057f, -0.228f, -1.331f, -0.536f)
                curveToRelative(-0.283f, -0.318f, -0.432f, -0.755f, -0.429f, -1.21f)
                curveToRelative(0.004f, -0.456f, 0.16f, -0.897f, 0.447f, -1.218f)
                curveToRelative(0.28f, -0.312f, 0.706f, -0.536f, 1.313f, -0.536f)
                horizontalLineToRelative(3.153f)
                lineToRelative(0.384f, 0.02f)
                curveToRelative(1.79f, 0.15f, 3.569f, 1.111f, 5.059f, 2.452f)
                lineToRelative(0.315f, 0.293f)
                lineTo(30.6f, 31.75f)
                horizontalLineToRelative(-9.767f)
                lineToRelative(-1.366f, -1.356f)
                lineToRelative(-0.147f, -0.144f)
                horizontalLineToRelative(-5.931f)
                lineToRelative(-8.746f, -7.705f)
                lineToRelative(-0.008f, -0.008f)
                lineToRelative(-0.009f, -0.007f)
                lineToRelative(-0.077f, -0.068f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.078f, -1.338f)
            }
        }
        .build()
        return _handSbbMedium!!
    }

private var _handSbbMedium: ImageVector? = null
