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

public val SBBIcons.StarSmall: ImageVector
    get() {
        if (_starSmall != null) {
            return _starSmall!!
        }
        _starSmall = Builder(name = "StarSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.0f, 1.92f)
                lineToRelative(0.475f, 1.422f)
                lineTo(14.36f, 9.0f)
                horizontalLineToRelative(6.596f)
                lineToRelative(-1.15f, 0.895f)
                lineToRelative(-4.217f, 3.28f)
                lineToRelative(1.883f, 5.461f)
                lineToRelative(0.48f, 1.39f)
                lineToRelative(-1.228f, -0.81f)
                lineTo(12.0f, 16.1f)
                lineToRelative(-4.724f, 3.117f)
                lineToRelative(-1.228f, 0.81f)
                lineToRelative(0.48f, -1.39f)
                lineToRelative(1.883f, -5.46f)
                lineToRelative(-4.218f, -3.281f)
                lineTo(3.043f, 9.0f)
                lineTo(9.64f, 9.0f)
                lineToRelative(1.886f, -5.658f)
                close()
                moveTo(12.0f, 5.081f)
                lineTo(10.475f, 9.658f)
                lineTo(10.361f, 10.0f)
                lineTo(5.958f, 10.0f)
                lineToRelative(3.35f, 2.605f)
                lineToRelative(0.282f, 0.22f)
                lineToRelative(-0.117f, 0.338f)
                lineToRelative(-1.52f, 4.409f)
                lineToRelative(3.772f, -2.49f)
                lineToRelative(0.275f, -0.18f)
                lineToRelative(0.276f, 0.18f)
                lineToRelative(3.772f, 2.49f)
                lineToRelative(-1.52f, -4.409f)
                lineToRelative(-0.117f, -0.338f)
                lineToRelative(0.282f, -0.22f)
                lineTo(18.043f, 10.0f)
                lineTo(13.64f, 10.0f)
                lineToRelative(-0.114f, -0.342f)
                close()
            }
        }
        .build()
        return _starSmall!!
    }

private var _starSmall: ImageVector? = null
