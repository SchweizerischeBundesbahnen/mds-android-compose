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

public val SBBIcons.StairsUserMedium: ImageVector
    get() {
        if (_stairsUserMedium != null) {
            return _stairsUserMedium!!
        }
        _stairsUserMedium = Builder(name = "StairsUserMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.25f, 4.25f)
                curveToRelative(0.523f, 0.0f, 1.0f, 0.477f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.477f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.477f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.477f, -1.0f, 1.0f, -1.0f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(1.076f, 0.0f, 2.0f, -0.924f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.924f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.924f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.924f, 2.0f, 2.0f, 2.0f)
                moveToRelative(1.809f, 2.0f)
                lineToRelative(0.138f, 0.276f)
                lineToRelative(1.48f, 2.96f)
                lineTo(19.9f, 15.45f)
                lineToRelative(-0.8f, 0.6f)
                lineToRelative(-2.25f, -3.0f)
                lineToRelative(-0.027f, -0.036f)
                lineToRelative(-0.02f, -0.04f)
                lineToRelative(-0.553f, -1.106f)
                verticalLineToRelative(5.23f)
                lineToRelative(1.5f, 2.25f)
                verticalLineToRelative(3.402f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.5f)
                lineTo(33.0f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(4.5f)
                lineTo(3.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.25f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.61f)
                lineToRelative(1.39f, -5.562f)
                lineTo(12.25f, 10.956f)
                lineToRelative(-2.0f, 2.0f)
                lineTo(10.25f, 16.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.957f)
                lineToRelative(3.293f, -3.293f)
                close()
                moveTo(13.25f, 16.75f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(15.482f, 17.75f)
                lineTo(13.25f, 17.75f)
                verticalLineToRelative(4.061f)
                lineToRelative(-0.015f, 0.06f)
                lineToRelative(-1.344f, 5.379f)
                horizontalLineToRelative(3.359f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3.099f)
                close()
            }
        }
        .build()
        return _stairsUserMedium!!
    }

private var _stairsUserMedium: ImageVector? = null
