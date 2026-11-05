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

public val SBBIcons.CopyrightSmall: ImageVector
    get() {
        if (_copyrightSmall != null) {
            return _copyrightSmall!!
        }
        _copyrightSmall = Builder(
            name = "CopyrightSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(12.0f, 2.0f)
                curveToRelative(5.58f, 0.0f, 10.0f, 4.418f, 10.0f, 10.0f)
                curveToRelative(0.0f, 5.58f, -4.42f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.58f, 2.0f, 12.0f)
                curveTo(2.0f, 6.418f, 6.42f, 2.0f, 12.0f, 2.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-5.028f, 0.0f, -9.0f, 3.97f, -9.0f, 9.0f)
                curveToRelative(0.0f, 5.028f, 3.972f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -3.972f, 9.0f, -9.0f)
                curveToRelative(0.0f, -5.03f, -3.972f, -9.0f, -9.0f, -9.0f)
                moveToRelative(-0.012f, 6.0f)
                quadToRelative(1.137f, 0.0f, 1.822f, 0.592f)
                quadToRelative(0.687f, 0.591f, 0.815f, 1.681f)
                horizontalLineToRelative(-1.06f)
                quadToRelative(-0.106f, -0.539f, -0.381f, -0.86f)
                quadToRelative(-0.446f, -0.517f, -1.202f, -0.517f)
                quadToRelative(-1.02f, 0.0f, -1.529f, 0.844f)
                quadToRelative(-0.404f, 0.668f, -0.404f, 1.653f)
                quadToRelative(0.0f, 1.031f, 0.41f, 1.681f)
                quadToRelative(0.51f, 0.797f, 1.465f, 0.797f)
                quadToRelative(0.698f, 0.0f, 1.136f, -0.422f)
                quadToRelative(0.44f, -0.422f, 0.557f, -1.195f)
                horizontalLineToRelative(1.043f)
                quadToRelative(-0.158f, 1.196f, -0.873f, 1.857f)
                quadToRelative(-0.715f, 0.663f, -1.84f, 0.662f)
                quadToRelative(-1.511f, 0.0f, -2.308f, -1.09f)
                quadTo(9.0f, 13.806f, 9.0f, 12.476f)
                quadToRelative(0.0f, -1.729f, 0.92f, -2.655f)
                quadToRelative(0.808f, -0.82f, 2.068f, -0.82f)
            }
        }
            .build()
        return _copyrightSmall!!
    }

private var _copyrightSmall: ImageVector? = null
