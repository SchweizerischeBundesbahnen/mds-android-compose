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

public val SBBIcons.DeskMedium: ImageVector
    get() {
        if (_deskMedium != null) {
            return _deskMedium!!
        }
        _deskMedium = Builder(name = "DeskMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.25f, 31.499f)
                verticalLineToRelative(-16.25f)
                lineTo(4.75f, 15.249f)
                verticalLineToRelative(16.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-12.25f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(12.25f)
                close()
                moveTo(30.25f, 18.249f)
                verticalLineToRelative(-2.0f)
                lineTo(5.75f, 16.249f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _deskMedium!!
    }

private var _deskMedium: ImageVector? = null
