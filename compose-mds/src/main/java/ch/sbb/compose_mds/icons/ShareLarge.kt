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

public val SBBIcons.ShareLarge: ImageVector
    get() {
        if (_shareLarge != null) {
            return _shareLarge!!
        }
        _shareLarge = Builder(name = "ShareLarge", defaultWidth = 48.0.dp, defaultHeight = 48.0.dp,
                viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(34.5f, 5.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, -9.0f)
                moveToRelative(0.0f, 10.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, -4.773f, -2.765f)
                lineToRelative(-15.031f, 8.709f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 7.113f)
                lineToRelative(15.031f, 8.708f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.577f, -0.821f)
                lineToRelative(-15.031f, -8.71f)
                curveToRelative(0.463f, -0.805f, 0.727f, -1.738f, 0.727f, -2.734f)
                reflectiveCurveToRelative(-0.264f, -1.93f, -0.727f, -2.735f)
                lineToRelative(15.031f, -8.709f)
                arcTo(5.49f, 5.49f, 0.0f, false, false, 34.5f, 15.0f)
                moveTo(15.0f, 24.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 9.0f, 0.0f)
                moveToRelative(24.0f, 15.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, -9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 9.0f, 0.0f)
            }
        }
        .build()
        return _shareLarge!!
    }

private var _shareLarge: ImageVector? = null
