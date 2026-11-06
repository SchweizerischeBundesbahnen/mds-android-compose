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

public val SBBIcons.GpsDisabledMedium: ImageVector
    get() {
        if (_gpsDisabledMedium != null) {
            return _gpsDisabledMedium!!
        }
        _gpsDisabledMedium = Builder(name = "GpsDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.256f, 7.761f)
                arcTo(10.96f, 10.96f, 0.0f, false, false, 12.7f, 9.558f)
                lineToRelative(0.55f, 0.835f)
                arcTo(9.97f, 9.97f, 0.0f, false, true, 18.75f, 8.75f)
                curveToRelative(5.539f, 0.0f, 10.0f, 4.461f, 10.0f, 10.0f)
                arcToRelative(9.97f, 9.97f, 0.0f, false, true, -1.643f, 5.5f)
                lineToRelative(0.835f, 0.549f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, false, 1.797f, -5.555f)
                horizontalLineToRelative(3.26f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.26f)
                arcTo(10.977f, 10.977f, 0.0f, false, false, 19.255f, 7.762f)
                lineTo(19.255f, 4.5f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(4.5f, 18.251f)
                horizontalLineToRelative(3.262f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, 2.858f, -6.923f)
                lineTo(7.26f, 7.967f)
                lineToRelative(0.706f, -0.707f)
                lineToRelative(22.275f, 22.273f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.36f, -3.36f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -6.918f, 2.859f)
                verticalLineToRelative(3.26f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.26f)
                arcTo(10.976f, 10.976f, 0.0f, false, true, 7.762f, 19.25f)
                lineTo(4.5f, 19.25f)
                close()
                moveTo(25.466f, 26.172f)
                lineTo(22.98f, 23.686f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -9.166f, -9.165f)
                lineToRelative(-2.486f, -2.485f)
                arcToRelative(9.97f, 9.97f, 0.0f, false, false, -2.577f, 6.714f)
                curveToRelative(0.0f, 5.54f, 4.46f, 10.0f, 10.0f, 10.0f)
                arcToRelative(9.97f, 9.97f, 0.0f, false, false, 6.715f, -2.578f)
                moveTo(14.523f, 15.23f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 7.747f, 7.746f)
                close()
                moveTo(18.751f, 13.25f)
                curveToRelative(-0.803f, 0.0f, -1.563f, 0.181f, -2.256f, 0.495f)
                lineToRelative(-0.412f, -0.911f)
                arcToRelative(6.45f, 6.45f, 0.0f, false, true, 2.668f, -0.583f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 6.5f, 6.5f)
                curveToRelative(0.0f, 0.956f, -0.218f, 1.854f, -0.585f, 2.666f)
                lineToRelative(-0.911f, -0.412f)
                arcToRelative(5.45f, 5.45f, 0.0f, false, false, 0.496f, -2.254f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -5.5f, -5.5f)
            }
        }
        .build()
        return _gpsDisabledMedium!!
    }

private var _gpsDisabledMedium: ImageVector? = null
