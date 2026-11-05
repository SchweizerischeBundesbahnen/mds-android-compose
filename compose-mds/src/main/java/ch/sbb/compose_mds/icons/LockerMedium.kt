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
                moveTo(3.25f, 6.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.373f, -2.0f)
                horizontalLineToRelative(7.834f)
                lineToRelative(0.147f, 0.147f)
                lineToRelative(1.476f, 1.476f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-1.523f, 1.524f)
                lineToRelative(-0.146f, 0.146f)
                lineTo(9.622f, 8.75f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, -6.372f, -2.0f)
                moveToRelative(7.0f, 0.0f)
                quadToRelative(-0.001f, -0.522f, -0.145f, -1.0f)
                horizontalLineToRelative(6.938f)
                lineToRelative(0.976f, 0.977f)
                lineToRelative(-1.023f, 1.023f)
                horizontalLineToRelative(-6.89f)
                quadToRelative(0.143f, -0.476f, 0.144f, -1.0f)
                moveToRelative(-3.5f, -2.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(-3.0f, 8.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(29.5f)
                verticalLineToRelative(-20.5f)
                horizontalLineToRelative(-29.0f)
                moveToRelative(0.5f, 19.5f)
                verticalLineToRelative(-18.5f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(18.5f)
                close()
                moveTo(7.75f, 20.251f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(9.75f, 28.251f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(9.75f, 19.251f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(15.0f, 17.751f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _lockerMedium!!
    }

private var _lockerMedium: ImageVector? = null
