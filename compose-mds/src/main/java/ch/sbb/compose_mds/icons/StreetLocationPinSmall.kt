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
                moveTo(11.517f, 1.96f)
                horizontalLineToRelative(-0.034f)
                arcTo(2.57f, 2.57f, 0.0f, false, false, 9.0f, 4.6f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.35f, 1.245f)
                lineToRelative(1.73f, 2.91f)
                lineToRelative(0.431f, 0.726f)
                lineToRelative(0.43f, -0.727f)
                lineToRelative(1.72f, -2.91f)
                lineToRelative(0.001f, -0.003f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.0f, 4.598f)
                arcToRelative(2.57f, 2.57f, 0.0f, false, false, -2.483f, -2.638f)
                moveToRelative(-1.092f, 1.494f)
                arcTo(1.57f, 1.57f, 0.0f, false, true, 11.5f, 2.96f)
                arcTo(1.57f, 1.57f, 0.0f, false, true, 13.0f, 4.575f)
                verticalLineToRelative(0.014f)
                curveToRelative(0.0f, 0.263f, -0.07f, 0.521f, -0.202f, 0.748f)
                lineToRelative(-1.29f, 2.182f)
                lineToRelative(-1.298f, -2.184f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -0.21f, -0.75f)
                verticalLineToRelative(-0.01f)
                arcToRelative(1.57f, 1.57f, 0.0f, false, true, 0.425f, -1.12f)
                moveTo(2.0f, 10.0f)
                horizontalLineToRelative(7.12f)
                lineToRelative(-0.131f, 0.606f)
                lineToRelative(-2.5f, 11.5f)
                lineToRelative(-0.978f, -0.212f)
                lineTo(7.88f, 11.0f)
                lineTo(2.0f, 11.0f)
                close()
                moveTo(14.5f, 10.0f)
                horizontalLineToRelative(-0.62f)
                lineToRelative(0.131f, 0.606f)
                lineToRelative(2.5f, 11.5f)
                lineToRelative(0.978f, -0.212f)
                lineTo(15.12f, 11.0f)
                lineTo(21.0f, 11.0f)
                verticalLineToRelative(-1.0f)
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
