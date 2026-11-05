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

public val SBBIcons.PearlchainWithCrossSmall: ImageVector
    get() {
        if (_pearlchainWithCrossSmall != null) {
            return _pearlchainWithCrossSmall!!
        }
        _pearlchainWithCrossSmall = Builder(name = "PearlchainWithCrossSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.597f, 8.111f)
                lineTo(12.707f, 12.0f)
                lineToRelative(3.889f, 3.89f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(12.0f, 12.708f)
                lineToRelative(-3.889f, 3.889f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(11.292f, 12.0f)
                lineTo(7.403f, 8.111f)
                lineToRelative(0.708f, -0.707f)
                lineTo(12.0f, 11.293f)
                lineToRelative(3.889f, -3.889f)
                close()
                moveTo(4.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.958f, 2.5f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.958f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 4.0f, 9.0f)
                moveToRelative(16.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -2.958f, 3.5f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.042f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 20.0f, 9.0f)
            }
        }
        .build()
        return _pearlchainWithCrossSmall!!
    }

private var _pearlchainWithCrossSmall: ImageVector? = null
