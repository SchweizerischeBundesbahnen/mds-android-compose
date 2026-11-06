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

public val SBBIcons.RssMedium: ImageVector
    get() {
        if (_rssMedium != null) {
            return _rssMedium!!
        }
        _rssMedium = Builder(name = "RssMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.75f, 30.0f)
                curveTo(28.75f, 17.435f, 18.565f, 7.25f, 6.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                curveToRelative(13.118f, 0.0f, 23.75f, 10.633f, 23.75f, 23.75f)
                close()
                moveTo(6.25f, 27.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, 5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -5.5f, 0.0f)
                moveTo(9.0f, 25.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 0.0f, -3.5f)
                moveToRelative(-3.0f, -9.0f)
                curveToRelative(7.594f, 0.0f, 13.75f, 6.156f, 13.75f, 13.75f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.0f, -8.146f, -6.603f, -14.75f, -14.75f, -14.75f)
                close()
            }
        }
        .build()
        return _rssMedium!!
    }

private var _rssMedium: ImageVector? = null
