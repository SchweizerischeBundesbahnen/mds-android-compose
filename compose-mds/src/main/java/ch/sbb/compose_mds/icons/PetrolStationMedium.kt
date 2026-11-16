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

public val SBBIcons.PetrolStationMedium: ImageVector
    get() {
        if (_petrolStationMedium != null) {
            return _petrolStationMedium!!
        }
        _petrolStationMedium = Builder(name = "PetrolStationMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.75f, 4.249f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(25.0f)
                lineTo(8.75f, 31.749f)
                verticalLineToRelative(-25.0f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(7.75f, 31.749f)
                verticalLineToRelative(-25.0f)
                curveToRelative(0.0f, -1.932f, 1.568f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.932f, 0.0f, 3.5f, 1.568f, 3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.825f, 0.0f, 1.53f, 0.205f, 2.028f, 0.707f)
                curveToRelative(0.496f, 0.499f, 0.703f, 1.208f, 0.722f, 2.032f)
                verticalLineToRelative(1.51f)
                lineToRelative(0.004f, 0.315f)
                curveToRelative(0.009f, 0.32f, 0.04f, 0.647f, 0.148f, 0.917f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.27f, 0.37f)
                curveToRelative(0.113f, 0.08f, 0.288f, 0.15f, 0.578f, 0.15f)
                curveToRelative(0.295f, 0.0f, 0.473f, -0.07f, 0.585f, -0.148f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.268f, -0.361f)
                curveToRelative(0.144f, -0.353f, 0.15f, -0.813f, 0.147f, -1.238f)
                lineTo(30.25f, 12.18f)
                lineToRelative(-3.634f, -4.36f)
                lineToRelative(0.768f, -0.64f)
                lineToRelative(3.75f, 4.5f)
                lineToRelative(0.116f, 0.14f)
                verticalLineToRelative(13.677f)
                lineToRelative(-0.001f, 0.337f)
                curveToRelative(-0.008f, 0.377f, -0.046f, 0.858f, -0.22f, 1.284f)
                curveToRelative(-0.12f, 0.297f, -0.314f, 0.59f, -0.623f, 0.805f)
                curveToRelative(-0.31f, 0.216f, -0.698f, 0.327f, -1.156f, 0.327f)
                curveToRelative(-0.46f, 0.0f, -0.847f, -0.115f, -1.157f, -0.335f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.618f, -0.812f)
                curveToRelative(-0.224f, -0.554f, -0.224f, -1.195f, -0.225f, -1.57f)
                lineTo(27.25f, 24.01f)
                lineToRelative(-0.013f, -0.245f)
                curveToRelative(-0.046f, -0.542f, -0.203f, -0.888f, -0.419f, -1.105f)
                curveToRelative(-0.243f, -0.245f, -0.646f, -0.411f, -1.318f, -0.411f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(9.499f)
                lineTo(27.0f, 31.748f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 32.748f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.25f, 7.749f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-7.0f)
                close()
                moveTo(11.75f, 13.749f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-9.5f)
                close()
            }
        }
        .build()
        return _petrolStationMedium!!
    }

private var _petrolStationMedium: ImageVector? = null
