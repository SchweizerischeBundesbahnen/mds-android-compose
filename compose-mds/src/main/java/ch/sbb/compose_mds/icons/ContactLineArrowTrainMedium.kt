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

public val SBBIcons.ContactLineArrowTrainMedium: ImageVector
    get() {
        if (_contactLineArrowTrainMedium != null) {
            return _contactLineArrowTrainMedium!!
        }
        _contactLineArrowTrainMedium = Builder(
            name = "ContactLineArrowTrainMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
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
                moveToRelative(20.401f, 9.75f)
                lineToRelative(-3.75f, 2.5f)
                lineTo(21.0f, 12.25f)
                curveToRelative(3.176f, 0.0f, 5.84f, 2.053f, 6.823f, 4.886f)
                horizontalLineToRelative(0.001f)
                lineToRelative(3.149f, 8.68f)
                curveToRelative(0.17f, 0.353f, 0.277f, 0.752f, 0.277f, 1.184f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.75f, 2.75f)
                horizontalLineToRelative(-3.286f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.016f, 2.0f)
                lineTo(33.0f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.802f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.016f, -2.0f)
                lineTo(3.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(25.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 30.25f, 27.0f)
                curveToRelative(0.0f, -0.27f, -0.069f, -0.529f, -0.187f, -0.77f)
                lineToRelative(-0.013f, -0.025f)
                lineToRelative(-0.01f, -0.026f)
                lineToRelative(0.47f, -0.17f)
                lineToRelative(0.006f, -0.003f)
                lineToRelative(-0.476f, 0.173f)
                lineToRelative(-0.88f, -2.429f)
                horizontalLineToRelative(-9.41f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(6.832f)
                curveToRelative(-1.017f, -2.072f, -3.125f, -3.5f, -5.582f, -3.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.349f)
                lineToRelative(3.75f, -2.5f)
                lineToRelative(-3.876f, -2.584f)
                lineToRelative(0.554f, -0.832f)
                close()
                moveTo(5.8f, 29.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 4.9f, 0.0f)
                close()
                moveTo(11.714f, 29.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.016f, 2.0f)
                horizontalLineToRelative(8.604f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.016f, -2.0f)
                close()
                moveTo(19.3f, 29.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, false, 4.9f, 0.0f)
                close()
                moveTo(20.75f, 22.75f)
                horizontalLineToRelative(8.047f)
                lineToRelative(-1.814f, -5.0f)
                lineTo(20.75f, 17.75f)
                close()
                moveTo(12.354f, 10.147f)
                lineTo(11.647f, 10.854f)
                lineTo(8.75f, 7.957f)
                lineTo(8.75f, 16.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(7.75f, 7.957f)
                lineToRelative(-2.896f, 2.897f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(8.25f, 6.042f)
                close()
                moveTo(33.0f, 4.25f)
                lineTo(3.0f, 4.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(30.0f)
                close()
            }
        }
            .build()
        return _contactLineArrowTrainMedium!!
    }

private var _contactLineArrowTrainMedium: ImageVector? = null
