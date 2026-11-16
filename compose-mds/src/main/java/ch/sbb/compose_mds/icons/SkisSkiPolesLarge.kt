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

public val SBBIcons.SkisSkiPolesLarge: ImageVector
    get() {
        if (_skisSkiPolesLarge != null) {
            return _skisSkiPolesLarge!!
        }
        _skisSkiPolesLarge = Builder(name = "SkisSkiPolesLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 5.5f)
                curveToRelative(1.382f, 0.0f, 2.5f, 1.118f, 2.5f, 2.5f)
                verticalLineToRelative(11.55f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 18.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.5f, 1.05f)
                lineTo(5.5f, 8.0f)
                curveToRelative(0.0f, -1.382f, 1.118f, -2.5f, 2.5f, -2.5f)
                moveToRelative(0.0f, 14.0f)
                curveToRelative(1.382f, 0.0f, 2.5f, 1.118f, 2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-5.0f)
                lineTo(5.5f, 22.0f)
                curveToRelative(0.0f, -1.382f, 1.118f, -2.5f, 2.5f, -2.5f)
                moveToRelative(-3.5f, 24.0f)
                lineTo(4.5f, 8.0f)
                curveToRelative(0.0f, -1.934f, 1.566f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.566f, 3.5f, 3.5f)
                verticalLineToRelative(35.5f)
                close()
                moveTo(5.5f, 31.5f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-11.0f)
                close()
                moveTo(18.0f, 5.5f)
                curveToRelative(1.382f, 0.0f, 2.5f, 1.118f, 2.5f, 2.5f)
                verticalLineToRelative(11.55f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 18.0f, 18.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.5f, 1.05f)
                lineTo(15.5f, 8.0f)
                curveToRelative(0.0f, -1.382f, 1.118f, -2.5f, 2.5f, -2.5f)
                moveTo(15.5f, 22.0f)
                curveToRelative(0.0f, -1.382f, 1.118f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.118f, 2.5f, 2.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(21.5f, 22.0f)
                lineTo(21.5f, 8.0f)
                curveToRelative(0.0f, -1.934f, -1.566f, -3.5f, -3.5f, -3.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 14.5f, 8.0f)
                verticalLineToRelative(35.5f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(15.5f, 42.5f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(42.469f, 43.827f)
                lineTo(41.531f, 44.173f)
                lineTo(40.605f, 41.659f)
                lineTo(38.158f, 42.475f)
                lineTo(37.842f, 41.525f)
                lineTo(40.259f, 40.72f)
                lineTo(35.0f, 26.445f)
                lineTo(29.741f, 40.72f)
                lineToRelative(2.417f, 0.805f)
                lineToRelative(-0.316f, 0.95f)
                lineToRelative(-2.447f, -0.816f)
                lineToRelative(-0.926f, 2.514f)
                lineToRelative(-0.938f, -0.346f)
                lineToRelative(0.916f, -2.484f)
                lineToRelative(-2.605f, -0.868f)
                lineToRelative(0.316f, -0.95f)
                lineToRelative(2.635f, 0.879f)
                lineTo(34.468f, 25.0f)
                lineToRelative(-3.27f, -8.872f)
                lineToRelative(-1.04f, 0.347f)
                lineTo(30.0f, 16.0f)
                lineToRelative(-0.474f, 0.158f)
                lineToRelative(-2.0f, -6.0f)
                lineToRelative(-0.158f, -0.473f)
                lineToRelative(0.474f, -0.159f)
                lineToRelative(0.823f, -0.275f)
                lineToRelative(-1.134f, -3.078f)
                lineToRelative(0.938f, -0.346f)
                lineTo(35.0f, 23.555f)
                lineToRelative(6.531f, -17.728f)
                lineToRelative(0.938f, 0.346f)
                lineToRelative(-1.134f, 3.078f)
                lineToRelative(0.823f, 0.275f)
                lineToRelative(0.474f, 0.159f)
                lineToRelative(-0.158f, 0.473f)
                lineToRelative(-2.0f, 6.0f)
                lineTo(40.0f, 16.0f)
                lineToRelative(-0.159f, 0.475f)
                lineToRelative(-1.04f, -0.347f)
                lineTo(35.532f, 25.0f)
                lineToRelative(5.675f, 15.404f)
                lineToRelative(2.635f, -0.879f)
                lineToRelative(0.316f, 0.95f)
                lineToRelative(-2.605f, 0.868f)
                close()
                moveTo(39.147f, 15.19f)
                lineToRelative(0.536f, 0.18f)
                lineToRelative(1.684f, -5.053f)
                lineToRelative(-0.378f, -0.126f)
                close()
                moveTo(39.841f, 16.476f)
                lineTo(40.0f, 16.0f)
                lineToRelative(0.475f, 0.157f)
                lineToRelative(-0.158f, 0.475f)
                close()
                moveTo(29.526f, 16.159f)
                lineTo(29.684f, 16.634f)
                lineTo(30.159f, 16.476f)
                lineTo(30.0f, 16.0f)
                close()
                moveTo(29.011f, 10.191f)
                lineTo(30.853f, 15.191f)
                lineTo(30.317f, 15.369f)
                lineTo(28.632f, 10.317f)
                close()
            }
        }
        .build()
        return _skisSkiPolesLarge!!
    }

private var _skisSkiPolesLarge: ImageVector? = null
