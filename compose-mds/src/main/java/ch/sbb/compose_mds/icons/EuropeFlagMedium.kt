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

public val SBBIcons.EuropeFlagMedium: ImageVector
    get() {
        if (_europeFlagMedium != null) {
            return _europeFlagMedium!!
        }
        _europeFlagMedium = Builder(
            name = "EuropeFlagMedium",
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
                moveTo(18.0f, 4.25f)
                curveTo(10.406f, 4.25f, 4.25f, 10.406f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(31.75f, 25.594f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 4.25f, 18.0f, 4.25f)
                moveTo(3.25f, 18.0f)
                curveTo(3.25f, 9.854f, 9.854f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(32.75f, 9.854f, 32.75f, 18.0f)
                reflectiveCurveTo(26.146f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(3.25f, 26.146f, 3.25f, 18.0f)
                moveToRelative(12.73f, -8.565f)
                lineToRelative(1.24f, 0.413f)
                lineToRelative(-0.815f, 1.224f)
                lineToRelative(0.832f, 0.555f)
                lineToRelative(0.763f, -1.145f)
                lineToRelative(0.762f, 1.145f)
                lineToRelative(0.833f, -0.555f)
                lineToRelative(-0.816f, -1.224f)
                lineToRelative(1.24f, -0.413f)
                lineToRelative(-0.316f, -0.949f)
                lineToRelative(-1.203f, 0.401f)
                lineTo(18.5f, 7.684f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.203f)
                lineToRelative(-1.204f, -0.4f)
                close()
                moveTo(23.22f, 12.315f)
                lineTo(21.98f, 11.901f)
                lineTo(22.296f, 10.952f)
                lineTo(23.5f, 11.353f)
                lineTo(23.5f, 10.15f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.203f)
                lineToRelative(1.203f, -0.401f)
                lineToRelative(0.316f, 0.949f)
                lineToRelative(-1.24f, 0.413f)
                lineToRelative(0.816f, 1.224f)
                lineToRelative(-0.832f, 0.555f)
                lineTo(24.0f, 12.948f)
                lineToRelative(-0.763f, 1.145f)
                lineToRelative(-0.832f, -0.555f)
                close()
                moveTo(24.23f, 17.854f)
                lineTo(25.47f, 18.267f)
                lineTo(24.655f, 19.491f)
                lineTo(25.487f, 20.046f)
                lineTo(26.25f, 18.901f)
                lineTo(27.013f, 20.046f)
                lineTo(27.845f, 19.491f)
                lineTo(27.029f, 18.267f)
                lineTo(28.269f, 17.854f)
                lineTo(27.953f, 16.905f)
                lineTo(26.75f, 17.306f)
                verticalLineToRelative(-1.203f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.203f)
                lineToRelative(-1.204f, -0.4f)
                close()
                moveTo(23.22f, 24.22f)
                lineTo(21.98f, 23.807f)
                lineTo(22.296f, 22.858f)
                lineTo(23.5f, 23.259f)
                verticalLineToRelative(-1.203f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.203f)
                lineToRelative(1.203f, -0.4f)
                lineToRelative(0.316f, 0.948f)
                lineToRelative(-1.24f, 0.413f)
                lineToRelative(0.816f, 1.224f)
                lineToRelative(-0.832f, 0.555f)
                lineTo(24.0f, 24.855f)
                lineToRelative(-0.763f, 1.144f)
                lineToRelative(-0.832f, -0.555f)
                close()
                moveTo(15.98f, 26.273f)
                lineTo(17.22f, 26.686f)
                lineTo(16.405f, 27.91f)
                lineTo(17.237f, 28.465f)
                lineTo(18.0f, 27.32f)
                lineToRelative(0.762f, 1.145f)
                lineToRelative(0.833f, -0.555f)
                lineToRelative(-0.816f, -1.224f)
                lineToRelative(1.24f, -0.413f)
                lineToRelative(-0.316f, -0.949f)
                lineToRelative(-1.203f, 0.401f)
                verticalLineToRelative(-1.203f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.203f)
                lineToRelative(-1.204f, -0.4f)
                close()
                moveTo(11.22f, 24.22f)
                lineTo(9.98f, 23.807f)
                lineTo(10.296f, 22.858f)
                lineTo(11.5f, 23.259f)
                verticalLineToRelative(-1.203f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.203f)
                lineToRelative(1.203f, -0.4f)
                lineToRelative(0.316f, 0.948f)
                lineToRelative(-1.24f, 0.413f)
                lineToRelative(0.816f, 1.224f)
                lineToRelative(-0.833f, 0.555f)
                lineTo(12.0f, 24.855f)
                lineToRelative(-0.763f, 1.144f)
                lineToRelative(-0.832f, -0.555f)
                close()
                moveTo(7.73f, 17.854f)
                lineTo(8.97f, 18.267f)
                lineTo(8.155f, 19.491f)
                lineTo(8.987f, 20.046f)
                lineTo(9.75f, 18.901f)
                lineTo(10.512f, 20.046f)
                lineTo(11.345f, 19.491f)
                lineTo(10.529f, 18.267f)
                lineTo(11.769f, 17.854f)
                lineTo(11.453f, 16.905f)
                lineTo(10.25f, 17.306f)
                verticalLineToRelative(-1.203f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.203f)
                lineToRelative(-1.204f, -0.4f)
                close()
                moveTo(11.22f, 12.314f)
                lineTo(9.98f, 11.901f)
                lineTo(10.296f, 10.952f)
                lineTo(11.5f, 11.353f)
                lineTo(11.5f, 10.15f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.203f)
                lineToRelative(1.203f, -0.401f)
                lineToRelative(0.316f, 0.949f)
                lineToRelative(-1.24f, 0.413f)
                lineToRelative(0.816f, 1.224f)
                lineToRelative(-0.833f, 0.555f)
                lineTo(12.0f, 12.948f)
                lineToRelative(-0.763f, 1.145f)
                lineToRelative(-0.832f, -0.555f)
                close()
            }
        }
            .build()
        return _europeFlagMedium!!
    }

private var _europeFlagMedium: ImageVector? = null
