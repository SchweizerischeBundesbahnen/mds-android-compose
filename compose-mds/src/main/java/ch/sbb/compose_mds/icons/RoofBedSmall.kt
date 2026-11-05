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

public val SBBIcons.RoofBedSmall: ImageVector
    get() {
        if (_roofBedSmall != null) {
            return _roofBedSmall!!
        }
        _roofBedSmall = Builder(name = "RoofBedSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.22f, 16.56f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-18.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.22f, 16.56f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(6.22f, 11.56f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(6.224f, -10.448f)
                lineToRelative(10.0f, 5.0f)
                lineToRelative(-0.448f, 0.895f)
                lineToRelative(-9.776f, -4.889f)
                lineToRelative(-9.776f, 4.889f)
                lineToRelative(-0.448f, -0.895f)
                lineToRelative(10.0f, -5.0f)
                lineToRelative(0.224f, -0.111f)
                close()
            }
        }
        .build()
        return _roofBedSmall!!
    }

private var _roofBedSmall: ImageVector? = null
