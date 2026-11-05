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

public val SBBIcons.NarcoticMedium: ImageVector
    get() {
        if (_narcoticMedium != null) {
            return _narcoticMedium!!
        }
        _narcoticMedium = Builder(
            name = "NarcoticMedium",
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
                moveToRelative(29.75f, 7.748f)
                lineToRelative(0.002f, -4.749f)
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.002f, 4.749f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.002f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(3.001f)
                verticalLineToRelative(5.0f)
                lineTo(25.5f, 31.75f)
                verticalLineToRelative(1.0f)
                lineTo(33.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.25f)
                lineToRelative(0.001f, -5.0f)
                horizontalLineToRelative(2.999f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(31.25f, 7.748f)
                horizontalLineToRelative(-1.5f)
                moveTo(15.84f, 5.436f)
                arcToRelative(4.05f, 4.05f, 0.0f, true, true, 5.727f, 5.726f)
                lineTo(16.72f, 16.01f)
                lineToRelative(-5.727f, -5.727f)
                close()
                moveTo(10.286f, 10.989f)
                lineTo(5.438f, 15.835f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 3.428f, 6.876f)
                lineToRelative(0.17f, -0.031f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, false, 2.13f, -1.117f)
                lineToRelative(0.735f, -0.734f)
                lineToRelative(0.81f, -0.812f)
                lineToRelative(0.107f, -0.106f)
                lineToRelative(3.195f, -3.195f)
                close()
                moveTo(22.274f, 11.869f)
                lineTo(14.391f, 19.752f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, -6.641f, 6.499f)
                curveToRelative(0.0f, -0.893f, 0.19f, -1.735f, 0.518f, -2.501f)
                arcToRelative(5.05f, 5.05f, 0.0f, false, true, -3.537f, -8.622f)
                lineToRelative(10.4f, -10.399f)
                horizontalLineToRelative(0.001f)
                arcToRelative(5.05f, 5.05f, 0.0f, true, true, 7.142f, 7.14f)
                moveToRelative(-8.963f, 8.964f)
                lineToRelative(-0.702f, 0.702f)
                lineToRelative(-0.735f, 0.736f)
                arcToRelative(5.06f, 5.06f, 0.0f, false, true, -2.43f, 1.349f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -0.67f, 2.133f)
                horizontalLineToRelative(10.954f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -6.417f, -4.92f)
                moveToRelative(6.416f, 5.92f)
                lineTo(8.773f, 26.753f)
                arcToRelative(5.501f, 5.501f, 0.0f, false, false, 10.954f, 0.0f)
                moveTo(30.25f, 8.748f)
                verticalLineToRelative(2.002f)
                horizontalLineToRelative(-2.0f)
                lineTo(28.25f, 8.748f)
                close()
                moveTo(26.75f, 23.75f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(2.0f)
                lineTo(30.0f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(2.0f)
                lineTo(30.0f, 16.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(2.0f)
                lineTo(30.0f, 19.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.25f)
                verticalLineToRelative(2.0f)
                lineTo(30.0f, 22.75f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
            .build()
        return _narcoticMedium!!
    }

private var _narcoticMedium: ImageVector? = null
