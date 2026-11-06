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

public val SBBIcons.DocumentVideoSmall: ImageVector
    get() {
        if (_documentVideoSmall != null) {
            return _documentVideoSmall!!
        }
        _documentVideoSmall = Builder(name = "DocumentVideoSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 4.0f)
                horizontalLineToRelative(6.707f)
                lineToRelative(0.147f, 0.147f)
                lineToRelative(5.0f, 5.0f)
                lineToRelative(0.146f, 0.146f)
                lineTo(18.0f, 20.0f)
                lineTo(6.0f, 20.0f)
                lineTo(6.0f, 4.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(12.0f, 5.0f)
                close()
                moveTo(13.0f, 5.707f)
                lineTo(16.293f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(9.765f, 11.077f)
                lineTo(9.0f, 10.597f)
                verticalLineToRelative(6.804f)
                lineToRelative(0.765f, -0.478f)
                lineToRelative(4.0f, -2.5f)
                lineToRelative(0.678f, -0.424f)
                lineToRelative(-0.678f, -0.424f)
                close()
                moveTo(12.557f, 14.0f)
                lineTo(10.0f, 15.598f)
                verticalLineToRelative(-3.196f)
                close()
            }
        }
        .build()
        return _documentVideoSmall!!
    }

private var _documentVideoSmall: ImageVector? = null
