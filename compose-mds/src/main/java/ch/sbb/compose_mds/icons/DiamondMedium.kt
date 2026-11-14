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

public val SBBIcons.DiamondMedium: ImageVector
    get() {
        if (_diamondMedium != null) {
            return _diamondMedium!!
        }
        _diamondMedium = Builder(name = "DiamondMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(26.518f, 3.25f)
                lineToRelative(6.345f, 9.519f)
                lineToRelative(-0.215f, 0.284f)
                lineToRelative(-14.25f, 18.75f)
                lineToRelative(-0.398f, 0.523f)
                lineToRelative(-0.398f, -0.523f)
                lineToRelative(-14.25f, -18.75f)
                lineToRelative(-0.215f, -0.284f)
                lineTo(9.482f, 3.25f)
                close()
                moveTo(11.755f, 12.25f)
                lineTo(4.684f, 12.25f)
                lineToRelative(4.89f, -7.335f)
                close()
                moveTo(12.587f, 11.538f)
                lineTo(10.421f, 4.25f)
                horizontalLineToRelative(6.681f)
                close()
                moveTo(13.323f, 12.25f)
                lineTo(18.0f, 4.7f)
                lineToRelative(4.678f, 7.55f)
                close()
                moveTo(23.413f, 11.537f)
                lineTo(18.9f, 4.25f)
                horizontalLineToRelative(6.68f)
                close()
                moveTo(31.316f, 12.25f)
                lineTo(26.426f, 4.915f)
                lineTo(24.245f, 12.25f)
                close()
                moveTo(23.948f, 13.25f)
                horizontalLineToRelative(7.293f)
                lineToRelative(-11.98f, 15.763f)
                close()
                moveTo(12.053f, 13.25f)
                lineTo(16.739f, 29.014f)
                lineTo(4.759f, 13.25f)
                close()
                moveTo(18.0f, 29.745f)
                lineTo(13.096f, 13.25f)
                horizontalLineToRelative(9.808f)
                close()
            }
        }
        .build()
        return _diamondMedium!!
    }

private var _diamondMedium: ImageVector? = null
