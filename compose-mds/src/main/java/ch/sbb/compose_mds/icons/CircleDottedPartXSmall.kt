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
        _circleDottedPartXSmall = Builder(
            name = "CircleDottedPartXSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
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
                moveTo(12.594f, 2.017f)
                arcToRelative(9.94f, 9.94f, 0.0f, false, true, 5.7f, 2.211f)
                arcToRelative(10.097f, 10.097f, 0.0f, false, true, 2.21f, 2.508f)
                lineToRelative(0.264f, 0.426f)
                lineToRelative(-0.01f, 0.006f)
                quadToRelative(0.331f, 0.6f, 0.58f, 1.247f)
                lineToRelative(-0.933f, 0.359f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.5f, -1.079f)
                lineToRelative(-7.642f, 4.73f)
                lineToRelative(-0.763f, 0.472f)
                lineTo(11.5f, 3.014f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -0.909f, 0.096f)
                lineToRelative(-0.155f, -0.988f)
                quadToRelative(0.524f, -0.083f, 1.064f, -0.11f)
                lineTo(11.5f, 2.0f)
                horizontalLineToRelative(0.5f)
                quadToRelative(0.3f, 0.0f, 0.594f, 0.017f)
                moveToRelative(6.4f, 4.32f)
                quadToRelative(0.202f, 0.246f, 0.385f, 0.509f)
                lineTo(12.5f, 11.103f)
                verticalLineToRelative(-8.09f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, true, 5.164f, 1.992f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.33f, 1.331f)
                moveTo(6.337f, 5.004f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 2.438f, -1.41f)
                lineToRelative(-0.359f, -0.933f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -2.709f, 1.566f)
                close()
                moveTo(3.597f, 8.773f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.41f, -2.438f)
                lineToRelative(-0.778f, -0.63f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -1.566f, 2.71f)
                close()
                moveTo(3.0f, 12.0f)
                quadToRelative(0.0f, -0.72f, 0.11f, -1.409f)
                lineToRelative(-0.988f, -0.155f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                close()
                moveTo(20.89f, 10.591f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.0f, 2.818f)
                lineToRelative(0.988f, 0.155f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -3.128f)
                close()
                moveTo(20.405f, 15.226f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -1.41f, 2.438f)
                lineToRelative(0.777f, 0.63f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 1.566f, -2.71f)
                close()
                moveTo(17.664f, 18.995f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.438f, 1.41f)
                lineToRelative(0.359f, 0.933f)
                curveToRelative(0.988f, -0.38f, 1.9f, -0.911f, 2.709f, -1.566f)
                close()
                moveTo(13.409f, 20.89f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 12.0f, 21.0f)
                verticalLineToRelative(1.0f)
                quadToRelative(0.799f, -0.001f, 1.564f, -0.122f)
                close()
                moveTo(6.0f, 18.707f)
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
