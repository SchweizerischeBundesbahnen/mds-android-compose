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
        _fourDiamondsMedium = Builder(
            name = "FourDiamondsMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(3.858f, 17.646f)
                lineTo(3.504f, 18.0f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(5.303f, 5.303f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(5.304f, -5.303f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(-5.304f, -5.303f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(-0.354f, 0.353f)
                close()
                moveTo(9.515f, 22.596f)
                lineTo(4.919f, 18.0f)
                lineToRelative(4.596f, -4.596f)
                lineTo(14.11f, 18.0f)
                close()
                moveTo(12.343f, 9.161f)
                lineTo(11.99f, 9.515f)
                lineTo(12.343f, 9.868f)
                lineTo(17.647f, 15.172f)
                lineTo(18.0f, 15.525f)
                lineTo(18.354f, 15.172f)
                lineTo(23.657f, 9.868f)
                lineTo(24.011f, 9.515f)
                lineTo(23.657f, 9.161f)
                lineTo(18.354f, 3.858f)
                lineTo(18.0f, 3.504f)
                lineToRelative(-0.354f, 0.354f)
                close()
                moveTo(18.0f, 14.111f)
                lineToRelative(-4.596f, -4.596f)
                lineTo(18.0f, 4.919f)
                lineToRelative(4.596f, 4.596f)
                close()
                moveTo(11.99f, 26.485f)
                lineTo(12.343f, 26.132f)
                lineTo(17.647f, 20.828f)
                lineTo(18.0f, 20.475f)
                lineTo(18.354f, 20.828f)
                lineTo(23.657f, 26.132f)
                lineTo(24.011f, 26.485f)
                lineTo(23.657f, 26.839f)
                lineTo(18.354f, 32.142f)
                lineTo(18.0f, 32.496f)
                lineTo(17.646f, 32.142f)
                lineTo(12.343f, 26.839f)
                close()
                moveTo(13.404f, 26.485f)
                lineTo(18.0f, 31.081f)
                lineToRelative(4.596f, -4.596f)
                lineTo(18.0f, 21.89f)
                close()
                moveTo(20.828f, 17.646f)
                lineTo(20.475f, 18.0f)
                lineTo(20.828f, 18.354f)
                lineTo(26.132f, 23.657f)
                lineTo(26.485f, 24.01f)
                lineTo(26.839f, 23.657f)
                lineTo(32.142f, 18.354f)
                lineTo(32.496f, 18.0f)
                lineTo(32.142f, 17.646f)
                lineTo(26.839f, 12.343f)
                lineTo(26.485f, 11.99f)
                lineTo(26.132f, 12.343f)
                close()
                moveTo(26.485f, 22.596f)
                lineTo(21.89f, 18.0f)
                lineToRelative(4.596f, -4.596f)
                lineTo(31.082f, 18.0f)
                close()
            }
        }
            .build()
        return _fourDiamondsMedium!!
    }

private var _fourDiamondsMedium: ImageVector? = null
