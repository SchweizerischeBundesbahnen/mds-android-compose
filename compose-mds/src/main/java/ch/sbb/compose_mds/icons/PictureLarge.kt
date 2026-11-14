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

public val SBBIcons.PictureLarge: ImageVector
    get() {
        if (_pictureLarge != null) {
            return _pictureLarge!!
        }
        _pictureLarge = Builder(name = "PictureLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(44.0f, 4.0f)
                verticalLineToRelative(40.0f)
                lineTo(4.0f, 44.0f)
                lineTo(4.0f, 4.0f)
                close()
                moveTo(5.0f, 43.0f)
                horizontalLineToRelative(38.0f)
                verticalLineToRelative(-6.0f)
                lineTo(5.0f, 37.0f)
                close()
                moveTo(41.765f, 36.0f)
                lineTo(43.0f, 36.0f)
                lineTo(43.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                verticalLineToRelative(31.0f)
                horizontalLineToRelative(1.225f)
                lineToRelative(6.853f, -10.769f)
                lineToRelative(0.304f, -0.476f)
                lineToRelative(0.435f, 0.36f)
                lineToRelative(8.173f, 6.729f)
                lineToRelative(9.656f, -9.696f)
                lineToRelative(0.427f, -0.43f)
                lineToRelative(0.341f, 0.502f)
                close()
                moveTo(34.588f, 27.205f)
                lineTo(31.926f, 23.282f)
                lineTo(28.216f, 27.009f)
                lineTo(29.5f, 28.293f)
                lineTo(31.5f, 26.293f)
                lineTo(33.5f, 28.293f)
                close()
                moveTo(35.16f, 28.047f)
                lineTo(40.556f, 36.0f)
                lineTo(19.263f, 36.0f)
                lineToRelative(3.115f, -3.128f)
                lineToRelative(5.132f, -5.155f)
                lineToRelative(1.99f, 1.99f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(13.618f, 26.244f)
                lineTo(21.282f, 32.556f)
                lineTo(17.852f, 36.0f)
                lineTo(7.411f, 36.0f)
                close()
                moveTo(15.5f, 12.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(0.0f, 6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.817f, 11.45f)
                lineTo(12.524f, 10.744f)
                lineTo(10.246f, 8.467f)
                lineTo(9.539f, 9.174f)
                close()
                moveTo(16.0f, 7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.0f, 7.0f)
                close()
                moveTo(19.245f, 11.506f)
                lineTo(21.509f, 9.268f)
                lineTo(20.806f, 8.557f)
                lineTo(18.542f, 10.795f)
                close()
                moveTo(23.0f, 15.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(20.818f, 20.452f)
                lineTo(21.524f, 19.742f)
                lineTo(19.257f, 17.486f)
                lineTo(18.552f, 18.195f)
                close()
                moveTo(16.0f, 19.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(10.25f, 20.52f)
                lineTo(12.511f, 18.259f)
                lineTo(11.804f, 17.552f)
                lineTo(9.542f, 19.814f)
                close()
            }
        }
        .build()
        return _pictureLarge!!
    }

private var _pictureLarge: ImageVector? = null
