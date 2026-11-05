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

public val SBBIcons.RunningShoeSmall: ImageVector
    get() {
        if (_runningShoeSmall != null) {
            return _runningShoeSmall!!
        }
        _runningShoeSmall = Builder(
            name = "RunningShoeSmall",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(10.735f, 6.272f)
                curveTo(9.747f, 5.284f, 9.707f, 4.0f, 10.354f, 3.354f)
                lineToRelative(-0.708f, -0.708f)
                lineToRelative(-5.5f, 5.5f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(9.77f, 9.77f)
                lineToRelative(0.002f, -0.002f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 14.5f, 21.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                curveToRelative(-0.516f, 0.0f, -0.981f, -0.195f, -1.337f, -0.517f)
                lineToRelative(-3.197f, -8.165f)
                lineToRelative(-0.28f, -0.712f)
                lineToRelative(-0.54f, 0.54f)
                curveToRelative(-0.648f, 0.649f, -1.926f, 0.611f, -2.911f, -0.374f)
                moveToRelative(2.389f, 13.142f)
                lineToRelative(-0.002f, 0.001f)
                lineTo(3.707f, 10.0f)
                lineToRelative(0.793f, -0.793f)
                lineToRelative(8.916f, 8.917f)
                lineToRelative(0.002f, -0.002f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 15.5f, 19.0f)
                horizontalLineToRelative(5.415f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.415f, 1.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.376f, -0.586f)
                moveToRelative(0.998f, -1.999f)
                lineTo(5.207f, 8.5f)
                lineToRelative(3.728f, -3.728f)
                curveToRelative(0.084f, 0.79f, 0.474f, 1.588f, 1.093f, 2.207f)
                curveToRelative(1.041f, 1.041f, 2.584f, 1.428f, 3.743f, 0.808f)
                lineTo(14.638f, 10.0f)
                lineTo(13.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.03f)
                lineToRelative(0.391f, 1.0f)
                lineTo(14.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.813f)
                lineToRelative(0.96f, 2.45f)
                lineToRelative(0.037f, 0.098f)
                lineToRelative(0.074f, 0.073f)
                arcTo(2.98f, 2.98f, 0.0f, false, false, 19.0f, 16.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.937f, 1.5f)
                lineTo(15.5f, 18.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.376f, -0.586f)
                close()
                moveTo(6.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(4.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(2.0f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 16.0f)
                close()
            }
        }
            .build()
        return _runningShoeSmall!!
    }

private var _runningShoeSmall: ImageVector? = null
