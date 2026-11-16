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

public val SBBIcons.LockerMedium: ImageVector
    get() {
        if (_lockerMedium != null) {
            return _lockerMedium!!
        }
        _lockerMedium = Builder(name = "LockerMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 6.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 5.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                quadToRelative(-0.001f, 0.524f, -0.145f, 1.0f)
                horizontalLineToRelative(6.892f)
                lineToRelative(1.022f, -1.024f)
                lineToRelative(-0.976f, -0.976f)
                horizontalLineToRelative(-6.938f)
                quadToRelative(0.144f, 0.478f, 0.145f, 1.0f)
                moveToRelative(-3.5f, 3.5f)
                curveToRelative(1.189f, 0.0f, 2.24f, -0.593f, 2.872f, -1.5f)
                horizontalLineToRelative(7.789f)
                lineToRelative(0.146f, -0.146f)
                lineTo(19.08f, 7.08f)
                lineToRelative(0.353f, -0.354f)
                lineToRelative(-1.976f, -1.976f)
                lineTo(9.624f, 4.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -2.873f, 5.5f)
                moveToRelative(12.33f, -3.17f)
                lineToRelative(-0.355f, -0.354f)
                horizontalLineToRelative(0.001f)
                close()
                moveTo(32.751f, 32.75f)
                verticalLineToRelative(-20.5f)
                lineTo(3.25f, 12.25f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(31.751f, 31.75f)
                lineTo(4.25f, 31.75f)
                verticalLineToRelative(-18.5f)
                horizontalLineToRelative(27.5f)
                close()
                moveTo(27.251f, 20.251f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.75f, 19.251f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                close()
                moveTo(28.251f, 26.251f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(9.75f, 28.251f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(21.001f, 17.751f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _lockerMedium!!
    }

private var _lockerMedium: ImageVector? = null
