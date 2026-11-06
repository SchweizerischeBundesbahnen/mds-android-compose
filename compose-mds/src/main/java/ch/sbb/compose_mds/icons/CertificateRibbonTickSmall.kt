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

public val SBBIcons.CertificateRibbonTickSmall: ImageVector
    get() {
        if (_certificateRibbonTickSmall != null) {
            return _certificateRibbonTickSmall!!
        }
        _certificateRibbonTickSmall = Builder(name = "CertificateRibbonTickSmall", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 10.0f, 0.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 8.0f)
                moveToRelative(5.0f, -6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.81f, 10.636f)
                lineToRelative(-4.114f, 6.583f)
                lineToRelative(-0.737f, 1.179f)
                lineToRelative(1.32f, -0.44f)
                lineToRelative(2.588f, -0.863f)
                lineToRelative(0.806f, 1.613f)
                lineToRelative(0.447f, 0.894f)
                lineToRelative(0.447f, -0.894f)
                lineToRelative(3.049f, -6.098f)
                lineToRelative(3.057f, 6.114f)
                lineToRelative(0.447f, 0.894f)
                lineToRelative(0.447f, -0.894f)
                lineToRelative(0.806f, -1.612f)
                lineToRelative(2.589f, 0.863f)
                lineToRelative(1.319f, 0.44f)
                lineToRelative(-0.737f, -1.18f)
                lineToRelative(-4.121f, -6.594f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveToRelative(-0.791f, 11.948f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.195f, -0.743f)
                lineTo(5.66f, 18.57f)
                lineToRelative(1.68f, -0.56f)
                lineToRelative(0.412f, -0.138f)
                lineToRelative(0.194f, 0.388f)
                lineToRelative(0.553f, 1.106f)
                close()
                moveTo(14.979f, 13.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.195f, 0.74f)
                lineToRelative(2.716f, 5.432f)
                lineToRelative(0.553f, -1.105f)
                lineToRelative(0.194f, -0.388f)
                lineToRelative(0.411f, 0.137f)
                lineToRelative(1.681f, 0.56f)
                close()
                moveTo(15.354f, 6.354f)
                lineTo(11.354f, 10.354f)
                lineTo(11.0f, 10.707f)
                lineTo(10.646f, 10.354f)
                lineTo(8.646f, 8.354f)
                lineTo(9.354f, 7.646f)
                lineTo(11.0f, 9.293f)
                lineToRelative(3.646f, -3.647f)
                close()
            }
        }
        .build()
        return _certificateRibbonTickSmall!!
    }

private var _certificateRibbonTickSmall: ImageVector? = null
