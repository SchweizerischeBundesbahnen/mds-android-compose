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

public val SBBIcons.CertificateRibbonTickLarge: ImageVector
    get() {
        if (_certificateRibbonTickLarge != null) {
            return _certificateRibbonTickLarge!!
        }
        _certificateRibbonTickLarge = Builder(name = "CertificateRibbonTickLarge", defaultWidth =
                48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight =
                48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 5.0f)
                curveTo(29.851f, 5.0f, 35.0f, 10.149f, 35.0f, 16.5f)
                arcToRelative(11.48f, 11.48f, 0.0f, false, true, -4.558f, 9.165f)
                lineToRelative(8.482f, 13.57f)
                lineToRelative(0.737f, 1.18f)
                lineToRelative(-1.32f, -0.44f)
                lineToRelative(-5.588f, -1.864f)
                lineToRelative(-1.806f, 3.613f)
                lineToRelative(-0.447f, 0.894f)
                lineToRelative(-7.009f, -14.016f)
                lineToRelative(-6.544f, 13.09f)
                lineToRelative(-0.447f, 0.895f)
                lineToRelative(-2.254f, -4.508f)
                lineToRelative(-5.588f, 1.863f)
                lineToRelative(-1.32f, 0.44f)
                lineToRelative(0.738f, -1.179f)
                lineToRelative(8.467f, -13.548f)
                arcTo(11.48f, 11.48f, 0.0f, false, true, 12.0f, 16.5f)
                curveTo(12.0f, 10.149f, 17.149f, 5.0f, 23.5f, 5.0f)
                moveToRelative(6.12f, 21.234f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -5.326f, 1.736f)
                lineTo(30.5f, 40.382f)
                lineToRelative(1.553f, -3.106f)
                lineToRelative(0.194f, -0.387f)
                lineToRelative(0.411f, 0.137f)
                lineToRelative(4.68f, 1.56f)
                close()
                moveTo(9.66f, 38.554f)
                lineToRelative(4.682f, -1.56f)
                lineToRelative(0.41f, -0.137f)
                lineToRelative(0.195f, 0.388f)
                lineToRelative(1.553f, 3.106f)
                lineToRelative(6.19f, -12.383f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -5.325f, -1.743f)
                close()
                moveTo(23.5f, 6.0f)
                curveTo(17.701f, 6.0f, 13.0f, 10.701f, 13.0f, 16.5f)
                reflectiveCurveTo(17.701f, 27.0f, 23.5f, 27.0f)
                reflectiveCurveTo(34.0f, 22.299f, 34.0f, 16.5f)
                reflectiveCurveTo(29.299f, 6.0f, 23.5f, 6.0f)
                moveToRelative(6.354f, 6.854f)
                lineTo(21.5f, 21.207f)
                lineToRelative(-4.353f, -4.353f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(3.646f, 3.646f)
                lineToRelative(7.647f, -7.646f)
                close()
            }
        }
        .build()
        return _certificateRibbonTickLarge!!
    }

private var _certificateRibbonTickLarge: ImageVector? = null
