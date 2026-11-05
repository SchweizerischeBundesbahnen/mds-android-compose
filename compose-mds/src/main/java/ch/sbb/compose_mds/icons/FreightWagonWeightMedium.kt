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

public val SBBIcons.FreightWagonWeightMedium: ImageVector
    get() {
        if (_freightWagonWeightMedium != null) {
            return _freightWagonWeightMedium!!
        }
        _freightWagonWeightMedium = Builder(name = "FreightWagonWeightMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 27.25f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(2.0f)
                lineTo(31.75f, 25.5f)
                horizontalLineToRelative(1.0f)
                lineTo(32.75f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(28.25f, 30.0f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, true, -2.75f, 2.75f)
                arcTo(2.747f, 2.747f, 0.0f, false, true, 22.75f, 30.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-9.5f)
                lineTo(13.25f, 30.0f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, true, -2.75f, 2.75f)
                arcTo(2.747f, 2.747f, 0.0f, false, true, 7.75f, 30.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(4.25f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(8.75f, 30.0f)
                curveToRelative(0.0f, 0.969f, 0.781f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.781f, 1.75f, -1.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(23.75f, 30.0f)
                curveToRelative(0.0f, 0.969f, 0.781f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.781f, 1.75f, -1.75f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(7.25f, 28.75f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-2.0f)
                lineTo(7.25f, 26.75f)
                close()
                moveTo(18.0f, 3.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.121f, 4.5f)
                horizontalLineToRelative(6.54f)
                lineToRelative(0.08f, 0.402f)
                lineToRelative(3.0f, 15.0f)
                lineToRelative(0.12f, 0.598f)
                lineTo(6.14f, 23.75f)
                lineToRelative(0.12f, -0.598f)
                lineToRelative(3.0f, -15.0f)
                lineToRelative(0.08f, -0.402f)
                horizontalLineToRelative(6.539f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.0f, 3.25f)
                moveTo(7.36f, 22.75f)
                horizontalLineToRelative(21.28f)
                lineToRelative(-2.8f, -14.0f)
                lineTo(10.16f, 8.75f)
                close()
                moveTo(21.39f, 11.985f)
                curveToRelative(0.944f, 0.0f, 1.71f, 0.3f, 2.295f, 0.915f)
                quadToRelative(0.652f, 0.675f, 0.765f, 1.62f)
                horizontalLineToRelative(-1.515f)
                curveToRelative(-0.075f, -0.39f, -0.255f, -0.69f, -0.525f, -0.9f)
                reflectiveCurveToRelative(-0.615f, -0.33f, -1.035f, -0.33f)
                curveToRelative(-0.63f, 0.0f, -1.125f, 0.24f, -1.47f, 0.735f)
                curveToRelative(-0.3f, 0.435f, -0.45f, 1.006f, -0.45f, 1.74f)
                curveToRelative(0.0f, 0.735f, 0.15f, 1.275f, 0.42f, 1.695f)
                curveToRelative(0.345f, 0.51f, 0.87f, 0.766f, 1.545f, 0.766f)
                quadToRelative(0.742f, 0.0f, 1.215f, -0.45f)
                reflectiveQuadToRelative(0.495f, -1.17f)
                horizontalLineToRelative(-1.59f)
                verticalLineToRelative(-1.14f)
                horizontalLineToRelative(3.015f)
                verticalLineToRelative(3.854f)
                lineTo(23.55f, 19.32f)
                lineToRelative(-0.15f, -0.825f)
                curveToRelative(-0.525f, 0.66f, -1.245f, 0.99f, -2.145f, 0.99f)
                curveToRelative(-1.095f, 0.0f, -1.95f, -0.405f, -2.595f, -1.215f)
                curveToRelative(-0.525f, -0.674f, -0.795f, -1.514f, -0.795f, -2.504f)
                curveToRelative(0.0f, -1.125f, 0.345f, -2.056f, 1.035f, -2.761f)
                curveToRelative(0.645f, -0.675f, 1.47f, -1.02f, 2.49f, -1.02f)
                moveToRelative(-8.46f, 3.15f)
                lineToRelative(2.805f, -2.955f)
                horizontalLineToRelative(1.95f)
                lineTo(14.896f, 15.0f)
                lineToRelative(3.075f, 4.335f)
                horizontalLineToRelative(-1.965f)
                lineToRelative(-2.175f, -3.21f)
                lineToRelative(-0.9f, 0.9f)
                verticalLineToRelative(2.31f)
                horizontalLineToRelative(-1.56f)
                lineTo(11.371f, 12.18f)
                horizontalLineToRelative(1.56f)
                close()
                moveTo(17.715f, 12.18f)
                horizontalLineToRelative(-0.03f)
                lineToRelative(0.015f, -0.015f)
                close()
                moveTo(18.0f, 4.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
            }
        }
        .build()
        return _freightWagonWeightMedium!!
    }

private var _freightWagonWeightMedium: ImageVector? = null
