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
                moveTo(10.0f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                moveToRelative(0.95f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(4.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.9f, 0.0f)
                lineTo(22.0f, 6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.5f, 10.0f)
                curveToRelative(1.234f, 0.0f, 2.228f, 0.843f, 2.452f, 2.0f)
                lineTo(22.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.854f, -0.646f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.646f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.048f)
                curveToRelative(0.224f, -1.157f, 1.218f, -2.0f, 2.452f, -2.0f)
                moveToRelative(-7.0f, 7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(2.45f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -4.9f, 0.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 4.9f, 0.0f)
                horizontalLineToRelative(2.07f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.5f, 19.207f)
                lineTo(15.354f, 22.353f)
                lineTo(14.647f, 21.646f)
                lineTo(17.793f, 18.5f)
                lineTo(14.647f, 15.354f)
                lineTo(15.354f, 14.647f)
                lineTo(18.5f, 17.793f)
                lineTo(21.646f, 14.647f)
                lineTo(22.353f, 15.354f)
                lineTo(19.207f, 18.5f)
                lineTo(22.353f, 21.646f)
                lineTo(21.646f, 22.353f)
                close()
            }
        }
        .build()
        return _controlsXSmall!!
    }

private var _controlsXSmall: ImageVector? = null
