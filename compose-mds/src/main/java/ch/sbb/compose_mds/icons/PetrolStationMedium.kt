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
                moveTo(8.75f, 6.749f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(25.0f)
                lineTo(8.75f, 31.749f)
                close()
                moveTo(7.75f, 31.749f)
                verticalLineToRelative(-25.0f)
                curveToRelative(0.0f, -1.932f, 1.568f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(1.932f, 0.0f, 3.5f, 1.568f, 3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(0.25f)
                curveToRelative(0.825f, 0.0f, 1.53f, 0.205f, 2.028f, 0.707f)
                curveToRelative(0.496f, 0.5f, 0.703f, 1.208f, 0.722f, 2.032f)
                lineTo(28.25f, 25.5f)
                curveToRelative(0.0f, 0.408f, 0.007f, 0.87f, 0.152f, 1.23f)
                quadToRelative(0.1f, 0.25f, 0.271f, 0.37f)
                curveToRelative(0.112f, 0.08f, 0.287f, 0.15f, 0.577f, 0.15f)
                curveToRelative(0.295f, 0.0f, 0.472f, -0.07f, 0.584f, -0.148f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.27f, -0.36f)
                curveToRelative(0.143f, -0.354f, 0.148f, -0.814f, 0.146f, -1.24f)
                lineTo(30.25f, 12.18f)
                lineToRelative(-3.634f, -4.36f)
                lineToRelative(0.768f, -0.64f)
                lineToRelative(3.75f, 4.5f)
                lineToRelative(0.116f, 0.139f)
                verticalLineToRelative(13.7f)
                curveToRelative(0.002f, 0.392f, 0.006f, 1.042f, -0.22f, 1.599f)
                curveToRelative(-0.121f, 0.297f, -0.315f, 0.59f, -0.624f, 0.805f)
                curveToRelative(-0.31f, 0.216f, -0.698f, 0.327f, -1.156f, 0.327f)
                quadToRelative(-0.691f, -0.002f, -1.157f, -0.335f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.619f, -0.811f)
                curveToRelative(-0.223f, -0.554f, -0.223f, -1.194f, -0.224f, -1.57f)
                verticalLineToRelative(-1.528f)
                curveToRelative(-0.017f, -0.683f, -0.186f, -1.098f, -0.431f, -1.345f)
                curveToRelative(-0.244f, -0.246f, -0.647f, -0.411f, -1.319f, -0.411f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(9.499f)
                lineTo(27.0f, 31.749f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 32.749f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.75f, 7.749f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _petrolStationMedium!!
    }

private var _petrolStationMedium: ImageVector? = null
