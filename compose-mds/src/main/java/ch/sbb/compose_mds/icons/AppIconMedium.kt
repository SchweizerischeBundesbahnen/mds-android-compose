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

public val SBBIcons.AppIconMedium: ImageVector
    get() {
        if (_appIconMedium != null) {
            return _appIconMedium!!
        }
        _appIconMedium = Builder(
            name = "AppIconMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(4.25f, 9.54f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, true, 5.289f, -5.29f)
                horizontalLineToRelative(16.923f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, true, 5.288f, 5.29f)
                verticalLineToRelative(16.92f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, true, -5.288f, 5.29f)
                lineTo(9.539f, 31.75f)
                arcToRelative(5.29f, 5.29f, 0.0f, false, true, -5.289f, -5.29f)
                close()
                moveTo(9.539f, 3.25f)
                arcTo(6.29f, 6.29f, 0.0f, false, false, 3.25f, 9.54f)
                verticalLineToRelative(16.92f)
                arcToRelative(6.29f, 6.29f, 0.0f, false, false, 6.289f, 6.29f)
                horizontalLineToRelative(16.923f)
                arcToRelative(6.29f, 6.29f, 0.0f, false, false, 6.288f, -6.29f)
                lineTo(32.75f, 9.54f)
                arcToRelative(6.29f, 6.29f, 0.0f, false, false, -6.288f, -6.29f)
                close()
                moveTo(23.424f, 16.977f)
                lineTo(19.896f, 13.5f)
                horizontalLineToRelative(2.622f)
                lineTo(27.0f, 18.0f)
                lineToRelative(-4.482f, 4.5f)
                horizontalLineToRelative(-2.622f)
                lineToRelative(3.528f, -3.453f)
                horizontalLineToRelative(-4.386f)
                lineTo(19.038f, 22.5f)
                horizontalLineToRelative(-2.074f)
                verticalLineToRelative(-3.453f)
                lineTo(12.6f, 19.047f)
                lineTo(16.13f, 22.5f)
                horizontalLineToRelative(-2.623f)
                lineTo(9.0f, 18.0f)
                lineToRelative(4.506f, -4.5f)
                horizontalLineToRelative(2.623f)
                lineToRelative(-3.528f, 3.477f)
                horizontalLineToRelative(4.363f)
                lineTo(16.964f, 13.5f)
                horizontalLineToRelative(2.074f)
                verticalLineToRelative(3.477f)
                close()
            }
        }
            .build()
        return _appIconMedium!!
    }

private var _appIconMedium: ImageVector? = null
