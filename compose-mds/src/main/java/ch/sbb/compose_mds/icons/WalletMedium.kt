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

public val SBBIcons.WalletMedium: ImageVector
    get() {
        if (_walletMedium != null) {
            return _walletMedium!!
        }
        _walletMedium = Builder(name = "WalletMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.75f, 7.75f)
                horizontalLineToRelative(26.5f)
                verticalLineToRelative(20.5f)
                lineTo(4.75f, 28.25f)
                lineTo(4.75f, 7.75f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(-5.0f)
                lineTo(19.5f, 22.25f)
                curveToRelative(-1.384f, 0.0f, -2.46f, -0.524f, -3.183f, -1.34f)
                curveToRelative(-0.715f, -0.805f, -1.062f, -1.866f, -1.062f, -2.91f)
                reflectiveCurveToRelative(0.347f, -2.104f, 1.062f, -2.91f)
                curveToRelative(0.724f, -0.815f, 1.799f, -1.34f, 3.183f, -1.34f)
                horizontalLineToRelative(10.75f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(19.5f, 14.75f)
                horizontalLineToRelative(10.75f)
                verticalLineToRelative(6.5f)
                lineTo(19.5f, 21.25f)
                curveToRelative(-1.113f, 0.0f, -1.91f, -0.412f, -2.435f, -1.003f)
                curveToRelative(-0.533f, -0.6f, -0.81f, -1.416f, -0.81f, -2.247f)
                curveToRelative(0.0f, -0.83f, 0.277f, -1.645f, 0.81f, -2.246f)
                curveToRelative(0.525f, -0.591f, 1.322f, -1.004f, 2.435f, -1.004f)
                moveTo(19.25f, 18.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveToRelative(0.25f, -1.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
            }
        }
        .build()
        return _walletMedium!!
    }

private var _walletMedium: ImageVector? = null
