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

public val SBBIcons.DocumentStandardSmall: ImageVector
    get() {
        if (_documentStandardSmall != null) {
            return _documentStandardSmall!!
        }
        _documentStandardSmall = Builder(name = "DocumentStandardSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 9.293f)
                lineToRelative(-0.146f, -0.147f)
                lineToRelative(-5.0f, -5.0f)
                lineTo(12.707f, 4.0f)
                lineTo(6.5f, 4.0f)
                moveTo(7.0f, 19.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(16.293f, 9.0f)
                lineTo(13.0f, 5.707f)
                lineTo(13.0f, 9.0f)
                close()
            }
        }
        .build()
        return _documentStandardSmall!!
    }

private var _documentStandardSmall: ImageVector? = null
