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

public val SBBIcons.CertificateRibbonMedium: ImageVector
    get() {
        if (_certificateRibbonMedium != null) {
            return _certificateRibbonMedium!!
        }
        _certificateRibbonMedium = Builder(
            name = "CertificateRibbonMedium",
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
                moveTo(10.25f, 12.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, true, true, 15.5f, 0.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, -15.5f, 0.0f)
                moveTo(18.0f, 3.25f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -5.75f, 15.346f)
                verticalLineToRelative(14.111f)
                lineToRelative(0.854f, -0.854f)
                lineToRelative(2.646f, -2.646f)
                lineToRelative(2.646f, 2.646f)
                lineToRelative(0.854f, 0.854f)
                verticalLineToRelative(-5.5f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(2.646f, 2.646f)
                lineToRelative(0.854f, 0.854f)
                lineTo(23.75f, 18.595f)
                arcTo(8.75f, 8.75f, 0.0f, false, false, 18.0f, 3.25f)
                moveToRelative(4.75f, 16.1f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -3.5f, 1.312f)
                verticalLineToRelative(5.13f)
                lineToRelative(0.646f, -0.646f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(2.146f, 2.146f)
                close()
                moveTo(13.25f, 30.293f)
                lineTo(13.25f, 19.35f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, 5.0f, 1.397f)
                verticalLineToRelative(9.546f)
                lineToRelative(-2.146f, -2.147f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.354f, 0.353f)
                close()
                moveTo(13.25f, 12.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, 9.5f, 0.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -9.5f, 0.0f)
                moveTo(18.0f, 6.25f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 0.0f, 11.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 0.0f, -11.5f)
            }
        }
            .build()
        return _certificateRibbonMedium!!
    }

private var _certificateRibbonMedium: ImageVector? = null
