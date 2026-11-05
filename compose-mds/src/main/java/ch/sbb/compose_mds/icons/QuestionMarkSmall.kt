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

public val SBBIcons.QuestionMarkSmall: ImageVector
    get() {
        if (_questionMarkSmall != null) {
            return _questionMarkSmall!!
        }
        _questionMarkSmall = Builder(name = "QuestionMarkSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.03f, 17.04f)
                verticalLineToRelative(1.94f)
                horizontalLineToRelative(-2.016f)
                verticalLineToRelative(-1.94f)
                close()
                moveTo(12.142f, 5.03f)
                quadToRelative(1.893f, 0.0f, 3.012f, 1.072f)
                quadToRelative(1.045f, 0.99f, 1.045f, 2.602f)
                quadToRelative(0.0f, 1.334f, -0.709f, 2.294f)
                quadToRelative(-0.319f, 0.439f, -1.52f, 1.614f)
                quadToRelative(-0.533f, 0.514f, -0.742f, 0.853f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, false, -0.293f, 0.844f)
                quadToRelative(-0.094f, 0.503f, -0.094f, 1.306f)
                horizontalLineToRelative(-1.585f)
                quadToRelative(0.019f, -1.427f, 0.25f, -2.117f)
                quadToRelative(0.17f, -0.504f, 0.482f, -0.905f)
                quadToRelative(0.312f, -0.402f, 1.385f, -1.501f)
                quadToRelative(0.69f, -0.709f, 0.904f, -1.278f)
                quadToRelative(0.178f, -0.485f, 0.178f, -0.99f)
                quadToRelative(0.0f, -0.932f, -0.513f, -1.565f)
                quadToRelative(-0.616f, -0.774f, -1.819f, -0.774f)
                quadToRelative(-2.49f, 0.0f, -2.687f, 3.059f)
                horizontalLineTo(7.835f)
                quadToRelative(0.065f, -1.735f, 0.68f, -2.686f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 1.512f, -1.353f)
                quadToRelative(0.94f, -0.475f, 2.117f, -0.475f)
            }
        }
        .build()
        return _questionMarkSmall!!
    }

private var _questionMarkSmall: ImageVector? = null
