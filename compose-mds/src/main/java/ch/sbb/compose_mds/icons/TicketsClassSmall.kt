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

public val SBBIcons.TicketsClassSmall: ImageVector
    get() {
        if (_ticketsClassSmall != null) {
            return _ticketsClassSmall!!
        }
        _ticketsClassSmall = Builder(name = "TicketsClassSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 21.0f)
                lineTo(4.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(5.0f, 20.0f)
                horizontalLineToRelative(8.0f)
                lineTo(13.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                lineTo(19.0f, 4.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(12.0f, 16.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(12.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(10.606f, 6.833f)
                quadToRelative(0.57f, 0.0f, 0.95f, 0.323f)
                quadToRelative(0.413f, 0.35f, 0.414f, 0.944f)
                quadToRelative(0.0f, 0.516f, -0.331f, 0.89f)
                quadToRelative(-0.108f, 0.123f, -0.203f, 0.196f)
                reflectiveQuadToRelative(-0.498f, 0.355f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.55f, 0.41f)
                quadToRelative(-0.165f, 0.14f, -0.307f, 0.325f)
                horizontalLineToRelative(1.908f)
                lineTo(11.989f, 11.0f)
                lineTo(9.06f, 11.0f)
                quadToRelative(0.0f, -0.331f, 0.108f, -0.632f)
                quadToRelative(0.107f, -0.3f, 0.302f, -0.518f)
                quadToRelative(0.15f, -0.167f, 0.351f, -0.325f)
                quadToRelative(0.202f, -0.159f, 0.803f, -0.582f)
                quadToRelative(0.293f, -0.203f, 0.408f, -0.38f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.118f, -0.405f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.158f, -0.433f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, -0.413f, -0.165f)
                quadToRelative(-0.628f, 0.0f, -0.648f, 0.904f)
                horizontalLineToRelative(-0.782f)
                verticalLineToRelative(-0.089f)
                quadToRelative(0.0f, -0.741f, 0.415f, -1.146f)
                quadToRelative(0.403f, -0.396f, 1.043f, -0.396f)
                moveTo(17.975f, 9.0f)
                horizontalLineToRelative(-0.812f)
                lineTo(17.163f, 6.336f)
                horizontalLineToRelative(-0.959f)
                verticalLineToRelative(-0.59f)
                quadToRelative(0.299f, -0.007f, 0.486f, -0.06f)
                quadToRelative(0.188f, -0.054f, 0.344f, -0.173f)
                quadToRelative(0.226f, -0.174f, 0.303f, -0.581f)
                horizontalLineToRelative(0.638f)
                close()
            }
        }
        .build()
        return _ticketsClassSmall!!
    }

private var _ticketsClassSmall: ImageVector? = null
