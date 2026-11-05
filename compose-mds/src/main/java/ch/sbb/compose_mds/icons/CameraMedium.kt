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

public val SBBIcons.CameraMedium: ImageVector
    get() {
        if (_cameraMedium != null) {
            return _cameraMedium!!
        }
        _cameraMedium = Builder(name = "CameraMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.89f, 6.25f)
                horizontalLineToRelative(8.221f)
                lineToRelative(0.114f, 0.342f)
                lineToRelative(1.38f, 4.158f)
                horizontalLineToRelative(9.145f)
                verticalLineToRelative(19.0f)
                lineTo(3.25f, 29.75f)
                lineTo(3.25f, 9.25f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5.14f)
                lineToRelative(1.386f, -4.158f)
                close()
                moveTo(6.25f, 10.75f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(21.39f, 7.25f)
                lineTo(22.551f, 10.75f)
                horizontalLineToRelative(-9.107f)
                lineToRelative(1.166f, -3.5f)
                close()
                moveTo(4.25f, 28.75f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(17.0f)
                close()
                moveTo(13.25f, 20.25f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, 9.5f, 0.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -9.5f, 0.0f)
                moveTo(18.0f, 14.5f)
                arcTo(5.75f, 5.75f, 0.0f, true, false, 18.0f, 26.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 0.0f, -11.5f)
            }
        }
        .build()
        return _cameraMedium!!
    }

private var _cameraMedium: ImageVector? = null
