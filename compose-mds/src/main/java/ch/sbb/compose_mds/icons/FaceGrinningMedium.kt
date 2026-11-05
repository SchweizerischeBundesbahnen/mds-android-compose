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

public val SBBIcons.FaceGrinningMedium: ImageVector
    get() {
        if (_faceGrinningMedium != null) {
            return _faceGrinningMedium!!
        }
        _faceGrinningMedium = Builder(name = "FaceGrinningMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.75f, 18.0f)
                curveToRelative(0.0f, -6.844f, 5.407f, -12.25f, 12.25f, -12.25f)
                reflectiveCurveTo(30.25f, 11.156f, 30.25f, 18.0f)
                curveToRelative(0.0f, 6.843f, -5.407f, 12.25f, -12.25f, 12.25f)
                reflectiveCurveTo(5.75f, 24.843f, 5.75f, 18.0f)
                moveTo(18.0f, 4.75f)
                curveTo(10.605f, 4.75f, 4.75f, 10.604f, 4.75f, 18.0f)
                curveToRelative(0.0f, 7.395f, 5.855f, 13.25f, 13.25f, 13.25f)
                reflectiveCurveTo(31.25f, 25.395f, 31.25f, 18.0f)
                curveToRelative(0.0f, -7.396f, -5.855f, -13.25f, -13.25f, -13.25f)
                moveToRelative(-4.5f, 7.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveToRelative(-0.25f, 1.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(1.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-12.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 4.465f, 3.536f, 8.0f, 8.0f, 8.0f)
                reflectiveCurveToRelative(8.0f, -3.535f, 8.0f, -8.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineTo(10.5f)
                moveToRelative(7.5f, 7.5f)
                curveToRelative(-3.744f, 0.0f, -6.733f, -2.828f, -6.983f, -6.5f)
                horizontalLineToRelative(13.966f)
                curveToRelative(-0.25f, 3.672f, -3.24f, 6.5f, -6.983f, 6.5f)
            }
        }
        .build()
        return _faceGrinningMedium!!
    }

private var _faceGrinningMedium: ImageVector? = null
