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

public val SBBIcons.BulbOffMedium: ImageVector
    get() {
        if (_bulbOffMedium != null) {
            return _bulbOffMedium!!
        }
        _bulbOffMedium = Builder(name = "BulbOffMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 11.75f)
                arcTo(6.22f, 6.22f, 0.0f, false, true, 24.25f, 18.0f)
                curveToRelative(0.0f, 2.325f, -1.349f, 4.51f, -3.22f, 5.5f)
                horizontalLineToRelative(-6.044f)
                curveToRelative(-1.904f, -1.137f, -3.236f, -3.195f, -3.236f, -5.5f)
                arcTo(6.22f, 6.22f, 0.0f, false, true, 18.0f, 11.75f)
                moveToRelative(-4.25f, 12.12f)
                curveToRelative(-1.784f, -1.355f, -3.0f, -3.483f, -3.0f, -5.87f)
                arcTo(7.22f, 7.22f, 0.0f, false, true, 18.0f, 10.75f)
                arcTo(7.22f, 7.22f, 0.0f, false, true, 25.25f, 18.0f)
                curveToRelative(0.0f, 2.367f, -1.2f, 4.616f, -3.0f, 5.916f)
                verticalLineToRelative(3.589f)
                lineToRelative(-0.335f, 0.117f)
                lineToRelative(-2.665f, 0.932f)
                verticalLineToRelative(1.196f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.196f)
                lineToRelative(-2.665f, -0.932f)
                lineToRelative(-0.335f, -0.117f)
                close()
                moveTo(17.415f, 27.728f)
                lineTo(14.75f, 26.795f)
                lineTo(14.75f, 24.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(2.295f)
                lineToRelative(-2.665f, 0.933f)
                lineToRelative(-0.335f, 0.118f)
                verticalLineToRelative(0.904f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.904f)
                close()
            }
        }
        .build()
        return _bulbOffMedium!!
    }

private var _bulbOffMedium: ImageVector? = null
