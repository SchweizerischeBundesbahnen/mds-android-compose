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

public val SBBIcons.LinkMedium: ImageVector
    get() {
        if (_linkMedium != null) {
            return _linkMedium!!
        }
        _linkMedium = Builder(name = "LinkMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(29.135f, 8.013f)
                lineToRelative(-1.101f, -1.057f)
                arcToRelative(4.96f, 4.96f, 0.0f, false, false, -7.024f, 0.003f)
                lineToRelative(0.344f, 0.345f)
                lineToRelative(-0.344f, -0.345f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-0.005f, 0.005f)
                lineToRelative(-0.02f, 0.02f)
                lineToRelative(-0.073f, 0.073f)
                lineToRelative(-0.276f, 0.277f)
                lineToRelative(-0.936f, 0.936f)
                lineToRelative(-2.4f, 2.4f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(2.399f, -2.4f)
                lineToRelative(0.936f, -0.936f)
                lineToRelative(0.276f, -0.277f)
                lineToRelative(0.074f, -0.074f)
                lineToRelative(0.02f, -0.02f)
                lineToRelative(0.004f, -0.004f)
                lineToRelative(0.001f, -0.001f)
                arcToRelative(3.96f, 3.96f, 0.0f, false, true, 5.614f, 0.0f)
                lineToRelative(0.008f, 0.006f)
                lineToRelative(1.1f, 1.057f)
                arcToRelative(3.967f, 3.967f, 0.0f, false, true, 0.005f, 5.616f)
                verticalLineToRelative(0.001f)
                lineToRelative(-6.373f, 6.4f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, -5.656f, 0.0f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(1.06f, 1.06f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, 7.07f, 0.0f)
                horizontalLineToRelative(0.001f)
                lineToRelative(6.372f, -6.4f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, false, -0.008f, -7.034f)
                close()
                moveTo(19.195f, 14.993f)
                arcToRelative(5.016f, 5.016f, 0.0f, false, false, -7.072f, 0.0f)
                lineTo(5.76f, 21.359f)
                arcToRelative(5.013f, 5.013f, 0.0f, false, false, 0.0f, 7.072f)
                lineToRelative(1.06f, 1.06f)
                curveToRelative(1.946f, 1.944f, 5.126f, 1.945f, 7.07f, 0.0f)
                lineToRelative(3.72f, -3.72f)
                lineToRelative(-0.706f, -0.707f)
                lineToRelative(-3.72f, 3.72f)
                arcToRelative(4.014f, 4.014f, 0.0f, false, true, -5.656f, 0.0f)
                lineToRelative(-1.06f, -1.06f)
                arcToRelative(4.013f, 4.013f, 0.0f, false, true, 0.0f, -5.658f)
                lineToRelative(6.362f, -6.364f)
                arcToRelative(4.016f, 4.016f, 0.0f, false, true, 5.658f, 0.0f)
                lineToRelative(1.06f, 1.062f)
                lineToRelative(0.708f, -0.707f)
                close()
            }
        }
        .build()
        return _linkMedium!!
    }

private var _linkMedium: ImageVector? = null
