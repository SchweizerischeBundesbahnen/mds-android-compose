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

public val SBBIcons.DocumentImageSmall: ImageVector
    get() {
        if (_documentImageSmall != null) {
            return _documentImageSmall!!
        }
        _documentImageSmall = Builder(
            name = "DocumentImageSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(6.707f)
                lineToRelative(0.147f, 0.147f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(0.146f, 0.146f)
                lineTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                close()
                moveTo(13.0f, 5.707f)
                lineTo(16.293f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(10.974f, 9.342f)
                lineTo(10.464f, 7.809f)
                lineTo(10.019f, 9.362f)
                lineTo(8.019f, 16.357f)
                lineTo(7.837f, 16.995f)
                horizontalLineToRelative(8.303f)
                lineToRelative(-0.155f, -0.621f)
                lineToRelative(-1.0f, -4.005f)
                lineToRelative(-0.274f, -1.099f)
                lineToRelative(-0.627f, 0.943f)
                lineToRelative(-1.434f, 2.155f)
                close()
                moveTo(9.163f, 15.995f)
                lineTo(10.537f, 11.19f)
                lineTo(12.026f, 15.655f)
                lineTo(12.139f, 15.995f)
                close()
                moveTo(14.86f, 15.995f)
                horizontalLineToRelative(-2.09f)
                lineToRelative(0.146f, -0.221f)
                lineToRelative(1.373f, -2.064f)
                close()
            }
        }
            .build()
        return _documentImageSmall!!
    }

private var _documentImageSmall: ImageVector? = null
