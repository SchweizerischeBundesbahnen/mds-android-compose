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

public val SBBIcons.DocumentTextMedium: ImageVector
    get() {
        if (_documentTextMedium != null) {
            return _documentTextMedium!!
        }
        _documentTextMedium = Builder(
            name = "DocumentTextMedium",
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
                moveTo(9.252f, 6.245f)
                horizontalLineToRelative(9.707f)
                lineToRelative(0.147f, 0.146f)
                lineToRelative(7.5f, 7.5f)
                lineToRelative(0.146f, 0.146f)
                verticalLineToRelative(15.708f)
                horizontalLineToRelative(-17.5f)
                verticalLineToRelative(-23.5f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(19.252f, 7.952f)
                lineTo(25.045f, 13.745f)
                horizontalLineToRelative(-5.793f)
                close()
                moveTo(13.5f, 19.25f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                close()
                moveTo(22.5f, 22.25f)
                horizontalLineToRelative(-9.004f)
                verticalLineToRelative(-1.0f)
                lineTo(22.5f, 21.25f)
                close()
                moveTo(13.5f, 25.25f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-9.0f)
                close()
            }
        }
            .build()
        return _documentTextMedium!!
    }

private var _documentTextMedium: ImageVector? = null
