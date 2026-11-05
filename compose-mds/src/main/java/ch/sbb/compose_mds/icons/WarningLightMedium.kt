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

public val SBBIcons.WarningLightMedium: ImageVector
    get() {
        if (_warningLightMedium != null) {
            return _warningLightMedium!!
        }
        _warningLightMedium = Builder(
            name = "WarningLightMedium",
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
                moveTo(19.25f, 7.5f)
                lineTo(19.25f, 3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(13.854f, 8.646f)
                lineTo(10.854f, 5.646f)
                lineTo(10.147f, 6.353f)
                lineTo(13.147f, 9.353f)
                close()
                moveTo(27.354f, 6.353f)
                lineTo(24.354f, 9.353f)
                lineTo(23.647f, 8.646f)
                lineTo(26.647f, 5.646f)
                close()
                moveTo(13.25f, 17.25f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 11.0f, 0.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-11.0f)
                close()
                moveTo(12.25f, 25.75f)
                verticalLineToRelative(-8.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 13.0f, 0.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2.86f)
                lineToRelative(0.115f, 0.341f)
                lineToRelative(1.5f, 4.5f)
                lineToRelative(0.22f, 0.659f)
                lineTo(7.556f, 31.25f)
                lineToRelative(0.219f, -0.659f)
                lineToRelative(1.5f, -4.5f)
                lineToRelative(0.114f, -0.341f)
                horizontalLineToRelative(2.86f)
                moveToRelative(4.0f, -9.25f)
                lineTo(16.249f, 24.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(8.944f, 30.25f)
                lineToRelative(1.167f, -3.5f)
                lineTo(27.39f, 26.75f)
                lineToRelative(1.167f, 3.5f)
                close()
            }
        }
            .build()
        return _warningLightMedium!!
    }

private var _warningLightMedium: ImageVector? = null
