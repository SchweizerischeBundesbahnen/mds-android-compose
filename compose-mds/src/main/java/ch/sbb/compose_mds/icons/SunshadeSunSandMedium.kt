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

public val SBBIcons.SunshadeSunSandMedium: ImageVector
    get() {
        if (_sunshadeSunSandMedium != null) {
            return _sunshadeSunSandMedium!!
        }
        _sunshadeSunSandMedium = Builder(name = "SunshadeSunSandMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.432f, 11.791f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 12.547f, 3.711f)
                lineToRelative(0.25f, 0.433f)
                lineToRelative(-0.433f, 0.25f)
                lineToRelative(-7.388f, 4.263f)
                lineToRelative(5.65f, 11.302f)
                lineTo(33.0f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(14.941f)
                lineToRelative(-5.399f, -10.8f)
                lineToRelative(-7.336f, 4.235f)
                lineToRelative(-0.25f, -0.434f)
                lineToRelative(-0.433f, 0.25f)
                curveToRelative(-2.621f, -4.544f, -1.065f, -10.353f, 3.479f, -12.977f)
                close()
                moveTo(5.206f, 25.185f)
                lineToRelative(-0.433f, 0.25f)
                lineToRelative(-0.25f, -0.434f)
                lineToRelative(0.433f, -0.249f)
                close()
                moveTo(6.403f, 14.599f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -1.25f, 9.46f)
                lineToRelative(3.024f, -1.745f)
                curveToRelative(-1.12f, -2.066f, -1.754f, -4.169f, -1.862f, -5.953f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 0.088f, -1.762f)
                moveToRelative(5.647f, -1.033f)
                curveToRelative(-1.378f, -0.91f, -2.567f, -1.126f, -3.389f, -0.757f)
                lineToRelative(-0.159f, 0.082f)
                curveToRelative(-0.824f, 0.475f, -1.294f, 1.652f, -1.189f, 3.41f)
                curveToRelative(0.097f, 1.605f, 0.674f, 3.557f, 1.731f, 5.513f)
                lineToRelative(6.915f, -3.993f)
                curveToRelative(-1.165f, -1.893f, -2.567f, -3.369f, -3.91f, -4.255f)
                moveToRelative(7.799f, 2.01f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.82f, -3.65f)
                curveToRelative(0.526f, 0.19f, 1.056f, 0.465f, 1.572f, 0.805f)
                curveToRelative(1.491f, 0.985f, 2.994f, 2.587f, 4.223f, 4.59f)
                close()
                moveTo(31.75f, 9.75f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, -10.0f, 0.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
            }
        }
        .build()
        return _sunshadeSunSandMedium!!
    }

private var _sunshadeSunSandMedium: ImageVector? = null
