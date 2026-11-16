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

public val SBBIcons.WifiDisabledSmall: ImageVector
    get() {
        if (_wifiDisabledSmall != null) {
            return _wifiDisabledSmall!!
        }
        _wifiDisabledSmall = Builder(name = "WifiDisabledSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.853f, 18.147f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.458f, -4.458f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 12.0f, 14.0f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, false, -2.892f, 1.252f)
                lineToRelative(-0.727f, -0.687f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, 3.922f, -1.555f)
                lineToRelative(-1.83f, -1.83f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -3.54f, 2.008f)
                lineTo(6.21f, 12.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.448f, -2.136f)
                lineTo(8.1f, 8.807f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -3.345f, 2.314f)
                lineToRelative(-0.725f, -0.688f)
                curveToRelative(0.94f, -0.991f, 2.065f, -1.798f, 3.314f, -2.382f)
                lineTo(5.859f, 6.566f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -3.277f, 2.49f)
                lineToRelative(-0.724f, -0.688f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 5.123f, 5.83f)
                lineTo(3.146f, 3.854f)
                lineToRelative(0.707f, -0.708f)
                close()
                moveTo(13.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.001f, -0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.001f)
                moveTo(12.0f, 4.0f)
                curveToRelative(3.997f, 0.0f, 7.593f, 1.684f, 10.143f, 4.367f)
                lineToRelative(-0.726f, 0.69f)
                curveTo(19.047f, 6.562f, 15.71f, 5.0f, 12.0f, 5.0f)
                curveToRelative(-1.576f, 0.0f, -3.08f, 0.297f, -4.482f, 0.815f)
                lineToRelative(-0.346f, -0.938f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 12.0f, 4.0f)
                moveToRelative(7.97f, 6.432f)
                arcTo(10.96f, 10.96f, 0.0f, false, false, 9.64f, 7.259f)
                lineToRelative(0.215f, 0.977f)
                arcToRelative(9.956f, 9.956f, 0.0f, false, true, 9.39f, 2.885f)
                close()
                moveTo(17.797f, 12.494f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, -5.23f, -2.462f)
                lineToRelative(-0.071f, 0.998f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, 4.576f, 2.154f)
                close()
            }
        }
        .build()
        return _wifiDisabledSmall!!
    }

private var _wifiDisabledSmall: ImageVector? = null
