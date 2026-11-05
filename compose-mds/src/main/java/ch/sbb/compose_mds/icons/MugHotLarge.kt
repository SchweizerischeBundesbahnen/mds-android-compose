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

public val SBBIcons.MugHotLarge: ImageVector
    get() {
        if (_mugHotLarge != null) {
            return _mugHotLarge!!
        }
        _mugHotLarge = Builder(
            name = "MugHotLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(31.0f, 25.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                lineTo(31.0f, 38.0f)
                verticalLineToRelative(4.0f)
                lineTo(10.0f, 42.0f)
                lineTo(10.0f, 19.0f)
                horizontalLineToRelative(21.0f)
                close()
                moveTo(11.0f, 38.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 37.0f)
                horizontalLineToRelative(19.0f)
                lineTo(30.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                close()
                moveTo(31.0f, 37.0f)
                horizontalLineToRelative(3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(31.0f, 26.0f)
                close()
                moveTo(11.0f, 23.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-3.0f)
                lineTo(11.0f, 20.0f)
                close()
                moveTo(15.0f, 4.5f)
                curveToRelative(0.0f, 0.455f, 0.239f, 1.092f, 0.701f, 1.621f)
                curveToRelative(0.454f, 0.52f, 1.076f, 0.879f, 1.799f, 0.879f)
                curveToRelative(2.142f, 0.0f, 3.34f, 1.792f, 3.425f, 3.475f)
                curveToRelative(0.042f, 0.852f, -0.19f, 1.735f, -0.766f, 2.412f)
                curveTo(19.575f, 13.574f, 18.68f, 14.0f, 17.5f, 14.0f)
                curveToRelative(-1.346f, 0.0f, -2.5f, 0.998f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.098f, 1.646f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.922f, 0.0f, 1.526f, -0.324f, 1.898f, -0.762f)
                curveToRelative(0.38f, -0.448f, 0.56f, -1.066f, 0.528f, -1.713f)
                curveTo(19.86f, 9.208f, 18.957f, 8.0f, 17.5f, 8.0f)
                curveToRelative(-1.077f, 0.0f, -1.956f, -0.54f, -2.552f, -1.22f)
                curveTo(14.361f, 6.107f, 14.0f, 5.244f, 14.0f, 4.5f)
                close()
                moveTo(23.0f, 4.5f)
                curveToRelative(0.0f, 0.455f, 0.239f, 1.092f, 0.701f, 1.621f)
                curveToRelative(0.454f, 0.52f, 1.076f, 0.879f, 1.799f, 0.879f)
                curveToRelative(2.142f, 0.0f, 3.34f, 1.792f, 3.425f, 3.475f)
                curveToRelative(0.042f, 0.852f, -0.19f, 1.735f, -0.766f, 2.412f)
                curveTo(27.575f, 13.574f, 26.68f, 14.0f, 25.5f, 14.0f)
                curveToRelative(-1.346f, 0.0f, -2.5f, 0.998f, -2.5f, 2.5f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, -2.098f, 1.646f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0.922f, 0.0f, 1.526f, -0.324f, 1.898f, -0.762f)
                curveToRelative(0.38f, -0.448f, 0.56f, -1.066f, 0.528f, -1.713f)
                curveTo(27.86f, 9.208f, 26.957f, 8.0f, 25.5f, 8.0f)
                curveToRelative(-1.077f, 0.0f, -1.956f, -0.54f, -2.552f, -1.22f)
                curveTo(22.361f, 6.107f, 22.0f, 5.244f, 22.0f, 4.5f)
                close()
            }
        }
            .build()
        return _mugHotLarge!!
    }

private var _mugHotLarge: ImageVector? = null
