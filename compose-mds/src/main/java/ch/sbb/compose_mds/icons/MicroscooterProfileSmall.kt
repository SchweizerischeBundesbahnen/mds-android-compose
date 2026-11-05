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

public val SBBIcons.MicroscooterProfileSmall: ImageVector
    get() {
        if (_microscooterProfileSmall != null) {
            return _microscooterProfileSmall!!
        }
        _microscooterProfileSmall = Builder(name = "MicroscooterProfileSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.5f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.035f)
                arcTo(3.51f, 3.51f, 0.0f, false, false, 14.035f, 16.0f)
                horizontalLineTo(7.732f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 17.0f)
                curveToRelative(0.0f, 1.104f, 0.897f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.896f, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.377f, 1.122f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.551f, -0.45f, -1.0f, -1.0f, -1.0f)
                moveToRelative(12.0f, 0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.449f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                curveToRelative(0.0f, -0.551f, -0.45f, -1.0f, -1.0f, -1.0f)
                moveToRelative(-2.0f, 1.0f)
                curveToRelative(0.0f, -1.104f, 0.897f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.896f, 2.0f, 2.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.897f, -2.0f, -2.0f)
            }
        }
        .build()
        return _microscooterProfileSmall!!
    }

private var _microscooterProfileSmall: ImageVector? = null
