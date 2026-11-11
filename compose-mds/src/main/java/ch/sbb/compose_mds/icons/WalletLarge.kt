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

public val SBBIcons.WalletLarge: ImageVector
    get() {
        if (_walletLarge != null) {
            return _walletLarge!!
        }
        _walletLarge = Builder(name = "WalletLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(34.9f, 4.084f)
                curveToRelative(0.782f, -0.246f, 1.716f, 0.063f, 1.993f, 0.886f)
                lineToRelative(1.98f, 5.03f)
                lineTo(45.0f, 10.0f)
                verticalLineToRelative(32.0f)
                lineTo(3.0f, 42.0f)
                lineTo(3.0f, 10.0f)
                horizontalLineToRelative(19.154f)
                lineToRelative(12.685f, -5.893f)
                lineToRelative(0.03f, -0.013f)
                close()
                moveTo(20.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(7.39f)
                close()
                moveTo(4.0f, 16.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(-6.0f)
                lineTo(26.5f, 35.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 0.0f, -13.0f)
                lineTo(44.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(26.5f, 34.0f)
                lineTo(44.0f, 34.0f)
                lineTo(44.0f, 23.0f)
                lineTo(26.5f, 23.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                moveTo(44.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.734f)
                lineToRelative(1.574f, 4.0f)
                close()
                moveTo(35.963f, 5.336f)
                lineTo(39.766f, 15.0f)
                lineTo(13.763f, 15.0f)
                lineToRelative(21.455f, -9.967f)
                curveToRelative(0.402f, -0.118f, 0.676f, 0.087f, 0.731f, 0.266f)
                lineToRelative(0.006f, 0.02f)
                close()
                moveTo(35.949f, 5.299f)
                lineTo(36.429f, 5.151f)
                lineTo(36.424f, 5.154f)
                close()
                moveTo(28.0f, 28.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
            }
        }
        .build()
        return _walletLarge!!
    }

private var _walletLarge: ImageVector? = null
