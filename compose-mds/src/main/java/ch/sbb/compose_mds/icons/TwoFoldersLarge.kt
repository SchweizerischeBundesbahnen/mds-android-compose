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

public val SBBIcons.TwoFoldersLarge: ImageVector
    get() {
        if (_twoFoldersLarge != null) {
            return _twoFoldersLarge!!
        }
        _twoFoldersLarge = Builder(
            name = "TwoFoldersLarge",
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
                moveTo(43.0f, 29.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-30.0f, 0.018f)
                lineTo(6.0f, 41.018f)
                lineTo(6.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                lineTo(12.0f, 10.0f)
                horizontalLineToRelative(20.191f)
                lineToRelative(1.862f, -3.724f)
                lineTo(34.19f, 6.0f)
                lineTo(43.0f, 6.0f)
                close()
                moveTo(26.947f, 22.724f)
                lineTo(26.81f, 23.0f)
                lineTo(7.0f, 23.0f)
                verticalLineToRelative(17.017f)
                lineTo(36.0f, 40.0f)
                lineTo(36.0f, 19.0f)
                horizontalLineToRelative(-7.191f)
                close()
                moveTo(32.947f, 10.724f)
                lineTo(32.81f, 11.0f)
                lineTo(13.0f, 11.0f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(13.191f)
                lineToRelative(1.862f, -3.724f)
                lineToRelative(0.138f, -0.276f)
                lineTo(37.0f, 18.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(5.0f)
                lineTo(42.0f, 7.0f)
                horizontalLineToRelative(-7.191f)
                close()
            }
        }
            .build()
        return _twoFoldersLarge!!
    }

private var _twoFoldersLarge: ImageVector? = null
