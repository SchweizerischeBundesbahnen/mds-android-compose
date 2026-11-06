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
                moveTo(30.0f, 9.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 9.0f, 0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -9.0f, 0.0f)
                moveTo(34.5f, 4.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -4.773f, 8.235f)
                lineToRelative(-15.031f, 8.709f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, 7.113f)
                lineToRelative(15.031f, 8.708f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.577f, -0.821f)
                lineToRelative(-15.031f, -8.709f)
                curveToRelative(0.463f, -0.806f, 0.727f, -1.74f, 0.727f, -2.735f)
                curveToRelative(0.0f, -0.996f, -0.265f, -1.93f, -0.727f, -2.735f)
                lineToRelative(15.031f, -8.709f)
                arcTo(5.5f, 5.5f, 0.0f, true, false, 34.5f, 4.0f)
                moveToRelative(-24.0f, 16.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -9.0f)
                moveToRelative(24.0f, 15.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.0f, 9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 0.0f, -9.0f)
            }
        }
        .build()
        return _shareLarge!!
    }

private var _shareLarge: ImageVector? = null
