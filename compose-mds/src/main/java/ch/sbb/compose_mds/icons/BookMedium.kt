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

public val SBBIcons.BookMedium: ImageVector
    get() {
        if (_bookMedium != null) {
            return _bookMedium!!
        }
        _bookMedium = Builder(name = "BookMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.75f, 4.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.5f, 3.5f)
                verticalLineToRelative(20.002f)
                horizontalLineToRelative(0.036f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 3.464f, 3.0f)
                lineToRelative(19.5f, -0.002f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-19.5f, 0.002f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.487f, -2.245f)
                lineToRelative(-0.013f, -0.255f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(20.0f)
                lineTo(29.75f, 4.75f)
                close()
                moveTo(9.75f, 24.252f)
                curveToRelative(-0.98f, 0.0f, -1.865f, 0.403f, -2.5f, 1.052f)
                lineTo(7.25f, 8.25f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(18.502f)
                close()
                moveTo(29.75f, 28.252f)
                verticalLineToRelative(-1.0f)
                lineTo(9.25f, 27.252f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _bookMedium!!
    }

private var _bookMedium: ImageVector? = null
