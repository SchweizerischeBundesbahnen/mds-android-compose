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

public val SBBIcons.IdCardEmployeeMedium: ImageVector
    get() {
        if (_idCardEmployeeMedium != null) {
            return _idCardEmployeeMedium!!
        }
        _idCardEmployeeMedium = Builder(
            name = "IdCardEmployeeMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(18.0f, 5.75f)
                curveToRelative(-0.967f, 0.0f, -1.75f, 0.783f, -1.75f, 1.75f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(3.5f)
                lineTo(19.75f, 7.5f)
                curveToRelative(0.0f, -0.967f, -0.783f, -1.75f, -1.75f, -1.75f)
                moveTo(15.25f, 7.5f)
                curveToRelative(0.0f, -1.52f, 1.23f, -2.75f, 2.75f, -2.75f)
                reflectiveCurveToRelative(2.75f, 1.23f, 2.75f, 2.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.932f, 0.0f, 3.5f, 1.568f, 3.5f, 3.5f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.932f, -1.568f, 3.5f, -3.5f, 3.5f)
                lineTo(6.75f, 29.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, -3.5f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0.0f, -1.932f, 1.568f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(20.75f, 11.75f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(19.165f, 28.75f)
                curveToRelative(-0.308f, -2.907f, -1.673f, -5.412f, -3.64f, -6.659f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, false, 0.725f, -2.591f)
                curveToRelative(0.0f, -2.238f, -1.47f, -4.25f, -3.5f, -4.25f)
                reflectiveCurveToRelative(-3.5f, 2.012f, -3.5f, 4.25f)
                curveToRelative(0.0f, 0.95f, 0.265f, 1.86f, 0.725f, 2.591f)
                curveToRelative(-1.96f, 1.242f, -3.321f, 3.732f, -3.637f, 6.625f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.25f, 26.25f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.5f)
                moveToRelative(-13.41f, 17.0f)
                horizontalLineToRelative(10.82f)
                curveToRelative(-0.313f, -2.7f, -1.602f, -4.873f, -3.273f, -5.877f)
                curveToRelative(-0.579f, 0.544f, -1.312f, 0.877f, -2.137f, 0.877f)
                reflectiveCurveToRelative(-1.558f, -0.332f, -2.137f, -0.878f)
                curveToRelative(-1.671f, 1.005f, -2.96f, 3.178f, -3.272f, 5.878f)
                moveToRelative(12.16f, -9.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(28.501f, 22.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(10.25f, 19.5f)
                curveToRelative(0.0f, -1.905f, 1.218f, -3.25f, 2.5f, -3.25f)
                reflectiveCurveToRelative(2.5f, 1.345f, 2.5f, 3.25f)
                reflectiveCurveToRelative(-1.218f, 3.25f, -2.5f, 3.25f)
                reflectiveCurveToRelative(-2.5f, -1.345f, -2.5f, -3.25f)
            }
        }
            .build()
        return _idCardEmployeeMedium!!
    }

private var _idCardEmployeeMedium: ImageVector? = null
