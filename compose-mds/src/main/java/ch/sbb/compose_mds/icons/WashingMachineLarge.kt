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

public val SBBIcons.WashingMachineLarge: ImageVector
    get() {
        if (_washingMachineLarge != null) {
            return _washingMachineLarge!!
        }
        _washingMachineLarge = Builder(
            name = "WashingMachineLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(8.5f, 4.0f)
                lineTo(8.0f, 4.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(33.0f)
                lineTo(41.0f, 4.0f)
                lineTo(8.5f, 4.0f)
                moveToRelative(0.5f, 6.304f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(31.0f)
                verticalLineToRelative(8.0f)
                lineTo(9.0f, 13.0f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(31.0f)
                verticalLineToRelative(29.0f)
                lineTo(9.0f, 43.0f)
                close()
                moveTo(17.005f, 28.231f)
                curveToRelative(0.123f, 0.126f, 0.25f, 0.305f, 0.41f, 0.546f)
                lineToRelative(0.034f, 0.051f)
                curveToRelative(0.303f, 0.459f, 0.776f, 1.172f, 1.713f, 1.172f)
                reflectiveCurveToRelative(1.41f, -0.713f, 1.715f, -1.172f)
                lineToRelative(0.034f, -0.05f)
                curveToRelative(0.363f, -0.546f, 0.557f, -0.778f, 0.916f, -0.778f)
                curveToRelative(0.36f, 0.0f, 0.553f, 0.232f, 0.917f, 0.777f)
                lineToRelative(0.034f, 0.051f)
                curveToRelative(0.304f, 0.46f, 0.777f, 1.172f, 1.715f, 1.172f)
                reflectiveCurveToRelative(1.41f, -0.713f, 1.715f, -1.172f)
                lineToRelative(0.034f, -0.05f)
                curveToRelative(0.363f, -0.546f, 0.557f, -0.778f, 0.917f, -0.778f)
                curveToRelative(0.361f, 0.0f, 0.556f, 0.233f, 0.92f, 0.778f)
                lineToRelative(0.033f, 0.05f)
                curveToRelative(0.305f, 0.46f, 0.779f, 1.172f, 1.718f, 1.172f)
                curveToRelative(0.938f, 0.0f, 1.412f, -0.712f, 1.717f, -1.171f)
                lineToRelative(0.034f, -0.051f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.414f, -0.55f)
                quadToRelative(0.005f, 0.135f, 0.005f, 0.272f)
                arcToRelative(7.5f, 7.5f, 0.0f, true, true, -14.995f, -0.269f)
                moveToRelative(0.122f, -1.11f)
                curveToRelative(0.538f, 0.223f, 0.86f, 0.708f, 1.086f, 1.05f)
                lineToRelative(0.034f, 0.052f)
                curveToRelative(0.363f, 0.546f, 0.557f, 0.777f, 0.915f, 0.777f)
                curveToRelative(0.36f, 0.0f, 0.553f, -0.232f, 0.917f, -0.777f)
                lineToRelative(0.034f, -0.051f)
                curveToRelative(0.304f, -0.459f, 0.777f, -1.172f, 1.714f, -1.172f)
                curveToRelative(0.938f, 0.0f, 1.41f, 0.713f, 1.715f, 1.172f)
                lineToRelative(0.034f, 0.05f)
                curveToRelative(0.364f, 0.546f, 0.558f, 0.778f, 0.917f, 0.778f)
                curveToRelative(0.36f, 0.0f, 0.553f, -0.232f, 0.917f, -0.777f)
                lineToRelative(0.034f, -0.051f)
                curveToRelative(0.304f, -0.46f, 0.777f, -1.172f, 1.715f, -1.172f)
                reflectiveCurveToRelative(1.412f, 0.712f, 1.717f, 1.171f)
                lineToRelative(0.034f, 0.051f)
                curveToRelative(0.364f, 0.545f, 0.558f, 0.778f, 0.92f, 0.778f)
                curveToRelative(0.36f, 0.0f, 0.555f, -0.233f, 0.919f, -0.778f)
                lineToRelative(0.034f, -0.05f)
                curveToRelative(0.228f, -0.344f, 0.55f, -0.829f, 1.09f, -1.051f)
                arcToRelative(7.502f, 7.502f, 0.0f, false, false, -14.747f, 0.0f)
                moveTo(12.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(19.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(28.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(34.0f, 8.0f)
                horizontalLineToRelative(4.0f)
                lineTo(38.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(32.0f, 11.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(34.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(24.5f, 18.063f)
                curveToRelative(-5.799f, 0.0f, -10.5f, 4.7f, -10.5f, 10.5f)
                reflectiveCurveToRelative(4.701f, 10.5f, 10.5f, 10.5f)
                reflectiveCurveTo(35.0f, 34.36f, 35.0f, 28.563f)
                curveToRelative(0.0f, -5.8f, -4.701f, -10.5f, -10.5f, -10.5f)
                moveTo(13.0f, 28.563f)
                curveToRelative(0.0f, -6.352f, 5.149f, -11.5f, 11.5f, -11.5f)
                reflectiveCurveTo(36.0f, 22.21f, 36.0f, 28.563f)
                curveToRelative(0.0f, 6.35f, -5.149f, 11.5f, -11.5f, 11.5f)
                reflectiveCurveTo(13.0f, 34.913f, 13.0f, 28.563f)
                moveTo(24.5f, 20.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
            }
        }
            .build()
        return _washingMachineLarge!!
    }

private var _washingMachineLarge: ImageVector? = null
