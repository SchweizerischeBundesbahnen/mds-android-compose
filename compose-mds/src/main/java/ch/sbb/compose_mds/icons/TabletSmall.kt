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

public val SBBIcons.TabletSmall: ImageVector
    get() {
        if (_tabletSmall != null) {
            return _tabletSmall!!
        }
        _tabletSmall = Builder(name = "TabletSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(16.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(6.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.0f, 4.5f)
                verticalLineToRelative(16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.5f, 22.0f)
                horizontalLineToRelative(11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 3.0f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _tabletSmall!!
    }

private var _tabletSmall: ImageVector? = null
