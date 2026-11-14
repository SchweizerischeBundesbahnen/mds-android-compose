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

public val SBBIcons.StreetLocationPinSmall: ImageVector
    get() {
        if (_streetLocationPinSmall != null) {
            return _streetLocationPinSmall!!
        }
        _streetLocationPinSmall = Builder(name = "StreetLocationPinSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.305f, 2.77f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, -1.788f, -0.81f)
                horizontalLineToRelative(-0.034f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, -2.482f, 2.634f)
                lineTo(9.0f, 4.594f)
                curveToRelative(0.005f, 0.44f, 0.125f, 0.872f, 0.35f, 1.25f)
                lineToRelative(0.528f, -0.313f)
                lineToRelative(-0.098f, 0.059f)
                lineToRelative(-0.43f, 0.256f)
                lineToRelative(1.73f, 2.91f)
                lineToRelative(0.43f, 0.724f)
                lineToRelative(0.43f, -0.726f)
                lineToRelative(1.72f, -2.91f)
                lineToRelative(0.002f, -0.003f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 4.59f)
                lineToRelative(-0.001f, -0.001f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, -0.694f, -1.82f)
                moveToRelative(-0.062f, 2.828f)
                lineToRelative(-0.06f, -0.035f)
                lineToRelative(0.48f, 0.278f)
                close()
                moveTo(11.94f, 8.754f)
                lineToRelative(-0.43f, -0.254f)
                close()
                moveTo(10.425f, 3.454f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, true, 1.075f, -0.493f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, true, 1.497f, 1.459f)
                lineToRelative(0.003f, 0.155f)
                verticalLineToRelative(0.014f)
                curveToRelative(0.0f, 0.263f, -0.07f, 0.522f, -0.202f, 0.75f)
                lineToRelative(-1.29f, 2.18f)
                lineToRelative(-1.299f, -2.185f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 4.585f)
                verticalLineToRelative(-0.01f)
                lineToRelative(0.003f, -0.155f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, true, 0.422f, -0.966f)
                moveTo(9.12f, 10.0f)
                lineTo(6.488f, 22.106f)
                lineToRelative(-0.976f, -0.213f)
                lineTo(7.88f, 11.0f)
                lineTo(2.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 11.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.12f)
                lineToRelative(2.632f, 12.106f)
                lineToRelative(0.976f, -0.213f)
                lineTo(15.12f, 11.0f)
                close()
                moveTo(12.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _streetLocationPinSmall!!
    }

private var _streetLocationPinSmall: ImageVector? = null
