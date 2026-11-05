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

public val SBBIcons.PetrolStationSmall: ImageVector
    get() {
        if (_petrolStationSmall != null) {
            return _petrolStationSmall!!
        }
        _petrolStationSmall = Builder(name = "PetrolStationSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 3.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 4.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(5.0f, 21.0f)
                verticalLineTo(4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.0f, 4.5f)
                verticalLineTo(14.0f)
                curveToRelative(0.576f, 0.0f, 1.096f, 0.143f, 1.47f, 0.52f)
                curveToRelative(0.372f, 0.375f, 0.517f, 0.896f, 0.53f, 1.469f)
                verticalLineTo(17.0f)
                curveToRelative(0.0f, 0.278f, 0.007f, 0.553f, 0.09f, 0.758f)
                curveToRelative(0.036f, 0.09f, 0.078f, 0.142f, 0.122f, 0.173f)
                curveToRelative(0.041f, 0.03f, 0.123f, 0.069f, 0.288f, 0.069f)
                curveToRelative(0.17f, 0.0f, 0.252f, -0.04f, 0.294f, -0.068f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.12f, -0.167f)
                curveToRelative(0.082f, -0.2f, 0.088f, -0.473f, 0.086f, -0.762f)
                verticalLineTo(8.18f)
                lineToRelative(-2.384f, -2.86f)
                lineToRelative(0.768f, -0.641f)
                lineToRelative(2.5f, 3.0f)
                lineToRelative(0.116f, 0.139f)
                verticalLineToRelative(9.2f)
                curveToRelative(0.002f, 0.258f, 0.005f, 0.72f, -0.16f, 1.123f)
                curveToRelative(-0.089f, 0.22f, -0.235f, 0.444f, -0.474f, 0.61f)
                curveToRelative(-0.24f, 0.167f, -0.533f, 0.248f, -0.866f, 0.248f)
                curveToRelative(-0.335f, 0.0f, -0.628f, -0.084f, -0.868f, -0.254f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, true, -0.47f, -0.615f)
                curveTo(18.0f, 17.731f, 18.0f, 17.276f, 18.0f, 17.03f)
                verticalLineToRelative(-1.023f)
                curveToRelative(-0.01f, -0.431f, -0.117f, -0.658f, -0.24f, -0.781f)
                curveToRelative(-0.12f, -0.121f, -0.338f, -0.225f, -0.76f, -0.225f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _petrolStationSmall!!
    }

private var _petrolStationSmall: ImageVector? = null
