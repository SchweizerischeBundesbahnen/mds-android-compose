package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.NewspaperSbbSmall: ImageVector
    get() {
        if (_newspaperSbbSmall != null) {
            return _newspaperSbbSmall!!
        }
        _newspaperSbbSmall = Builder(name = "NewspaperSbbSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.5f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(13.5f)
                curveTo(3.0f, 18.876f, 4.124f, 20.0f, 5.5f, 20.0f)
                lineTo(8.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.5f, 19.0f)
                curveToRelative(-0.824f, 0.0f, -1.5f, -0.676f, -1.5f, -1.5f)
                lineTo(4.0f, 5.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                lineTo(19.0f, 4.0f)
                lineTo(3.5f, 4.0f)
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(12.0f)
                lineTo(17.0f, 6.0f)
                lineTo(5.0f, 6.0f)
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
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 9.0f)
                horizontalLineToRelative(-6.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(17.0f, 14.0f)
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
                moveTo(5.0f, 18.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 17.0f)
                close()
                moveTo(17.2f, 16.0f)
                lineTo(19.6f, 18.25f)
                horizontalLineToRelative(-2.85f)
                lineTo(16.75f, 16.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.25f)
                lineTo(12.4f, 18.25f)
                lineTo(14.8f, 16.0f)
                lineTo(13.0f, 16.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(1.8f)
                lineToRelative(-2.4f, -2.25f)
                horizontalLineToRelative(2.85f)
                lineTo(15.25f, 22.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2.25f)
                horizontalLineToRelative(2.85f)
                lineTo(17.2f, 22.0f)
                lineTo(19.0f, 22.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(-3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _newspaperSbbSmall!!
    }

private var _newspaperSbbSmall: ImageVector? = null
