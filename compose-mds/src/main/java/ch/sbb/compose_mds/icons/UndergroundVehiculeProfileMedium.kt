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
                moveTo(28.765f, 27.75f)
                verticalLineToRelative(-7.061f)
                lineToRelative(-0.008f, -0.184f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.09f, -0.53f)
                lineToRelative(-4.08f, -13.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.792f, -0.697f)
                lineToRelative(-0.159f, -0.013f)
                lineTo(3.016f, 5.765f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(20.628f)
                lineToRelative(0.16f, 0.007f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.74f, 1.413f)
                lineToRelative(4.08f, 13.5f)
                lineToRelative(0.003f, 0.01f)
                curveToRelative(0.089f, 0.321f, 0.136f, 0.653f, 0.138f, 0.986f)
                verticalLineToRelative(7.069f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(3.015f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(24.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                moveToRelative(4.235f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(3.03f, 32.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.996f, 18.612f)
                lineTo(22.893f, 7.75f)
                lineTo(15.25f, 7.75f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(10.928f)
                close()
                moveTo(24.852f, 18.25f)
                lineTo(16.25f, 18.25f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(5.888f)
                close()
                moveTo(8.75f, 8.75f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-17.0f)
                close()
                moveTo(8.25f, 7.75f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-19.0f)
                close()
                moveTo(4.25f, 25.75f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _undergroundVehiculeProfileMedium!!
    }

private var _undergroundVehiculeProfileMedium: ImageVector? = null
