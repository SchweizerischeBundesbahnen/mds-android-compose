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

public val SBBIcons.GondolaProfileMedium: ImageVector
    get() {
        if (_gondolaProfileMedium != null) {
            return _gondolaProfileMedium!!
        }
        _gondolaProfileMedium = Builder(name = "GondolaProfileMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(13.25f, 9.447f)
                lineToRelative(19.894f, -5.968f)
                lineToRelative(-0.288f, -0.958f)
                lineToRelative(-30.0f, 9.0f)
                lineToRelative(0.288f, 0.958f)
                lineToRelative(9.106f, -2.732f)
                verticalLineToRelative(5.503f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(10.838f)
                curveToRelative(0.0f, 0.16f, 0.026f, 0.321f, 0.077f, 0.474f)
                lineToRelative(1.22f, 3.662f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.424f, 1.026f)
                horizontalLineToRelative(7.558f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.423f, -1.026f)
                lineToRelative(1.221f, -3.662f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.077f, -0.474f)
                lineTo(19.25f, 16.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(9.25f, 18.25f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-7.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(7.25f, 16.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(10.838f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.026f, 0.158f)
                lineToRelative(-1.22f, 3.662f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.475f, 0.342f)
                lineTo(8.971f, 31.75f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.475f, -0.342f)
                lineToRelative(-1.22f, -3.662f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.026f, -0.158f)
                close()
            }
        }
        .build()
        return _gondolaProfileMedium!!
    }

private var _gondolaProfileMedium: ImageVector? = null
