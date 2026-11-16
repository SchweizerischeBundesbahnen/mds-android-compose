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

public val SBBIcons.MetadataMedium: ImageVector
    get() {
        if (_metadataMedium != null) {
            return _metadataMedium!!
        }
        _metadataMedium = Builder(name = "MetadataMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(32.75f, 31.25f)
                lineTo(32.75f, 4.75f)
                lineTo(3.25f, 4.75f)
                verticalLineToRelative(26.5f)
                close()
                moveTo(31.75f, 30.25f)
                lineTo(4.25f, 30.25f)
                lineTo(4.25f, 5.75f)
                horizontalLineToRelative(27.5f)
                close()
                moveTo(12.354f, 10.854f)
                lineTo(9.707f, 13.5f)
                lineToRelative(2.646f, 2.646f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(3.354f, -3.354f)
                close()
                moveTo(24.354f, 19.147f)
                lineTo(27.354f, 22.147f)
                lineTo(27.707f, 22.5f)
                lineTo(24.353f, 25.854f)
                lineTo(23.646f, 25.147f)
                lineTo(26.293f, 22.5f)
                lineTo(23.647f, 19.854f)
                close()
                moveTo(27.0f, 10.75f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                lineTo(9.0f, 24.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.5f, 15.25f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(27.0f, 16.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 19.75f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 20.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _metadataMedium!!
    }

private var _metadataMedium: ImageVector? = null
