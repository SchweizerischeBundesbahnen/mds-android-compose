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

public val SBBIcons.ToiletMedium: ImageVector
    get() {
        if (_toiletMedium != null) {
            return _toiletMedium!!
        }
        _toiletMedium = Builder(
            name = "ToiletMedium",
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
                moveTo(16.75f, 6.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(1.0f)
                lineTo(17.75f, 6.0f)
                close()
                moveTo(7.25f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.998f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.999f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.002f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.001f, -4.0f)
                moveToRelative(-3.0f, 6.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-6.5f)
                moveToRelative(0.5f, 7.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-1.5f)
                moveToRelative(19.5f, 9.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(24.248f, 29.25f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-3.163f)
                lineToRelative(0.182f, -0.638f)
                lineToRelative(3.0f, -10.5f)
                lineToRelative(0.104f, -0.362f)
                horizontalLineToRelative(3.754f)
                lineToRelative(0.104f, 0.362f)
                lineToRelative(3.0f, 10.5f)
                lineToRelative(0.182f, 0.638f)
                lineTo(28.25f, 23.75f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(25.248f, 8.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveToRelative(-1.123f, 7.0f)
                lineToRelative(-2.714f, 9.5f)
                horizontalLineToRelative(7.674f)
                lineToRelative(-2.714f, -9.5f)
                close()
            }
        }
            .build()
        return _toiletMedium!!
    }

private var _toiletMedium: ImageVector? = null
