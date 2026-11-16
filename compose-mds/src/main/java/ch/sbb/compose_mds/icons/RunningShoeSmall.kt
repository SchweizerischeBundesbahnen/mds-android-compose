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
        _runningShoeSmall = Builder(name = "RunningShoeSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.734f, 6.272f)
                curveToRelative(-0.987f, -0.988f, -1.027f, -2.272f, -0.38f, -2.918f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(2.293f, 10.0f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(9.77f, 9.77f)
                lineToRelative(0.001f, -0.002f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 14.5f, 21.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                curveToRelative(-0.518f, 0.0f, -0.984f, -0.197f, -1.34f, -0.522f)
                lineToRelative(-3.194f, -8.16f)
                lineToRelative(-0.28f, -0.712f)
                lineToRelative(-0.54f, 0.54f)
                curveToRelative(-0.648f, 0.649f, -1.926f, 0.611f, -2.912f, -0.374f)
                moveToRelative(2.388f, 13.142f)
                lineTo(3.707f, 10.0f)
                lineToRelative(0.792f, -0.792f)
                lineToRelative(8.917f, 8.917f)
                lineToRelative(0.001f, -0.002f)
                arcTo(2.9f, 2.9f, 0.0f, false, false, 15.5f, 19.0f)
                horizontalLineToRelative(5.413f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.413f, 1.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.376f, -0.586f)
                close()
                moveTo(14.122f, 17.414f)
                lineTo(5.207f, 8.5f)
                lineToRelative(3.729f, -3.728f)
                curveToRelative(0.083f, 0.79f, 0.472f, 1.588f, 1.091f, 2.208f)
                curveToRelative(1.042f, 1.041f, 2.584f, 1.427f, 3.744f, 0.807f)
                lineTo(14.638f, 10.0f)
                lineTo(13.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.03f)
                lineToRelative(0.391f, 1.0f)
                lineTo(14.0f, 12.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.813f)
                lineToRelative(0.96f, 2.45f)
                lineToRelative(0.038f, 0.098f)
                lineToRelative(0.074f, 0.073f)
                arcTo(2.98f, 2.98f, 0.0f, false, false, 19.0f, 16.5f)
                curveToRelative(0.932f, 0.0f, 1.712f, 0.638f, 1.935f, 1.5f)
                lineTo(15.5f, 18.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.376f, -0.586f)
                close()
                moveTo(16.772f, 15.45f)
                lineTo(17.238f, 15.267f)
                close()
                moveTo(10.0f, 19.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(8.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 17.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.0f, 15.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _runningShoeSmall!!
    }

private var _runningShoeSmall: ImageVector? = null
