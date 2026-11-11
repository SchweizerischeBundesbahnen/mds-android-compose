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

public val SBBIcons.HikingBootMedium: ImageVector
    get() {
        if (_hikingBootMedium != null) {
            return _hikingBootMedium!!
        }
        _hikingBootMedium = Builder(name = "HikingBootMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.75f, 19.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.25f, 24.25f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(9.64f)
                lineToRelative(1.288f, 3.865f)
                lineToRelative(-2.032f, 2.031f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(1.985f, -1.985f)
                lineToRelative(1.995f, 1.088f)
                lineToRelative(-1.686f, 1.69f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(1.894f, -1.898f)
                lineToRelative(1.997f, 1.089f)
                lineToRelative(-1.599f, 1.602f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(1.807f, -1.81f)
                lineToRelative(2.1f, 1.146f)
                lineToRelative(0.112f, 0.061f)
                close()
                moveTo(4.25f, 25.25f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(3.25f, 26.25f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(11.36f)
                lineToRelative(0.115f, 0.342f)
                lineToRelative(1.437f, 4.313f)
                lineToRelative(2.736f, 1.493f)
                lineToRelative(2.913f, 1.588f)
                lineToRelative(2.316f, 1.264f)
                horizontalLineToRelative(3.623f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                moveToRelative(28.5f, 0.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
            }
        }
        .build()
        return _hikingBootMedium!!
    }

private var _hikingBootMedium: ImageVector? = null
