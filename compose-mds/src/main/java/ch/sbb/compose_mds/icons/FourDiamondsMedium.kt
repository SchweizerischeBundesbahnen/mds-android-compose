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

public val SBBIcons.FourDiamondsMedium: ImageVector
    get() {
        if (_fourDiamondsMedium != null) {
            return _fourDiamondsMedium!!
        }
        _fourDiamondsMedium = Builder(name = "FourDiamondsMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.525f, 18.0f)
                lineToRelative(-6.01f, -6.01f)
                lineTo(3.505f, 18.0f)
                lineToRelative(6.01f, 6.01f)
                close()
                moveTo(14.111f, 18.0f)
                lineTo(9.515f, 22.596f)
                lineTo(4.919f, 18.0f)
                lineToRelative(4.596f, -4.596f)
                close()
                moveTo(24.011f, 9.515f)
                lineTo(18.0f, 3.505f)
                lineToRelative(-6.011f, 6.01f)
                lineToRelative(6.01f, 6.01f)
                close()
                moveTo(22.596f, 9.515f)
                lineTo(18.0f, 14.11f)
                lineToRelative(-4.596f, -4.596f)
                lineTo(18.0f, 4.919f)
                close()
                moveTo(18.0f, 20.475f)
                lineToRelative(6.01f, 6.01f)
                lineToRelative(-6.01f, 6.01f)
                lineToRelative(-6.01f, -6.01f)
                close()
                moveTo(18.0f, 31.081f)
                lineTo(22.596f, 26.485f)
                lineTo(18.0f, 21.89f)
                lineToRelative(-4.596f, 4.596f)
                close()
                moveTo(32.496f, 18.0f)
                lineToRelative(-6.01f, -6.01f)
                lineTo(20.474f, 18.0f)
                lineToRelative(6.01f, 6.01f)
                close()
                moveTo(31.082f, 18.0f)
                lineTo(26.485f, 22.596f)
                lineTo(21.89f, 18.0f)
                lineToRelative(4.596f, -4.596f)
                close()
            }
        }
        .build()
        return _fourDiamondsMedium!!
    }

private var _fourDiamondsMedium: ImageVector? = null
