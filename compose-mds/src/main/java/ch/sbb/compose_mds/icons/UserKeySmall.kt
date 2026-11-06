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

public val SBBIcons.UserKeySmall: ImageVector
    get() {
        if (_userKeySmall != null) {
            return _userKeySmall!!
        }
        _userKeySmall = Builder(name = "UserKeySmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 6.0f)
                curveToRelative(0.0f, -1.723f, 1.126f, -3.0f, 2.5f, -3.0f)
                reflectiveCurveTo(12.0f, 4.277f, 12.0f, 6.0f)
                reflectiveCurveToRelative(-1.126f, 3.0f, -2.5f, 3.0f)
                reflectiveCurveTo(7.0f, 7.723f, 7.0f, 6.0f)
                moveToRelative(2.5f, -4.0f)
                curveTo(7.418f, 2.0f, 6.0f, 3.895f, 6.0f, 6.0f)
                curveToRelative(0.0f, 0.986f, 0.311f, 1.926f, 0.856f, 2.647f)
                curveToRelative(-2.55f, 2.085f, -3.762f, 4.984f, -3.855f, 8.84f)
                lineTo(2.988f, 18.0f)
                horizontalLineToRelative(7.013f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(4.02f)
                curveToRelative(0.18f, -3.402f, 1.324f, -5.86f, 3.546f, -7.641f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 9.5f, 10.0f)
                curveToRelative(0.729f, 0.0f, 1.376f, -0.232f, 1.91f, -0.624f)
                curveToRelative(1.012f, 0.764f, 1.727f, 1.636f, 2.224f, 2.59f)
                lineToRelative(0.887f, -0.46f)
                curveToRelative(-0.547f, -1.053f, -1.325f, -2.009f, -2.393f, -2.838f)
                curveTo(12.683f, 7.944f, 13.0f, 6.996f, 13.0f, 6.0f)
                curveToRelative(0.0f, -2.105f, -1.418f, -4.0f, -3.5f, -4.0f)
                moveTo(14.0f, 15.5f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, 2.5f, -2.5f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, 2.5f, 2.5f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, -2.5f, 2.5f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, -2.5f, -2.5f)
                moveToRelative(2.5f, -3.5f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -3.5f, 3.5f)
                quadToRelative(0.0f, 0.235f, 0.03f, 0.463f)
                lineToRelative(-2.887f, 2.936f)
                lineToRelative(-0.143f, 0.146f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(2.955f)
                lineToRelative(0.146f, -0.144f)
                lineToRelative(2.927f, -2.887f)
                quadToRelative(0.232f, 0.03f, 0.472f, 0.031f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, 3.5f, -3.5f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -3.5f, -3.5f)
                moveToRelative(-1.562f, 6.64f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, -1.58f, -1.585f)
                lineTo(11.0f, 19.455f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(1.545f)
                close()
                moveTo(16.502f, 15.0f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, -0.502f, 0.499f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, false, 0.502f, 0.501f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, false, 0.498f, -0.501f)
                arcToRelative(0.484f, 0.484f, 0.0f, false, false, -0.498f, -0.499f)
                moveTo(15.0f, 15.499f)
                curveToRelative(0.0f, -0.84f, 0.663f, -1.499f, 1.502f, -1.499f)
                curveToRelative(0.842f, 0.0f, 1.498f, 0.662f, 1.498f, 1.499f)
                curveToRelative(0.0f, 0.835f, -0.655f, 1.501f, -1.498f, 1.501f)
                arcTo(1.49f, 1.49f, 0.0f, false, true, 15.0f, 15.499f)
            }
        }
        .build()
        return _userKeySmall!!
    }

private var _userKeySmall: ImageVector? = null
