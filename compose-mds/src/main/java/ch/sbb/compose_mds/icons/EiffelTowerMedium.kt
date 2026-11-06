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

public val SBBIcons.EiffelTowerMedium: ImageVector
    get() {
        if (_eiffelTowerMedium != null) {
            return _eiffelTowerMedium!!
        }
        _eiffelTowerMedium = Builder(name = "EiffelTowerMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.25f, 3.25f)
                lineTo(16.8f, 3.25f)
                lineToRelative(-0.048f, 0.446f)
                arcToRelative(109.0f, 109.0f, 0.0f, false, true, -4.36f, 20.903f)
                arcToRelative(48.3f, 48.3f, 0.0f, false, true, -3.087f, 7.421f)
                lineToRelative(-0.378f, 0.73f)
                lineTo(15.5f, 32.75f)
                verticalLineToRelative(-0.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6.58f)
                lineToRelative(-0.388f, -0.734f)
                curveToRelative(-2.815f, -5.32f, -4.68f, -12.386f, -5.84f, -18.153f)
                arcToRelative(127.0f, 127.0f, 0.0f, false, true, -1.237f, -7.244f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, true, -0.362f, -2.87f)
                lineToRelative(-0.004f, -0.038f)
                lineToRelative(-0.001f, -0.009f)
                lineTo(19.248f, 3.7f)
                lineToRelative(-0.498f, 0.05f)
                lineToRelative(0.497f, -0.05f)
                lineToRelative(-0.045f, -0.45f)
                lineTo(17.25f, 3.25f)
                moveToRelative(0.448f, 1.0f)
                horizontalLineToRelative(0.604f)
                lineToRelative(0.04f, 0.342f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 0.427f, 3.158f)
                horizontalLineToRelative(-1.52f)
                quadToRelative(0.252f, -1.745f, 0.449f, -3.5f)
                moveToRelative(-0.6f, 4.5f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, -1.537f, 8.0f)
                horizontalLineToRelative(4.885f)
                curveToRelative(-0.208f, -0.921f, -0.399f, -1.821f, -0.574f, -2.69f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, true, -0.95f, -5.31f)
                close()
                moveTo(20.678f, 17.75f)
                horizontalLineToRelative(-5.353f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, -1.777f, 6.5f)
                horizontalLineToRelative(8.913f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, true, -1.784f, -6.5f)
                moveToRelative(2.11f, 7.5f)
                horizontalLineToRelative(-9.555f)
                arcToRelative(49.0f, 49.0f, 0.0f, false, true, -2.67f, 6.5f)
                horizontalLineToRelative(3.973f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 6.928f, 0.0f)
                horizontalLineToRelative(3.967f)
                curveToRelative(-1.004f, -2.01f, -1.881f, -4.224f, -2.644f, -6.5f)
            }
        }
        .build()
        return _eiffelTowerMedium!!
    }

private var _eiffelTowerMedium: ImageVector? = null
