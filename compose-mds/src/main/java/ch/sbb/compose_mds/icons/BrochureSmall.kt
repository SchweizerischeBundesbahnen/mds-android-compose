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

public val SBBIcons.BrochureSmall: ImageVector
    get() {
        if (_brochureSmall != null) {
            return _brochureSmall!!
        }
        _brochureSmall = Builder(name = "BrochureSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(21.0f, 18.86f)
                lineToRelative(-0.342f, 0.114f)
                lineToRelative(-9.158f, 3.053f)
                lineToRelative(-9.158f, -3.053f)
                lineTo(2.0f, 18.86f)
                lineTo(2.0f, 2.807f)
                lineToRelative(0.658f, 0.218f)
                lineTo(11.5f, 5.973f)
                lineToRelative(8.842f, -2.948f)
                lineToRelative(0.658f, -0.218f)
                close()
                moveTo(12.0f, 6.86f)
                verticalLineToRelative(13.946f)
                lineToRelative(8.0f, -2.668f)
                lineTo(20.0f, 4.194f)
                close()
                moveTo(11.0f, 20.806f)
                lineTo(11.0f, 6.86f)
                lineTo(3.0f, 4.193f)
                lineTo(3.0f, 18.14f)
                close()
                moveTo(10.158f, 8.526f)
                lineTo(9.842f, 9.474f)
                lineTo(3.842f, 7.474f)
                lineTo(4.158f, 6.525f)
                close()
                moveTo(13.158f, 9.474f)
                lineTo(19.158f, 7.474f)
                lineTo(18.842f, 6.525f)
                lineTo(12.842f, 8.525f)
                close()
                moveTo(13.158f, 12.474f)
                lineTo(19.158f, 10.474f)
                lineTo(18.842f, 9.525f)
                lineTo(12.842f, 11.525f)
                close()
                moveTo(19.158f, 13.474f)
                lineTo(13.158f, 15.474f)
                lineTo(12.842f, 14.524f)
                lineTo(18.842f, 12.524f)
                close()
                moveTo(13.158f, 18.474f)
                lineTo(19.158f, 16.474f)
                lineTo(18.842f, 15.524f)
                lineTo(12.842f, 17.524f)
                close()
                moveTo(9.842f, 12.474f)
                lineTo(10.158f, 11.525f)
                lineTo(4.158f, 9.525f)
                lineTo(3.842f, 10.475f)
                close()
                moveTo(10.158f, 14.525f)
                lineTo(9.842f, 15.475f)
                lineTo(3.842f, 13.475f)
                lineTo(4.158f, 12.525f)
                close()
                moveTo(9.842f, 18.474f)
                lineTo(10.158f, 17.524f)
                lineTo(4.158f, 15.524f)
                lineTo(3.842f, 16.474f)
                close()
            }
        }
        .build()
        return _brochureSmall!!
    }

private var _brochureSmall: ImageVector? = null
