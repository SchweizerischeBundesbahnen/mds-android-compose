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

public val SBBIcons.CurriculumVitaeMedium: ImageVector
    get() {
        if (_curriculumVitaeMedium != null) {
            return _curriculumVitaeMedium!!
        }
        _curriculumVitaeMedium = Builder(name = "CurriculumVitaeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.25f, 3.25f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(29.5f)
                lineTo(6.25f, 32.75f)
                lineTo(6.25f, 3.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(27.5f)
                horizontalLineToRelative(21.5f)
                lineTo(28.75f, 4.25f)
                close()
                moveTo(27.0f, 7.75f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(1.0f)
                lineTo(27.0f, 8.75f)
                close()
                moveTo(27.0f, 10.75f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(1.0f)
                lineTo(27.0f, 11.75f)
                close()
                moveTo(19.5f, 13.75f)
                lineTo(27.0f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.5f)
                close()
                moveTo(25.5f, 19.75f)
                lineTo(9.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(16.5f)
                close()
                moveTo(9.0f, 22.75f)
                horizontalLineToRelative(16.5f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 23.75f)
                close()
                moveTo(12.03f, 27.265f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(15.03f, 27.265f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(24.03f, 27.265f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.125f, 9.0f)
                curveToRelative(0.0f, -1.056f, 0.697f, -1.75f, 1.375f, -1.75f)
                reflectiveCurveToRelative(1.375f, 0.694f, 1.375f, 1.75f)
                reflectiveCurveToRelative(-0.697f, 1.75f, -1.375f, 1.75f)
                reflectiveCurveToRelative(-1.375f, -0.694f, -1.375f, -1.75f)
                moveTo(13.5f, 6.25f)
                curveToRelative(-1.393f, 0.0f, -2.375f, 1.32f, -2.375f, 2.75f)
                curveToRelative(0.0f, 0.778f, 0.29f, 1.523f, 0.78f, 2.041f)
                arcToRelative(6.32f, 6.32f, 0.0f, false, false, -2.654f, 5.485f)
                lineToRelative(0.998f, -0.052f)
                arcToRelative(5.32f, 5.32f, 0.0f, false, true, 2.569f, -4.836f)
                quadToRelative(0.32f, 0.11f, 0.682f, 0.112f)
                quadToRelative(0.346f, -0.002f, 0.654f, -0.102f)
                arcToRelative(5.35f, 5.35f, 0.0f, false, true, 2.597f, 4.83f)
                lineToRelative(0.999f, 0.044f)
                arcToRelative(6.35f, 6.35f, 0.0f, false, false, -2.671f, -5.464f)
                curveToRelative(0.499f, -0.519f, 0.796f, -1.272f, 0.796f, -2.058f)
                curveToRelative(0.0f, -1.43f, -0.982f, -2.75f, -2.375f, -2.75f)
            }
        }
        .build()
        return _curriculumVitaeMedium!!
    }

private var _curriculumVitaeMedium: ImageVector? = null
