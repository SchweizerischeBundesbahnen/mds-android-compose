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

public val SBBIcons.RailwaySwitchMedium: ImageVector
    get() {
        if (_railwaySwitchMedium != null) {
            return _railwaySwitchMedium!!
        }
        _railwaySwitchMedium = Builder(
            name = "RailwaySwitchMedium",
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
                moveTo(7.75f, 10.25f)
                verticalLineToRelative(3.5f)
                lineTo(6.0f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(3.5f)
                lineTo(6.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(3.5f)
                lineTo(6.0f, 22.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(3.5f)
                lineTo(6.0f, 27.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.912f)
                lineTo(22.918f, 7.025f)
                lineToRelative(-0.836f, -0.55f)
                lineTo(20.26f, 9.25f)
                horizontalLineToRelative(-0.76f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.103f)
                lineToRelative(-2.3f, 3.5f)
                lineTo(16.25f, 13.75f)
                verticalLineToRelative(-3.5f)
                lineTo(18.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.75f)
                lineTo(16.25f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                lineTo(10.5f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(3.5f)
                lineTo(10.5f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(2.124f)
                lineToRelative(-0.899f, 1.368f)
                lineTo(10.5f, 18.242f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.194f)
                lineToRelative(-2.3f, 3.5f)
                lineTo(10.5f, 22.742f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.238f)
                lineTo(8.75f, 26.767f)
                lineTo(8.75f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                lineTo(6.0f, 9.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.25f, 15.352f)
                verticalLineToRelative(-0.602f)
                horizontalLineToRelative(0.395f)
                close()
                moveTo(16.25f, 29.324f)
                verticalLineToRelative(2.175f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.25f)
                lineTo(12.0f, 28.249f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.485f)
                lineToRelative(2.46f, -3.5f)
                lineTo(15.0f, 23.749f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.647f)
                lineToRelative(2.46f, -3.499f)
                lineTo(18.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.809f)
                lineToRelative(2.459f, -3.5f)
                lineTo(21.0f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.97f)
                lineToRelative(2.46f, -3.5f)
                lineTo(24.0f, 10.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.132f)
                lineToRelative(1.959f, -2.787f)
                lineToRelative(0.818f, 0.574f)
                lineToRelative(-1.554f, 2.213f)
                lineTo(31.5f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.848f)
                lineToRelative(-2.46f, 3.5f)
                lineTo(28.5f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(-2.46f, 3.5f)
                horizontalLineToRelative(1.47f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.172f)
                lineToRelative(-2.459f, 3.5f)
                lineTo(22.5f, 22.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.333f)
                lineToRelative(-2.46f, 3.5f)
                lineTo(19.5f, 27.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.495f)
                close()
            }
        }
            .build()
        return _railwaySwitchMedium!!
    }

private var _railwaySwitchMedium: ImageVector? = null
