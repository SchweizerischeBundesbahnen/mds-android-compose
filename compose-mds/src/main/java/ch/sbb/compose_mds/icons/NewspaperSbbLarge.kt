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

public val SBBIcons.NewspaperSbbLarge: ImageVector
    get() {
        if (_newspaperSbbLarge != null) {
            return _newspaperSbbLarge!!
        }
        _newspaperSbbLarge = Builder(name = "NewspaperSbbLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.3f, 36.0f)
                lineTo(30.0f, 36.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(3.0f)
                lineTo(33.0f, 36.0f)
                horizontalLineToRelative(5.7f)
                lineToRelative(-4.8f, -4.5f)
                horizontalLineToRelative(3.6f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(-6.0f, 6.0f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(4.8f, -4.5f)
                lineTo(33.0f, 39.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3.0f)
                lineTo(30.0f, 39.0f)
                horizontalLineToRelative(-5.7f)
                lineToRelative(4.8f, 4.5f)
                horizontalLineToRelative(-3.6f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(6.0f, -6.0f)
                horizontalLineToRelative(3.6f)
                close()
                moveTo(37.0f, 29.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(36.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                verticalLineToRelative(25.5f)
                curveToRelative(0.0f, 1.924f, 1.576f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-5.0f)
                arcTo(4.51f, 4.51f, 0.0f, false, true, 6.0f, 34.5f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(17.5f, 35.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(19.5f, 31.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(19.5f, 27.0f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(33.5f, 27.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(19.0f, 23.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(11.0f, 22.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(33.5f, 21.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(33.5f, 17.0f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(33.5f, 13.0f)
                horizontalLineToRelative(-24.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(24.0f)
                close()
            }
        }
        .build()
        return _newspaperSbbLarge!!
    }

private var _newspaperSbbLarge: ImageVector? = null
