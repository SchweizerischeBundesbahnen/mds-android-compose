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

public val SBBIcons.WalletSmall: ImageVector
    get() {
        if (_walletSmall != null) {
            return _walletSmall!!
        }
        _walletSmall = Builder(name = "WalletSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 5.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(14.0f)
                lineTo(3.0f, 19.0f)
                lineTo(3.0f, 5.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.968f, 0.0f, -1.731f, -0.368f, -2.247f, -0.95f)
                curveToRelative(-0.507f, -0.57f, -0.75f, -1.318f, -0.75f, -2.05f)
                reflectiveCurveToRelative(0.243f, -1.479f, 0.75f, -2.05f)
                curveTo(11.27f, 9.369f, 12.032f, 9.0f, 13.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                lineTo(20.0f, 6.0f)
                close()
                moveTo(13.0f, 10.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-0.696f, 0.0f, -1.182f, -0.256f, -1.499f, -0.613f)
                curveToRelative(-0.325f, -0.366f, -0.498f, -0.868f, -0.498f, -1.387f)
                curveToRelative(0.0f, -0.518f, 0.173f, -1.02f, 0.498f, -1.387f)
                curveToRelative(0.317f, -0.356f, 0.803f, -0.613f, 1.499f, -0.613f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
            }
        }
        .build()
        return _walletSmall!!
    }

private var _walletSmall: ImageVector? = null
