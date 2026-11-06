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

public val SBBIcons.BinocularsSmall: ImageVector
    get() {
        if (_binocularsSmall != null) {
            return _binocularsSmall!!
        }
        _binocularsSmall = Builder(name = "BinocularsSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 4.0f)
                horizontalLineToRelative(-0.39f)
                lineToRelative(-0.095f, 0.379f)
                lineToRelative(-0.944f, 3.777f)
                lineToRelative(-1.795f, 0.897f)
                lineToRelative(-0.241f, 0.12f)
                lineToRelative(-0.032f, 0.269f)
                lineToRelative(-0.897f, 7.629f)
                quadTo(3.0f, 17.518f, 3.0f, 18.0f)
                curveToRelative(0.0f, 2.23f, 1.77f, 4.0f, 4.0f, 4.0f)
                arcToRelative(3.974f, 3.974f, 0.0f, false, false, 4.0f, -4.066f)
                lineTo(11.0f, 10.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.0f, -0.165f)
                curveToRelative(0.352f, 0.0f, 0.688f, 0.058f, 1.0f, 0.165f)
                lineToRelative(0.001f, 7.74f)
                lineTo(13.0f, 18.0f)
                curveToRelative(0.0f, 2.23f, 1.77f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.001f, -1.77f, 4.001f, -4.0f)
                quadToRelative(-0.001f, -0.481f, -0.106f, -0.929f)
                lineToRelative(-0.897f, -7.63f)
                lineToRelative(-0.032f, -0.268f)
                lineToRelative(-0.241f, -0.12f)
                lineToRelative(-1.795f, -0.897f)
                lineToRelative(-0.944f, -3.777f)
                lineTo(16.891f, 4.0f)
                horizontalLineToRelative(-3.89f)
                verticalLineToRelative(0.5f)
                lineTo(13.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(2.11f)
                lineToRelative(0.906f, 3.621f)
                lineToRelative(0.056f, 0.223f)
                lineToRelative(0.205f, 0.103f)
                lineToRelative(1.759f, 0.88f)
                lineToRelative(0.607f, 5.158f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.643f, -0.98f)
                curveToRelative(-1.201f, 0.0f, -2.27f, 0.512f, -3.0f, 1.334f)
                verticalLineToRelative(-4.588f)
                arcTo(2.98f, 2.98f, 0.0f, false, true, 15.001f, 13.0f)
                horizontalLineToRelative(1.0f)
                arcTo(3.97f, 3.97f, 0.0f, false, false, 12.0f, 9.004f)
                curveToRelative(-2.23f, 0.0f, -4.0f, 1.765f, -4.0f, 3.996f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.98f, 2.98f, 0.0f, false, true, 1.0f, -2.25f)
                verticalLineToRelative(4.59f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, -3.0f, -1.335f)
                curveToRelative(-1.018f, 0.0f, -1.94f, 0.368f, -2.642f, 0.98f)
                lineToRelative(0.607f, -5.158f)
                lineToRelative(1.759f, -0.88f)
                lineToRelative(0.205f, -0.103f)
                lineToRelative(0.056f, -0.223f)
                lineTo(7.89f, 5.0f)
                lineTo(10.0f, 5.0f)
                verticalLineToRelative(3.037f)
                horizontalLineToRelative(1.0f)
                lineTo(11.0f, 4.0f)
                lineTo(7.5f, 4.0f)
                moveTo(14.0f, 18.0f)
                close()
                verticalLineToRelative(-0.079f)
                arcTo(2.97f, 2.97f, 0.0f, false, true, 17.0f, 15.005f)
                curveToRelative(1.419f, 0.0f, 2.582f, 0.941f, 2.91f, 2.245f)
                lineToRelative(0.09f, 0.778f)
                arcTo(2.974f, 2.974f, 0.0f, false, true, 17.0f, 21.0f)
                curveToRelative(-1.678f, 0.0f, -3.0f, -1.322f, -3.0f, -3.0f)
                moveToRelative(-4.0f, 0.0f)
                verticalLineToRelative(-0.057f)
                arcToRelative(2.97f, 2.97f, 0.0f, false, false, -3.0f, -2.938f)
                curveToRelative(-1.418f, 0.0f, -2.581f, 0.94f, -2.908f, 2.244f)
                lineToRelative(-0.092f, 0.78f)
                arcTo(2.973f, 2.973f, 0.0f, false, false, 7.0f, 21.0f)
                arcToRelative(2.974f, 2.974f, 0.0f, false, false, 3.001f, -3.0f)
                moveToRelative(6.0f, 0.001f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, 1.0f, -0.999f)
                verticalLineToRelative(-1.0f)
                curveToRelative(-1.113f, 0.0f, -2.0f, 0.884f, -2.0f, 1.999f)
                close()
                moveTo(5.001f, 18.002f)
                curveToRelative(0.0f, -1.114f, 0.884f, -2.0f, 1.999f, -2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.987f, 0.987f, 0.0f, false, false, -0.999f, 1.0f)
                close()
            }
        }
        .build()
        return _binocularsSmall!!
    }

private var _binocularsSmall: ImageVector? = null
