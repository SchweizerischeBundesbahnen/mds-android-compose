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

public val SBBIcons.MedicalFacilitySmall: ImageVector
    get() {
        if (_medicalFacilitySmall != null) {
            return _medicalFacilitySmall!!
        }
        _medicalFacilitySmall = Builder(name = "MedicalFacilitySmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(12.704f, 3.356f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-8.0f, 8.0f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(0.646f, -0.647f)
                verticalLineToRelative(9.293f)
                horizontalLineToRelative(4.99f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.01f)
                verticalLineToRelative(-9.293f)
                lineToRelative(0.647f, 0.647f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(18.35f, 10.417f)
                lineTo(12.35f, 4.417f)
                lineTo(6.35f, 10.417f)
                verticalLineToRelative(9.293f)
                horizontalLineToRelative(2.99f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.01f)
                close()
                moveTo(11.35f, 7.71f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
            }
        }
        .build()
        return _medicalFacilitySmall!!
    }

private var _medicalFacilitySmall: ImageVector? = null
