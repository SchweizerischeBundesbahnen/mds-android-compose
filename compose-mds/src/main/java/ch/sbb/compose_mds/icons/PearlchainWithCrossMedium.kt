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

public val SBBIcons.PearlchainWithCrossMedium: ImageVector
    get() {
        if (_pearlchainWithCrossMedium != null) {
            return _pearlchainWithCrossMedium!!
        }
        _pearlchainWithCrossMedium = Builder(name = "PearlchainWithCrossMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.718f, 11.99f)
                lineTo(18.707f, 18.0f)
                lineToRelative(6.01f, 6.01f)
                lineToRelative(-0.706f, 0.708f)
                lineTo(18.0f, 18.707f)
                lineToRelative(-6.01f, 6.01f)
                lineToRelative(-0.708f, -0.706f)
                lineTo(17.292f, 18.0f)
                lineToRelative(-6.01f, -6.01f)
                lineToRelative(0.707f, -0.707f)
                lineTo(18.0f, 17.293f)
                lineToRelative(6.01f, -6.01f)
                close()
                moveTo(6.0f, 13.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.472f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.528f)
                arcTo(4.5f, 4.5f, 0.0f, true, true, 6.0f, 13.5f)
                moveToRelative(24.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -4.472f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.528f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.472f, -4.0f)
            }
        }
        .build()
        return _pearlchainWithCrossMedium!!
    }

private var _pearlchainWithCrossMedium: ImageVector? = null
