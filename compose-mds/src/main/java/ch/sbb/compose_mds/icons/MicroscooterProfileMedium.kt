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

public val SBBIcons.MicroscooterProfileMedium: ImageVector
    get() {
        if (_microscooterProfileMedium != null) {
            return _microscooterProfileMedium!!
        }
        _microscooterProfileMedium = Builder(name = "MicroscooterProfileMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.75f, 20.749f)
                verticalLineToRelative(-13.0f)
                lineTo(24.0f, 7.749f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(11.024f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, false, -4.475f, 4.476f)
                horizontalLineToRelative(-9.826f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 9.0f, 22.749f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, false, -2.75f, 2.75f)
                arcTo(2.753f, 2.753f, 0.0f, false, false, 9.0f, 28.249f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, false, 2.739f, -3.0f)
                horizontalLineToRelative(10.51f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -2.205f, 1.796f, -4.0f, 4.0f, -4.0f)
                close()
                moveTo(10.75f, 25.499f)
                curveToRelative(0.0f, -0.964f, -0.786f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.786f, -1.75f, 1.75f)
                reflectiveCurveToRelative(0.786f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.786f, 1.75f, -1.75f)
                moveToRelative(18.0f, 0.0f)
                curveToRelative(0.0f, -0.964f, -0.786f, -1.75f, -1.75f, -1.75f)
                reflectiveCurveToRelative(-1.75f, 0.786f, -1.75f, 1.75f)
                reflectiveCurveToRelative(0.786f, 1.75f, 1.75f, 1.75f)
                reflectiveCurveToRelative(1.75f, -0.786f, 1.75f, -1.75f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, -2.75f, 2.75f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, -2.75f, -2.75f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, 2.75f, -2.75f)
                arcToRelative(2.753f, 2.753f, 0.0f, false, true, 2.75f, 2.75f)
            }
        }
        .build()
        return _microscooterProfileMedium!!
    }

private var _microscooterProfileMedium: ImageVector? = null
