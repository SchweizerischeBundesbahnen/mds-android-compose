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

public val SBBIcons.ReduceSizeSmall: ImageVector
    get() {
        if (_reduceSizeSmall != null) {
            return _reduceSizeSmall!!
        }
        _reduceSizeSmall = Builder(name = "ReduceSizeSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 2.521f)
                verticalLineToRelative(-0.52f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.52f)
                close()
                moveTo(15.0f, 4.604f)
                lineTo(15.0f, 3.563f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.041f)
                close()
                moveTo(15.0f, 6.688f)
                lineTo(15.0f, 5.646f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 8.771f)
                lineTo(15.0f, 7.73f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 10.854f)
                lineTo(15.0f, 9.813f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.041f)
                close()
                moveTo(15.0f, 12.938f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 14.5f)
                verticalLineToRelative(-0.52f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 14.0f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 15.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(0.52f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 14.0f)
                close()
                moveTo(3.563f, 15.0f)
                horizontalLineToRelative(1.041f)
                verticalLineToRelative(-1.0f)
                lineTo(3.563f, 14.0f)
                close()
                moveTo(5.646f, 15.0f)
                horizontalLineToRelative(1.042f)
                verticalLineToRelative(-1.0f)
                lineTo(5.646f, 14.0f)
                close()
                moveTo(7.729f, 15.0f)
                horizontalLineToRelative(1.042f)
                verticalLineToRelative(-1.0f)
                lineTo(7.729f, 14.0f)
                close()
                moveTo(9.813f, 15.0f)
                horizontalLineToRelative(1.041f)
                verticalLineToRelative(-1.0f)
                lineTo(9.813f, 14.0f)
                close()
                moveTo(11.896f, 15.0f)
                horizontalLineToRelative(1.041f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.041f)
                close()
                moveTo(16.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.293f)
                lineToRelative(3.647f, 3.646f)
                lineToRelative(-0.708f, 0.707f)
                lineTo(17.0f, 17.707f)
                lineTo(17.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
            }
        }
        .build()
        return _reduceSizeSmall!!
    }

private var _reduceSizeSmall: ImageVector? = null
