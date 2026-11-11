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

public val SBBIcons.StarMedium: ImageVector
    get() {
        if (_starMedium != null) {
            return _starMedium!!
        }
        _starMedium = Builder(name = "StarMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(18.475f, 5.092f)
                lineToRelative(2.886f, 8.658f)
                horizontalLineToRelative(9.346f)
                lineToRelative(-1.15f, 0.895f)
                lineToRelative(-6.468f, 5.03f)
                lineToRelative(2.884f, 8.36f)
                lineToRelative(0.48f, 1.391f)
                lineToRelative(-1.228f, -0.81f)
                lineTo(18.0f, 23.85f)
                lineToRelative(-7.224f, 4.767f)
                lineToRelative(-1.228f, 0.81f)
                lineToRelative(0.48f, -1.39f)
                lineToRelative(2.882f, -8.362f)
                lineToRelative(-6.466f, -5.03f)
                lineToRelative(-1.15f, -0.894f)
                horizontalLineToRelative(9.346f)
                lineToRelative(2.886f, -8.658f)
                lineTo(18.0f, 3.67f)
                close()
                moveTo(15.475f, 14.409f)
                lineTo(15.361f, 14.75f)
                lineTo(8.207f, 14.75f)
                lineToRelative(5.6f, 4.356f)
                lineToRelative(0.282f, 0.22f)
                lineToRelative(-0.116f, 0.337f)
                lineToRelative(-2.522f, 7.308f)
                lineToRelative(6.274f, -4.138f)
                lineToRelative(0.275f, -0.181f)
                lineToRelative(0.276f, 0.181f)
                lineToRelative(6.272f, 4.138f)
                lineToRelative(-2.52f, -7.308f)
                lineToRelative(-0.117f, -0.337f)
                lineToRelative(0.283f, -0.22f)
                lineToRelative(5.6f, -4.356f)
                lineTo(20.64f, 14.75f)
                lineToRelative(-0.114f, -0.341f)
                lineTo(18.0f, 6.832f)
                close()
            }
        }
        .build()
        return _starMedium!!
    }

private var _starMedium: ImageVector? = null
