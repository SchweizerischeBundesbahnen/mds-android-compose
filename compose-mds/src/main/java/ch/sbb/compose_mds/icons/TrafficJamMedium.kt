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

public val SBBIcons.TrafficJamMedium: ImageVector
    get() {
        if (_trafficJamMedium != null) {
            return _trafficJamMedium!!
        }
        _trafficJamMedium = Builder(
            name = "TrafficJamMedium",
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
                moveTo(7.56f, 3.25f)
                curveToRelative(-0.66f, 0.0f, -1.298f, 0.336f, -1.663f, 0.9f)
                lineTo(3.591f, 7.594f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.25f, 8.7f)
                verticalLineToRelative(4.55f)
                horizontalLineToRelative(3.063f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.874f, 0.0f)
                lineTo(12.0f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.813f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.874f, 0.0f)
                lineTo(4.25f, 12.25f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(17.5f)
                curveToRelative(0.549f, 0.0f, 1.0f, 0.451f, 1.0f, 1.0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0.0f, -1.101f, -0.899f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.293f)
                lineTo(16.54f, 3.831f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -1.419f, -0.581f)
                close()
                moveTo(19.043f, 7.75f)
                lineTo(15.83f, 4.539f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, -0.711f, -0.289f)
                horizontalLineToRelative(-1.87f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(12.25f, 4.25f)
                lineTo(7.56f, 4.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.824f, 0.445f)
                lineToRelative(-0.005f, 0.008f)
                lineTo(4.69f, 7.75f)
                horizontalLineToRelative(7.559f)
                close()
                moveTo(7.25f, 12.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(7.632f, 0.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.663f, -0.9f)
                horizontalLineToRelative(7.575f)
                curveToRelative(0.533f, 0.0f, 1.036f, 0.2f, 1.418f, 0.581f)
                lineToRelative(3.92f, 3.919f)
                horizontalLineToRelative(1.292f)
                curveToRelative(1.101f, 0.0f, 2.0f, 0.899f, 2.0f, 2.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-3.063f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.874f, 0.0f)
                lineTo(19.5f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.313f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.874f, 0.0f)
                horizontalLineToRelative(2.063f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.549f, -0.451f, -1.0f, -1.0f, -1.0f)
                lineTo(13.235f, 17.75f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.8f)
                curveToRelative(0.0f, -0.383f, 0.119f, -0.78f, 0.341f, -1.105f)
                close()
                moveTo(24.832f, 13.539f)
                lineTo(28.042f, 16.75f)
                lineTo(22.25f, 16.75f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(1.87f)
                curveToRelative(0.277f, 0.0f, 0.524f, 0.1f, 0.711f, 0.289f)
                moveToRelative(-8.287f, -0.289f)
                horizontalLineToRelative(4.705f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-7.575f)
                lineToRelative(2.04f, -3.047f)
                lineToRelative(0.006f, -0.008f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, true, 0.824f, -0.445f)
                moveToRelative(11.205f, 7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-20.19f, 0.5f)
                curveToRelative(-0.66f, 0.0f, -1.298f, 0.337f, -1.663f, 0.9f)
                lineToRelative(-2.306f, 3.445f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.25f, 26.7f)
                verticalLineToRelative(4.55f)
                horizontalLineToRelative(3.063f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.874f, 0.0f)
                horizontalLineToRelative(6.626f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.874f, 0.0f)
                horizontalLineToRelative(3.063f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -1.101f, -0.899f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.293f)
                lineToRelative(-3.918f, -3.919f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -1.419f, -0.581f)
                close()
                moveTo(19.042f, 25.75f)
                lineTo(15.83f, 22.539f)
                arcToRelative(0.98f, 0.98f, 0.0f, false, false, -0.711f, -0.289f)
                horizontalLineToRelative(-1.87f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(12.249f, 22.25f)
                lineTo(7.56f, 22.25f)
                arcToRelative(0.99f, 0.99f, 0.0f, false, false, -0.824f, 0.445f)
                lineToRelative(-0.005f, 0.008f)
                lineToRelative(-2.04f, 3.047f)
                horizontalLineToRelative(7.559f)
                close()
                moveTo(4.249f, 26.75f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2.063f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.874f, 0.0f)
                horizontalLineToRelative(6.626f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.874f, 0.0f)
                horizontalLineToRelative(2.063f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0.0f, -0.549f, -0.451f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(7.249f, 30.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(10.5f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
            }
        }
            .build()
        return _trafficJamMedium!!
    }

private var _trafficJamMedium: ImageVector? = null
