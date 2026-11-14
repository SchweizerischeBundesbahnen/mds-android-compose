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
                moveTo(19.774f, 4.326f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -2.508f, -1.136f)
                horizontalLineToRelative(-0.033f)
                arcToRelative(3.606f, 3.606f, 0.0f, false, false, -3.482f, 3.7f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.49f, 1.75f)
                lineToRelative(2.596f, 4.365f)
                lineToRelative(0.431f, 0.726f)
                lineToRelative(0.43f, -0.727f)
                lineToRelative(2.579f, -4.365f)
                lineToRelative(0.003f, -0.003f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 20.75f, 6.9f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -0.976f, -2.574f)
                moveToRelative(-4.32f, 0.684f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 1.796f, -0.819f)
                arcToRelative(2.605f, 2.605f, 0.0f, false, true, 2.5f, 2.68f)
                verticalLineToRelative(0.013f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.335f, 1.246f)
                lineToRelative(-2.152f, 3.64f)
                lineTo(15.1f, 8.13f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.35f, -1.25f)
                verticalLineToRelative(-0.01f)
                lineToRelative(0.004f, -0.257f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 0.7f, -1.603f)
                moveTo(13.37f, 15.25f)
                lineTo(9.488f, 33.106f)
                lineToRelative(-0.976f, -0.212f)
                lineTo(12.13f, 16.25f)
                lineTo(3.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(31.5f, 16.25f)
                verticalLineToRelative(-1.0f)
                lineTo(21.13f, 15.25f)
                lineToRelative(3.882f, 17.856f)
                lineToRelative(0.976f, -0.212f)
                lineTo(22.37f, 16.25f)
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
