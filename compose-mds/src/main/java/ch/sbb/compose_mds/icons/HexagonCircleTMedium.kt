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

public val SBBIcons.HexagonCircleTMedium: ImageVector
    get() {
        if (_hexagonCircleTMedium != null) {
            return _hexagonCircleTMedium!!
        }
        _hexagonCircleTMedium = Builder(name = "HexagonCircleTMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.974f, 3.3f)
                lineToRelative(13.5f, 6.75f)
                lineToRelative(0.276f, 0.14f)
                verticalLineToRelative(15.617f)
                lineToRelative(-0.276f, 0.138f)
                lineToRelative(-13.5f, 6.75f)
                lineToRelative(-0.224f, 0.112f)
                lineToRelative(-0.224f, -0.112f)
                lineToRelative(-13.5f, -6.75f)
                lineToRelative(-0.276f, -0.138f)
                lineTo(4.75f, 10.19f)
                lineToRelative(0.276f, -0.14f)
                lineToRelative(13.5f, -6.75f)
                lineToRelative(0.224f, -0.11f)
                close()
                moveTo(5.75f, 10.808f)
                verticalLineToRelative(14.382f)
                lineToRelative(13.0f, 6.5f)
                lineToRelative(13.0f, -6.5f)
                lineTo(31.75f, 10.807f)
                lineToRelative(-13.0f, -6.5f)
                close()
                moveTo(18.75f, 10.749f)
                arcToRelative(7.25f, 7.25f, 0.0f, true, true, 0.0f, 14.5f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, true, 0.0f, -14.5f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(6.25f, 6.25f, 0.0f, true, false, 0.0f, 12.5f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 0.0f, -12.5f)
                moveToRelative(2.25f, 4.5f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.75f)
                lineTo(16.5f, 16.249f)
                verticalLineToRelative(-1.0f)
                lineTo(21.0f, 15.249f)
                close()
            }
        }
        .build()
        return _hexagonCircleTMedium!!
    }

private var _hexagonCircleTMedium: ImageVector? = null
