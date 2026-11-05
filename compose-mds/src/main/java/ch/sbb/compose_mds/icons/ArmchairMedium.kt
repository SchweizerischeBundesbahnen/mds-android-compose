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

public val SBBIcons.ArmchairMedium: ImageVector
    get() {
        if (_armchairMedium != null) {
            return _armchairMedium!!
        }
        _armchairMedium = Builder(
            name = "ArmchairMedium",
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
                pathFillType = NonZero,
            ) {
                moveTo(24.75f, 3.25f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                verticalLineToRelative(7.026f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 1.545f, 6.341f)
                verticalLineToRelative(4.678f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.545f, 2.902f)
                verticalLineToRelative(3.153f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -1.17f, 1.761f)
                curveToRelative(-0.23f, 0.094f, -0.476f, 0.14f, -0.724f, 0.138f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(-0.21f)
                verticalLineToRelative(-0.001f)
                arcTo(1.88f, 1.88f, 0.0f, false, true, 24.8f, 32.2f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -0.551f, -1.35f)
                verticalLineToRelative(-2.555f)
                horizontalLineToRelative(-12.5f)
                verticalLineToRelative(2.555f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -1.17f, 1.761f)
                curveToRelative(-0.23f, 0.094f, -0.476f, 0.14f, -0.725f, 0.138f)
                verticalLineToRelative(0.001f)
                horizontalLineToRelative(-0.21f)
                verticalLineToRelative(-0.001f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -1.344f, -0.549f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -0.551f, -1.35f)
                verticalLineToRelative(-3.185f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.5f, -2.87f)
                verticalLineToRelative(-4.678f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.5f, -2.87f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.0f, -3.463f)
                lineTo(7.749f, 6.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, -3.5f)
                close()
                moveTo(8.75f, 30.86f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.548f, 0.826f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.342f, 0.064f)
                horizontalLineToRelative(0.22f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.89f, -0.89f)
                verticalLineToRelative(-2.565f)
                horizontalLineToRelative(-1.0f)
                quadToRelative(-0.515f, 0.0f, -1.0f, -0.147f)
                close()
                moveTo(27.25f, 28.16f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.955f, 0.135f)
                lineTo(25.25f, 28.295f)
                verticalLineToRelative(2.565f)
                arcToRelative(0.885f, 0.885f, 0.0f, false, false, 0.548f, 0.826f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.342f, 0.064f)
                horizontalLineToRelative(0.22f)
                arcToRelative(0.88f, 0.88f, 0.0f, false, false, 0.89f, -0.89f)
                close()
                moveTo(27.793f, 14.747f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.498f, 2.503f)
                horizontalLineToRelative(-0.045f)
                verticalLineToRelative(4.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-10.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(2.503f, 2.503f, 0.0f, false, false, -2.498f, -2.503f)
                arcTo(2.501f, 2.501f, 0.0f, false, false, 7.0f, 19.412f)
                lineToRelative(0.25f, 0.145f)
                verticalLineToRelative(5.238f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(16.545f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, -2.5f)
                verticalLineToRelative(-5.238f)
                lineToRelative(0.25f, -0.145f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -1.252f, -4.665f)
                moveTo(11.75f, 20.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(10.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.25f, 4.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(7.033f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.0f, 3.467f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(0.045f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.955f, -3.459f)
                lineTo(27.25f, 6.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, -2.5f)
                close()
            }
        }
            .build()
        return _armchairMedium!!
    }

private var _armchairMedium: ImageVector? = null
