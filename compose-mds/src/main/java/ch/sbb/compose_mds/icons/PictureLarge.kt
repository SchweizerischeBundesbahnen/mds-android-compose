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
                moveTo(4.0f, 4.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(40.0f)
                lineTo(4.0f, 44.0f)
                lineTo(4.0f, 4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(31.0f)
                horizontalLineToRelative(1.226f)
                lineToRelative(6.852f, -10.768f)
                lineToRelative(0.304f, -0.477f)
                lineToRelative(0.436f, 0.359f)
                lineToRelative(8.172f, 6.73f)
                lineToRelative(9.656f, -9.697f)
                lineToRelative(0.427f, -0.43f)
                lineToRelative(0.34f, 0.502f)
                lineTo(41.766f, 36.0f)
                lineTo(43.0f, 36.0f)
                lineTo(43.0f, 5.0f)
                close()
                moveTo(5.0f, 43.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(38.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(34.588f, 27.205f)
                lineTo(31.927f, 23.282f)
                lineTo(28.216f, 27.009f)
                lineTo(29.5f, 28.293f)
                lineTo(31.146f, 26.646f)
                lineTo(31.5f, 26.293f)
                lineTo(31.854f, 26.646f)
                lineTo(33.5f, 28.293f)
                close()
                moveTo(35.16f, 28.047f)
                lineTo(33.854f, 29.354f)
                lineTo(33.5f, 29.707f)
                lineTo(33.146f, 29.354f)
                lineTo(31.5f, 27.707f)
                lineTo(29.854f, 29.354f)
                lineTo(29.5f, 29.707f)
                lineTo(29.146f, 29.354f)
                lineTo(27.51f, 27.718f)
                lineTo(22.378f, 32.872f)
                lineTo(19.264f, 36.0f)
                horizontalLineToRelative(21.293f)
                close()
                moveTo(13.618f, 26.245f)
                lineTo(21.282f, 32.556f)
                lineTo(17.852f, 36.0f)
                lineTo(7.411f, 36.0f)
                close()
                moveTo(13.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -5.0f, 0.0f)
                moveToRelative(2.5f, -3.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, 7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                moveTo(11.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(9.54f, 9.174f)
                lineToRelative(2.276f, 2.277f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(-2.277f, -2.277f)
                close()
                moveTo(15.0f, 10.0f)
                lineTo(15.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(20.806f, 8.557f)
                lineTo(18.542f, 10.795f)
                lineTo(19.245f, 11.505f)
                lineTo(21.509f, 9.268f)
                close()
                moveTo(20.0f, 14.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(21.524f, 19.743f)
                lineTo(19.258f, 17.486f)
                lineTo(18.552f, 18.195f)
                lineTo(20.818f, 20.451f)
                close()
                moveTo(15.0f, 22.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(11.804f, 17.552f)
                lineTo(9.542f, 19.813f)
                lineTo(10.249f, 20.52f)
                lineTo(12.511f, 18.259f)
                close()
            }
        }
        .build()
        return _pictureLarge!!
    }

private var _pictureLarge: ImageVector? = null
