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

public val SBBIcons.DocumentVideoMedium: ImageVector
    get() {
        if (_documentVideoMedium != null) {
            return _documentVideoMedium!!
        }
        _documentVideoMedium = Builder(
            name = "DocumentVideoMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(9.25f, 6.25f)
                horizontalLineToRelative(9.707f)
                lineToRelative(0.147f, 0.147f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(0.146f, 0.146f)
                verticalLineToRelative(15.708f)
                lineTo(9.25f, 29.751f)
                lineTo(9.25f, 6.25f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(19.25f, 7.958f)
                lineTo(25.043f, 13.751f)
                lineTo(19.25f, 13.751f)
                close()
                moveTo(14.515f, 16.827f)
                lineTo(13.75f, 16.348f)
                verticalLineToRelative(9.305f)
                lineToRelative(0.765f, -0.479f)
                lineToRelative(6.0f, -3.75f)
                lineToRelative(0.678f, -0.424f)
                lineToRelative(-0.678f, -0.424f)
                close()
                moveTo(19.307f, 21.0f)
                lineToRelative(-4.557f, 2.848f)
                verticalLineToRelative(-5.695f)
                close()
            }
        }
            .build()
        return _documentVideoMedium!!
    }

private var _documentVideoMedium: ImageVector? = null
