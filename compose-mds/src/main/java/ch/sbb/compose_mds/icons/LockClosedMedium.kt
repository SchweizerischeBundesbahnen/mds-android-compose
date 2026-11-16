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

public val SBBIcons.LockClosedMedium: ImageVector
    get() {
        if (_lockClosedMedium != null) {
            return _lockClosedMedium!!
        }
        _lockClosedMedium = Builder(name = "LockClosedMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.25f, 9.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -6.5f, 0.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(22.25f, 13.75f)
                lineTo(22.25f, 9.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, false, -8.5f, 0.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(-16.0f)
                close()
                moveTo(18.5f, 19.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(25.75f, 28.75f)
                horizontalLineToRelative(-15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(15.5f)
                close()
            }
        }
        .build()
        return _lockClosedMedium!!
    }

private var _lockClosedMedium: ImageVector? = null
