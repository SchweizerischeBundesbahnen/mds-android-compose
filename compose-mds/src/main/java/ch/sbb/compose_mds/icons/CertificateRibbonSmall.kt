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

public val SBBIcons.CertificateRibbonSmall: ImageVector
    get() {
        if (_certificateRibbonSmall != null) {
            return _certificateRibbonSmall!!
        }
        _certificateRibbonSmall = Builder(name = "CertificateRibbonSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -10.0f)
                moveToRelative(3.0f, 10.197f)
                curveToRelative(-0.607f, 0.352f, -1.282f, 0.6f, -2.0f, 0.72f)
                verticalLineToRelative(2.876f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(1.5f, 1.5f)
                close()
                moveTo(16.0f, 12.472f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(9.735f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                verticalLineToRelative(-4.0f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(2.5f, 2.5f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, -0.803f)
                verticalLineToRelative(6.596f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(1.5f, 1.5f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, -6.0f)
                moveToRelative(0.0f, 7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
            }
        }
        .build()
        return _certificateRibbonSmall!!
    }

private var _certificateRibbonSmall: ImageVector? = null
