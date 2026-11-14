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

public val SBBIcons.BikeTrailerMedium: ImageVector
    get() {
        if (_bikeTrailerMedium != null) {
            return _bikeTrailerMedium!!
        }
        _bikeTrailerMedium = Builder(name = "BikeTrailerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(28.924f, 13.015f)
                lineToRelative(0.478f, -0.765f)
                lineTo(25.5f, 12.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.099f)
                lineToRelative(-1.25f, 2.0f)
                horizontalLineToRelative(-4.96f)
                lineToRelative(-0.114f, 0.342f)
                lineToRelative(-0.404f, 1.213f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, -4.085f, 2.945f)
                lineTo(13.25f, 19.75f)
                verticalLineToRelative(-1.23f)
                lineToRelative(-0.175f, -0.15f)
                lineToRelative(-5.25f, -4.5f)
                lineToRelative(-0.14f, -0.12f)
                lineTo(3.25f, 13.75f)
                lineTo(3.25f, 21.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 5.2f, 1.25f)
                horizontalLineToRelative(4.8f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3.536f)
                arcToRelative(3.505f, 3.505f, 0.0f, false, false, 3.464f, 3.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.93f, -3.128f)
                lineToRelative(0.29f, -0.872f)
                horizontalLineToRelative(4.228f)
                lineToRelative(0.735f, 1.26f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.323f, 2.74f)
                curveToRelative(0.0f, 1.93f, 1.569f, 3.5f, 3.5f, 3.5f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                arcToRelative(3.503f, 3.503f, 0.0f, false, false, -4.814f, -3.244f)
                lineToRelative(-0.727f, -1.247f)
                close()
                moveTo(8.739f, 21.25f)
                quadToRelative(0.01f, -0.123f, 0.011f, -0.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -4.5f, -2.121f)
                lineTo(4.25f, 14.75f)
                horizontalLineToRelative(3.065f)
                lineToRelative(4.935f, 4.23f)
                verticalLineToRelative(2.27f)
                close()
                moveTo(4.25f, 21.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -3.5f, 0.0f)
                moveToRelative(25.432f, -1.002f)
                lineToRelative(-1.235f, -2.116f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, true, 3.303f, 2.368f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, true, -2.5f, -2.5f)
                curveToRelative(0.0f, -0.74f, 0.323f, -1.405f, 0.835f, -1.863f)
                lineToRelative(1.233f, 2.115f)
                close()
                moveTo(21.499f, 18.085f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.251f, 2.165f)
                curveToRelative(0.0f, 1.378f, -1.122f, 2.5f, -2.5f, 2.5f)
                arcToRelative(2.505f, 2.505f, 0.0f, false, true, -2.45f, -2.0f)
                horizontalLineToRelative(2.81f)
                lineToRelative(0.115f, -0.342f)
                close()
                moveTo(17.8f, 19.75f)
                arcToRelative(2.505f, 2.505f, 0.0f, false, true, 2.75f, -1.982f)
                lineToRelative(-0.66f, 1.982f)
                close()
                moveTo(22.5f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _bikeTrailerMedium!!
    }

private var _bikeTrailerMedium: ImageVector? = null
