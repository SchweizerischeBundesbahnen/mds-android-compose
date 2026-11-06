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

public val SBBIcons.CheckpointsMedium: ImageVector
    get() {
        if (_checkpointsMedium != null) {
            return _checkpointsMedium!!
        }
        _checkpointsMedium = Builder(name = "CheckpointsMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 3.25f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.976f, 4.5f)
                horizontalLineTo(29.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, 3.5f)
                lineToRelative(-7.026f, -0.001f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -9.949f, 0.0f)
                horizontalLineTo(6.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(16.025f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 1.0f)
                horizontalLineTo(6.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, -3.5f)
                verticalLineToRelative(-4.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                horizontalLineToRelative(5.525f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 9.95f, 0.0f)
                horizontalLineToRelative(7.025f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                horizontalLineTo(13.226f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -4.976f, -5.5f)
                moveToRelative(19.5f, 20.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                moveToRelative(2.603f, 2.853f)
                lineTo(27.0f, 29.957f)
                lineToRelative(-1.854f, -1.854f)
                lineToRelative(0.707f, -0.707f)
                lineTo(27.0f, 28.543f)
                lineToRelative(2.646f, -2.647f)
                close()
                moveTo(17.25f, 13.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                moveToRelative(2.603f, 2.853f)
                lineTo(16.5f, 19.456f)
                lineToRelative(-1.854f, -1.854f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(1.147f, 1.147f)
                lineToRelative(2.646f, -2.647f)
                close()
                moveTo(8.25f, 4.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                moveToRelative(2.603f, 2.853f)
                lineTo(7.5f, 10.457f)
                lineTo(5.646f, 8.603f)
                lineToRelative(0.707f, -0.707f)
                lineTo(7.5f, 9.043f)
                lineToRelative(2.646f, -2.647f)
                close()
            }
        }
        .build()
        return _checkpointsMedium!!
    }

private var _checkpointsMedium: ImageVector? = null
