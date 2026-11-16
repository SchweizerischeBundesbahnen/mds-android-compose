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

public val SBBIcons.CircleDottedSmall: ImageVector
    get() {
        if (_circleDottedSmall != null) {
            return _circleDottedSmall!!
        }
        _circleDottedSmall = Builder(name = "CircleDottedSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.565f, 21.878f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -3.13f, 0.0f)
                lineToRelative(0.156f, -0.987f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.818f, 0.0f)
                close()
                moveTo(6.335f, 18.995f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.438f, 1.41f)
                lineToRelative(-0.358f, 0.933f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.709f, -1.567f)
                close()
                moveTo(18.294f, 19.771f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.709f, 1.567f)
                lineToRelative(-0.358f, -0.934f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.437f, -1.409f)
                close()
                moveTo(3.596f, 15.228f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 1.409f, 2.437f)
                lineToRelative(-0.776f, 0.63f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -1.567f, -2.709f)
                close()
                moveTo(21.338f, 15.586f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -1.567f, 2.709f)
                lineToRelative(-0.776f, -0.63f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 1.41f, -2.437f)
                close()
                moveTo(2.0f, 12.0f)
                quadToRelative(0.001f, -0.799f, 0.122f, -1.565f)
                lineToRelative(0.987f, 0.156f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 2.818f)
                lineToRelative(-0.987f, 0.155f)
                quadTo(2.001f, 12.799f, 2.0f, 12.0f)
                moveToRelative(19.0f, 0.0f)
                quadToRelative(0.0f, -0.72f, -0.11f, -1.41f)
                lineToRelative(0.988f, -0.155f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 3.13f)
                lineToRelative(-0.987f, -0.156f)
                quadToRelative(0.108f, -0.69f, 0.109f, -1.409f)
                moveTo(5.005f, 6.336f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -1.41f, 2.437f)
                lineToRelative(-0.933f, -0.358f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 4.23f, 5.706f)
                close()
                moveTo(19.772f, 5.706f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 1.566f, 2.709f)
                lineToRelative(-0.934f, 0.358f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -1.409f, -2.437f)
                close()
                moveTo(8.772f, 3.596f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -2.437f, 1.409f)
                lineToRelative(-0.63f, -0.776f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 2.709f, -1.567f)
                close()
                moveTo(15.584f, 2.662f)
                curveToRelative(0.988f, 0.38f, 1.901f, 0.911f, 2.709f, 1.567f)
                lineToRelative(-0.63f, 0.776f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -2.437f, -1.41f)
                close()
                moveTo(12.0f, 2.0f)
                quadToRelative(0.799f, 0.001f, 1.565f, 0.122f)
                lineToRelative(-0.156f, 0.987f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -2.818f, 0.0f)
                lineToRelative(-0.155f, -0.987f)
                quadTo(11.202f, 2.001f, 12.0f, 2.0f)
            }
        }
        .build()
        return _circleDottedSmall!!
    }

private var _circleDottedSmall: ImageVector? = null
