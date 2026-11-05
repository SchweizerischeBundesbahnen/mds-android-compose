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

public val SBBIcons.FaceNeutralSmall: ImageVector
    get() {
        if (_faceNeutralSmall != null) {
            return _faceNeutralSmall!!
        }
        _faceNeutralSmall = Builder(
            name = "FaceNeutralSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveToRelative(5.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(7.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
            .build()
        return _faceNeutralSmall!!
    }

private var _faceNeutralSmall: ImageVector? = null
