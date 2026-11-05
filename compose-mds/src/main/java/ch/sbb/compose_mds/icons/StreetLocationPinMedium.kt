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

public val SBBIcons.StreetLocationPinMedium: ImageVector
    get() {
        if (_streetLocationPinMedium != null) {
            return _streetLocationPinMedium!!
        }
        _streetLocationPinMedium = Builder(name = "StreetLocationPinMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.267f, 3.19f)
                horizontalLineToRelative(-0.034f)
                arcToRelative(3.605f, 3.605f, 0.0f, false, false, -3.483f, 3.705f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.49f, 1.745f)
                lineToRelative(2.595f, 4.365f)
                lineToRelative(0.431f, 0.725f)
                lineToRelative(0.43f, -0.726f)
                lineToRelative(2.58f, -4.365f)
                lineToRelative(0.001f, -0.003f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.473f, -1.743f)
                arcToRelative(3.606f, 3.606f, 0.0f, false, false, -3.483f, -3.703f)
                moveToRelative(-1.812f, 1.82f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 1.795f, -0.82f)
                arcToRelative(2.605f, 2.605f, 0.0f, false, true, 2.5f, 2.68f)
                verticalLineToRelative(0.014f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.337f, 1.248f)
                lineToRelative(-2.15f, 3.637f)
                lineTo(15.1f, 8.13f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.35f, -1.25f)
                lineTo(14.75f, 6.87f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 0.704f, -1.86f)
                moveTo(3.0f, 15.25f)
                horizontalLineToRelative(10.37f)
                lineToRelative(-0.131f, 0.606f)
                lineToRelative(-3.75f, 17.25f)
                lineToRelative(-0.978f, -0.212f)
                lineTo(12.13f, 16.25f)
                lineTo(3.0f, 16.25f)
                close()
                moveTo(21.75f, 15.25f)
                horizontalLineToRelative(-0.62f)
                lineToRelative(0.131f, 0.606f)
                lineToRelative(3.75f, 17.25f)
                lineToRelative(0.978f, -0.212f)
                lineTo(22.37f, 16.25f)
                horizontalLineToRelative(9.13f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(17.75f, 19.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.75f, 25.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(17.75f, 28.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _streetLocationPinMedium!!
    }

private var _streetLocationPinMedium: ImageVector? = null
