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
                moveTo(2.0f, 2.0f)
                horizontalLineToRelative(10.309f)
                lineToRelative(-0.362f, 0.724f)
                lineTo(10.0f, 6.618f)
                verticalLineToRelative(1.395f)
                arcTo(9.5f, 9.5f, 0.0f, false, true, 18.987f, 17.0f)
                lineTo(22.0f, 17.0f)
                verticalLineToRelative(5.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 2.0f)
                moveToRelative(1.0f, 5.0f)
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
                moveTo(12.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-0.647f, -0.854f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.707f, 0.707f)
                lineTo(8.88f, 14.586f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.707f, -0.707f)
                close()
                moveTo(6.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 12.5f)
                moveToRelative(13.538f, 1.879f)
                lineToRelative(-0.342f, -0.94f)
                lineToRelative(0.94f, -0.342f)
                lineToRelative(0.342f, 0.94f)
                close()
                moveTo(18.343f, 11.817f)
                lineTo(18.843f, 12.683f)
                lineTo(19.709f, 12.183f)
                lineTo(19.209f, 11.317f)
                close()
                moveTo(17.866f, 11.134f)
                lineTo(17.223f, 10.368f)
                lineTo(17.988f, 9.725f)
                lineTo(18.631f, 10.491f)
                close()
                moveTo(15.866f, 9.135f)
                lineTo(16.633f, 9.778f)
                lineTo(17.276f, 9.012f)
                lineTo(16.509f, 8.369f)
                close()
            }
        }
        .build()
        return _cashRegisterSmall!!
    }

private var _cashRegisterSmall: ImageVector? = null
