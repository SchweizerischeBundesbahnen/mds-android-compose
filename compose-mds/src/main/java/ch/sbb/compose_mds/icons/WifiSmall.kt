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

public val SBBIcons.WifiSmall: ImageVector
    get() {
        if (_wifiSmall != null) {
            return _wifiSmall!!
        }
        _wifiSmall = Builder(
            name = "WifiSmall",
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
                moveTo(1.856f, 8.368f)
                curveTo(4.406f, 5.684f, 8.002f, 4.0f, 12.0f, 4.0f)
                curveToRelative(3.997f, 0.0f, 7.593f, 1.684f, 10.142f, 4.368f)
                lineToRelative(-0.725f, 0.689f)
                curveTo(19.047f, 6.562f, 15.71f, 5.0f, 12.0f, 5.0f)
                curveTo(8.29f, 5.0f, 4.952f, 6.562f, 2.58f, 9.057f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -4.0f, 0.0f)
                moveToRelative(2.0f, -11.0f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, false, -7.97f, 3.432f)
                lineToRelative(0.726f, 0.688f)
                arcTo(9.96f, 9.96f, 0.0f, false, true, 12.0f, 8.0f)
                arcToRelative(9.96f, 9.96f, 0.0f, false, true, 7.244f, 3.12f)
                lineToRelative(0.726f, -0.688f)
                arcTo(10.96f, 10.96f, 0.0f, false, false, 12.0f, 7.0f)
                moveToRelative(-5.791f, 5.5f)
                arcToRelative(7.97f, 7.97f, 0.0f, false, true, 5.796f, -2.496f)
                curveToRelative(2.283f, 0.0f, 4.336f, 0.96f, 5.792f, 2.49f)
                lineToRelative(-0.725f, 0.69f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -5.067f, -2.18f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -5.071f, 2.185f)
                close()
                moveTo(11.999f, 13.0f)
                curveToRelative(-1.43f, 0.0f, -2.71f, 0.607f, -3.618f, 1.563f)
                lineToRelative(0.725f, 0.69f)
                arcTo(3.98f, 3.98f, 0.0f, false, true, 12.0f, 14.0f)
                curveToRelative(1.139f, 0.0f, 2.163f, 0.483f, 2.893f, 1.252f)
                lineToRelative(0.725f, -0.688f)
                arcTo(4.98f, 4.98f, 0.0f, false, false, 12.0f, 13.0f)
            }
        }
            .build()
        return _wifiSmall!!
    }

private var _wifiSmall: ImageVector? = null
