package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.MugHotMedium: ImageVector
    get() {
        if (_mugHotMedium != null) {
            return _mugHotMedium!!
        }
        _mugHotMedium = Builder(name = "MugHotMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.75f, 18.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-17.5f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(8.75f, 30.25f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-15.5f)
                horizontalLineToRelative(-14.0f)
                close()
                moveTo(23.75f, 27.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(11.75f, 3.0f)
                curveToRelative(0.0f, 0.305f, 0.164f, 0.754f, 0.495f, 1.133f)
                curveToRelative(0.323f, 0.37f, 0.757f, 0.617f, 1.255f, 0.617f)
                curveToRelative(1.692f, 0.0f, 2.628f, 1.417f, 2.693f, 2.725f)
                curveToRelative(0.034f, 0.665f, -0.148f, 1.36f, -0.603f, 1.896f)
                curveToRelative(-0.465f, 0.547f, -1.174f, 0.879f, -2.09f, 0.879f)
                curveToRelative(-0.946f, 0.0f, -1.75f, 0.698f, -1.75f, 1.75f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.648f, 1.296f, -2.75f, 2.75f, -2.75f)
                curveToRelative(0.659f, 0.0f, 1.075f, -0.23f, 1.327f, -0.527f)
                curveToRelative(0.262f, -0.308f, 0.39f, -0.738f, 0.367f, -1.198f)
                curveToRelative(-0.047f, -0.942f, -0.687f, -1.775f, -1.694f, -1.775f)
                curveToRelative(-0.852f, 0.0f, -1.543f, -0.427f, -2.008f, -0.958f)
                curveToRelative(-0.456f, -0.521f, -0.742f, -1.197f, -0.742f, -1.792f)
                close()
                moveTo(17.75f, 3.0f)
                curveToRelative(0.0f, 0.305f, 0.164f, 0.754f, 0.495f, 1.133f)
                curveToRelative(0.323f, 0.37f, 0.757f, 0.617f, 1.255f, 0.617f)
                curveToRelative(1.692f, 0.0f, 2.628f, 1.417f, 2.693f, 2.725f)
                curveToRelative(0.034f, 0.665f, -0.148f, 1.36f, -0.603f, 1.896f)
                curveToRelative(-0.465f, 0.547f, -1.174f, 0.879f, -2.09f, 0.879f)
                curveToRelative(-0.946f, 0.0f, -1.75f, 0.698f, -1.75f, 1.75f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -1.648f, 1.296f, -2.75f, 2.75f, -2.75f)
                curveToRelative(0.659f, 0.0f, 1.075f, -0.23f, 1.327f, -0.527f)
                curveToRelative(0.262f, -0.308f, 0.39f, -0.738f, 0.367f, -1.198f)
                curveToRelative(-0.047f, -0.942f, -0.687f, -1.775f, -1.694f, -1.775f)
                curveToRelative(-0.852f, 0.0f, -1.543f, -0.427f, -2.008f, -0.958f)
                curveToRelative(-0.456f, -0.521f, -0.742f, -1.197f, -0.742f, -1.792f)
                close()
            }
        }
        .build()
        return _mugHotMedium!!
    }

private var _mugHotMedium: ImageVector? = null
