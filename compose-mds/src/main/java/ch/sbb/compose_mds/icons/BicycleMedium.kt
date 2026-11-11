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

public val SBBIcons.BicycleMedium: ImageVector
    get() {
        if (_bicycleMedium != null) {
            return _bicycleMedium!!
        }
        _bicycleMedium = Builder(name = "BicycleMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(25.166f, 10.026f)
                lineToRelative(0.519f, -0.777f)
                horizontalLineTo(19.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.315f)
                lineToRelative(-2.333f, 3.5f)
                horizontalLineTo(13.15f)
                lineToRelative(-0.119f, 0.33f)
                lineToRelative(-1.042f, 2.866f)
                arcTo(5.756f, 5.756f, 0.0f, false, false, 4.75f, 22.5f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.75f, 5.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.75f, -5.75f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, -3.323f, -5.213f)
                lineToRelative(0.923f, -2.538f)
                horizontalLineToRelative(7.578f)
                lineToRelative(1.247f, 2.744f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -2.924f, 5.007f)
                arcToRelative(5.755f, 5.755f, 0.0f, false, false, 5.75f, 5.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.75f, -5.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, -7.665f, -5.422f)
                lineToRelative(-1.266f, -2.783f)
                close()
                moveTo(20.752f, 22.5f)
                curveToRelative(0.0f, -1.74f, 0.94f, -3.265f, 2.34f, -4.093f)
                lineToRelative(1.954f, 4.3f)
                lineToRelative(0.911f, -0.415f)
                lineToRelative(-1.955f, -4.3f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, 6.25f, 4.508f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -4.75f, 4.75f)
                arcToRelative(4.755f, 4.755f, 0.0f, false, true, -4.75f, -4.75f)
                moveToRelative(-9.108f, -4.61f)
                lineToRelative(-1.614f, 4.438f)
                lineToRelative(0.94f, 0.342f)
                lineToRelative(1.613f, -4.438f)
                arcTo(4.76f, 4.76f, 0.0f, false, true, 15.25f, 22.5f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -4.75f, 4.75f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -4.75f, -4.75f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, 5.894f, -4.61f)
                moveToRelative(3.357f, -6.14f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.188f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _bicycleMedium!!
    }

private var _bicycleMedium: ImageVector? = null
