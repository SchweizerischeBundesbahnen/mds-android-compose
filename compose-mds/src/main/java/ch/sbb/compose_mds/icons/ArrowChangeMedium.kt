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

public val SBBIcons.ArrowChangeMedium: ImageVector
    get() {
        if (_arrowChangeMedium != null) {
            return _arrowChangeMedium!!
        }
        _arrowChangeMedium = Builder(name = "ArrowChangeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(9.755f, 6.047f)
                lineToRelative(5.604f, 5.604f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.397f, -4.397f)
                verticalLineToRelative(16.793f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 8.0f, 0.0f)
                verticalLineTo(11.252f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, true, 10.0f, 0.0f)
                verticalLineToRelative(16.795f)
                lineToRelative(4.396f, -4.396f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-5.603f, 5.603f)
                lineToRelative(-5.604f, -5.603f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(4.397f, 4.397f)
                verticalLineTo(11.252f)
                arcToRelative(4.001f, 4.001f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(13.502f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f)
                verticalLineTo(7.961f)
                lineTo(4.86f, 12.358f)
                lineToRelative(-0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _arrowChangeMedium!!
    }

private var _arrowChangeMedium: ImageVector? = null
