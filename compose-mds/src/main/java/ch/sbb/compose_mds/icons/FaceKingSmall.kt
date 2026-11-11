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

public val SBBIcons.FaceKingSmall: ImageVector
    get() {
        if (_faceKingSmall != null) {
            return _faceKingSmall!!
        }
        _faceKingSmall = Builder(name = "FaceKingSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 8.3f)
                lineTo(6.0f, 1.618f)
                lineToRelative(0.757f, 0.454f)
                lineToRelative(2.165f, 1.3f)
                lineToRelative(1.224f, -1.225f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(1.5f, 1.5f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.577f, 1.577f)
                lineToRelative(2.166f, -1.299f)
                lineToRelative(0.757f, -0.454f)
                verticalLineToRelative(6.684f)
                arcToRelative(7.65f, 7.65f, 0.0f, false, true, 1.999f, 5.735f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.99f, 0.36f)
                lineTo(4.0f, 14.0f)
                arcToRelative(7.65f, 7.65f, 0.0f, false, true, 2.0f, -5.7f)
                moveToRelative(0.717f, 0.7f)
                arcToRelative(6.65f, 6.65f, 0.0f, false, false, -1.718f, 4.964f)
                lineTo(4.999f, 14.0f)
                arcToRelative(7.002f, 7.002f, 0.0f, false, false, 11.95f, 4.95f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 19.0f, 14.0f)
                verticalLineToRelative(-0.019f)
                lineToRelative(0.003f, -0.017f)
                lineToRelative(0.498f, 0.036f)
                lineToRelative(-0.498f, -0.036f)
                arcTo(6.65f, 6.65f, 0.0f, false, false, 17.284f, 9.0f)
                close()
                moveTo(12.0f, 4.707f)
                lineToRelative(-1.5f, -1.5f)
                lineTo(9.077f, 4.63f)
                lineToRelative(-0.334f, -0.201f)
                lineTo(7.0f, 3.383f)
                lineTo(7.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 3.383f)
                lineToRelative(-1.743f, 1.046f)
                lineToRelative(-0.334f, 0.2f)
                lineTo(13.5f, 3.208f)
                close()
                moveTo(14.91f, 12.91f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, -0.36f, 0.0f)
                arcToRelative(0.18f, 0.18f, 0.0f, true, false, 0.36f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.181f, 1.181f, 0.0f, true, true, -2.362f, -0.001f)
                arcToRelative(1.181f, 1.181f, 0.0f, false, true, 2.362f, 0.0f)
                moveToRelative(-6.64f, -0.18f)
                arcToRelative(0.18f, 0.18f, 0.0f, true, true, 0.0f, 0.36f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, true, 0.0f, -0.36f)
                moveToRelative(0.0f, 1.36f)
                arcToRelative(1.181f, 1.181f, 0.0f, true, false, -0.001f, -2.362f)
                arcToRelative(1.181f, 1.181f, 0.0f, false, false, 0.0f, 2.362f)
                moveToRelative(6.886f, 2.688f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -8.312f, 0.0f)
                lineToRelative(0.832f, -0.556f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.648f, 0.0f)
                close()
            }
        }
        .build()
        return _faceKingSmall!!
    }

private var _faceKingSmall: ImageVector? = null
