package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.ToiletSmall: ImageVector
    get() {
        if (_toiletSmall != null) {
            return _toiletSmall!!
        }
        _toiletSmall = Builder(name = "ToiletSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.999f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveTo(5.5f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-2.0f, 4.0f)
                lineTo(3.0f, 8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(8.0f, 8.0f)
                lineTo(3.5f, 8.0f)
                moveToRelative(1.0f, 5.0f)
                lineTo(4.0f, 13.0f)
                lineTo(4.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(6.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(16.0f, 19.5f)
                lineTo(16.0f, 16.0f)
                horizontalLineToRelative(-2.163f)
                lineToRelative(0.182f, -0.638f)
                lineToRelative(2.0f, -7.0f)
                lineTo(16.123f, 8.0f)
                horizontalLineToRelative(2.754f)
                lineToRelative(0.104f, 0.362f)
                lineToRelative(2.0f, 7.0f)
                lineToRelative(0.182f, 0.638f)
                lineTo(19.0f, 16.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -1.0f, 0.0f)
                moveToRelative(0.5f, -1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveToRelative(-0.623f, 5.0f)
                lineToRelative(-1.714f, 6.0f)
                horizontalLineToRelative(4.674f)
                lineToRelative(-1.714f, -6.0f)
                close()
                moveTo(11.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(1.0f)
                lineTo(12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _toiletSmall!!
    }

private var _toiletSmall: ImageVector? = null
