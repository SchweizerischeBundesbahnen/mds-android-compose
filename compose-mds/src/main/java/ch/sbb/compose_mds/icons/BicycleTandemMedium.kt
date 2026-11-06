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

public val SBBIcons.BicycleTandemMedium: ImageVector
    get() {
        if (_bicycleTandemMedium != null) {
            return _bicycleTandemMedium!!
        }
        _bicycleTandemMedium = Builder(name = "BicycleTandemMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(27.75f, 9.25f)
                lineTo(24.0f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.816f)
                lineToRelative(-2.334f, 3.5f)
                lineTo(20.75f, 13.75f)
                verticalLineToRelative(-3.0f)
                lineTo(16.5f, 10.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-3.0f)
                lineTo(9.0f, 10.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(2.382f)
                lineToRelative(-0.827f, 1.654f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 9.0f, 15.25f)
                arcTo(5.756f, 5.756f, 0.0f, false, false, 3.25f, 21.0f)
                arcTo(5.756f, 5.756f, 0.0f, false, false, 9.0f, 26.75f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.745f, -6.0f)
                horizontalLineToRelative(6.51f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, 5.745f, 6.0f)
                arcTo(5.756f, 5.756f, 0.0f, false, false, 32.75f, 21.0f)
                arcToRelative(5.756f, 5.756f, 0.0f, false, false, -6.885f, -5.638f)
                lineToRelative(-0.538f, -1.076f)
                lineToRelative(2.839f, -4.259f)
                lineToRelative(0.518f, -0.777f)
                close()
                moveTo(19.441f, 14.75f)
                lineTo(16.941f, 19.75f)
                horizontalLineToRelative(-2.328f)
                arcToRelative(5.76f, 5.76f, 0.0f, false, false, -2.322f, -3.463f)
                lineToRelative(0.768f, -1.537f)
                close()
                moveTo(22.25f, 21.0f)
                quadToRelative(0.0f, -0.126f, 0.006f, -0.25f)
                horizontalLineToRelative(6.303f)
                lineToRelative(-0.362f, -0.724f)
                lineToRelative(-1.865f, -3.73f)
                arcTo(4.756f, 4.756f, 0.0f, false, true, 31.75f, 21.0f)
                arcTo(4.756f, 4.756f, 0.0f, false, true, 27.0f, 25.751f)
                arcTo(4.756f, 4.756f, 0.0f, false, true, 22.25f, 21.0f)
                moveToRelative(4.691f, -1.25f)
                lineToRelative(-1.6f, -3.2f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, false, -2.924f, 3.2f)
                close()
                moveTo(21.387f, 19.75f)
                arcToRelative(5.77f, 5.77f, 0.0f, false, true, 3.504f, -4.1f)
                lineToRelative(-0.45f, -0.9f)
                horizontalLineToRelative(-3.882f)
                lineToRelative(-2.5f, 5.0f)
                close()
                moveTo(10.976f, 16.68f)
                arcTo(4.7f, 4.7f, 0.0f, false, false, 9.0f, 16.25f)
                arcTo(4.756f, 4.756f, 0.0f, false, false, 4.25f, 21.0f)
                arcTo(4.756f, 4.756f, 0.0f, false, false, 9.0f, 25.75f)
                arcToRelative(4.756f, 4.756f, 0.0f, false, false, 4.743f, -5.0f)
                lineTo(8.942f, 20.75f)
                lineToRelative(0.362f, -0.724f)
                close()
                moveTo(13.583f, 19.75f)
                lineTo(10.56f, 19.75f)
                lineToRelative(1.279f, -2.557f)
                arcToRelative(4.77f, 4.77f, 0.0f, false, true, 1.745f, 2.557f)
            }
        }
        .build()
        return _bicycleTandemMedium!!
    }

private var _bicycleTandemMedium: ImageVector? = null
