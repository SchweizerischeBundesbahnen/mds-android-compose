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

public val SBBIcons.PreviousSmall: ImageVector
    get() {
        if (_previousSmall != null) {
            return _previousSmall!!
        }
        _previousSmall = Builder(name = "PreviousSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(14.773f, 9.169f)
                lineToRelative(4.228f, -2.748f)
                verticalLineToRelative(11.157f)
                lineToRelative(-4.228f, -2.747f)
                lineTo(10.418f, 12.0f)
                close()
                moveTo(19.229f, 18.919f)
                lineTo(20.001f, 19.421f)
                lineTo(20.001f, 4.579f)
                lineToRelative(-0.773f, 0.502f)
                lineTo(8.585f, 12.0f)
                close()
                moveTo(8.0f, 19.0f)
                lineTo(8.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(7.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _previousSmall!!
    }

private var _previousSmall: ImageVector? = null
