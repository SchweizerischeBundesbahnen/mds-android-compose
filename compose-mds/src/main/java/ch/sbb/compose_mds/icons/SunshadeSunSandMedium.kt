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

public val SBBIcons.SunshadeSunSandMedium: ImageVector
    get() {
        if (_sunshadeSunSandMedium != null) {
            return _sunshadeSunSandMedium!!
        }
        _sunshadeSunSandMedium = Builder(
            name = "SunshadeSunSandMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(27.75f, 5.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                moveToRelative(-5.0f, 4.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f)
                moveTo(8.002f, 12.024f)
                curveToRelative(4.543f, -2.623f, 10.353f, -1.067f, 12.977f, 3.478f)
                lineToRelative(0.25f, 0.432f)
                lineToRelative(-0.433f, 0.25f)
                lineToRelative(-7.387f, 4.265f)
                lineToRelative(5.65f, 11.301f)
                lineTo(33.0f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(14.941f)
                lineToRelative(-5.4f, -10.8f)
                lineToRelative(-7.335f, 4.235f)
                lineToRelative(-0.433f, 0.25f)
                lineToRelative(-0.25f, -0.434f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 3.479f, -12.976f)
                moveToRelative(0.5f, 0.865f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -2.1f, 1.707f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.087f, 1.764f)
                curveToRelative(0.107f, 1.784f, 0.742f, 3.887f, 1.862f, 5.954f)
                lineTo(5.152f, 24.06f)
                arcToRelative(8.51f, 8.51f, 0.0f, false, true, 1.25f, -9.464f)
                moveToRelative(2.642f, 7.218f)
                lineToRelative(6.916f, -3.993f)
                curveToRelative(-1.166f, -1.893f, -2.568f, -3.37f, -3.91f, -4.256f)
                curveToRelative(-1.47f, -0.97f, -2.723f, -1.151f, -3.547f, -0.676f)
                moveToRelative(8.323f, 4.432f)
                curveToRelative(-1.23f, -2.004f, -2.733f, -3.605f, -4.225f, -4.59f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, false, -1.572f, -0.806f)
                arcToRelative(8.51f, 8.51f, 0.0f, false, true, 8.821f, 3.65f)
                close()
                moveTo(9.044f, 21.814f)
                curveToRelative(-1.057f, -1.956f, -1.634f, -3.909f, -1.73f, -5.514f)
                curveToRelative(-0.106f, -1.758f, 0.364f, -2.935f, 1.188f, -3.41f)
                lineToRelative(-0.25f, -0.433f)
                lineToRelative(0.25f, 0.432f)
            }
        }
            .build()
        return _sunshadeSunSandMedium!!
    }

private var _sunshadeSunSandMedium: ImageVector? = null
