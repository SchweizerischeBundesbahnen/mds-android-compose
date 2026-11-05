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

public val SBBIcons.DocumentStandardMedium: ImageVector
    get() {
        if (_documentStandardMedium != null) {
            return _documentStandardMedium!!
        }
        _documentStandardMedium = Builder(name = "DocumentStandardMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.75f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(23.5f)
                horizontalLineToRelative(17.5f)
                lineTo(26.75f, 14.043f)
                lineToRelative(-0.146f, -0.147f)
                lineToRelative(-7.5f, -7.5f)
                lineToRelative(-0.147f, -0.146f)
                lineTo(9.75f, 6.25f)
                moveToRelative(0.5f, 22.5f)
                lineTo(10.25f, 7.25f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(25.043f, 13.75f)
                lineTo(19.25f, 7.957f)
                verticalLineToRelative(5.793f)
                close()
            }
        }
        .build()
        return _documentStandardMedium!!
    }

private var _documentStandardMedium: ImageVector? = null
