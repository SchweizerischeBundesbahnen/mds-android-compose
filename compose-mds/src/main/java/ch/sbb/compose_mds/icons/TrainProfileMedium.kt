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

public val SBBIcons.TrainProfileMedium: ImageVector
    get() {
        if (_trainProfileMedium != null) {
            return _trainProfileMedium!!
        }
        _trainProfileMedium = Builder(name = "TrainProfileMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(15.277f, 4.834f)
                lineToRelative(5.124f, 3.416f)
                lineToRelative(-3.748f, 2.5f)
                lineTo(21.0f, 10.75f)
                curveToRelative(3.166f, 0.0f, 5.826f, 2.04f, 6.815f, 4.861f)
                lineToRelative(0.006f, 0.016f)
                lineToRelative(0.002f, 0.009f)
                horizontalLineToRelative(0.001f)
                lineToRelative(3.152f, 8.69f)
                curveToRelative(0.167f, 0.35f, 0.274f, 0.745f, 0.274f, 1.173f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                horizontalLineToRelative(-3.285f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.016f, 2.0f)
                lineTo(33.0f, 30.249f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 31.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.801f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.016f, -2.0f)
                lineTo(3.0f, 28.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(25.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.75f, -1.75f)
                curveToRelative(0.0f, -0.27f, -0.07f, -0.529f, -0.189f, -0.77f)
                lineToRelative(-0.011f, -0.025f)
                lineToRelative(-0.01f, -0.026f)
                lineToRelative(0.47f, -0.17f)
                lineToRelative(0.002f, -0.002f)
                lineToRelative(-0.472f, 0.172f)
                lineToRelative(-0.881f, -2.43f)
                lineTo(19.75f, 22.248f)
                verticalLineToRelative(-6.997f)
                horizontalLineToRelative(6.833f)
                curveToRelative(-1.016f, -2.073f, -3.126f, -3.502f, -5.583f, -3.502f)
                lineTo(3.0f, 11.749f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.348f)
                lineToRelative(-3.75f, -2.5f)
                lineToRelative(5.125f, -3.415f)
                lineToRelative(0.277f, -0.185f)
                close()
                moveTo(26.983f, 16.25f)
                lineTo(20.75f, 16.25f)
                verticalLineToRelative(4.998f)
                horizontalLineToRelative(8.046f)
                close()
                moveTo(18.285f, 28.248f)
                curveToRelative(0.112f, 0.779f, 0.48f, 1.475f, 1.016f, 2.0f)
                lineTo(10.7f, 30.248f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.015f, -2.0f)
                close()
                moveTo(5.8f, 28.248f)
                horizontalLineToRelative(4.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, 2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.45f, -2.0f)
                moveToRelative(13.5f, 0.0f)
                curveToRelative(0.232f, 1.14f, 1.241f, 2.0f, 2.45f, 2.0f)
                reflectiveCurveToRelative(2.218f, -0.86f, 2.45f, -2.0f)
                close()
                moveTo(11.401f, 8.248f)
                lineTo(15.0f, 10.65f)
                lineToRelative(3.599f, -2.4f)
                lineTo(15.0f, 5.85f)
                close()
                moveTo(17.75f, 15.248f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(11.75f, 21.248f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(8.75f, 22.248f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 15.248f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 21.248f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _trainProfileMedium!!
    }

private var _trainProfileMedium: ImageVector? = null
