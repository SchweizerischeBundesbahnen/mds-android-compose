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

public val SBBIcons.WineCheeseLarge: ImageVector
    get() {
        if (_wineCheeseLarge != null) {
            return _wineCheeseLarge!!
        }
        _wineCheeseLarge = Builder(
            name = "WineCheeseLarge",
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
                pathFillType = NonZero,
            ) {
                moveTo(15.0f, 14.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                lineTo(19.0f, 23.0f)
                lineTo(7.0f, 23.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 33.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 43.0f)
                lineTo(6.0f, 17.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 9.5f, 14.0f)
                horizontalLineToRelative(0.5f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(31.0f, 27.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 5.0f, 0.0f)
                lineTo(36.0f, 26.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(5.34f)
                lineToRelative(-0.248f, 0.146f)
                curveTo(41.705f, 32.096f, 41.0f, 33.214f, 41.0f, 34.5f)
                reflectiveCurveToRelative(0.705f, 2.403f, 1.752f, 3.014f)
                lineToRelative(0.248f, 0.145f)
                lineTo(43.0f, 43.0f)
                lineTo(18.0f, 43.0f)
                lineTo(18.0f, 26.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(19.0f, 42.0f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(-3.778f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, true, -2.0f, -3.722f)
                curveToRelative(0.0f, -1.56f, 0.803f, -2.918f, 2.0f, -3.723f)
                lineTo(42.0f, 27.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -7.0f, 0.0f)
                lineTo(30.0f, 27.0f)
                lineTo(19.0f, 27.0f)
                close()
                moveTo(34.5f, 34.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.001f, 4.999f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 34.5f, 34.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.001f, 2.999f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 34.5f, 35.0f)
                moveToRelative(-9.0f, -5.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.0f, -7.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(13.0f, -1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveTo(16.0f, 28.0f)
                lineTo(9.0f, 28.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(11.0f, 15.0f)
                lineTo(9.5f, 15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 7.0f, 17.5f)
                lineTo(7.0f, 22.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                lineTo(14.0f, 15.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
            .build()
        return _wineCheeseLarge!!
    }

private var _wineCheeseLarge: ImageVector? = null
