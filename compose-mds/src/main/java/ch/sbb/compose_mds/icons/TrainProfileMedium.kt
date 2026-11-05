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
        _trainProfileMedium = Builder(
            name = "TrainProfileMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveToRelative(15.0f, 4.649f)
                lineToRelative(0.277f, 0.185f)
                lineToRelative(4.5f, 3.0f)
                lineToRelative(0.624f, 0.416f)
                lineToRelative(-0.624f, 0.416f)
                lineToRelative(-3.125f, 2.083f)
                lineTo(21.0f, 10.749f)
                curveToRelative(3.172f, 0.0f, 5.835f, 2.047f, 6.82f, 4.875f)
                lineToRelative(0.001f, 0.003f)
                lineToRelative(0.004f, 0.012f)
                lineToRelative(3.146f, 8.673f)
                curveToRelative(0.17f, 0.353f, 0.279f, 0.754f, 0.279f, 1.187f)
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
                curveToRelative(0.0f, -0.27f, -0.069f, -0.529f, -0.188f, -0.77f)
                lineToRelative(-0.013f, -0.025f)
                lineToRelative(-0.009f, -0.026f)
                lineToRelative(-0.881f, -2.429f)
                lineTo(19.75f, 22.249f)
                verticalLineToRelative(-6.998f)
                horizontalLineToRelative(6.833f)
                curveToRelative(-1.016f, -2.073f, -3.126f, -3.502f, -5.583f, -3.502f)
                lineTo(3.0f, 11.749f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.348f)
                lineToRelative(-3.125f, -2.083f)
                lineToRelative(-0.624f, -0.416f)
                lineToRelative(0.624f, -0.416f)
                lineToRelative(4.5f, -3.0f)
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
                horizontalLineToRelative(-4.9f)
                moveTo(15.0f, 10.65f)
                lineToRelative(3.599f, -2.4f)
                lineTo(15.0f, 5.852f)
                lineTo(11.401f, 8.25f)
                close()
                moveTo(10.75f, 15.25f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(3.0f, 16.25f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 21.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.75f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 15.25f)
                close()
            }
        }
            .build()
        return _trainProfileMedium!!
    }

private var _trainProfileMedium: ImageVector? = null
