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
        _idCardEmployeeMedium = Builder(name = "IdCardEmployeeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.75f, 7.5f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, false, -3.5f, 0.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(15.25f, 11.75f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                curveToRelative(0.0f, 1.24f, 0.904f, 2.27f, 2.089f, 2.466f)
                curveToRelative(0.315f, -2.893f, 1.677f, -5.383f, 3.636f, -6.625f)
                arcTo(4.9f, 4.9f, 0.0f, false, true, 9.25f, 19.5f)
                curveToRelative(0.0f, -2.238f, 1.47f, -4.25f, 3.5f, -4.25f)
                reflectiveCurveToRelative(3.5f, 2.012f, 3.5f, 4.25f)
                arcToRelative(4.9f, 4.9f, 0.0f, false, true, -0.725f, 2.591f)
                curveToRelative(1.967f, 1.247f, 3.332f, 3.752f, 3.64f, 6.659f)
                lineTo(29.25f, 28.75f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(10.613f, 22.872f)
                curveToRelative(-1.671f, 1.005f, -2.96f, 3.178f, -3.273f, 5.878f)
                horizontalLineToRelative(10.82f)
                curveToRelative(-0.313f, -2.7f, -1.602f, -4.873f, -3.273f, -5.877f)
                curveToRelative(-0.58f, 0.545f, -1.312f, 0.877f, -2.137f, 0.877f)
                reflectiveCurveToRelative(-1.558f, -0.332f, -2.137f, -0.878f)
                moveTo(6.75f, 9.25f)
                horizontalLineToRelative(8.5f)
                lineTo(15.25f, 7.5f)
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
                moveToRelative(18.75f, 10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(28.5f, 21.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(12.75f, 16.25f)
                curveToRelative(1.282f, 0.0f, 2.5f, 1.345f, 2.5f, 3.25f)
                reflectiveCurveToRelative(-1.218f, 3.25f, -2.5f, 3.25f)
                reflectiveCurveToRelative(-2.5f, -1.345f, -2.5f, -3.25f)
                reflectiveCurveToRelative(1.218f, -3.25f, 2.5f, -3.25f)
            }
        }
        .build()
        return _idCardEmployeeMedium!!
    }

private var _idCardEmployeeMedium: ImageVector? = null
