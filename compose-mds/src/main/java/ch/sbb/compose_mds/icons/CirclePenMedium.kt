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
                moveTo(31.75f, 18.0f)
                curveToRelative(0.0f, -7.595f, -6.156f, -13.75f, -13.75f, -13.75f)
                reflectiveCurveTo(4.25f, 10.405f, 4.25f, 18.0f)
                reflectiveCurveTo(10.406f, 31.75f, 18.0f, 31.75f)
                reflectiveCurveTo(31.75f, 25.594f, 31.75f, 18.0f)
                moveToRelative(1.0f, 0.0f)
                curveToRelative(0.0f, 8.146f, -6.603f, 14.75f, -14.75f, 14.75f)
                reflectiveCurveTo(3.25f, 26.146f, 3.25f, 18.0f)
                reflectiveCurveTo(9.853f, 3.25f, 18.0f, 3.25f)
                reflectiveCurveTo(32.75f, 9.853f, 32.75f, 18.0f)
                moveToRelative(-9.897f, -8.29f)
                lineToRelative(3.435f, 3.422f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(-2.647f, 2.66f)
                lineToRelative(-0.237f, 0.238f)
                lineToRelative(-0.116f, 0.116f)
                lineToRelative(-8.25f, 8.25f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-0.146f, 0.147f)
                lineTo(10.75f, 25.25f)
                verticalLineToRelative(-4.142f)
                lineToRelative(8.397f, -8.396f)
                lineToRelative(3.352f, -3.353f)
                close()
                moveTo(20.207f, 13.065f)
                lineTo(22.934f, 15.792f)
                lineTo(25.227f, 13.488f)
                lineTo(22.5f, 10.77f)
                close()
                moveTo(11.75f, 24.25f)
                verticalLineToRelative(-2.728f)
                lineToRelative(7.75f, -7.75f)
                lineToRelative(2.727f, 2.727f)
                lineToRelative(-7.75f, 7.75f)
                close()
            }
        }
        .build()
        return _circlePenMedium!!
    }

private var _circlePenMedium: ImageVector? = null
