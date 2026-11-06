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

public val SBBIcons.FaceWorkerMedium: ImageVector
    get() {
        if (_faceWorkerMedium != null) {
            return _faceWorkerMedium!!
        }
        _faceWorkerMedium = Builder(name = "FaceWorkerMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.254f, 13.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.004f, 0.25f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -0.628f, 1.75f)
                horizontalLineToRelative(16.757f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, true, -0.629f, -1.75f)
                quadToRelative(0.0f, -0.126f, -0.004f, -0.25f)
                lineTo(19.5f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.15f)
                arcToRelative(7.752f, 7.752f, 0.0f, false, false, -15.3f, 0.0f)
                horizontalLineToRelative(6.15f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(28.5f, 15.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.75f, -1.75f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -17.5f, 0.0f)
                curveToRelative(0.0f, 0.967f, -0.783f, 1.75f, -1.75f, 1.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.15f)
                arcToRelative(8.75f, 8.75f, 0.0f, true, false, 14.699f, 0.0f)
                lineTo(28.5f, 16.25f)
                close()
                moveTo(24.123f, 16.25f)
                lineTo(11.876f, 16.25f)
                arcTo(7.7f, 7.7f, 0.0f, false, false, 10.25f, 21.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, true, false, 13.873f, -4.75f)
                moveToRelative(-9.123f, 3.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(7.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(-6.46f, 4.787f)
                arcTo(5.74f, 5.74f, 0.0f, false, false, 18.0f, 26.75f)
                curveToRelative(1.953f, 0.0f, 3.673f, -0.98f, 4.71f, -2.464f)
                lineToRelative(-0.82f, -0.572f)
                arcTo(4.74f, 4.74f, 0.0f, false, true, 18.0f, 25.75f)
                arcToRelative(4.74f, 4.74f, 0.0f, false, true, -3.89f, -2.037f)
                close()
            }
        }
        .build()
        return _faceWorkerMedium!!
    }

private var _faceWorkerMedium: ImageVector? = null
