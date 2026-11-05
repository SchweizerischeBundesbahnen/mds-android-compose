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

public val SBBIcons.FaceWorkerSmall: ImageVector
    get() {
        if (_faceWorkerSmall != null) {
            return _faceWorkerSmall!!
        }
        _faceWorkerSmall = Builder(
            name = "FaceWorkerSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                moveTo(7.1f, 8.0f)
                arcToRelative(5.001f, 5.001f, 0.0f, false, true, 9.8f, 0.0f)
                lineTo(13.0f, 8.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.364f, 0.097f, 0.706f, 0.267f, 1.0f)
                lineTo(6.733f, 10.0f)
                curveToRelative(0.17f, -0.294f, 0.267f, -0.636f, 0.267f, -1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(11.0f, 8.0f)
                close()
                moveTo(19.0f, 10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.803f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.394f, 0.0f)
                lineTo(19.0f, 11.0f)
                close()
                moveTo(16.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 8.0f, 0.0f)
                moveToRelative(-7.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(4.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(-4.276f, 3.287f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 18.0f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, false, 3.276f, -1.714f)
                lineToRelative(-0.82f, -0.572f)
                arcTo(2.99f, 2.99f, 0.0f, false, true, 12.0f, 17.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.457f, -1.287f)
                close()
            }
        }
            .build()
        return _faceWorkerSmall!!
    }

private var _faceWorkerSmall: ImageVector? = null
