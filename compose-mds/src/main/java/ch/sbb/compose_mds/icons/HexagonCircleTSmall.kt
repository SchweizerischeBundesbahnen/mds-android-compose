package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.HexagonCircleTSmall: ImageVector
    get() {
        if (_hexagonCircleTSmall != null) {
            return _hexagonCircleTSmall!!
        }
        _hexagonCircleTSmall = Builder(name = "HexagonCircleTSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.724f, 2.051f)
                lineToRelative(9.0f, 4.5f)
                lineToRelative(0.276f, 0.139f)
                verticalLineToRelative(10.617f)
                lineToRelative(-0.276f, 0.139f)
                lineToRelative(-9.0f, 4.5f)
                lineToRelative(-0.224f, 0.111f)
                lineToRelative(-0.224f, -0.111f)
                lineToRelative(-9.0f, -4.5f)
                lineTo(3.0f, 17.307f)
                verticalLineTo(6.69f)
                lineToRelative(0.276f, -0.139f)
                lineToRelative(9.0f, -4.5f)
                lineToRelative(0.224f, -0.111f)
                close()
                moveTo(4.0f, 7.307f)
                verticalLineToRelative(9.382f)
                lineToRelative(8.5f, 4.25f)
                lineToRelative(8.5f, -4.25f)
                verticalLineTo(7.307f)
                lineToRelative(-8.5f, -4.25f)
                close()
                moveTo(12.5f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                moveToRelative(1.5f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _hexagonCircleTSmall!!
    }

private var _hexagonCircleTSmall: ImageVector? = null
