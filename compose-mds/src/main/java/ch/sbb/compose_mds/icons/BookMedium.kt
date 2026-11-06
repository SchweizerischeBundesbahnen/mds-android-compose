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
                moveTo(7.25f, 8.25f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(18.502f)
                horizontalLineToRelative(-19.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -2.5f, 1.05f)
                close()
                moveTo(6.25f, 28.252f)
                lineTo(6.25f, 8.25f)
                curveToRelative(0.0f, -1.932f, 1.568f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(20.502f)
                horizontalLineToRelative(-20.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 0.0f, 5.0f)
                lineToRelative(19.5f, -0.002f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-19.5f, 0.002f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.465f, -3.0f)
                close()
                moveTo(9.75f, 27.252f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-20.0f)
            }
        }
        .build()
        return _bookMedium!!
    }

private var _bookMedium: ImageVector? = null
