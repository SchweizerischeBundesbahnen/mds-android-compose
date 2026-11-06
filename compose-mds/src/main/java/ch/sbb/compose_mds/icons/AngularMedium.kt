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
                moveTo(18.158f, 3.276f)
                lineTo(18.0f, 3.223f)
                lineToRelative(-0.158f, 0.053f)
                lineToRelative(-13.5f, 4.5f)
                lineToRelative(-0.389f, 0.13f)
                lineToRelative(0.05f, 0.406f)
                lineToRelative(2.25f, 18.0f)
                lineToRelative(0.033f, 0.257f)
                lineToRelative(0.229f, 0.122f)
                lineToRelative(11.25f, 6.0f)
                lineToRelative(0.235f, 0.126f)
                lineToRelative(0.235f, -0.126f)
                lineToRelative(11.25f, -6.0f)
                lineToRelative(0.229f, -0.122f)
                lineToRelative(0.032f, -0.257f)
                lineToRelative(0.002f, -0.018f)
                lineToRelative(0.001f, -0.001f)
                lineToRelative(0.032f, -0.252f)
                lineToRelative(2.215f, -17.635f)
                lineToRelative(-0.011f, -0.001f)
                lineToRelative(0.011f, -0.093f)
                lineToRelative(0.05f, -0.407f)
                lineToRelative(-0.388f, -0.13f)
                close()
                moveTo(28.82f, 25.665f)
                lineToRelative(2.134f, -17.07f)
                lineTo(18.5f, 4.444f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(4.444f)
                lineTo(5.047f, 8.594f)
                lineToRelative(2.167f, 17.337f)
                lineTo(17.5f, 31.417f)
                verticalLineTo(21.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.62f)
                close()
                moveTo(18.0f, 11.057f)
                lineToRelative(0.424f, 0.678f)
                lineToRelative(7.5f, 12.0f)
                lineToRelative(-0.848f, 0.53f)
                lineTo(22.41f, 20.0f)
                horizontalLineToRelative(-8.82f)
                lineToRelative(-2.666f, 4.265f)
                lineToRelative(-0.848f, -0.53f)
                lineToRelative(7.5f, -12.0f)
                close()
                moveTo(14.215f, 19.0f)
                lineTo(18.0f, 12.943f)
                lineTo(21.785f, 19.0f)
                close()
            }
        }
        .build()
        return _angularMedium!!
    }

private var _angularMedium: ImageVector? = null
