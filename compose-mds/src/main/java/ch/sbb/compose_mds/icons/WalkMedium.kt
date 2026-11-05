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

public val SBBIcons.WalkMedium: ImageVector
    get() {
        if (_walkMedium != null) {
            return _walkMedium!!
        }
        _walkMedium = Builder(name = "WalkMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.25f, 7.25f)
                curveToRelative(-0.523f, 0.0f, -1.0f, 0.476f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.476f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.476f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.477f, -1.0f, -1.0f, -1.0f)
                moveToRelative(-2.0f, 1.0f)
                curveToRelative(0.0f, -1.076f, 0.924f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.924f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.925f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.923f, -2.0f, -2.0f)
                moveToRelative(1.0f, 5.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(15.25f, 13.684f)
                verticalLineToRelative(10.914f)
                lineToRelative(-2.916f, 4.374f)
                lineToRelative(0.832f, 0.555f)
                lineToRelative(3.0f, -4.5f)
                lineToRelative(0.084f, -0.126f)
                lineTo(16.25f, 20.75f)
                horizontalLineToRelative(2.293f)
                lineToRelative(2.707f, 2.707f)
                lineTo(21.25f, 30.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.958f)
                lineToRelative(-0.146f, -0.146f)
                lineToRelative(-2.854f, -2.854f)
                verticalLineToRelative(-6.085f)
                lineToRelative(2.146f, 2.146f)
                lineToRelative(0.147f, 0.146f)
                lineTo(25.5f, 16.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.543f)
                lineToRelative(-2.853f, -2.853f)
                lineToRelative(-0.147f, -0.147f)
                lineTo(15.6f, 12.249f)
                lineToRelative(-0.126f, 0.085f)
                lineToRelative(-4.5f, 3.0f)
                lineToRelative(-0.223f, 0.148f)
                lineTo(10.751f, 21.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.983f)
                close()
            }
        }
        .build()
        return _walkMedium!!
    }

private var _walkMedium: ImageVector? = null
