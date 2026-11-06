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
                moveToRelative(6.0f, 1.617f)
                lineToRelative(0.757f, 0.454f)
                lineToRelative(2.165f, 1.3f)
                lineToRelative(1.224f, -1.225f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(0.354f, 0.353f)
                lineTo(12.0f, 3.293f)
                lineToRelative(1.146f, -1.147f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(1.223f, 1.224f)
                lineToRelative(2.166f, -1.299f)
                lineToRelative(0.757f, -0.454f)
                lineTo(18.0f, 8.3f)
                arcToRelative(7.65f, 7.65f, 0.0f, false, true, 2.0f, 5.717f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(7.65f, 7.65f, 0.0f, false, true, 2.0f, -5.717f)
                lineTo(6.0f, 1.617f)
                moveTo(6.716f, 9.0f)
                arcToRelative(6.65f, 6.65f, 0.0f, false, false, -1.717f, 4.964f)
                lineTo(4.999f, 14.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, true, false, 14.0f, 0.0f)
                verticalLineToRelative(-0.018f)
                lineToRelative(0.002f, -0.018f)
                arcTo(6.65f, 6.65f, 0.0f, false, false, 17.284f, 9.0f)
                close()
                moveTo(7.0f, 3.383f)
                lineTo(7.0f, 8.0f)
                horizontalLineToRelative(10.0f)
                lineTo(17.0f, 3.383f)
                lineTo(15.257f, 4.43f)
                lineToRelative(-0.335f, 0.2f)
                lineToRelative(-0.276f, -0.275f)
                lineTo(13.5f, 3.207f)
                lineToRelative(-1.146f, 1.147f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineTo(10.5f, 3.207f)
                lineTo(9.353f, 4.354f)
                lineToRelative(-0.276f, 0.276f)
                lineToRelative(-0.334f, -0.201f)
                close()
                moveTo(14.73f, 12.73f)
                arcToRelative(0.18f, 0.18f, 0.0f, true, false, 0.0f, 0.36f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, 0.0f, -0.36f)
                moveToRelative(-1.18f, 0.18f)
                arcToRelative(1.18f, 1.18f, 0.0f, true, true, 2.36f, 0.0f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, true, -2.36f, 0.0f)
                moveToRelative(-4.46f, 0.0f)
                arcToRelative(0.18f, 0.18f, 0.0f, true, true, 0.36f, 0.0f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, true, -0.36f, 0.0f)
                moveToRelative(0.18f, -1.18f)
                arcToRelative(1.18f, 1.18f, 0.0f, true, false, 0.0f, 2.36f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, false, 0.0f, -2.36f)
                moveToRelative(0.374f, 6.678f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -1.8f, -1.63f)
                lineToRelative(0.831f, -0.556f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.65f, 0.0f)
                lineToRelative(0.83f, 0.556f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -6.51f, 1.63f)
            }
        }
        .build()
        return _faceKingSmall!!
    }

private var _faceKingSmall: ImageVector? = null
