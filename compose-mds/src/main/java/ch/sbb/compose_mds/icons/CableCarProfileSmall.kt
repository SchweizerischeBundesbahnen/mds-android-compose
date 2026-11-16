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

public val SBBIcons.CableCarProfileSmall: ImageVector
    get() {
        if (_cableCarProfileSmall != null) {
            return _cableCarProfileSmall!!
        }
        _cableCarProfileSmall = Builder(name = "CableCarProfileSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.241f, 2.976f)
                lineTo(22.0f, 2.006f)
                lineToRelative(-20.0f, 5.0f)
                lineToRelative(0.242f, 0.97f)
                lineTo(9.14f, 6.25f)
                lineToRelative(-2.837f, 5.24f)
                lineTo(3.62f, 11.49f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-2.681f)
                lineToRelative(-3.11f, -6.662f)
                close()
                moveTo(13.841f, 5.076f)
                lineTo(10.455f, 5.922f)
                lineTo(7.44f, 11.49f)
                horizontalLineToRelative(9.396f)
                close()
                moveTo(21.12f, 12.99f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(8.12f, 13.49f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(5.12f, 17.49f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.12f, 18.49f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(13.12f, 17.49f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(20.12f, 13.49f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(17.12f, 17.49f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _cableCarProfileSmall!!
    }

private var _cableCarProfileSmall: ImageVector? = null
