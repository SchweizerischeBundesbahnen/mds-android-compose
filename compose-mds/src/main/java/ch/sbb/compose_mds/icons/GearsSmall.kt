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

public val SBBIcons.GearsSmall: ImageVector
    get() {
        if (_gearsSmall != null) {
            return _gearsSmall!!
        }
        _gearsSmall = Builder(
            name = "GearsSmall",
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
                moveTo(13.0f, 3.0f)
                verticalLineToRelative(2.016f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 2.813f, 0.746f)
                lineToRelative(1.004f, -1.74f)
                lineToRelative(0.866f, 0.5f)
                lineTo(16.68f, 6.26f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 2.06f, 2.06f)
                lineToRelative(1.737f, -1.003f)
                lineToRelative(0.5f, 0.866f)
                lineToRelative(-1.739f, 1.004f)
                curveToRelative(0.42f, 0.857f, 0.68f, 1.807f, 0.746f, 2.813f)
                lineTo(22.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.016f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -0.746f, 2.813f)
                lineToRelative(1.74f, 1.004f)
                lineToRelative(-0.5f, 0.866f)
                lineToRelative(-1.738f, -1.003f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -2.06f, 2.06f)
                lineToRelative(1.003f, 1.737f)
                lineToRelative(-0.866f, 0.5f)
                lineToRelative(-1.004f, -1.738f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -2.813f, 0.745f)
                lineTo(13.0f, 22.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.016f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -2.813f, -0.745f)
                lineToRelative(-1.004f, 1.738f)
                lineToRelative(-0.866f, -0.5f)
                lineTo(8.32f, 18.74f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -2.06f, -2.06f)
                lineToRelative(-1.737f, 1.003f)
                lineToRelative(-0.5f, -0.866f)
                lineToRelative(1.738f, -1.004f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 5.016f, 13.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.016f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.745f, -2.813f)
                lineTo(4.024f, 8.183f)
                lineToRelative(0.5f, -0.866f)
                lineTo(6.26f, 8.32f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 2.06f, -2.06f)
                lineTo(7.317f, 4.523f)
                lineToRelative(0.866f, -0.5f)
                lineToRelative(1.004f, 1.739f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.0f, 5.016f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(18.981f, 12.0f)
                arcTo(6.47f, 6.47f, 0.0f, false, false, 12.5f, 6.0f)
                curveToRelative(-1.01f, 0.0f, -1.962f, 0.226f, -2.812f, 0.63f)
                lineToRelative(1.509f, 2.613f)
                curveToRelative(0.401f, -0.157f, 0.84f, -0.243f, 1.303f, -0.243f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, true, 3.466f, 3.0f)
                close()
                moveTo(15.966f, 13.0f)
                horizontalLineToRelative(3.015f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, -6.481f, 6.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.812f, -0.63f)
                lineToRelative(1.509f, -2.613f)
                curveToRelative(0.401f, 0.157f, 0.84f, 0.243f, 1.303f, 0.243f)
                curveToRelative(1.79f, 0.0f, 3.23f, -1.285f, 3.466f, -3.0f)
                moveTo(6.0f, 12.5f)
                arcTo(6.48f, 6.48f, 0.0f, false, true, 8.821f, 7.13f)
                lineToRelative(1.507f, 2.61f)
                arcTo(3.48f, 3.48f, 0.0f, false, false, 9.0f, 12.5f)
                curveToRelative(0.0f, 1.133f, 0.515f, 2.126f, 1.328f, 2.762f)
                lineToRelative(-1.507f, 2.61f)
                arcTo(6.48f, 6.48f, 0.0f, false, true, 6.0f, 12.5f)
                moveToRelative(4.0f, 0.0f)
                curveToRelative(0.0f, -1.407f, 1.093f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.093f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.093f, 2.5f, -2.5f, 2.5f)
                arcToRelative(2.467f, 2.467f, 0.0f, false, true, -2.5f, -2.5f)
            }
        }
            .build()
        return _gearsSmall!!
    }

private var _gearsSmall: ImageVector? = null
