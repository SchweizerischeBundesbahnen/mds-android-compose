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
        _hikingBootMedium = Builder(
            name = "HikingBootMedium",
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
                moveToRelative(14.724f, 9.592f)
                lineToRelative(-0.114f, -0.342f)
                lineTo(3.25f, 9.25f)
                verticalLineToRelative(17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                horizontalLineToRelative(-3.622f)
                lineToRelative(-2.317f, -1.264f)
                lineToRelative(-2.912f, -1.588f)
                lineToRelative(-2.737f, -1.493f)
                close()
                moveTo(31.75f, 26.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                moveToRelative(0.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineToRelative(-3.878f)
                lineToRelative(-0.111f, -0.061f)
                lineToRelative(-2.1f, -1.145f)
                lineToRelative(-1.807f, 1.81f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(1.6f, -1.602f)
                lineToRelative(-1.997f, -1.09f)
                lineToRelative(-1.895f, 1.898f)
                lineToRelative(-0.708f, -0.706f)
                lineToRelative(1.688f, -1.69f)
                lineToRelative(-1.995f, -1.089f)
                lineToRelative(-1.985f, 1.986f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(2.032f, -2.032f)
                lineToRelative(-1.288f, -3.865f)
                lineTo(4.25f, 10.25f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(4.25f, 25.25f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
            .build()
        return _hikingBootMedium!!
    }

private var _hikingBootMedium: ImageVector? = null
