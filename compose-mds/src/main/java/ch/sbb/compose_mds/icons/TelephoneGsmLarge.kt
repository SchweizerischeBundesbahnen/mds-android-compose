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

public val SBBIcons.TelephoneGsmLarge: ImageVector
    get() {
        if (_telephoneGsmLarge != null) {
            return _telephoneGsmLarge!!
        }
        _telephoneGsmLarge = Builder(
            name = "TelephoneGsmLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(29.0f, 8.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(28.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-28.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 14.5f, 8.0f)
                lineTo(24.0f, 8.0f)
                lineTo(24.0f, 6.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(14.5f, 9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(28.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-28.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 32.5f, 9.0f)
                close()
                moveTo(20.0f, 37.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(26.0f, 37.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(32.0f, 37.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(20.0f, 33.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(26.0f, 33.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(32.0f, 33.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(20.0f, 29.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(26.0f, 29.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(32.0f, 29.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(31.0f, 25.0f)
                lineTo(16.0f, 25.0f)
                lineTo(16.0f, 12.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(17.0f, 24.0f)
                horizontalLineToRelative(13.0f)
                lineTo(30.0f, 13.0f)
                lineTo(17.0f, 13.0f)
                close()
                moveTo(25.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(28.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
            .build()
        return _telephoneGsmLarge!!
    }

private var _telephoneGsmLarge: ImageVector? = null
