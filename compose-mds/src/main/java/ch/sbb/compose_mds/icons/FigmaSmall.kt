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

public val SBBIcons.FigmaSmall: ImageVector
    get() {
        if (_figmaSmall != null) {
            return _figmaSmall!!
        }
        _figmaSmall = Builder(name = "FigmaSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.5f, 3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(12.5f, 3.0f)
                close()
                moveTo(11.5f, 3.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(6.766f, 8.541f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.5f, 2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.53f, 6.649f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -4.53f, 5.301f)
                verticalLineToRelative(3.8f)
                arcToRelative(3.75f, 3.75f, 0.0f, true, true, -5.67f, -3.221f)
                arcToRelative(3.467f, 3.467f, 0.0f, false, true, -1.752f, -2.993f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 1.688f, -2.995f)
                moveTo(12.5f, 9.0f)
                verticalLineToRelative(0.05f)
                lineToRelative(0.05f, -0.05f)
                close()
                moveTo(15.0f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.465f)
                verticalLineToRelative(0.07f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 15.0f, 9.0f)
                moveToRelative(-3.5f, 2.5f)
                lineTo(11.5f, 9.033f)
                lineTo(8.567f, 9.033f)
                lineToRelative(-0.25f, 0.015f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, false, -1.519f, 0.73f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, false, -0.72f, 1.752f)
                curveToRelative(0.004f, 0.654f, 0.27f, 1.282f, 0.74f, 1.745f)
                curveToRelative(0.471f, 0.463f, 1.11f, 0.724f, 1.776f, 0.725f)
                lineTo(11.5f, 14.0f)
                verticalLineToRelative(-2.5f)
                moveToRelative(0.0f, 3.5f)
                lineTo(8.75f, 15.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 2.75f, 2.75f)
                close()
            }
        }
        .build()
        return _figmaSmall!!
    }

private var _figmaSmall: ImageVector? = null
