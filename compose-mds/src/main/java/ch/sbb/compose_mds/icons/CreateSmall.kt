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

public val SBBIcons.CreateSmall: ImageVector
    get() {
        if (_createSmall != null) {
            return _createSmall!!
        }
        _createSmall = Builder(name = "CreateSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(16.71f, 9.503f)
                lineTo(16.35f, 9.856f)
                lineTo(10.251f, 15.856f)
                lineTo(10.105f, 16.0f)
                lineTo(8.0f, 16.0f)
                verticalLineToRelative(-2.207f)
                lineToRelative(6.5f, -6.5f)
                close()
                moveTo(9.0f, 14.207f)
                lineTo(9.0f, 15.0f)
                horizontalLineToRelative(0.695f)
                lineToRelative(5.594f, -5.504f)
                lineToRelative(-0.789f, -0.789f)
                close()
                moveTo(19.621f, 6.5f)
                lineTo(17.43f, 8.691f)
                lineTo(15.237f, 6.5f)
                lineToRelative(2.192f, -2.191f)
                close()
                moveTo(16.651f, 6.5f)
                lineTo(17.429f, 7.277f)
                lineTo(18.206f, 6.5f)
                lineTo(17.429f, 5.723f)
                close()
            }
        }
        .build()
        return _createSmall!!
    }

private var _createSmall: ImageVector? = null
