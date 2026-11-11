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

public val SBBIcons.ArrowTurnUpSmall: ImageVector
    get() {
        if (_arrowTurnUpSmall != null) {
            return _arrowTurnUpSmall!!
        }
        _arrowTurnUpSmall = Builder(name = "ArrowTurnUpSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.83f, 16.362f)
                curveTo(10.507f, 17.508f, 8.643f, 18.0f, 6.5f, 18.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(2.276f, 0.0f, 4.412f, -0.52f, 5.984f, -1.882f)
                curveTo(14.07f, 15.746f, 15.0f, 13.59f, 15.0f, 10.5f)
                verticalLineTo(6.724f)
                lineToRelative(2.287f, 2.28f)
                lineToRelative(0.707f, -0.706f)
                lineToRelative(-3.15f, -3.143f)
                lineToRelative(-0.353f, -0.352f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-3.14f, 3.142f)
                lineToRelative(0.707f, 0.707f)
                lineTo(14.0f, 6.708f)
                verticalLineTo(10.5f)
                curveToRelative(0.0f, 2.884f, -0.86f, 4.728f, -2.17f, 5.862f)
                moveTo(14.48f, 5.5f)
                lineToRelative(-0.343f, -0.344f)
                lineToRelative(0.344f, 0.344f)
                moveToRelative(0.02f, 0.0f)
                lineToRelative(0.345f, -0.345f)
                lineToRelative(-0.343f, 0.345f)
                close()
            }
        }
        .build()
        return _arrowTurnUpSmall!!
    }

private var _arrowTurnUpSmall: ImageVector? = null
