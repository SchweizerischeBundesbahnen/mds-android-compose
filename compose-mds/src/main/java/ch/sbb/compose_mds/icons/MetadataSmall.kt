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

public val SBBIcons.MetadataSmall: ImageVector
    get() {
        if (_metadataSmall != null) {
            return _metadataSmall!!
        }
        _metadataSmall = Builder(name = "MetadataSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.5f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 3.0f)
                lineTo(2.5f, 3.0f)
                moveTo(3.0f, 20.0f)
                lineTo(3.0f, 4.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(5.646f, 8.646f)
                lineToRelative(2.0f, -2.0f)
                lineToRelative(0.708f, 0.708f)
                lineTo(6.707f, 9.0f)
                lineToRelative(1.647f, 1.646f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(5.293f, 9.0f)
                close()
                moveTo(16.354f, 12.646f)
                lineTo(18.354f, 14.646f)
                lineTo(18.707f, 15.0f)
                lineTo(18.354f, 15.354f)
                lineTo(16.354f, 17.354f)
                lineTo(15.646f, 16.646f)
                lineTo(17.293f, 15.0f)
                lineToRelative(-1.647f, -1.646f)
                close()
                moveTo(18.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(10.0f, 7.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(6.0f, 16.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 11.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 14.0f)
                lineTo(6.0f, 14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 14.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 13.0f)
                close()
            }
        }
        .build()
        return _metadataSmall!!
    }

private var _metadataSmall: ImageVector? = null
