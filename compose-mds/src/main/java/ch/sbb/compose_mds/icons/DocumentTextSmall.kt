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

public val SBBIcons.DocumentTextSmall: ImageVector
    get() {
        if (_documentTextSmall != null) {
            return _documentTextSmall!!
        }
        _documentTextSmall = Builder(name = "DocumentTextSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.001f, 3.996f)
                horizontalLineToRelative(6.708f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(0.146f, 0.146f)
                verticalLineToRelative(10.707f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-16.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(13.001f, 5.703f)
                lineTo(16.294f, 8.996f)
                horizontalLineToRelative(-3.293f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 12.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineTo(8.998f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 14.0f)
                close()
                moveTo(9.0f, 17.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 16.0f)
                close()
            }
        }
        .build()
        return _documentTextSmall!!
    }

private var _documentTextSmall: ImageVector? = null
