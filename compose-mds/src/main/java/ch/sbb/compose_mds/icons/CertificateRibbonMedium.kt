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
        _certificateRibbonMedium = Builder(name = "CertificateRibbonMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.25f)
                arcToRelative(7.75f, 7.75f, 0.0f, true, true, 0.0f, 15.5f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 0.0f, -15.5f)
                moveToRelative(0.0f, 16.5f)
                quadToRelative(0.126f, 0.0f, 0.25f, -0.003f)
                verticalLineToRelative(9.546f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                lineTo(13.25f, 19.35f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, 4.75f, 1.4f)
                moveToRelative(4.75f, -1.4f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -3.5f, 1.312f)
                verticalLineToRelative(5.13f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(2.5f, 2.5f)
                close()
                moveTo(23.75f, 18.595f)
                arcToRelative(8.75f, 8.75f, 0.0f, true, false, -11.5f, 0.0f)
                verticalLineToRelative(14.112f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(3.5f, 3.5f)
                verticalLineToRelative(-5.5f)
                lineToRelative(1.0f, -1.0f)
                lineToRelative(3.5f, 3.5f)
                close()
                moveTo(18.0f, 7.25f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, 0.0f, 9.5f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, 0.0f, -9.5f)
                moveToRelative(0.0f, 10.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 0.0f, -11.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 0.0f, 11.5f)
            }
        }
        .build()
        return _certificateRibbonMedium!!
    }

private var _certificateRibbonMedium: ImageVector? = null
