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

public val SBBIcons.UndergroundVehiculeProfileMedium: ImageVector
    get() {
        if (_undergroundVehiculeProfileMedium != null) {
            return _undergroundVehiculeProfileMedium!!
        }
        _undergroundVehiculeProfileMedium = Builder(name = "UndergroundVehiculeProfileMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.015f, 4.765f)
                horizontalLineToRelative(20.629f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.9f, 1.42f)
                lineToRelative(4.08f, 13.5f)
                lineToRelative(0.003f, 0.01f)
                curveToRelative(0.09f, 0.321f, 0.136f, 0.653f, 0.138f, 0.986f)
                verticalLineToRelative(7.069f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(3.015f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(24.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-7.063f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.1f, -0.718f)
                lineTo(24.587f, 6.475f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.949f, -0.71f)
                lineTo(3.015f, 5.765f)
                close()
                moveTo(33.0f, 32.75f)
                lineTo(3.03f, 32.75f)
                verticalLineToRelative(-1.0f)
                lineTo(33.0f, 31.75f)
                close()
                moveTo(15.75f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(10.928f)
                lineToRelative(-0.182f, -0.637f)
                lineToRelative(-3.0f, -10.5f)
                lineToRelative(-0.104f, -0.363f)
                lineTo(15.75f, 7.75f)
                moveToRelative(0.5f, 10.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(5.888f)
                lineToRelative(2.714f, 9.5f)
                close()
                moveTo(3.25f, 7.75f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-19.0f)
                moveToRelative(5.5f, 18.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(4.25f, 8.75f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-17.0f)
                close()
            }
        }
        .build()
        return _undergroundVehiculeProfileMedium!!
    }

private var _undergroundVehiculeProfileMedium: ImageVector? = null
