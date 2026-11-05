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

public val SBBIcons.PearlchainWithCrossLarge: ImageVector
    get() {
        if (_pearlchainWithCrossLarge != null) {
            return _pearlchainWithCrossLarge!!
        }
        _pearlchainWithCrossLarge = Builder(
            name = "PearlchainWithCrossLarge",
            defaultWidth =
                48.0.dp,
            defaultHeight = 48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight =
            48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(32.338f, 15.37f)
                lineToRelative(-8.132f, 8.13f)
                lineToRelative(8.132f, 8.132f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-8.132f, -8.131f)
                lineToRelative(-8.13f, 8.131f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(8.131f, -8.132f)
                lineToRelative(-8.13f, -8.13f)
                lineToRelative(0.706f, -0.707f)
                lineToRelative(8.131f, 8.13f)
                lineToRelative(8.132f, -8.13f)
                close()
                moveTo(7.5f, 17.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.48f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.021f)
                arcTo(6.498f, 6.498f, 0.0f, false, true, 1.0f, 23.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 7.5f, 17.0f)
                moveToRelative(32.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -6.478f, 7.0f)
                horizontalLineTo(27.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.02f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.48f, -6.0f)
            }
        }
            .build()
        return _pearlchainWithCrossLarge!!
    }

private var _pearlchainWithCrossLarge: ImageVector? = null
