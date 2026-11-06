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

public val SBBIcons.MedicalFacilityMedium: ImageVector
    get() {
        if (_medicalFacilityMedium != null) {
            return _medicalFacilityMedium!!
        }
        _medicalFacilityMedium = Builder(name = "MedicalFacilityMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.879f, 5.211f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.353f, 0.353f)
                lineToRelative(-12.0f, 12.0f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(1.396f, -1.397f)
                verticalLineToRelative(14.293f)
                horizontalLineToRelative(6.985f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.015f)
                lineTo(28.775f, 16.522f)
                lineToRelative(1.397f, 1.397f)
                lineToRelative(0.707f, -0.707f)
                close()
                moveTo(27.775f, 15.522f)
                lineTo(18.525f, 6.272f)
                lineTo(9.275f, 15.522f)
                verticalLineToRelative(14.293f)
                horizontalLineToRelative(4.985f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(5.015f)
                close()
                moveTo(17.275f, 11.815f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _medicalFacilityMedium!!
    }

private var _medicalFacilityMedium: ImageVector? = null
