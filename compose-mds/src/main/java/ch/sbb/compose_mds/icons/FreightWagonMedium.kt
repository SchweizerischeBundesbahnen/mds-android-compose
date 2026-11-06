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

public val SBBIcons.FreightWagonMedium: ImageVector
    get() {
        if (_freightWagonMedium != null) {
            return _freightWagonMedium!!
        }
        _freightWagonMedium = Builder(name = "FreightWagonMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.75f, 12.25f)
                horizontalLineToRelative(26.5f)
                verticalLineToRelative(9.009f)
                horizontalLineToRelative(1.752f)
                verticalLineToRelative(1.0f)
                lineTo(31.25f, 22.259f)
                verticalLineToRelative(1.491f)
                horizontalLineToRelative(-3.026f)
                quadToRelative(0.026f, 0.123f, 0.026f, 0.254f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.474f, -0.254f)
                lineTo(10.224f, 23.75f)
                quadToRelative(0.026f, 0.123f, 0.026f, 0.254f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.474f, -0.254f)
                lineTo(4.75f, 23.75f)
                verticalLineToRelative(-1.491f)
                lineTo(2.997f, 22.259f)
                verticalLineToRelative(-1.0f)
                lineTo(4.75f, 21.259f)
                lineTo(4.75f, 12.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(13.25f, 13.25f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-9.5f)
                close()
                moveTo(30.25f, 22.75f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(6.5f)
                close()
                moveTo(9.0f, 23.754f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(17.75f, 0.25f)
                curveToRelative(0.0f, -0.137f, 0.113f, -0.25f, 0.25f, -0.25f)
                reflectiveCurveToRelative(0.25f, 0.113f, 0.25f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
            }
        }
        .build()
        return _freightWagonMedium!!
    }

private var _freightWagonMedium: ImageVector? = null
