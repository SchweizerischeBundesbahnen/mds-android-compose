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

public val SBBIcons.DocumentSbbSmall: ImageVector
    get() {
        if (_documentSbbSmall != null) {
            return _documentSbbSmall!!
        }
        _documentSbbSmall = Builder(name = "DocumentSbbSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.01f, 4.0f)
                horizontalLineToRelative(6.697f)
                lineToRelative(0.146f, 0.147f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(0.147f, 0.146f)
                lineTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.009f, -15.0f)
                close()
                moveTo(7.009f, 5.0f)
                lineTo(7.0f, 19.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                close()
                moveTo(13.0f, 5.708f)
                lineTo(16.293f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(14.4f, 15.5f)
                lineTo(12.8f, 14.0f)
                lineTo(14.0f, 14.0f)
                lineToRelative(2.0f, 2.0f)
                lineToRelative(-2.0f, 2.0f)
                horizontalLineToRelative(-1.2f)
                lineToRelative(1.6f, -1.5f)
                horizontalLineToRelative(-1.9f)
                lineTo(12.5f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                lineTo(9.6f, 16.5f)
                lineToRelative(1.6f, 1.5f)
                lineTo(10.0f, 18.0f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(2.0f, -2.0f)
                horizontalLineToRelative(1.2f)
                lineToRelative(-1.6f, 1.5f)
                horizontalLineToRelative(1.9f)
                lineTo(11.5f, 14.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.5f)
                close()
            }
        }
        .build()
        return _documentSbbSmall!!
    }

private var _documentSbbSmall: ImageVector? = null
