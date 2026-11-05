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

public val SBBIcons.FigmaMedium: ImageVector
    get() {
        if (_figmaMedium != null) {
            return _figmaMedium!!
        }
        _figmaMedium = Builder(
            name = "FigmaMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(12.75f, 3.25f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.064f, 9.555f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -1.375f, 0.98f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, -1.443f, 3.517f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, false, 1.483f, 3.502f)
                curveToRelative(0.419f, 0.412f, 0.903f, 0.743f, 1.429f, 0.985f)
                arcToRelative(5.37f, 5.37f, 0.0f, false, false, -2.62f, 2.78f)
                arcToRelative(5.375f, 5.375f, 0.0f, true, false, 10.34f, 2.056f)
                lineTo(18.5f, 20.25f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 6.517f, -7.322f)
                arcTo(5.002f, 5.002f, 0.0f, false, false, 23.25f, 3.25f)
                close()
                moveTo(19.5f, 13.25f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.5f, 12.25f)
                horizontalLineToRelative(4.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(18.5f, 4.25f)
                close()
                moveTo(17.5f, 4.25f)
                horizontalLineToRelative(-4.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(4.75f)
                close()
                moveTo(22.5f, 13.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                moveToRelative(-5.0f, 0.05f)
                verticalLineToRelative(7.95f)
                horizontalLineToRelative(-4.608f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, -2.84f, -1.16f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, true, -1.184f, -2.793f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, true, 1.152f, -2.807f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, 2.824f, -1.19f)
                close()
                moveTo(17.5f, 22.25f)
                horizontalLineToRelative(-4.375f)
                arcToRelative(4.375f, 4.375f, 0.0f, true, false, 4.375f, 4.375f)
                close()
            }
        }
            .build()
        return _figmaMedium!!
    }

private var _figmaMedium: ImageVector? = null
