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
                moveTo(2.52f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(4.604f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.563f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.688f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.646f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.771f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.729f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.854f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.814f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.938f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.043f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(-1.02f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 14.0f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 12.938f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 10.855f)
                lineTo(15.0f, 9.813f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 8.771f)
                lineTo(15.0f, 7.73f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.04f)
                close()
                moveTo(15.0f, 6.688f)
                lineTo(15.0f, 5.646f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 4.605f)
                lineTo(15.0f, 3.563f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 2.521f)
                lineTo(15.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.52f)
                close()
                moveTo(20.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.293f)
                lineToRelative(3.646f, 3.646f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(17.0f, 17.707f)
                lineTo(17.0f, 20.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _reduceSizeSmall!!
    }

private var _reduceSizeSmall: ImageVector? = null
