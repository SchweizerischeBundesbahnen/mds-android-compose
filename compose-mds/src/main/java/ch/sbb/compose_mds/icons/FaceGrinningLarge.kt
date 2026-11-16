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

public val SBBIcons.FaceGrinningLarge: ImageVector
    get() {
        if (_faceGrinningLarge != null) {
            return _faceGrinningLarge!!
        }
        _faceGrinningLarge = Builder(name = "FaceGrinningLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.5f, 6.0f)
                curveTo(34.165f, 6.0f, 42.0f, 13.835f, 42.0f, 23.5f)
                reflectiveCurveTo(34.165f, 41.0f, 24.5f, 41.0f)
                reflectiveCurveTo(7.0f, 33.165f, 7.0f, 23.5f)
                reflectiveCurveTo(14.835f, 6.0f, 24.5f, 6.0f)
                moveToRelative(0.0f, 36.0f)
                curveTo(34.717f, 42.0f, 43.0f, 33.717f, 43.0f, 23.5f)
                reflectiveCurveTo(34.717f, 5.0f, 24.5f, 5.0f)
                reflectiveCurveTo(6.0f, 13.283f, 6.0f, 23.5f)
                reflectiveCurveTo(14.283f, 42.0f, 24.5f, 42.0f)
                moveToRelative(-5.646f, -23.853f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, -0.707f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, -0.707f)
                moveToRelative(0.893f, 1.186f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -2.494f, -1.667f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.494f, 1.667f)
                moveTo(31.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, -0.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.001f)
                moveToRelative(2.947f, 7.05f)
                lineToRelative(0.056f, -0.55f)
                horizontalLineTo(13.997f)
                lineToRelative(0.056f, 0.55f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, false, 20.894f, 0.0f)
                moveToRelative(-16.82f, 5.996f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 15.121f, 26.0f)
                horizontalLineTo(33.88f)
                arcToRelative(9.498f, 9.498f, 0.0f, false, true, -15.752f, 5.546f)
            }
        }
        .build()
        return _faceGrinningLarge!!
    }

private var _faceGrinningLarge: ImageVector? = null
