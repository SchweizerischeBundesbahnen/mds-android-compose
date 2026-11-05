package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.DocumentSbbLarge: ImageVector
    get() {
        if (_documentSbbLarge != null) {
            return _documentSbbLarge!!
        }
        _documentSbbLarge = Builder(
            name = "DocumentSbbLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(36.0f, 18.293f)
                lineTo(36.0f, 39.0f)
                lineTo(13.0f, 39.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.018f, -30.0f)
                lineTo(13.018f, 8.0f)
                horizontalLineToRelative(12.689f)
                close()
                moveTo(14.0f, 38.0f)
                horizontalLineToRelative(21.0f)
                lineTo(35.0f, 19.0f)
                lineTo(25.0f, 19.0f)
                lineTo(25.0f, 9.0f)
                lineTo(14.018f, 9.0f)
                close()
                moveTo(22.9f, 27.5f)
                lineTo(19.7f, 30.5f)
                horizontalLineToRelative(3.8f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.802f)
                lineToRelative(-3.202f, -3.0f)
                horizontalLineToRelative(2.4f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-4.0f, 4.0f)
                horizontalLineToRelative(-2.4f)
                lineToRelative(3.202f, -3.0f)
                lineTo(25.5f, 32.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.8f)
                lineToRelative(3.2f, 3.0f)
                horizontalLineToRelative(-2.4f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(4.0f, -4.0f)
                close()
                moveTo(26.0f, 18.0f)
                horizontalLineToRelative(8.293f)
                lineTo(26.0f, 9.707f)
                close()
            }
        }
            .build()
        return _documentSbbLarge!!
    }

private var _documentSbbLarge: ImageVector? = null
