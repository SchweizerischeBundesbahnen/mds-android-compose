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

public val SBBIcons.FaceGrinningSmall: ImageVector
    get() {
        if (_faceGrinningSmall != null) {
            return _faceGrinningSmall!!
        }
        _faceGrinningSmall = Builder(
            name = "FaceGrinningSmall",
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
                moveTo(4.0f, 12.0f)
                curveToRelative(0.0f, -4.47f, 3.53f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.53f, 8.0f, 8.0f)
                reflectiveCurveToRelative(-3.53f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.53f, -8.0f, -8.0f)
                moveToRelative(8.0f, -9.0f)
                curveToRelative(-5.022f, 0.0f, -9.0f, 3.977f, -9.0f, 9.0f)
                reflectiveCurveToRelative(3.978f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -3.978f, 9.0f, -9.0f)
                reflectiveCurveToRelative(-3.978f, -9.0f, -9.0f, -9.0f)
                moveTo(9.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(5.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-7.0f, 3.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 3.068f, 2.432f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.432f, 5.5f, -5.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                moveToRelative(5.0f, 5.0f)
                curveToRelative(-2.347f, 0.0f, -4.23f, -1.726f, -4.474f, -4.0f)
                horizontalLineToRelative(8.948f)
                curveToRelative(-0.243f, 2.274f, -2.127f, 4.0f, -4.474f, 4.0f)
            }
        }
            .build()
        return _faceGrinningSmall!!
    }

private var _faceGrinningSmall: ImageVector? = null
