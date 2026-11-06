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

public val SBBIcons.ControlsXSmall: ImageVector
    get() {
        if (_controlsXSmall != null) {
            return _controlsXSmall!!
        }
        _controlsXSmall = Builder(name = "ControlsXSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.5f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveTo(2.0f, 7.0f)
                horizontalLineToRelative(4.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.9f, 0.0f)
                lineTo(22.0f, 7.0f)
                lineTo(22.0f, 6.0f)
                lineTo(10.95f, 6.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -4.9f, 0.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(13.048f, 12.0f)
                curveToRelative(0.224f, -1.157f, 1.218f, -2.0f, 2.452f, -2.0f)
                reflectiveCurveToRelative(2.228f, 0.843f, 2.452f, 2.0f)
                lineTo(22.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.854f, -0.646f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.646f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 18.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -3.0f, 0.0f)
                moveTo(8.5f, 16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.45f, 2.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.9f, 0.0f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.07f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.45f, -2.0f)
                moveToRelative(10.0f, 3.207f)
                lineToRelative(-3.146f, 3.147f)
                lineToRelative(-0.708f, -0.708f)
                lineToRelative(3.147f, -3.146f)
                lineToRelative(-3.147f, -3.146f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(3.146f, 3.147f)
                lineToRelative(3.146f, -3.147f)
                lineToRelative(0.708f, 0.708f)
                lineToRelative(-3.147f, 3.146f)
                lineToRelative(3.147f, 3.146f)
                lineToRelative(-0.708f, 0.708f)
                close()
            }
        }
        .build()
        return _controlsXSmall!!
    }

private var _controlsXSmall: ImageVector? = null
