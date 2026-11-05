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

public val SBBIcons.NewspaperSmall: ImageVector
    get() {
        if (_newspaperSmall != null) {
            return _newspaperSmall!!
        }
        _newspaperSmall = Builder(
            name = "NewspaperSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(3.5f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(13.502f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 5.499f, 20.0f)
                horizontalLineToRelative(13.003f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 21.0f, 17.502f)
                lineTo(21.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 4.0f)
                lineTo(3.5f, 4.0f)
                moveTo(19.0f, 17.0f)
                lineTo(19.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(9.502f)
                curveToRelative(0.0f, 0.827f, -0.671f, 1.498f, -1.498f, 1.498f)
                lineTo(5.499f, 19.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.0f, 17.502f)
                lineTo(4.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(5.5f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                lineTo(10.0f, 8.0f)
                lineTo(5.5f, 8.0f)
                moveToRelative(0.5f, 3.0f)
                lineTo(6.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 11.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(6.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(11.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 16.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(5.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 13.0f)
                close()
                moveTo(10.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(5.0f, 17.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _newspaperSmall!!
    }

private var _newspaperSmall: ImageVector? = null
