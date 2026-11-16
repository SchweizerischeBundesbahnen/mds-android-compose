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

public val SBBIcons.LockClosedSmall: ImageVector
    get() {
        if (_lockClosedSmall != null) {
            return _lockClosedSmall!!
        }
        _lockClosedSmall = Builder(name = "LockClosedSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(15.0f, 9.0f)
                lineTo(15.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -6.0f, 0.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 9.0f)
                close()
                moveTo(12.5f, 13.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _lockClosedSmall!!
    }

private var _lockClosedSmall: ImageVector? = null
