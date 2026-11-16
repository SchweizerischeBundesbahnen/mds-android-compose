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

public val SBBIcons.AngularMedium: ImageVector
    get() {
        if (_angularMedium != null) {
            return _angularMedium!!
        }
        _angularMedium = Builder(name = "AngularMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(32.047f, 7.905f)
                lineToRelative(-0.389f, -0.13f)
                lineTo(18.0f, 3.223f)
                lineTo(4.342f, 7.775f)
                lineToRelative(-0.389f, 0.13f)
                lineToRelative(0.05f, 0.407f)
                lineToRelative(2.25f, 18.0f)
                lineToRelative(0.033f, 0.257f)
                lineToRelative(0.229f, 0.122f)
                lineToRelative(11.25f, 6.0f)
                lineToRelative(0.235f, 0.125f)
                lineToRelative(0.235f, -0.125f)
                lineToRelative(11.25f, -6.0f)
                lineToRelative(0.229f, -0.122f)
                lineToRelative(0.032f, -0.257f)
                lineToRelative(0.002f, -0.018f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.033f, -0.254f)
                lineToRelative(2.214f, -17.633f)
                lineToRelative(-0.011f, -0.002f)
                lineToRelative(0.011f, -0.093f)
                close()
                moveTo(28.818f, 25.665f)
                lineTo(30.952f, 8.595f)
                lineTo(18.5f, 4.443f)
                lineTo(18.5f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(17.5f, 4.443f)
                lineTo(5.047f, 8.595f)
                lineTo(7.214f, 25.93f)
                lineTo(17.5f, 31.416f)
                lineTo(17.5f, 21.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.62f)
                close()
                moveTo(18.424f, 11.735f)
                lineTo(25.924f, 23.735f)
                lineTo(25.076f, 24.265f)
                lineTo(22.411f, 20.0f)
                horizontalLineToRelative(-8.822f)
                lineToRelative(-2.665f, 4.265f)
                lineToRelative(-0.848f, -0.53f)
                lineToRelative(7.5f, -12.0f)
                lineToRelative(0.424f, -0.678f)
                close()
                moveTo(14.214f, 19.0f)
                lineTo(18.0f, 12.942f)
                lineTo(21.786f, 19.0f)
                close()
            }
        }
        .build()
        return _angularMedium!!
    }

private var _angularMedium: ImageVector? = null
