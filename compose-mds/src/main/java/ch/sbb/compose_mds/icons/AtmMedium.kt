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

public val SBBIcons.AtmMedium: ImageVector
    get() {
        if (_atmMedium != null) {
            return _atmMedium!!
        }
        _atmMedium = Builder(
            name = "AtmMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(30.25f, 3.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                lineTo(9.25f, 32.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-16.5f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                close()
                moveTo(8.75f, 31.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(17.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-21.0f)
                horizontalLineToRelative(-3.509f)
                quadToRelative(0.008f, 0.124f, 0.009f, 0.25f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, -11.5f, 0.0f)
                quadToRelative(0.002f, -0.126f, 0.009f, -0.25f)
                lineTo(8.75f, 10.25f)
                close()
                moveTo(13.25f, 10.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, 9.5f, 0.0f)
                quadToRelative(-0.002f, -0.126f, -0.009f, -0.25f)
                lineTo(13.26f, 10.25f)
                quadToRelative(-0.008f, 0.124f, -0.009f, 0.25f)
                moveToRelative(-7.5f, -6.25f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.5f)
                lineTo(6.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-6.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
            }
        }
            .build()
        return _atmMedium!!
    }

private var _atmMedium: ImageVector? = null
