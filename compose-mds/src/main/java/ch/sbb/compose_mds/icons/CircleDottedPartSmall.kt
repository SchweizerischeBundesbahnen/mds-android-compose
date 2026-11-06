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
                moveTo(11.5f, 2.012f)
                quadToRelative(-0.54f, 0.027f, -1.064f, 0.11f)
                lineToRelative(0.155f, 0.988f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.909f, -0.096f)
                verticalLineToRelative(9.146f)
                lineToRelative(0.092f, 0.13f)
                lineToRelative(5.203f, 7.328f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -1.569f, 0.787f)
                lineToRelative(0.359f, 0.933f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 1.79f, -0.904f)
                lineToRelative(0.007f, 0.01f)
                lineToRelative(0.408f, -0.29f)
                lineToRelative(0.038f, -0.027f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.466f, -0.355f)
                arcToRelative(10.013f, 10.013f, 0.0f, false, false, 2.598f, -3.19f)
                arcTo(9.96f, 9.96f, 0.0f, false, false, 22.0f, 11.999f)
                curveToRelative(0.0f, -5.39f, -4.264f, -9.784f, -9.603f, -9.992f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(20.99f, 12.414f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.008f, -0.593f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.5f, 3.014f)
                verticalLineToRelative(8.827f)
                lineToRelative(5.11f, 7.197f)
                lineToRelative(0.054f, -0.043f)
                arcToRelative(9.013f, 9.013f, 0.0f, false, false, 2.308f, -2.813f)
                arcToRelative(8.95f, 8.95f, 0.0f, false, false, 1.019f, -3.769f)
                moveTo(8.416f, 2.662f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -2.709f, 1.566f)
                lineToRelative(0.63f, 0.777f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 2.438f, -1.41f)
                close()
                moveTo(4.228f, 5.706f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -1.566f, 2.71f)
                lineToRelative(0.933f, 0.358f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.41f, -2.438f)
                close()
                moveTo(2.122f, 10.436f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 3.128f)
                lineToRelative(0.988f, -0.155f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 0.0f, -2.818f)
                close()
                moveTo(2.662f, 15.585f)
                curveToRelative(0.38f, 0.988f, 0.911f, 1.9f, 1.566f, 2.709f)
                lineToRelative(0.777f, -0.63f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -1.41f, -2.438f)
                close()
                moveTo(5.706f, 19.772f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 2.71f, 1.566f)
                lineToRelative(0.358f, -0.933f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.438f, -1.41f)
                close()
                moveTo(10.436f, 21.878f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 3.128f, 0.0f)
                lineToRelative(-0.155f, -0.988f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -2.818f, 0.0f)
                close()
            }
        }
        .build()
        return _circleDottedPartSmall!!
    }

private var _circleDottedPartSmall: ImageVector? = null
