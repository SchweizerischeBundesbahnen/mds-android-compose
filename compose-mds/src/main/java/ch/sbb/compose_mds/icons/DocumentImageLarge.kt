package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.DocumentImageLarge: ImageVector
    get() {
        if (_documentImageLarge != null) {
            return _documentImageLarge!!
        }
        _documentImageLarge = Builder(name = "DocumentImageLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.0f, 18.293f)
                lineTo(35.0f, 39.0f)
                lineTo(12.0f, 39.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineToRelative(12.707f)
                close()
                moveTo(13.0f, 38.0f)
                horizontalLineToRelative(21.0f)
                lineTo(34.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(20.975f, 18.342f)
                lineTo(24.65f, 29.364f)
                lineTo(28.084f, 24.204f)
                lineTo(28.711f, 23.26f)
                lineTo(28.985f, 24.358f)
                lineTo(30.985f, 32.369f)
                lineTo(31.141f, 32.99f)
                lineTo(15.837f, 32.99f)
                lineToRelative(0.183f, -0.638f)
                lineToRelative(4.0f, -13.99f)
                lineToRelative(0.443f, -1.552f)
                close()
                moveTo(17.163f, 31.99f)
                lineTo(29.86f, 31.99f)
                lineToRelative(-1.57f, -6.29f)
                lineToRelative(-3.373f, 5.07f)
                lineToRelative(-0.566f, 0.853f)
                lineToRelative(-0.325f, -0.97f)
                lineToRelative(-3.489f, -10.463f)
                close()
                moveTo(25.0f, 18.0f)
                horizontalLineToRelative(8.293f)
                lineTo(25.0f, 9.707f)
                close()
            }
        }
        .build()
        return _documentImageLarge!!
    }

private var _documentImageLarge: ImageVector? = null
