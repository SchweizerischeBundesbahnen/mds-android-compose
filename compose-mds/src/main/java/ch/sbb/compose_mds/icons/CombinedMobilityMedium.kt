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

public val SBBIcons.CombinedMobilityMedium: ImageVector
    get() {
        if (_combinedMobilityMedium != null) {
            return _combinedMobilityMedium!!
        }
        _combinedMobilityMedium = Builder(
            name = "CombinedMobilityMedium",
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
                moveTo(18.0f, 3.249f)
                horizontalLineToRelative(6.184f)
                lineToRelative(-0.518f, 0.777f)
                lineToRelative(-2.846f, 4.27f)
                lineToRelative(1.29f, 2.84f)
                lineToRelative(-0.91f, 0.414f)
                lineToRelative(-1.272f, -2.801f)
                horizontalLineToRelative(-7.603f)
                lineToRelative(-0.542f, 1.22f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 2.967f, 5.03f)
                arcTo(5.755f, 5.755f, 0.0f, false, true, 9.0f, 20.749f)
                arcToRelative(5.755f, 5.755f, 0.0f, false, true, -5.75f, -5.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, true, 7.62f, -5.438f)
                lineToRelative(0.673f, -1.515f)
                lineToRelative(0.132f, -0.297f)
                horizontalLineToRelative(8.307f)
                lineToRelative(2.334f, -3.5f)
                lineTo(18.0f, 4.249f)
                close()
                moveTo(8.543f, 14.796f)
                lineToRelative(1.919f, -4.317f)
                arcTo(4.756f, 4.756f, 0.0f, false, false, 4.25f, 15.0f)
                curveToRelative(0.0f, 2.62f, 2.131f, 4.75f, 4.75f, 4.75f)
                reflectiveCurveToRelative(4.75f, -2.13f, 4.75f, -4.75f)
                curveToRelative(0.0f, -1.754f, -0.956f, -3.29f, -2.375f, -4.112f)
                lineToRelative(-1.918f, 4.315f)
                close()
                moveTo(5.646f, 29.646f)
                lineTo(28.146f, 7.146f)
                lineTo(28.854f, 7.853f)
                lineTo(6.354f, 30.353f)
                close()
                moveTo(25.5f, 13.748f)
                lineTo(27.0f, 13.748f)
                curveToRelative(1.348f, 0.0f, 2.44f, 0.313f, 3.188f, 1.063f)
                curveToRelative(0.749f, 0.749f, 1.062f, 1.84f, 1.062f, 3.187f)
                verticalLineToRelative(1.752f)
                lineTo(33.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(11.998f)
                horizontalLineToRelative(-5.498f)
                verticalLineToRelative(-3.0f)
                lineTo(16.25f, 29.748f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-4.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(-6.498f)
                lineTo(18.0f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.285f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, -3.002f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, 3.002f)
                horizontalLineToRelative(2.035f)
                verticalLineToRelative(-3.252f)
                curveToRelative(0.0f, -1.21f, -0.282f, -1.994f, -0.769f, -2.48f)
                curveToRelative(-0.486f, -0.487f, -1.27f, -0.77f, -2.481f, -0.77f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(26.752f, 29.748f)
                horizontalLineToRelative(3.498f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.498f)
                close()
                moveTo(11.75f, 29.748f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(24.75f, 19.248f)
                curveToRelative(1.21f, 0.0f, 2.219f, 0.86f, 2.45f, 2.002f)
                horizontalLineToRelative(-4.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.45f, -2.002f)
                moveToRelative(1.0f, 6.25f)
                arcToRelative(1.251f, 1.251f, 0.0f, false, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(1.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-12.0f, -1.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveToRelative(-0.25f, 1.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
                moveTo(9.313f, 5.749f)
                lineTo(13.5f, 5.749f)
                verticalLineToRelative(-1.0f)
                lineTo(9.313f, 4.749f)
                close()
            }
        }
            .build()
        return _combinedMobilityMedium!!
    }

private var _combinedMobilityMedium: ImageVector? = null
