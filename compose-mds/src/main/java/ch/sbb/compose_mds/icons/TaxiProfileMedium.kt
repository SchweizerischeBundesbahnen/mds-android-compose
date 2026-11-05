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

public val SBBIcons.TaxiProfileMedium: ImageVector
    get() {
        if (_taxiProfileMedium != null) {
            return _taxiProfileMedium!!
        }
        _taxiProfileMedium = Builder(name = "TaxiProfileMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.75f, 6.25f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(1.336f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.06f, 0.44f)
                lineToRelative(5.561f, 5.56f)
                horizontalLineToRelative(4.043f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-4.536f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, -3.0f)
                horizontalLineToRelative(-8.07f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.464f, -3.0f)
                lineTo(3.25f, 23.75f)
                verticalLineToRelative(-7.624f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.371f, -0.988f)
                lineToRelative(4.704f, -5.376f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.129f, -0.512f)
                horizontalLineToRelative(1.296f)
                verticalLineToRelative(-3.0f)
                moveToRelative(1.0f, 3.0f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-6.5f)
                close()
                moveTo(6.285f, 22.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, 3.0f)
                horizontalLineToRelative(8.071f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, 3.0f)
                horizontalLineToRelative(3.535f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-27.0f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(4.852f, 15.25f)
                horizontalLineToRelative(8.898f)
                verticalLineToRelative(-5.0f)
                lineTo(9.454f, 10.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.377f, 0.17f)
                close()
                moveTo(14.75f, 10.25f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(11.043f)
                lineToRelative(-4.854f, -4.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.353f, -0.146f)
                close()
                moveTo(9.75f, 20.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
                moveToRelative(15.0f, 0.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, -5.0f)
            }
        }
        .build()
        return _taxiProfileMedium!!
    }

private var _taxiProfileMedium: ImageVector? = null
