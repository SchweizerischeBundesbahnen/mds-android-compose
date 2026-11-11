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

public val SBBIcons.BridgeMedium: ImageVector
    get() {
        if (_bridgeMedium != null) {
            return _bridgeMedium!!
        }
        _bridgeMedium = Builder(name = "BridgeMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 9.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(33.0f, 13.28f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 12.28f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(6.667f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, -2.834f, 2.18f)
                lineToRelative(0.668f, 0.745f)
                curveTo(8.19f, 19.194f, 12.501f, 17.75f, 18.0f, 17.75f)
                reflectiveCurveToRelative(9.81f, 1.444f, 13.916f, 5.122f)
                lineToRelative(0.668f, -0.744f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, false, -2.834f, -2.18f)
                lineTo(29.75f, 13.28f)
                close()
                moveTo(28.75f, 19.34f)
                verticalLineToRelative(-6.06f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(4.413f)
                horizontalLineToRelative(-0.326f)
                curveToRelative(1.325f, 0.405f, 2.595f, 0.948f, 3.826f, 1.647f)
                moveToRelative(-4.5f, -1.84f)
                verticalLineToRelative(-4.22f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.599f)
                curveToRelative(1.215f, 0.119f, 2.378f, 0.323f, 3.5f, 0.622f)
                moveToRelative(-4.5f, -0.7f)
                verticalLineToRelative(-3.52f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.52f)
                quadToRelative(0.856f, -0.05f, 1.75f, -0.05f)
                reflectiveQuadToRelative(1.75f, 0.05f)
                moveToRelative(-4.5f, 0.079f)
                lineTo(15.25f, 13.28f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(4.22f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 3.5f, -0.621f)
                moveToRelative(-4.5f, 0.917f)
                lineTo(10.75f, 13.28f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(6.06f)
                arcToRelative(19.0f, 19.0f, 0.0f, false, true, 3.5f, -1.544f)
            }
        }
        .build()
        return _bridgeMedium!!
    }

private var _bridgeMedium: ImageVector? = null
