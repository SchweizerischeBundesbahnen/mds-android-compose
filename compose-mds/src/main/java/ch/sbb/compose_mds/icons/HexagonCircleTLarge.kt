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

public val SBBIcons.HexagonCircleTLarge: ImageVector
    get() {
        if (_hexagonCircleTLarge != null) {
            return _hexagonCircleTLarge!!
        }
        _hexagonCircleTLarge = Builder(name = "HexagonCircleTLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.724f, 5.05f)
                lineToRelative(18.0f, 9.0f)
                lineToRelative(0.276f, 0.138f)
                verticalLineToRelative(20.618f)
                lineToRelative(-0.276f, 0.138f)
                lineToRelative(-18.0f, 9.0f)
                lineToRelative(-0.224f, 0.112f)
                lineToRelative(-0.224f, -0.112f)
                lineToRelative(-18.0f, -9.0f)
                lineTo(6.0f, 34.806f)
                lineTo(6.0f, 14.189f)
                lineToRelative(0.276f, -0.14f)
                lineToRelative(18.0f, -9.0f)
                lineToRelative(0.224f, -0.11f)
                close()
                moveTo(7.0f, 14.806f)
                verticalLineToRelative(19.382f)
                lineToRelative(17.5f, 8.75f)
                lineToRelative(17.5f, -8.75f)
                lineTo(42.0f, 14.805f)
                lineToRelative(-17.5f, -8.75f)
                close()
                moveTo(24.5f, 14.997f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 9.5f, 9.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, -9.5f, 9.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, -9.5f, -9.5f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 9.5f, -9.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, false, 0.0f, 17.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 0.0f, -17.0f)
                moveToRelative(3.5f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _hexagonCircleTLarge!!
    }

private var _hexagonCircleTLarge: ImageVector? = null
