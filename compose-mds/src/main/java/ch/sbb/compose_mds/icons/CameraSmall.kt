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

public val SBBIcons.CameraSmall: ImageVector
    get() {
        if (_cameraSmall != null) {
            return _cameraSmall!!
        }
        _cameraSmall = Builder(name = "CameraSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(14.86f, 4.0f)
                lineToRelative(0.115f, 0.343f)
                lineTo(15.857f, 7.0f)
                lineTo(22.0f, 7.0f)
                verticalLineToRelative(13.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.14f)
                lineToRelative(0.885f, -2.658f)
                lineTo(9.14f, 4.0f)
                close()
                moveTo(9.86f, 5.0f)
                horizontalLineToRelative(4.28f)
                lineToRelative(0.663f, 2.0f)
                lineTo(9.195f, 7.0f)
                close()
                moveTo(3.0f, 19.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(12.0f, 10.5f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(0.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
            }
        }
        .build()
        return _cameraSmall!!
    }

private var _cameraSmall: ImageVector? = null
