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

public val SBBIcons.GlobeArrowsLeftRightUpDownLarge: ImageVector
    get() {
        if (_globeArrowsLeftRightUpDownLarge != null) {
            return _globeArrowsLeftRightUpDownLarge!!
        }
        _globeArrowsLeftRightUpDownLarge = Builder(
            name = "GlobeArrowsLeftRightUpDownLarge",
            defaultWidth = 48.0.dp,
            defaultHeight = 48.0.dp,
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
                moveToRelative(28.854f, 41.147f)
                lineToRelative(-0.707f, 0.706f)
                lineToRelative(-4.647f, -4.646f)
                lineToRelative(-4.646f, 4.646f)
                lineToRelative(-0.707f, -0.706f)
                lineToRelative(5.353f, -5.354f)
                close()
                moveTo(23.5f, 16.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 8.5f, 8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -8.5f, 8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -8.5f, -8.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 8.5f, -8.5f)
                moveToRelative(-2.693f, 9.0f)
                curveToRelative(0.05f, 1.96f, 0.387f, 3.703f, 0.894f, 4.972f)
                curveToRelative(0.276f, 0.689f, 0.592f, 1.213f, 0.917f, 1.556f)
                curveToRelative(0.324f, 0.343f, 0.622f, 0.472f, 0.882f, 0.472f)
                reflectiveCurveToRelative(0.558f, -0.13f, 0.882f, -0.472f)
                curveToRelative(0.325f, -0.343f, 0.641f, -0.867f, 0.917f, -1.556f)
                curveToRelative(0.507f, -1.269f, 0.845f, -3.013f, 0.894f, -4.972f)
                close()
                moveTo(16.019f, 25.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, 5.481f, 6.727f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.727f, -1.384f)
                curveToRelative(-0.562f, -1.407f, -0.917f, -3.282f, -0.966f, -5.343f)
                close()
                moveTo(27.193f, 25.0f)
                curveToRelative(-0.05f, 2.061f, -0.404f, 3.936f, -0.966f, 5.343f)
                curveToRelative(-0.21f, 0.522f, -0.453f, 0.99f, -0.728f, 1.384f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 30.981f, 25.0f)
                close()
                moveTo(12.207f, 24.5f)
                lineTo(6.854f, 29.854f)
                lineTo(6.146f, 29.147f)
                lineTo(10.793f, 24.5f)
                lineTo(6.146f, 19.854f)
                lineTo(6.854f, 19.147f)
                close()
                moveTo(40.853f, 19.854f)
                lineTo(36.207f, 24.5f)
                lineToRelative(4.646f, 4.647f)
                lineToRelative(-0.706f, 0.707f)
                lineToRelative(-5.354f, -5.354f)
                lineToRelative(5.354f, -5.353f)
                close()
                moveTo(21.5f, 17.272f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 16.019f, 24.0f)
                horizontalLineToRelative(3.788f)
                curveToRelative(0.05f, -2.061f, 0.404f, -3.936f, 0.966f, -5.343f)
                curveToRelative(0.21f, -0.522f, 0.452f, -0.991f, 0.727f, -1.386f)
                moveToRelative(2.0f, -0.272f)
                curveToRelative(-0.26f, 0.0f, -0.558f, 0.13f, -0.882f, 0.472f)
                curveToRelative(-0.325f, 0.343f, -0.641f, 0.867f, -0.917f, 1.556f)
                curveToRelative(-0.507f, 1.269f, -0.845f, 3.013f, -0.894f, 4.972f)
                horizontalLineToRelative(5.386f)
                curveToRelative(-0.05f, -1.96f, -0.387f, -3.703f, -0.894f, -4.972f)
                curveToRelative(-0.276f, -0.689f, -0.592f, -1.213f, -0.917f, -1.556f)
                curveToRelative(-0.324f, -0.343f, -0.622f, -0.472f, -0.882f, -0.472f)
                moveToRelative(1.999f, 0.271f)
                curveToRelative(0.275f, 0.395f, 0.518f, 0.864f, 0.728f, 1.386f)
                curveToRelative(0.563f, 1.407f, 0.917f, 3.282f, 0.966f, 5.343f)
                horizontalLineToRelative(3.788f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -5.482f, -6.728f)
                moveToRelative(3.355f, -9.417f)
                lineTo(23.5f, 13.207f)
                lineToRelative(-5.353f, -5.353f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(4.646f, 4.647f)
                lineToRelative(4.647f, -4.647f)
                close()
            }
        }
            .build()
        return _globeArrowsLeftRightUpDownLarge!!
    }

private var _globeArrowsLeftRightUpDownLarge: ImageVector? = null
