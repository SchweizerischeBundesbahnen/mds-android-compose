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

public val SBBIcons.CopySmall: ImageVector
    get() {
        if (_copySmall != null) {
            return _copySmall!!
        }
        _copySmall = Builder(name = "CopySmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.985f, 16.96f)
                verticalLineToRelative(-13.0f)
                horizontalLineToRelative(-10.0f)
                lineTo(8.985f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.04f)
                close()
                moveTo(15.0f, 15.96f)
                lineTo(15.0f, 7.0f)
                lineTo(9.985f, 7.0f)
                lineTo(9.985f, 4.96f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(11.0f)
                close()
                moveTo(14.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _copySmall!!
    }

private var _copySmall: ImageVector? = null
