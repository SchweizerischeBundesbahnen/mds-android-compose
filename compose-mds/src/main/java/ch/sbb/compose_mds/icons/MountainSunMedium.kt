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

public val SBBIcons.MountainSunMedium: ImageVector
    get() {
        if (_mountainSunMedium != null) {
            return _mountainSunMedium!!
        }
        _mountainSunMedium = Builder(name = "MountainSunMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.5f, 9.251f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -0.828f, 11.44f)
                lineToRelative(-5.606f, 9.811f)
                lineToRelative(-0.428f, 0.748f)
                horizontalLineToRelative(28.715f)
                lineToRelative(-0.417f, -0.744f)
                lineToRelative(-10.5f, -18.75f)
                lineToRelative(-0.407f, -0.728f)
                lineToRelative(-0.45f, 0.703f)
                lineToRelative(-3.943f, 6.16f)
                lineToRelative(-0.754f, -0.88f)
                curveToRelative(0.234f, -0.624f, 0.368f, -1.3f, 0.368f, -2.01f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -5.75f, -5.75f)
                moveToRelative(4.615f, 6.865f)
                quadToRelative(0.133f, -0.538f, 0.135f, -1.115f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, false, -5.036f, 4.742f)
                lineToRelative(2.852f, -4.99f)
                lineToRelative(0.352f, -0.617f)
                lineToRelative(0.462f, 0.539f)
                close()
                moveTo(8.726f, 30.25f)
                lineToRelative(7.347f, -11.48f)
                lineToRelative(-2.49f, -2.906f)
                lineTo(5.361f, 30.25f)
                close()
                moveTo(30.647f, 30.25f)
                lineTo(9.914f, 30.25f)
                lineToRelative(6.49f, -10.14f)
                lineToRelative(1.242f, 1.244f)
                lineToRelative(0.255f, 0.254f)
                lineToRelative(0.323f, -0.16f)
                lineToRelative(2.677f, -1.34f)
                lineToRelative(1.245f, 1.245f)
                lineToRelative(0.289f, 0.29f)
                lineToRelative(0.34f, -0.226f)
                lineToRelative(2.136f, -1.41f)
                close()
                moveTo(20.971f, 12.973f)
                lineTo(16.955f, 19.248f)
                lineTo(18.099f, 20.392f)
                lineTo(20.776f, 19.052f)
                lineTo(21.099f, 18.892f)
                lineTo(21.354f, 19.146f)
                lineTo(22.564f, 20.358f)
                lineTo(24.421f, 19.132f)
                close()
            }
        }
        .build()
        return _mountainSunMedium!!
    }

private var _mountainSunMedium: ImageVector? = null
