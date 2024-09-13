package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.CableCarProfileMedium: ImageVector
    get() {
        if (_cableCarProfileMedium != null) {
            return _cableCarProfileMedium!!
        }
        _cableCarProfileMedium = Builder(name = "CableCarProfileMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.301f, 11.72f)
                lineTo(14.2f, 8.997f)
                lineToRelative(-4.598f, 8.49f)
                lineTo(5.43f, 17.487f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(25.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(26.75f, 17.487f)
                lineToRelative(-4.86f, -10.412f)
                lineTo(33.302f, 4.22f)
                lineToRelative(-0.242f, -0.97f)
                lineToRelative(-30.0f, 7.5f)
                close()
                moveTo(20.901f, 7.32f)
                lineTo(15.515f, 8.667f)
                lineTo(10.739f, 17.486f)
                horizontalLineToRelative(14.906f)
                close()
                moveTo(5.431f, 18.487f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(25.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(6.431f, 20.487f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(15.931f, 20.487f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.431f, 20.487f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _cableCarProfileMedium!!
    }

private var _cableCarProfileMedium: ImageVector? = null
