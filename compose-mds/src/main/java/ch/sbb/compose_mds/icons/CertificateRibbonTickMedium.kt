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
        _certificateRibbonTickMedium = Builder(
            name = "CertificateRibbonTickMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(10.25f, 12.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, true, true, 15.5f, 0.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, -15.5f, 0.0f)
                moveTo(18.0f, 3.25f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -5.384f, 15.648f)
                lineTo(6.326f, 28.96f)
                lineToRelative(-0.737f, 1.179f)
                lineToRelative(1.32f, -0.44f)
                lineToRelative(4.088f, -1.363f)
                lineToRelative(1.306f, 2.613f)
                lineToRelative(0.447f, 0.894f)
                lineToRelative(0.447f, -0.895f)
                lineToRelative(4.797f, -9.593f)
                lineToRelative(4.809f, 9.618f)
                lineToRelative(0.447f, 0.894f)
                lineToRelative(0.447f, -0.894f)
                lineToRelative(1.306f, -2.612f)
                lineToRelative(4.089f, 1.363f)
                lineToRelative(1.319f, 0.44f)
                lineToRelative(-0.737f, -1.18f)
                lineToRelative(-6.3f, -10.08f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 18.0f, 3.25f)
                moveToRelative(-0.803f, 17.464f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -3.759f, -1.246f)
                lineToRelative(-5.527f, 8.844f)
                lineToRelative(3.18f, -1.06f)
                lineToRelative(0.412f, -0.138f)
                lineToRelative(0.194f, 0.388f)
                lineToRelative(1.053f, 2.106f)
                close()
                moveTo(22.551f, 19.475f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -3.76f, 1.24f)
                lineToRelative(4.459f, 8.917f)
                lineToRelative(1.053f, -2.105f)
                lineToRelative(0.194f, -0.388f)
                lineToRelative(0.411f, 0.137f)
                lineToRelative(3.181f, 1.06f)
                close()
                moveTo(22.854f, 9.354f)
                lineTo(16.854f, 15.354f)
                lineTo(16.5f, 15.707f)
                lineTo(16.146f, 15.354f)
                lineTo(13.146f, 12.354f)
                lineTo(13.853f, 11.646f)
                lineTo(16.5f, 14.293f)
                lineTo(22.146f, 8.646f)
                close()
            }
        }
            .build()
        return _certificateRibbonTickMedium!!
    }

private var _certificateRibbonTickMedium: ImageVector? = null
