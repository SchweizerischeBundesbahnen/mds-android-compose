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
        _certificateRibbonSmall = Builder(
            name = "CertificateRibbonSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(7.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 9.999f, 0.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 8.0f)
                moveToRelative(5.0f, -6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.0f, 10.472f)
                verticalLineToRelative(9.735f)
                lineToRelative(0.854f, -0.854f)
                lineToRelative(1.646f, -1.646f)
                lineToRelative(1.646f, 1.646f)
                lineToRelative(0.854f, 0.854f)
                verticalLineToRelative(-4.0f)
                lineToRelative(0.5f, -0.5f)
                lineToRelative(1.646f, 1.646f)
                lineToRelative(0.854f, 0.854f)
                verticalLineToRelative(-7.735f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveToRelative(3.0f, 11.197f)
                curveToRelative(-0.607f, 0.352f, -1.282f, 0.6f, -2.0f, 0.72f)
                verticalLineToRelative(2.876f)
                lineToRelative(0.146f, -0.147f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(0.354f, 0.353f)
                lineTo(15.0f, 17.793f)
                close()
                moveTo(9.0f, 19.793f)
                verticalLineToRelative(-6.595f)
                curveToRelative(0.882f, 0.51f, 1.907f, 0.802f, 3.0f, 0.802f)
                verticalLineToRelative(5.793f)
                lineToRelative(-1.146f, -1.147f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-0.354f, 0.353f)
                close()
                moveTo(9.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -6.0f, 0.0f)
                moveToRelative(3.0f, -4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
            }
        }
            .build()
        return _certificateRibbonSmall!!
    }

private var _certificateRibbonSmall: ImageVector? = null
