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

public val SBBIcons.CupHotMedium: ImageVector
    get() {
        if (_cupHotMedium != null) {
            return _cupHotMedium!!
        }
        _cupHotMedium = Builder(name = "CupHotMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.75f, 10.5f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(8.75f, 16.25f)
                horizontalLineToRelative(17.0f)
                lineTo(25.75f, 21.0f)
                curveToRelative(0.0f, 4.693f, -3.807f, 8.5f, -8.5f, 8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -8.5f, -8.5f)
                close()
                moveTo(19.424f, 30.25f)
                arcToRelative(9.52f, 9.52f, 0.0f, false, false, 6.922f, -6.5f)
                lineTo(28.5f, 23.75f)
                arcToRelative(2.751f, 2.751f, 0.0f, false, false, 0.0f, -5.5f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-19.0f)
                lineTo(7.75f, 21.0f)
                curveToRelative(0.0f, 4.498f, 3.128f, 8.267f, 7.326f, 9.25f)
                lineTo(6.0f, 30.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(22.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(28.5f, 22.75f)
                horizontalLineToRelative(-1.91f)
                quadToRelative(0.159f, -0.852f, 0.16f, -1.75f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(1.75f)
                arcToRelative(1.751f, 1.751f, 0.0f, false, true, 0.0f, 3.5f)
                moveTo(22.25f, 6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.25f, 6.0f)
                close()
                moveTo(13.25f, 12.0f)
                lineTo(13.25f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _cupHotMedium!!
    }

private var _cupHotMedium: ImageVector? = null
