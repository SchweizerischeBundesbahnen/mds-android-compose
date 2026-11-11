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

public val SBBIcons.SignParkingMedium: ImageVector
    get() {
        if (_signParkingMedium != null) {
            return _signParkingMedium!!
        }
        _signParkingMedium = Builder(name = "SignParkingMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.75f, 4.25f)
                curveToRelative(0.553f, 0.0f, 1.0f, 0.447f, 1.0f, 1.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(11.75f, 5.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(21.75f, 17.75f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(23.75f, 5.25f)
                curveToRelative(0.0f, -1.106f, -0.894f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(10.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineTo(16.75f, 33.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.75f, 17.75f)
                close()
                moveTo(19.75f, 9.0f)
                curveToRelative(0.0f, -0.672f, -0.172f, -1.085f, -0.423f, -1.334f)
                curveToRelative(-0.252f, -0.25f, -0.667f, -0.416f, -1.327f, -0.416f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(1.749f)
                curveToRelative(0.672f, -0.001f, 1.085f, -0.17f, 1.334f, -0.418f)
                curveToRelative(0.248f, -0.248f, 0.417f, -0.66f, 0.417f, -1.332f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 0.827f, -0.208f, 1.539f, -0.71f, 2.04f)
                curveToRelative(-0.502f, 0.5f, -1.214f, 0.708f, -2.039f, 0.71f)
                lineTo(16.25f, 11.75f)
                lineTo(16.25f, 15.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.25f, 6.25f)
                lineTo(18.0f, 6.25f)
                curveToRelative(0.817f, 0.0f, 1.528f, 0.207f, 2.031f, 0.706f)
                curveToRelative(0.505f, 0.5f, 0.719f, 1.211f, 0.719f, 2.044f)
            }
        }
        .build()
        return _signParkingMedium!!
    }

private var _signParkingMedium: ImageVector? = null
