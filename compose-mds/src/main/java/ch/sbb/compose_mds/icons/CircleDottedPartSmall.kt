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

public val SBBIcons.CircleDottedPartSmall: ImageVector
    get() {
        if (_circleDottedPartSmall != null) {
            return _circleDottedPartSmall!!
        }
        _circleDottedPartSmall = Builder(name = "CircleDottedPartSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                quadToRelative(0.799f, -0.001f, 1.565f, -0.122f)
                lineToRelative(-0.156f, -0.987f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.818f, 0.0f)
                lineToRelative(-0.155f, 0.987f)
                quadToRelative(0.766f, 0.121f, 1.564f, 0.122f)
                moveToRelative(-3.227f, -1.596f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.437f, -1.409f)
                lineToRelative(-0.63f, 0.776f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 2.709f, 1.567f)
                close()
                moveTo(17.77f, 20.168f)
                quadToRelative(0.27f, -0.19f, 0.524f, -0.396f)
                arcToRelative(10.007f, 10.007f, 0.0f, false, false, 2.2f, -2.491f)
                lineToRelative(0.019f, -0.031f)
                arcTo(9.95f, 9.95f, 0.0f, false, false, 22.0f, 12.0f)
                arcToRelative(9.95f, 9.95f, 0.0f, false, false, -2.229f, -6.294f)
                arcToRelative(10.025f, 10.025f, 0.0f, false, false, -2.334f, -2.1f)
                arcTo(9.95f, 9.95f, 0.0f, false, false, 12.0f, 2.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.012f)
                quadToRelative(-0.54f, 0.027f, -1.065f, 0.11f)
                lineToRelative(0.156f, 0.987f)
                quadToRelative(0.447f, -0.07f, 0.909f, -0.095f)
                verticalLineToRelative(9.145f)
                lineToRelative(0.093f, 0.13f)
                lineToRelative(5.203f, 7.329f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -1.57f, 0.786f)
                lineToRelative(0.359f, 0.934f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 1.79f, -0.904f)
                lineToRelative(0.007f, 0.01f)
                close()
                moveTo(15.227f, 3.596f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -2.727f, -0.582f)
                verticalLineToRelative(8.827f)
                lineToRelative(5.11f, 7.196f)
                arcTo(8.98f, 8.98f, 0.0f, false, false, 21.0f, 11.91f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.596f, -3.137f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.206f, -0.492f)
                arcToRelative(9.04f, 9.04f, 0.0f, false, false, -4.971f, -4.685f)
                moveTo(5.005f, 17.664f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -1.41f, -2.437f)
                lineToRelative(-0.933f, 0.358f)
                curveToRelative(0.38f, 0.988f, 0.911f, 1.901f, 1.567f, 2.709f)
                close()
                moveTo(2.122f, 10.435f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 3.13f)
                lineToRelative(0.987f, -0.156f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.0f, -2.818f)
                close()
                moveTo(3.596f, 8.773f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.409f, -2.437f)
                lineToRelative(-0.776f, -0.63f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -1.567f, 2.709f)
                close()
                moveTo(6.336f, 5.005f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 2.437f, -1.41f)
                lineToRelative(-0.358f, -0.933f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 5.706f, 4.23f)
                close()
            }
        }
        .build()
        return _circleDottedPartSmall!!
    }

private var _circleDottedPartSmall: ImageVector? = null
