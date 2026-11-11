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

public val SBBIcons.MedalMedium: ImageVector
    get() {
        if (_medalMedium != null) {
            return _medalMedium!!
        }
        _medalMedium = Builder(name = "MedalMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(14.712f, 5.058f)
                lineToRelative(-0.13f, -0.308f)
                lineTo(8.98f, 4.75f)
                lineToRelative(6.245f, 14.05f)
                arcTo(7.252f, 7.252f, 0.0f, false, false, 18.0f, 32.75f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, 2.775f, -13.95f)
                lineToRelative(6.244f, -14.05f)
                horizontalLineToRelative(-5.602f)
                lineToRelative(-0.13f, 0.308f)
                lineTo(18.0f, 12.948f)
                close()
                moveTo(18.455f, 14.458f)
                lineTo(18.462f, 14.442f)
                lineTo(22.084f, 5.75f)
                horizontalLineToRelative(3.396f)
                lineToRelative(-5.555f, 12.5f)
                horizontalLineToRelative(-3.367f)
                lineToRelative(1.89f, -3.776f)
                close()
                moveTo(17.45f, 14.231f)
                lineTo(15.776f, 17.578f)
                lineTo(10.52f, 5.75f)
                horizontalLineToRelative(3.397f)
                close()
                moveTo(24.25f, 25.5f)
                arcToRelative(6.25f, 6.25f, 0.0f, true, false, -12.5f, 0.0f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 12.5f, 0.0f)
                moveToRelative(-3.0f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, -6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 6.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, -8.5f, 0.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 8.5f, 0.0f)
            }
        }
        .build()
        return _medalMedium!!
    }

private var _medalMedium: ImageVector? = null
