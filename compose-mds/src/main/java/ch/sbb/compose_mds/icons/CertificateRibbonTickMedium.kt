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

public val SBBIcons.CertificateRibbonTickMedium: ImageVector
    get() {
        if (_certificateRibbonTickMedium != null) {
            return _certificateRibbonTickMedium!!
        }
        _certificateRibbonTickMedium = Builder(name = "CertificateRibbonTickMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                arcToRelative(7.75f, 7.75f, 0.0f, true, true, 0.0f, 15.5f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 0.0f, -15.5f)
                moveToRelative(5.374f, 14.656f)
                arcToRelative(8.75f, 8.75f, 0.0f, true, false, -10.758f, -0.008f)
                lineTo(6.326f, 28.96f)
                lineToRelative(-0.737f, 1.18f)
                lineToRelative(1.32f, -0.44f)
                lineToRelative(4.087f, -1.363f)
                lineToRelative(1.307f, 2.613f)
                lineToRelative(0.447f, 0.894f)
                lineToRelative(5.244f, -10.487f)
                lineToRelative(4.809f, 9.617f)
                lineToRelative(0.447f, 0.894f)
                lineToRelative(0.447f, -0.894f)
                lineToRelative(1.306f, -2.613f)
                lineToRelative(4.089f, 1.363f)
                lineToRelative(1.32f, 0.44f)
                lineToRelative(-0.738f, -1.179f)
                close()
                moveTo(29.674f, 28.986f)
                lineTo(29.25f, 29.25f)
                lineTo(29.092f, 29.724f)
                lineTo(29.25f, 29.251f)
                close()
                moveTo(17.197f, 20.714f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -3.76f, -1.246f)
                lineTo(7.91f, 28.31f)
                lineToRelative(3.182f, -1.06f)
                lineToRelative(0.41f, -0.136f)
                lineToRelative(0.195f, 0.387f)
                lineToRelative(1.053f, 2.106f)
                close()
                moveTo(22.551f, 19.474f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -3.76f, 1.24f)
                lineToRelative(4.459f, 8.919f)
                lineToRelative(1.247f, -2.495f)
                lineToRelative(0.411f, 0.138f)
                lineToRelative(3.18f, 1.06f)
                close()
                moveTo(22.854f, 9.354f)
                lineTo(16.5f, 15.707f)
                lineToRelative(-3.354f, -3.354f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(2.647f, 2.647f)
                lineToRelative(5.647f, -5.647f)
                close()
            }
        }
        .build()
        return _certificateRibbonTickMedium!!
    }

private var _certificateRibbonTickMedium: ImageVector? = null
