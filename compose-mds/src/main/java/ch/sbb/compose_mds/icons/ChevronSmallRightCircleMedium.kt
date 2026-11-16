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

public val SBBIcons.ChevronSmallRightCircleMedium: ImageVector
    get() {
        if (_chevronSmallRightCircleMedium != null) {
            return _chevronSmallRightCircleMedium!!
        }
        _chevronSmallRightCircleMedium = Builder(name = "ChevronSmallRightCircleMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.5f, 7.25f)
                curveToRelative(5.938f, 0.0f, 10.75f, 4.813f, 10.75f, 10.75f)
                reflectiveCurveTo(25.438f, 28.75f, 19.5f, 28.75f)
                reflectiveCurveTo(8.75f, 23.938f, 8.75f, 18.0f)
                reflectiveCurveTo(13.563f, 7.25f, 19.5f, 7.25f)
                moveToRelative(0.0f, 22.5f)
                curveToRelative(6.49f, 0.0f, 11.75f, -5.26f, 11.75f, -11.75f)
                reflectiveCurveTo(25.99f, 6.25f, 19.5f, 6.25f)
                reflectiveCurveTo(7.75f, 11.51f, 7.75f, 18.0f)
                reflectiveCurveToRelative(5.26f, 11.75f, 11.75f, 11.75f)
                moveTo(23.625f, 18.0f)
                lineToRelative(-0.36f, -0.356f)
                lineToRelative(-5.925f, -5.855f)
                lineToRelative(-0.702f, 0.71f)
                lineToRelative(5.563f, 5.5f)
                lineToRelative(-5.565f, 5.502f)
                lineToRelative(0.703f, 0.71f)
                lineToRelative(5.925f, -5.855f)
                close()
            }
        }
        .build()
        return _chevronSmallRightCircleMedium!!
    }

private var _chevronSmallRightCircleMedium: ImageVector? = null
