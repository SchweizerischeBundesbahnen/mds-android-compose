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
        _documentImageSmall = Builder(name = "DocumentImageSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.707f, 4.0f)
                lineTo(18.0f, 9.293f)
                lineTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(17.0f, 19.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                lineTo(7.0f, 5.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(13.0f, 5.707f)
                lineTo(16.293f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(12.65f, 14.367f)
                lineTo(10.975f, 9.342f)
                lineTo(10.463f, 7.809f)
                lineTo(10.02f, 9.362f)
                lineTo(8.02f, 16.357f)
                lineTo(7.837f, 16.995f)
                horizontalLineToRelative(8.304f)
                lineToRelative(-0.156f, -0.621f)
                lineToRelative(-1.0f, -4.005f)
                lineToRelative(-0.274f, -1.099f)
                lineToRelative(-0.627f, 0.943f)
                close()
                moveTo(12.5f, 15.496f)
                lineTo(12.916f, 15.773f)
                close()
                moveTo(12.769f, 15.995f)
                lineTo(12.916f, 15.773f)
                lineTo(14.288f, 13.709f)
                lineTo(14.859f, 15.995f)
                close()
                moveTo(12.139f, 15.995f)
                lineTo(9.163f, 15.995f)
                lineToRelative(1.373f, -4.805f)
                lineToRelative(1.49f, 4.465f)
                close()
            }
        }
        .build()
        return _documentImageSmall!!
    }

private var _documentImageSmall: ImageVector? = null
