package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.TelephoneGsmSmall: ImageVector
    get() {
        if (_telephoneGsmSmall != null) {
            return _telephoneGsmSmall!!
        }
        _telephoneGsmSmall = Builder(name = "TelephoneGsmSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 5.5f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 19.5f)
                verticalLineToRelative(-14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 4.0f)
                lineTo(12.0f, 4.0f)
                lineTo(12.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(7.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(10.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                lineTo(8.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(9.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 7.0f)
                lineTo(9.0f, 7.0f)
                close()
            }
        }
        .build()
        return _telephoneGsmSmall!!
    }

private var _telephoneGsmSmall: ImageVector? = null
