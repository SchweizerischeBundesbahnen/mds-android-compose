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

public val SBBIcons.LocomotiveProfileMoonMedium: ImageVector
    get() {
        if (_locomotiveProfileMoonMedium != null) {
            return _locomotiveProfileMoonMedium!!
        }
        _locomotiveProfileMoonMedium = Builder(name = "LocomotiveProfileMoonMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(25.075f, 4.325f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 6.6f, 6.599f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, -6.6f, -6.599f)
                moveTo(30.75f, 10.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -4.43f, -6.466f)
                lineToRelative(0.409f, -1.057f)
                lineToRelative(-1.056f, 0.41f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 7.358f, 7.64f)
                lineToRelative(0.082f, -0.2f)
                lineToRelative(0.41f, -1.056f)
                lineToRelative(-1.057f, 0.41f)
                curveToRelative(-0.532f, 0.205f, -1.11f, 0.319f, -1.716f, 0.319f)
                moveToRelative(-17.099f, -0.25f)
                lineTo(8.527f, 6.334f)
                lineTo(8.25f, 6.15f)
                lineToRelative(-0.277f, 0.184f)
                lineTo(2.849f, 9.75f)
                lineToRelative(3.75f, 2.5f)
                lineTo(3.0f, 12.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.099f)
                lineToRelative(0.151f, 0.1f)
                lineToRelative(0.151f, -0.1f)
                horizontalLineToRelative(4.106f)
                curveToRelative(2.456f, 0.0f, 4.566f, 1.428f, 5.582f, 3.5f)
                lineTo(12.25f, 16.75f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(8.416f)
                lineToRelative(0.88f, 2.429f)
                lineToRelative(0.01f, 0.026f)
                lineToRelative(0.012f, 0.026f)
                curveToRelative(0.12f, 0.24f, 0.189f, 0.5f, 0.189f, 0.77f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                lineTo(3.0f, 28.751f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.792f)
                curveToRelative(0.111f, 0.778f, 0.48f, 1.474f, 1.015f, 2.0f)
                lineTo(3.0f, 31.751f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(-1.0f)
                lineTo(15.706f, 31.751f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.015f, -2.0f)
                horizontalLineToRelative(3.286f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, -2.75f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -0.279f, -1.184f)
                lineToRelative(-3.147f, -8.68f)
                curveToRelative(-0.983f, -2.834f, -3.649f, -4.887f, -6.824f, -4.887f)
                lineTo(9.9f, 12.25f)
                close()
                moveTo(21.547f, 26.179f)
                lineTo(22.02f, 26.007f)
                lineTo(22.017f, 26.009f)
                close()
                moveTo(13.196f, 31.75f)
                horizontalLineToRelative(0.122f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.389f, -2.0f)
                horizontalLineToRelative(-4.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.389f, 2.0f)
                moveToRelative(7.107f, -9.0f)
                lineToRelative(-1.813f, -5.0f)
                horizontalLineToRelative(-5.24f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(18.86f, 17.307f)
                lineTo(18.898f, 17.293f)
                close()
                moveTo(8.25f, 12.149f)
                lineTo(4.651f, 9.75f)
                lineToRelative(3.599f, -2.4f)
                lineToRelative(3.599f, 2.4f)
                close()
                moveTo(10.25f, 16.751f)
                verticalLineToRelative(7.0f)
                lineTo(3.0f, 23.751f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(-5.0f)
                lineTo(3.0f, 17.751f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _locomotiveProfileMoonMedium!!
    }

private var _locomotiveProfileMoonMedium: ImageVector? = null
