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

public val SBBIcons.FaceWorkerLarge: ImageVector
    get() {
        if (_faceWorkerLarge != null) {
            return _faceWorkerLarge!!
        }
        _faceWorkerLarge = Builder(
            name = "FaceWorkerLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(23.5f, 7.0f)
                curveTo(29.85f, 7.0f, 35.0f, 12.148f, 35.0f, 18.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.515f)
                arcTo(11.44f, 11.44f, 0.0f, false, true, 35.0f, 28.5f)
                curveTo(35.0f, 34.85f, 29.85f, 40.0f, 23.5f, 40.0f)
                curveTo(17.148f, 40.0f, 12.0f, 34.85f, 12.0f, 28.5f)
                curveToRelative(0.0f, -2.413f, 0.743f, -4.65f, 2.013f, -6.5f)
                lineTo(9.5f, 22.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(1.382f, 0.0f, 2.5f, -1.118f, 2.5f, -2.5f)
                curveTo(12.0f, 12.148f, 17.148f, 7.0f, 23.5f, 7.0f)
                moveToRelative(-8.244f, 15.0f)
                arcTo(10.44f, 10.44f, 0.0f, false, false, 13.0f, 28.5f)
                curveTo(13.0f, 34.298f, 17.7f, 39.0f, 23.5f, 39.0f)
                curveTo(29.298f, 39.0f, 34.0f, 34.298f, 34.0f, 28.5f)
                curveToRelative(0.0f, -2.456f, -0.845f, -4.712f, -2.258f, -6.5f)
                close()
                moveTo(29.644f, 32.786f)
                arcTo(7.48f, 7.48f, 0.0f, false, true, 23.502f, 36.0f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, true, -6.145f, -3.214f)
                lineToRelative(0.82f, -0.572f)
                arcTo(6.49f, 6.49f, 0.0f, false, false, 23.503f, 35.0f)
                arcToRelative(6.48f, 6.48f, 0.0f, false, false, 5.321f, -2.786f)
                close()
                moveTo(19.5f, 25.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                moveToRelative(-8.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(8.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(-4.0f, -18.0f)
                curveToRelative(-5.29f, 0.0f, -9.664f, 3.911f, -10.392f, 9.0f)
                lineTo(22.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-8.987f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -0.013f, 0.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.05f, 2.5f)
                horizontalLineToRelative(23.1f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 34.0f, 18.5f)
                quadToRelative(0.0f, -0.252f, -0.013f, -0.5f)
                lineTo(25.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.892f)
                curveToRelative(-0.728f, -5.089f, -5.103f, -9.0f, -10.392f, -9.0f)
            }
        }
            .build()
        return _faceWorkerLarge!!
    }

private var _faceWorkerLarge: ImageVector? = null
