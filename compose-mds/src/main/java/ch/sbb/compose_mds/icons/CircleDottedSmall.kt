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

public val SBBIcons.CircleDottedSmall: ImageVector
    get() {
        if (_circleDottedSmall != null) {
            return _circleDottedSmall!!
        }
        _circleDottedSmall = Builder(name = "CircleDottedSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.436f, 2.122f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 3.128f, 0.0f)
                lineToRelative(-0.155f, 0.988f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -2.818f, 0.0f)
                close()
                moveTo(15.585f, 2.662f)
                curveToRelative(0.988f, 0.38f, 1.9f, 0.911f, 2.709f, 1.566f)
                lineToRelative(-0.63f, 0.777f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -2.438f, -1.41f)
                close()
                moveTo(5.706f, 4.228f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 2.71f, -1.566f)
                lineToRelative(0.358f, 0.933f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -2.438f, 1.41f)
                close()
                moveTo(19.772f, 5.706f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 1.566f, 2.71f)
                lineToRelative(-0.933f, 0.358f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -1.41f, -2.438f)
                close()
                moveTo(2.662f, 8.416f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 1.566f, -2.71f)
                lineToRelative(0.777f, 0.63f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -1.41f, 2.438f)
                close()
                moveTo(21.878f, 10.436f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 3.128f)
                lineToRelative(-0.988f, -0.155f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -2.818f)
                close()
                moveTo(2.0f, 12.0f)
                quadToRelative(0.001f, -0.799f, 0.122f, -1.564f)
                lineToRelative(0.988f, 0.155f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, 2.818f)
                lineToRelative(-0.988f, 0.155f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                moveToRelative(19.338f, 3.585f)
                curveToRelative(-0.38f, 0.988f, -0.911f, 1.9f, -1.566f, 2.709f)
                lineToRelative(-0.777f, -0.63f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 1.41f, -2.438f)
                close()
                moveTo(4.228f, 18.294f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -1.566f, -2.71f)
                lineToRelative(0.933f, -0.358f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 1.41f, 2.438f)
                close()
                moveTo(18.294f, 19.772f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.71f, 1.566f)
                lineToRelative(-0.358f, -0.933f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.438f, -1.41f)
                close()
                moveTo(8.415f, 21.338f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -2.709f, -1.566f)
                lineToRelative(0.63f, -0.777f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.438f, 1.41f)
                close()
                moveTo(12.0f, 22.0f)
                quadToRelative(-0.799f, -0.001f, -1.564f, -0.122f)
                lineToRelative(0.155f, -0.988f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.818f, 0.0f)
                lineToRelative(0.155f, 0.988f)
                quadTo(12.798f, 22.0f, 12.0f, 22.0f)
            }
        }
        .build()
        return _circleDottedSmall!!
    }

private var _circleDottedSmall: ImageVector? = null
