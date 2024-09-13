package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.FaceSadSmall: ImageVector
    get() {
        if (_faceSadSmall != null) {
            return _faceSadSmall!!
        }
        _faceSadSmall = Builder(name = "FaceSadSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
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
                moveToRelative(0.0f, 9.0f)
                curveToRelative(-2.28f, 0.0f, -4.175f, 1.358f, -5.012f, 3.302f)
                lineToRelative(0.918f, 0.396f)
                curveTo(8.593f, 14.104f, 10.137f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveToRelative(3.407f, 1.104f, 4.094f, 2.698f)
                lineToRelative(0.918f, -0.396f)
                curveTo(16.175f, 13.358f, 14.28f, 12.0f, 12.0f, 12.0f)
                moveTo(8.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(7.0f, -1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _faceSadSmall!!
    }

private var _faceSadSmall: ImageVector? = null
