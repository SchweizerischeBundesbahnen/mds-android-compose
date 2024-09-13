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

public val SmallGroup.FourSquaresSmall: ImageVector
    get() {
        if (_fourSquaresSmall != null) {
            return _fourSquaresSmall!!
        }
        _fourSquaresSmall = Builder(name = "FourSquaresSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(10.0f, 5.0f)
                lineTo(4.5f, 5.0f)
                moveToRelative(0.5f, 5.0f)
                lineTo(5.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(13.5f, 5.0f)
                lineTo(13.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineToRelative(-5.5f)
                moveToRelative(0.5f, 5.0f)
                lineTo(14.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                lineTo(4.0f, 20.0f)
                verticalLineToRelative(-6.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(13.5f, 14.0f)
                lineTo(13.0f, 14.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.5f)
                moveToRelative(0.5f, 5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _fourSquaresSmall!!
    }

private var _fourSquaresSmall: ImageVector? = null
