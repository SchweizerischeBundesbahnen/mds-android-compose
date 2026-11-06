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

public val SBBIcons.DiamondMedium: ImageVector
    get() {
        if (_diamondMedium != null) {
            return _diamondMedium!!
        }
        _diamondMedium = Builder(name = "DiamondMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.482f, 3.25f)
                horizontalLineToRelative(17.036f)
                lineToRelative(0.148f, 0.223f)
                lineToRelative(6.0f, 9.0f)
                lineToRelative(0.198f, 0.296f)
                lineToRelative(-0.216f, 0.284f)
                lineToRelative(-14.25f, 18.75f)
                lineToRelative(-0.398f, 0.523f)
                lineToRelative(-0.398f, -0.524f)
                lineToRelative(-14.25f, -18.75f)
                lineToRelative(-0.216f, -0.283f)
                lineToRelative(0.198f, -0.296f)
                lineToRelative(6.0f, -9.0f)
                close()
                moveTo(4.684f, 12.25f)
                lineTo(9.574f, 4.915f)
                lineTo(11.756f, 12.25f)
                close()
                moveTo(16.74f, 29.015f)
                lineTo(4.758f, 13.25f)
                horizontalLineToRelative(7.295f)
                close()
                moveTo(31.242f, 13.25f)
                lineTo(19.26f, 29.015f)
                lineToRelative(4.687f, -15.765f)
                close()
                moveTo(26.425f, 4.915f)
                lineTo(31.315f, 12.25f)
                horizontalLineToRelative(-7.07f)
                close()
                moveTo(18.898f, 4.25f)
                horizontalLineToRelative(6.682f)
                lineToRelative(-2.167f, 7.287f)
                close()
                moveTo(17.102f, 4.25f)
                lineTo(12.587f, 11.539f)
                lineTo(10.42f, 4.25f)
                close()
                moveTo(13.322f, 12.25f)
                lineTo(18.0f, 4.7f)
                lineToRelative(4.678f, 7.55f)
                close()
                moveTo(18.0f, 29.745f)
                lineToRelative(4.904f, -16.495f)
                horizontalLineToRelative(-9.808f)
                close()
            }
        }
        .build()
        return _diamondMedium!!
    }

private var _diamondMedium: ImageVector? = null
