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

public val SBBIcons.CirclePenMedium: ImageVector
    get() {
        if (_circlePenMedium != null) {
            return _circlePenMedium!!
        }
        _circlePenMedium = Builder(name = "CirclePenMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                curveTo(10.406f, 4.25f, 4.25f, 10.405f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(31.75f, 25.594f, 31.75f, 18.0f)
                reflectiveCurveTo(25.594f, 4.25f, 18.0f, 4.25f)
                moveTo(3.25f, 18.0f)
                curveTo(3.25f, 9.853f, 9.853f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(32.75f, 9.853f, 32.75f, 18.0f)
                reflectiveCurveTo(26.147f, 32.75f, 18.0f, 32.75f)
                reflectiveCurveTo(3.25f, 26.146f, 3.25f, 18.0f)
                moveTo(22.5f, 9.358f)
                lineToRelative(0.353f, 0.353f)
                lineToRelative(3.435f, 3.421f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-2.647f, 2.66f)
                lineToRelative(-0.08f, 0.079f)
                lineToRelative(-0.273f, 0.275f)
                lineToRelative(-8.25f, 8.25f)
                lineToRelative(-0.147f, 0.147f)
                lineTo(10.75f, 25.25f)
                verticalLineToRelative(-4.142f)
                lineToRelative(0.146f, -0.146f)
                lineToRelative(8.25f, -8.25f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(20.207f, 13.065f)
                lineTo(22.935f, 15.792f)
                lineTo(25.228f, 13.488f)
                lineTo(22.5f, 10.77f)
                close()
                moveTo(11.75f, 21.522f)
                lineTo(19.5f, 13.772f)
                lineTo(22.228f, 16.499f)
                lineTo(14.478f, 24.25f)
                lineTo(11.75f, 24.25f)
                close()
            }
        }
        .build()
        return _circlePenMedium!!
    }

private var _circlePenMedium: ImageVector? = null
