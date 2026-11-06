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
                moveTo(11.75f, 18.0f)
                arcTo(6.22f, 6.22f, 0.0f, false, true, 18.0f, 11.75f)
                arcTo(6.22f, 6.22f, 0.0f, false, true, 24.25f, 18.0f)
                curveToRelative(0.0f, 2.325f, -1.349f, 4.51f, -3.22f, 5.5f)
                horizontalLineToRelative(-6.045f)
                curveToRelative(-1.903f, -1.137f, -3.235f, -3.196f, -3.235f, -5.5f)
                moveToRelative(2.0f, 5.87f)
                curveToRelative(-1.783f, -1.356f, -3.0f, -3.483f, -3.0f, -5.87f)
                arcTo(7.22f, 7.22f, 0.0f, false, true, 18.0f, 10.75f)
                arcTo(7.22f, 7.22f, 0.0f, false, true, 25.25f, 18.0f)
                curveToRelative(0.0f, 2.367f, -1.2f, 4.616f, -3.0f, 5.915f)
                verticalLineToRelative(3.59f)
                lineToRelative(-0.335f, 0.117f)
                lineToRelative(-2.665f, 0.933f)
                verticalLineToRelative(1.195f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1.195f)
                lineToRelative(-2.665f, -0.933f)
                lineToRelative(-0.335f, -0.117f)
                verticalLineTo(23.87f)
                moveToRelative(1.0f, 2.925f)
                verticalLineTo(24.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(2.295f)
                lineToRelative(-2.665f, 0.933f)
                lineToRelative(-0.335f, 0.117f)
                verticalLineToRelative(0.905f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.905f)
                lineToRelative(-0.335f, -0.117f)
                close()
            }
        }
        .build()
        return _bulbOffMedium!!
    }

private var _bulbOffMedium: ImageVector? = null
