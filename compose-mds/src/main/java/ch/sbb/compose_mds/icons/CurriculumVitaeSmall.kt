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

public val SBBIcons.CurriculumVitaeSmall: ImageVector
    get() {
        if (_curriculumVitaeSmall != null) {
            return _curriculumVitaeSmall!!
        }
        _curriculumVitaeSmall = Builder(name = "CurriculumVitaeSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 2.0f)
                verticalLineToRelative(20.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 2.0f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                close()
                moveTo(18.0f, 6.0f)
                lineTo(18.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 8.0f)
                lineTo(18.0f, 7.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(17.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 13.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 15.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(8.02f, 19.01f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.02f, 18.01f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.02f, 19.01f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.0f, 5.0f)
                curveToRelative(0.333f, 0.0f, 0.75f, 0.358f, 0.75f, 1.0f)
                reflectiveCurveTo(9.333f, 7.0f, 9.0f, 7.0f)
                reflectiveCurveToRelative(-0.75f, -0.358f, -0.75f, -1.0f)
                reflectiveCurveTo(8.667f, 5.0f, 9.0f, 5.0f)
                moveToRelative(1.296f, 2.345f)
                curveToRelative(0.29f, -0.369f, 0.454f, -0.853f, 0.454f, -1.345f)
                curveToRelative(0.0f, -1.015f, -0.702f, -2.0f, -1.75f, -2.0f)
                reflectiveCurveToRelative(-1.75f, 0.985f, -1.75f, 2.0f)
                curveToRelative(0.0f, 0.486f, 0.161f, 0.966f, 0.444f, 1.333f)
                arcTo(4.38f, 4.38f, 0.0f, false, false, 6.0f, 11.026f)
                lineToRelative(1.0f, -0.052f)
                arcToRelative(3.38f, 3.38f, 0.0f, false, true, 1.567f, -3.033f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, 0.846f, 0.005f)
                arcTo(3.4f, 3.4f, 0.0f, false, true, 11.0f, 10.978f)
                lineToRelative(0.999f, 0.045f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -1.704f, -3.678f)
            }
        }
        .build()
        return _curriculumVitaeSmall!!
    }

private var _curriculumVitaeSmall: ImageVector? = null
