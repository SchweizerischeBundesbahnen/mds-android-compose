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
        _figmaMedium = Builder(name = "FigmaMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.25f, 4.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(18.5f, 12.25f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(17.5f, 4.25f)
                horizontalLineToRelative(-4.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(4.75f)
                close()
                moveTo(10.686f, 12.805f)
                arcTo(5.001f, 5.001f, 0.0f, false, true, 12.75f, 3.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 1.767f, 9.679f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 18.5f, 20.25f)
                verticalLineToRelative(6.374f)
                arcToRelative(5.376f, 5.376f, 0.0f, true, true, -7.72f, -4.836f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -1.43f, -0.985f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, true, -1.482f, -3.501f)
                arcToRelative(4.95f, 4.95f, 0.0f, false, true, 1.443f, -3.518f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 1.375f, -0.98f)
                moveToRelative(7.814f, 0.445f)
                verticalLineToRelative(0.999f)
                curveToRelative(0.285f, -0.378f, 0.621f, -0.715f, 1.0f, -0.999f)
                close()
                moveTo(22.5f, 13.249f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 3.945f)
                verticalLineToRelative(0.11f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 4.0f, -4.055f)
                moveToRelative(-5.0f, 4.0f)
                verticalLineToRelative(-3.951f)
                horizontalLineToRelative(-4.653f)
                lineToRelative(-0.2f, 0.008f)
                curveToRelative(-0.991f, 0.06f, -1.928f, 0.48f, -2.627f, 1.183f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, false, -1.152f, 2.807f)
                arcToRelative(3.95f, 3.95f, 0.0f, false, false, 1.184f, 2.794f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 2.839f, 1.159f)
                lineTo(17.5f, 21.249f)
                verticalLineToRelative(-4.0f)
                moveToRelative(0.0f, 5.0f)
                horizontalLineToRelative(-4.375f)
                arcToRelative(4.376f, 4.376f, 0.0f, true, false, 4.375f, 4.375f)
                close()
            }
        }
        .build()
        return _figmaMedium!!
    }

private var _figmaMedium: ImageVector? = null
