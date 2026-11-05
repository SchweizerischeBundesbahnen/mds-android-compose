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
                moveToRelative(26.32f, 3.534f)
                lineToRelative(0.409f, -1.056f)
                lineToRelative(-1.057f, 0.409f)
                arcTo(5.752f, 5.752f, 0.0f, false, false, 27.75f, 14.0f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 5.363f, -3.672f)
                lineToRelative(0.41f, -1.057f)
                lineToRelative(-1.057f, 0.41f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -6.147f, -6.147f)
                moveTo(23.0f, 8.25f)
                curveToRelative(0.0f, -1.63f, 0.822f, -3.07f, 2.074f, -3.925f)
                quadTo(25.0f, 4.777f, 25.0f, 5.25f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 6.675f, 5.676f)
                arcTo(4.75f, 4.75f, 0.0f, false, true, 23.0f, 8.25f)
                moveTo(8.527f, 6.334f)
                lineTo(8.25f, 6.15f)
                lineToRelative(-0.277f, 0.185f)
                lineToRelative(-4.5f, 3.0f)
                lineToRelative(-0.624f, 0.416f)
                lineToRelative(0.624f, 0.416f)
                lineToRelative(3.126f, 2.084f)
                lineTo(3.0f, 12.251f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.099f)
                lineToRelative(0.151f, 0.101f)
                lineToRelative(0.151f, -0.1f)
                horizontalLineToRelative(4.106f)
                curveToRelative(2.456f, 0.0f, 4.566f, 1.427f, 5.582f, 3.5f)
                lineTo(12.25f, 16.752f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(8.416f)
                lineToRelative(0.88f, 2.428f)
                lineToRelative(0.01f, 0.027f)
                lineToRelative(0.013f, 0.024f)
                curveToRelative(0.119f, 0.241f, 0.188f, 0.5f, 0.188f, 0.77f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, 1.75f)
                lineTo(3.0f, 28.751f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.792f)
                curveToRelative(0.111f, 0.779f, 0.48f, 1.475f, 1.015f, 2.0f)
                lineTo(3.0f, 31.751f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(30.0f)
                verticalLineToRelative(-1.0f)
                lineTo(15.706f, 31.751f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.015f, -2.0f)
                horizontalLineToRelative(3.286f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, -2.75f)
                curveToRelative(0.0f, -0.433f, -0.109f, -0.834f, -0.28f, -1.187f)
                lineToRelative(-3.145f, -8.673f)
                curveToRelative(-0.98f, -2.836f, -3.648f, -4.89f, -6.825f, -4.89f)
                lineTo(9.9f, 12.251f)
                lineToRelative(3.126f, -2.084f)
                lineToRelative(0.624f, -0.416f)
                lineToRelative(-0.624f, -0.416f)
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
                moveTo(8.25f, 12.15f)
                lineToRelative(-3.599f, -2.4f)
                lineTo(8.25f, 7.351f)
                lineToRelative(3.599f, 2.4f)
                close()
                moveTo(9.25f, 17.75f)
                lineTo(3.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.25f)
                verticalLineToRelative(7.0f)
                lineTo(3.0f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.25f)
                close()
            }
        }
        .build()
        return _locomotiveProfileMoonMedium!!
    }

private var _locomotiveProfileMoonMedium: ImageVector? = null
