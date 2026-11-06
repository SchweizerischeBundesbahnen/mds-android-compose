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

public val SBBIcons.TicketsClassMedium: ImageVector
    get() {
        if (_ticketsClassMedium != null) {
            return _ticketsClassMedium!!
        }
        _ticketsClassMedium = Builder(name = "TicketsClassMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.75f, 28.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.25f, 31.25f)
                lineTo(6.25f, 7.75f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(14.5f)
                close()
                moveTo(7.25f, 30.25f)
                horizontalLineToRelative(12.5f)
                lineTo(19.75f, 8.75f)
                lineTo(7.25f, 8.75f)
                close()
                moveTo(16.25f, 7.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(9.0f)
                lineTo(27.0f, 16.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.25f)
                verticalLineToRelative(2.0f)
                lineTo(27.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-6.25f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(8.0f)
                lineTo(28.75f, 5.75f)
                horizontalLineToRelative(-12.5f)
                close()
                moveTo(18.0f, 23.75f)
                lineTo(9.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(18.0f, 20.75f)
                lineTo(9.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(15.91f, 10.25f)
                quadToRelative(0.852f, 0.0f, 1.423f, 0.484f)
                quadToRelative(0.621f, 0.525f, 0.621f, 1.416f)
                quadToRelative(0.0f, 0.774f, -0.496f, 1.335f)
                quadToRelative(-0.162f, 0.184f, -0.305f, 0.294f)
                quadToRelative(-0.141f, 0.11f, -0.747f, 0.533f)
                quadToRelative(-0.575f, 0.401f, -0.825f, 0.613f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -0.46f, 0.49f)
                horizontalLineToRelative(2.863f)
                lineTo(17.984f, 16.5f)
                horizontalLineToRelative(-4.396f)
                quadToRelative(0.0f, -0.497f, 0.162f, -0.948f)
                quadToRelative(0.16f, -0.45f, 0.453f, -0.777f)
                quadToRelative(0.225f, -0.25f, 0.527f, -0.487f)
                quadToRelative(0.303f, -0.24f, 1.204f, -0.873f)
                quadToRelative(0.439f, -0.306f, 0.614f, -0.569f)
                quadToRelative(0.177f, -0.262f, 0.177f, -0.61f)
                quadToRelative(0.0f, -0.399f, -0.238f, -0.649f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -0.619f, -0.247f)
                quadToRelative(-0.943f, 0.0f, -0.973f, 1.356f)
                horizontalLineToRelative(-1.172f)
                verticalLineToRelative(-0.133f)
                quadToRelative(0.0f, -1.112f, 0.62f, -1.72f)
                quadToRelative(0.606f, -0.594f, 1.567f, -0.594f)
                moveToRelative(11.052f, 3.25f)
                horizontalLineToRelative(-1.218f)
                lineTo(25.744f, 9.505f)
                horizontalLineToRelative(-1.438f)
                lineTo(24.306f, 8.62f)
                quadToRelative(0.448f, -0.011f, 0.73f, -0.092f)
                quadToRelative(0.28f, -0.08f, 0.516f, -0.258f)
                quadToRelative(0.337f, -0.261f, 0.453f, -0.873f)
                horizontalLineToRelative(0.957f)
                close()
            }
        }
        .build()
        return _ticketsClassMedium!!
    }

private var _ticketsClassMedium: ImageVector? = null
