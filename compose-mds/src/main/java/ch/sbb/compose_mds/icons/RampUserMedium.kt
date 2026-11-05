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

public val SBBIcons.RampUserMedium: ImageVector
    get() {
        if (_rampUserMedium != null) {
            return _rampUserMedium!!
        }
        _rampUserMedium = Builder(
            name = "RampUserMedium",
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
                moveTo(7.25f, 11.25f)
                curveToRelative(0.0f, -0.523f, 0.477f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.477f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.477f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.477f, -1.0f, -1.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(-1.076f, 0.0f, -2.0f, 0.924f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.924f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.924f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.924f, -2.0f, -2.0f, -2.0f)
                moveToRelative(-1.707f, 6.0f)
                horizontalLineToRelative(3.516f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(1.48f, 2.96f)
                lineTo(13.9f, 21.45f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-2.25f, -3.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineToRelative(-0.553f, -1.106f)
                verticalLineToRelative(5.264f)
                lineToRelative(1.447f, 2.894f)
                lineToRelative(0.053f, 0.106f)
                verticalLineToRelative(4.5f)
                lineToRelative(20.35f, -6.36f)
                lineToRelative(0.65f, -0.202f)
                verticalLineToRelative(8.68f)
                lineTo(8.25f, 32.75f)
                lineToRelative(-0.15f, -0.977f)
                lineToRelative(2.65f, -0.828f)
                verticalLineToRelative(-4.577f)
                lineTo(9.441f, 23.75f)
                lineTo(7.25f, 23.75f)
                lineTo(7.25f, 33.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(6.25f, 16.957f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(4.25f, 22.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.957f)
                lineToRelative(0.146f, -0.147f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(7.25f, 22.75f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(31.75f, 31.75f)
                lineTo(11.526f, 31.75f)
                lineToRelative(20.224f, -6.32f)
                close()
            }
        }
            .build()
        return _rampUserMedium!!
    }

private var _rampUserMedium: ImageVector? = null
