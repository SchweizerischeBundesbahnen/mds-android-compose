package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.MedicalFacilityLarge: ImageVector
    get() {
        if (_medicalFacilityLarge != null) {
            return _medicalFacilityLarge!!
        }
        _medicalFacilityLarge = Builder(name = "MedicalFacilityLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(40.554f, 23.566f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(-2.146f, -2.146f)
                lineTo(37.7f, 41.42f)
                horizontalLineToRelative(-9.02f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(10.0f)
                lineTo(10.7f, 41.42f)
                lineTo(10.7f, 22.127f)
                lineToRelative(-2.147f, 2.146f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(24.2f, 7.213f)
                close()
                moveTo(11.7f, 21.127f)
                lineTo(11.7f, 40.42f)
                horizontalLineToRelative(6.98f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(7.02f)
                lineTo(36.7f, 21.127f)
                lineToRelative(-12.5f, -12.5f)
                close()
                moveTo(25.7f, 20.42f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(23.7f, 21.42f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _medicalFacilityLarge!!
    }

private var _medicalFacilityLarge: ImageVector? = null
