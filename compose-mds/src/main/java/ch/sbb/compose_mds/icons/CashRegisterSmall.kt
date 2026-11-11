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

public val SBBIcons.CashRegisterSmall: ImageVector
    get() {
        if (_cashRegisterSmall != null) {
            return _cashRegisterSmall!!
        }
        _cashRegisterSmall = Builder(name = "CashRegisterSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.309f, 2.0f)
                lineToRelative(-0.362f, 0.724f)
                lineTo(10.0f, 6.618f)
                verticalLineToRelative(1.395f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 18.987f, 17.0f)
                lineTo(22.0f, 17.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 2.0f)
                close()
                moveTo(3.0f, 7.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 8.485f, 8.0f)
                lineTo(16.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 17.0f)
                close()
                moveTo(9.191f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(7.691f)
                close()
                moveTo(13.0f, 17.5f)
                arcToRelative(0.499f, 0.499f, 0.0f, true, false, -0.998f, -0.002f)
                arcToRelative(0.499f, 0.499f, 0.0f, false, false, 0.998f, 0.002f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.854f, -0.647f)
                lineTo(8.88f, 14.586f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.707f, -0.707f)
                lineToRelative(2.267f, 2.267f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 17.5f)
                moveTo(7.5f, 11.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.001f, 3.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 11.0f)
                moveToRelative(12.978f, 3.037f)
                lineToRelative(-0.94f, 0.341f)
                lineToRelative(-0.342f, -0.939f)
                lineToRelative(0.94f, -0.342f)
                close()
                moveTo(18.844f, 12.683f)
                lineTo(19.709f, 12.183f)
                lineTo(19.209f, 11.317f)
                lineTo(18.344f, 11.817f)
                close()
                moveTo(18.631f, 10.491f)
                lineTo(17.866f, 11.133f)
                lineTo(17.223f, 10.368f)
                lineTo(17.988f, 9.725f)
                close()
                moveTo(16.634f, 9.779f)
                lineTo(17.276f, 9.012f)
                lineTo(16.509f, 8.369f)
                lineTo(15.866f, 9.135f)
                close()
            }
        }
        .build()
        return _cashRegisterSmall!!
    }

private var _cashRegisterSmall: ImageVector? = null
