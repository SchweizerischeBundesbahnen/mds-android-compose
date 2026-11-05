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
        _walletLarge = Builder(
            name = "WalletLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
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
                moveTo(35.228f, 5.03f)
                lineTo(13.763f, 15.0f)
                horizontalLineToRelative(26.003f)
                lineToRelative(-3.803f, -9.664f)
                lineToRelative(-0.008f, -0.018f)
                lineToRelative(-0.005f, -0.019f)
                curveToRelative(-0.055f, -0.178f, -0.325f, -0.38f, -0.722f, -0.269f)
                moveTo(20.0f, 11.0f)
                lineToRelative(-8.612f, 4.0f)
                lineTo(4.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(22.153f, 10.0f)
                lineTo(3.0f, 10.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(42.0f)
                lineTo(45.0f, 10.0f)
                horizontalLineToRelative(-6.127f)
                lineTo(36.9f, 4.986f)
                curveToRelative(-0.27f, -0.835f, -1.213f, -1.15f, -2.0f, -0.902f)
                lineToRelative(-0.032f, 0.01f)
                lineToRelative(-0.03f, 0.014f)
                close()
                moveTo(39.265f, 11.0f)
                lineTo(40.84f, 15.0f)
                lineTo(44.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(44.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(-6.0f)
                lineTo(26.5f, 35.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 0.0f, -13.0f)
                lineTo(44.0f, 22.0f)
                close()
                moveTo(26.5f, 34.0f)
                lineTo(44.0f, 34.0f)
                lineTo(44.0f, 23.0f)
                lineTo(26.5f, 23.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 11.0f)
                moveToRelative(0.0f, -7.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                moveTo(24.0f, 28.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
            }
        }
            .build()
        return _walletLarge!!
    }

private var _walletLarge: ImageVector? = null
