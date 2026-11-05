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

public val SBBIcons.SpeakerLarge: ImageVector
    get() {
        if (_speakerLarge != null) {
            return _speakerLarge!!
        }
        _speakerLarge = Builder(
            name = "SpeakerLarge",
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
                moveToRelative(27.0f, 37.432f)
                lineToRelative(-0.82f, -0.685f)
                lineToRelative(-10.5f, -8.76f)
                lineTo(8.0f, 27.987f)
                verticalLineToRelative(-6.998f)
                horizontalLineToRelative(7.68f)
                lineToRelative(10.5f, -8.74f)
                lineToRelative(0.82f, -0.683f)
                close()
                moveTo(36.308f, 35.877f)
                lineTo(36.045f, 36.302f)
                lineTo(35.782f, 36.727f)
                lineTo(31.25f, 33.925f)
                lineTo(31.775f, 33.075f)
                close()
                moveTo(16.182f, 21.873f)
                lineToRelative(-0.139f, 0.116f)
                lineTo(9.0f, 21.989f)
                verticalLineToRelative(4.997f)
                horizontalLineToRelative(7.043f)
                lineToRelative(0.14f, 0.116f)
                lineTo(26.0f, 35.295f)
                lineTo(26.0f, 13.699f)
                close()
                moveTo(38.826f, 29.801f)
                lineTo(38.706f, 30.286f)
                lineTo(38.585f, 30.771f)
                lineTo(31.394f, 28.985f)
                lineTo(31.634f, 28.015f)
                close()
                moveTo(24.0f, 28.505f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(40.0f, 25.0f)
                horizontalLineToRelative(-8.986f)
                verticalLineToRelative(-1.0f)
                lineTo(40.0f, 24.0f)
                close()
                moveTo(38.707f, 18.717f)
                lineTo(38.827f, 19.202f)
                lineTo(31.633f, 20.986f)
                lineTo(31.393f, 20.016f)
                lineTo(38.586f, 18.231f)
                close()
                moveTo(36.307f, 13.123f)
                lineTo(31.775f, 15.926f)
                lineTo(31.513f, 15.5f)
                lineTo(31.25f, 15.075f)
                lineTo(35.782f, 12.273f)
                close()
            }
        }
            .build()
        return _speakerLarge!!
    }

private var _speakerLarge: ImageVector? = null
