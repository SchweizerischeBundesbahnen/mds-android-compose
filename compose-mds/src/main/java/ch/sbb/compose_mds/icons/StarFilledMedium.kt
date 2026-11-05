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

public val SBBIcons.StarFilledMedium: ImageVector
    get() {
        if (_starFilledMedium != null) {
            return _starFilledMedium!!
        }
        _starFilledMedium = Builder(
            name = "StarFilledMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveToRelative(18.475f, 5.092f)
                lineToRelative(2.885f, 8.658f)
                horizontalLineToRelative(9.347f)
                lineToRelative(-1.15f, 0.895f)
                lineToRelative(-6.468f, 5.03f)
                lineToRelative(2.884f, 8.36f)
                lineToRelative(0.48f, 1.391f)
                lineToRelative(-1.228f, -0.81f)
                lineTo(18.0f, 23.85f)
                lineToRelative(-7.225f, 4.767f)
                lineToRelative(-1.227f, 0.81f)
                lineToRelative(0.48f, -1.39f)
                lineToRelative(2.882f, -8.362f)
                lineToRelative(-6.467f, -5.03f)
                lineToRelative(-1.15f, -0.894f)
                horizontalLineToRelative(9.347f)
                lineToRelative(2.885f, -8.658f)
                lineTo(18.0f, 3.67f)
                close()
            }
        }
            .build()
        return _starFilledMedium!!
    }

private var _starFilledMedium: ImageVector? = null
