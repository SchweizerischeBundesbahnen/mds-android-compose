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

public val SBBIcons.BicycleMedium: ImageVector
    get() {
        if (_bicycleMedium != null) {
            return _bicycleMedium!!
        }
        _bicycleMedium = Builder(
            name = "BicycleMedium",
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
                moveTo(24.75f, 9.249f)
                lineTo(19.5f, 9.249f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.316f)
                lineToRelative(-2.334f, 3.5f)
                lineTo(13.15f, 13.749f)
                lineToRelative(-0.12f, 0.33f)
                lineToRelative(-1.042f, 2.866f)
                arcTo(5.756f, 5.756f, 0.0f, false, false, 4.75f, 22.5f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.75f, 5.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.75f, -5.75f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, -3.323f, -5.213f)
                lineToRelative(0.923f, -2.538f)
                horizontalLineToRelative(7.578f)
                lineToRelative(1.248f, 2.744f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, -2.924f, 5.007f)
                arcToRelative(5.755f, 5.755f, 0.0f, false, false, 5.75f, 5.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.75f, -5.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, -7.666f, -5.422f)
                lineToRelative(-1.266f, -2.783f)
                lineToRelative(2.846f, -4.269f)
                lineToRelative(0.518f, -0.777f)
                close()
                moveTo(20.752f, 22.499f)
                curveToRelative(0.0f, -1.74f, 0.94f, -3.264f, 2.34f, -4.092f)
                lineToRelative(1.954f, 4.299f)
                lineToRelative(0.91f, -0.414f)
                lineToRelative(-1.955f, -4.3f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, 6.25f, 4.508f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -4.75f, 4.75f)
                arcToRelative(4.755f, 4.755f, 0.0f, false, true, -4.75f, -4.75f)
                moveToRelative(-9.108f, -4.61f)
                lineToRelative(-1.614f, 4.44f)
                lineToRelative(0.94f, 0.34f)
                lineToRelative(1.614f, -4.437f)
                arcTo(4.76f, 4.76f, 0.0f, false, true, 15.25f, 22.5f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -4.75f, 4.75f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, -4.75f, -4.75f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, true, 5.894f, -4.61f)
                moveToRelative(-0.831f, -6.14f)
                lineTo(15.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.188f)
                close()
            }
        }
            .build()
        return _bicycleMedium!!
    }

private var _bicycleMedium: ImageVector? = null
