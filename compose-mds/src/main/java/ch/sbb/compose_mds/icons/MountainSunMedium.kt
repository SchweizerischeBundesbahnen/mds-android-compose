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
                moveTo(10.5f, 10.251f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 4.75f, 4.75f)
                quadToRelative(-0.002f, 0.577f, -0.135f, 1.115f)
                lineToRelative(-1.235f, -1.441f)
                lineToRelative(-0.462f, -0.539f)
                lineToRelative(-0.353f, 0.616f)
                lineToRelative(-2.851f, 4.99f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 0.286f, -9.491f)
                moveToRelative(-0.829f, 10.44f)
                arcToRelative(5.751f, 5.751f, 0.0f, false, true, 0.829f, -11.44f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, true, 5.75f, 5.75f)
                curveToRelative(0.0f, 0.71f, -0.134f, 1.386f, -0.368f, 2.01f)
                lineToRelative(0.754f, 0.88f)
                lineToRelative(3.943f, -6.16f)
                lineToRelative(0.45f, -0.703f)
                lineToRelative(0.407f, 0.728f)
                lineToRelative(10.5f, 18.75f)
                lineToRelative(0.417f, 0.744f)
                lineTo(3.64f, 31.25f)
                lineToRelative(0.426f, -0.748f)
                close()
                moveTo(8.727f, 30.251f)
                lineTo(16.073f, 18.771f)
                lineTo(13.582f, 15.864f)
                lineTo(5.362f, 30.25f)
                close()
                moveTo(30.647f, 30.251f)
                lineTo(9.912f, 30.251f)
                lineToRelative(6.49f, -10.141f)
                lineToRelative(1.498f, 1.498f)
                lineToRelative(3.0f, -1.5f)
                lineToRelative(1.534f, 1.535f)
                lineToRelative(0.34f, -0.226f)
                lineToRelative(2.135f, -1.41f)
                close()
                moveTo(22.776f, 21.417f)
                lineTo(22.5f, 21.0f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(18.098f, 20.392f)
                lineTo(16.954f, 19.248f)
                lineTo(20.971f, 12.972f)
                lineTo(24.421f, 19.132f)
                lineTo(22.564f, 20.357f)
                lineTo(21.098f, 18.892f)
                close()
            }
        }
        .build()
        return _mountainSunMedium!!
    }

private var _mountainSunMedium: ImageVector? = null
