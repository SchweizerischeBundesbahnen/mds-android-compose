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

public val SBBIcons.CopyMedium: ImageVector
    get() {
        if (_copyMedium != null) {
            return _copyMedium!!
        }
        _copyMedium = Builder(name = "CopyMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.228f, 25.19f)
                verticalLineToRelative(-19.0f)
                horizontalLineToRelative(-14.5f)
                verticalLineToRelative(4.56f)
                lineTo(7.75f, 10.75f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-4.56f)
                close()
                moveTo(22.25f, 24.19f)
                lineTo(22.25f, 10.75f)
                horizontalLineToRelative(-7.523f)
                lineTo(14.727f, 7.19f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(17.0f)
                close()
                moveTo(21.25f, 28.75f)
                lineTo(8.75f, 28.75f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(12.5f)
                close()
            }
        }
        .build()
        return _copyMedium!!
    }

private var _copyMedium: ImageVector? = null
