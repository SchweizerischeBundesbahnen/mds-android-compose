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
                moveTo(5.123f, 5.83f)
                lineTo(3.146f, 3.854f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(15.0f, 15.0f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(-4.459f, -4.46f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 12.002f, 14.0f)
                curveToRelative(-1.14f, 0.0f, -2.164f, 0.482f, -2.894f, 1.252f)
                lineToRelative(-0.725f, -0.688f)
                arcToRelative(4.97f, 4.97f, 0.0f, false, true, 3.92f, -1.554f)
                lineToRelative(-1.829f, -1.83f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -3.539f, 2.009f)
                lineTo(6.21f, 12.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.447f, -2.137f)
                lineTo(8.1f, 8.808f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -3.345f, 2.313f)
                lineToRelative(-0.725f, -0.689f)
                curveToRelative(0.94f, -0.99f, 2.065f, -1.797f, 3.313f, -2.381f)
                lineTo(5.86f, 6.566f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, -3.276f, 2.49f)
                lineToRelative(-0.726f, -0.688f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 5.123f, 5.83f)
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveTo(7.172f, 4.877f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 12.0f, 4.0f)
                curveToRelative(3.997f, 0.0f, 7.593f, 1.684f, 10.142f, 4.367f)
                lineToRelative(-0.724f, 0.69f)
                curveTo(19.048f, 6.561f, 15.709f, 5.0f, 12.0f, 5.0f)
                curveToRelative(-1.576f, 0.0f, -3.08f, 0.297f, -4.482f, 0.815f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(-0.813f, 0.0f, -1.602f, 0.093f, -2.36f, 0.259f)
                lineToRelative(0.214f, 0.977f)
                arcToRelative(9.956f, 9.956f, 0.0f, false, true, 9.39f, 2.885f)
                lineToRelative(0.726f, -0.689f)
                arcTo(10.96f, 10.96f, 0.0f, false, false, 12.0f, 7.0f)
                moveToRelative(0.496f, 4.03f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, 4.576f, 2.154f)
                lineToRelative(0.724f, -0.69f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, false, -5.23f, -2.461f)
                close()
            }
        }
        .build()
        return _wifiDisabledSmall!!
    }

private var _wifiDisabledSmall: ImageVector? = null
