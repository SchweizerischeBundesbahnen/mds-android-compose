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

public val SBBIcons.SmartphoneShakingMedium: ImageVector
    get() {
        if (_smartphoneShakingMedium != null) {
            return _smartphoneShakingMedium!!
        }
        _smartphoneShakingMedium = Builder(name = "SmartphoneShakingMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(7.827f, 5.927f)
                lineToRelative(1.602f, -2.67f)
                lineToRelative(-0.857f, -0.514f)
                lineToRelative(-2.25f, 3.75f)
                lineToRelative(-0.257f, 0.428f)
                lineToRelative(0.429f, 0.257f)
                lineToRelative(3.75f, 2.25f)
                lineToRelative(0.513f, -0.857f)
                lineTo(8.0f, 6.915f)
                curveToRelative(2.94f, -0.778f, 6.063f, -1.165f, 9.252f, -1.165f)
                curveToRelative(3.167f, 0.0f, 6.314f, 0.395f, 9.249f, 1.166f)
                lineToRelative(-2.756f, 1.655f)
                lineToRelative(0.513f, 0.857f)
                lineToRelative(3.75f, -2.25f)
                lineToRelative(0.429f, -0.257f)
                lineToRelative(-0.257f, -0.428f)
                lineToRelative(-2.25f, -3.75f)
                lineToRelative(-0.857f, 0.513f)
                lineToRelative(1.603f, 2.673f)
                curveToRelative(-3.0f, -0.781f, -6.205f, -1.18f, -9.425f, -1.18f)
                curveToRelative(-3.238f, 0.0f, -6.418f, 0.39f, -9.423f, 1.178f)
                moveToRelative(2.924f, 24.822f)
                lineTo(10.752f, 12.747f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineToRelative(9.0f, 0.002f)
                lineToRelative(0.204f, 0.01f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.796f, 1.99f)
                verticalLineToRelative(18.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineToRelative(-9.0f, -0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(19.502f, 12.248f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 13.248f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(4.881f, 14.206f)
                lineToRelative(4.29f, -1.572f)
                lineToRelative(-0.343f, -0.939f)
                lineToRelative(-4.29f, 1.572f)
                verticalLineToRelative(0.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.195f, 2.563f)
                verticalLineToRelative(0.002f)
                lineTo(8.533f, 29.8f)
                lineToRelative(0.937f, -0.349f)
                lineTo(4.283f, 15.49f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.598f, -1.282f)
                close()
                moveTo(25.235f, 12.634f)
                lineTo(29.525f, 14.206f)
                horizontalLineToRelative(0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.597f, 1.283f)
                lineTo(24.94f, 29.45f)
                lineToRelative(0.937f, 0.349f)
                lineToRelative(5.187f, -13.966f)
                lineToRelative(0.001f, -0.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.195f, -2.563f)
                lineToRelative(-4.29f, -1.573f)
                close()
            }
        }
        .build()
        return _smartphoneShakingMedium!!
    }

private var _smartphoneShakingMedium: ImageVector? = null
