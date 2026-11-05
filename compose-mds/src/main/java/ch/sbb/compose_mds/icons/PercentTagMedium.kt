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

public val SBBIcons.PercentTagMedium: ImageVector
    get() {
        if (_percentTagMedium != null) {
            return _percentTagMedium!!
        }
        _percentTagMedium = Builder(name = "PercentTagMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.25f, 7.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(21.049f)
                lineToRelative(0.141f, -0.262f)
                lineToRelative(5.25f, -9.75f)
                lineToRelative(0.128f, -0.238f)
                lineToRelative(-0.128f, -0.237f)
                lineToRelative(-5.25f, -9.75f)
                lineToRelative(-0.141f, -0.263f)
                lineTo(5.25f, 7.75f)
                moveToRelative(0.5f, 19.5f)
                lineTo(5.75f, 8.75f)
                horizontalLineToRelative(19.451f)
                lineTo(30.182f, 18.0f)
                lineToRelative(-4.98f, 9.25f)
                close()
                moveTo(11.75f, 13.5f)
                curveToRelative(0.0f, -0.984f, 0.766f, -1.75f, 1.75f, -1.75f)
                reflectiveCurveToRelative(1.75f, 0.766f, 1.75f, 1.75f)
                reflectiveCurveToRelative(-0.766f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveToRelative(-1.75f, -0.766f, -1.75f, -1.75f)
                moveToRelative(1.75f, -2.75f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, -2.75f, 2.75f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, 2.75f, 2.75f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, 2.75f, -2.75f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, -2.75f, -2.75f)
                moveTo(17.75f, 22.5f)
                curveToRelative(0.0f, -0.985f, 0.766f, -1.75f, 1.75f, -1.75f)
                reflectiveCurveToRelative(1.75f, 0.765f, 1.75f, 1.75f)
                curveToRelative(0.0f, 0.984f, -0.766f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveToRelative(-1.75f, -0.766f, -1.75f, -1.75f)
                moveToRelative(1.75f, -2.75f)
                arcToRelative(2.727f, 2.727f, 0.0f, false, false, -2.75f, 2.75f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, 2.75f, 2.75f)
                arcToRelative(2.73f, 2.73f, 0.0f, false, false, 2.75f, -2.75f)
                arcToRelative(2.727f, 2.727f, 0.0f, false, false, -2.75f, -2.75f)
                moveToRelative(-9.354f, 3.896f)
                lineToRelative(12.0f, -12.0f)
                lineToRelative(0.708f, 0.707f)
                lineToRelative(-12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _percentTagMedium!!
    }

private var _percentTagMedium: ImageVector? = null
