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
                moveTo(9.75f, 4.75f)
                horizontalLineToRelative(-0.77f)
                lineToRelative(0.313f, 0.703f)
                lineTo(15.225f, 18.8f)
                arcTo(7.252f, 7.252f, 0.0f, false, false, 18.0f, 32.75f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, false, 2.775f, -13.95f)
                lineToRelative(5.932f, -13.347f)
                lineToRelative(0.312f, -0.703f)
                horizontalLineToRelative(-5.602f)
                lineToRelative(-0.129f, 0.308f)
                lineTo(18.0f, 12.95f)
                lineTo(14.71f, 5.058f)
                lineToRelative(-0.128f, -0.308f)
                horizontalLineTo(9.75f)
                moveToRelative(8.24f, 14.5f)
                horizontalLineToRelative(0.02f)
                arcToRelative(6.25f, 6.25f, 0.0f, true, true, -0.02f, 0.0f)
                moveToRelative(0.02f, -1.0f)
                horizontalLineToRelative(1.915f)
                lineToRelative(5.555f, -12.5f)
                horizontalLineToRelative(-3.397f)
                lineToRelative(-3.622f, 8.692f)
                lineToRelative(-0.006f, 0.016f)
                lineToRelative(-0.008f, 0.016f)
                lineToRelative(-1.888f, 3.776f)
                horizontalLineToRelative(1.452f)
                moveToRelative(-4.094f, -12.5f)
                lineToRelative(3.534f, 8.481f)
                lineToRelative(-1.673f, 3.348f)
                lineTo(10.519f, 5.75f)
                close()
                moveTo(18.0f, 22.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 0.0f, 6.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.0f, -6.5f)
                moveToRelative(-4.25f, 3.25f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, 8.5f, 0.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, -8.5f, 0.0f)
            }
        }
        .build()
        return _medalMedium!!
    }

private var _medalMedium: ImageVector? = null
