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

public val SBBIcons.MountainMinusMedium: ImageVector
    get() {
        if (_mountainMinusMedium != null) {
            return _mountainMinusMedium!!
        }
        _mountainMinusMedium = Builder(name = "MountainMinusMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.686f, 7.255f)
                lineToRelative(11.85f, 21.065f)
                lineToRelative(1.27f, 2.178f)
                lineToRelative(0.44f, 0.752f)
                lineTo(3.254f, 31.25f)
                lineToRelative(0.438f, -0.752f)
                lineTo(7.5f, 23.973f)
                lineToRelative(9.314f, -16.716f)
                lineToRelative(0.434f, -0.78f)
                close()
                moveTo(9.294f, 22.808f)
                lineToRelative(7.958f, -14.285f)
                lineToRelative(9.792f, 17.406f)
                lineToRelative(-8.678f, -8.224f)
                lineToRelative(-0.278f, -0.263f)
                lineToRelative(-0.326f, 0.2f)
                close()
                moveTo(28.707f, 28.883f)
                lineTo(17.955f, 18.694f)
                lineTo(8.3f, 24.586f)
                lineTo(4.995f, 30.25f)
                horizontalLineToRelative(24.51f)
                close()
                moveTo(31.507f, 9.253f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.598f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _mountainMinusMedium!!
    }

private var _mountainMinusMedium: ImageVector? = null
