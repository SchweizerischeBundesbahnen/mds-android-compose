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

public val SBBIcons.CircleDottedPartXSmall: ImageVector
    get() {
        if (_circleDottedPartXSmall != null) {
            return _circleDottedPartXSmall!!
        }
        _circleDottedPartXSmall = Builder(name = "CircleDottedPartXSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 22.0f)
                quadToRelative(0.799f, -0.001f, 1.565f, -0.122f)
                lineToRelative(-0.156f, -0.987f)
                quadToRelative(-0.69f, 0.108f, -1.409f, 0.109f)
                close()
                moveTo(15.585f, 21.338f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 2.709f, -1.567f)
                lineToRelative(-0.63f, -0.776f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.437f, 1.41f)
                close()
                moveTo(19.771f, 18.294f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 1.567f, -2.709f)
                lineToRelative(-0.934f, -0.358f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -1.409f, 2.437f)
                close()
                moveTo(20.891f, 10.591f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.0f, 2.818f)
                lineToRelative(0.987f, 0.155f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -3.129f)
                close()
                moveTo(3.0f, 12.0f)
                quadToRelative(0.0f, -0.72f, 0.11f, -1.41f)
                lineToRelative(-0.988f, -0.155f)
                quadTo(2.001f, 11.202f, 2.0f, 12.0f)
                close()
                moveTo(3.596f, 8.773f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.409f, -2.437f)
                lineToRelative(-0.776f, -0.63f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -1.567f, 2.709f)
                close()
                moveTo(20.54f, 6.795f)
                quadToRelative(-0.35f, -0.57f, -0.768f, -1.089f)
                arcToRelative(10.006f, 10.006f, 0.0f, false, false, -3.021f, -2.508f)
                arcTo(9.95f, 9.95f, 0.0f, false, false, 11.999f, 2.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.012f)
                quadToRelative(-0.54f, 0.027f, -1.065f, 0.11f)
                lineToRelative(0.156f, 0.987f)
                quadToRelative(0.447f, -0.07f, 0.909f, -0.095f)
                verticalLineToRelative(9.884f)
                lineToRelative(0.763f, -0.473f)
                lineToRelative(7.643f, -4.73f)
                quadToRelative(0.283f, 0.521f, 0.498f, 1.078f)
                lineToRelative(0.934f, -0.358f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -0.58f, -1.247f)
                lineToRelative(0.01f, -0.006f)
                close()
                moveTo(6.336f, 5.005f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 2.437f, -1.41f)
                lineToRelative(-0.358f, -0.933f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 5.706f, 4.23f)
                close()
                moveTo(19.378f, 6.845f)
                lineTo(12.5f, 11.103f)
                lineTo(12.5f, 3.015f)
                arcToRelative(8.99f, 8.99f, 0.0f, false, true, 6.878f, 3.832f)
                moveTo(6.0f, 18.708f)
                lineToRelative(-2.646f, 2.646f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(5.293f, 18.0f)
                lineToRelative(-2.647f, -2.647f)
                lineToRelative(0.708f, -0.707f)
                lineTo(6.0f, 17.293f)
                lineToRelative(2.646f, -2.647f)
                lineToRelative(0.708f, 0.707f)
                lineTo(6.707f, 18.0f)
                lineToRelative(2.647f, 2.646f)
                lineToRelative(-0.708f, 0.707f)
                close()
            }
        }
        .build()
        return _circleDottedPartXSmall!!
    }

private var _circleDottedPartXSmall: ImageVector? = null
