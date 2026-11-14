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

public val SBBIcons.DocumentPlusSmall: ImageVector
    get() {
        if (_documentPlusSmall != null) {
            return _documentPlusSmall!!
        }
        _documentPlusSmall = Builder(name = "DocumentPlusSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 9.293f)
                lineTo(12.707f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(4.996f)
                horizontalLineToRelative(5.0f)
                lineTo(17.0f, 15.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.29f, 8.996f)
                lineTo(13.0f, 5.706f)
                verticalLineToRelative(3.29f)
                close()
                moveTo(15.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.997f, 14.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.999f)
                verticalLineToRelative(-1.0f)
                lineTo(18.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.001f)
                verticalLineToRelative(1.0f)
                lineTo(17.0f, 20.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _documentPlusSmall!!
    }

private var _documentPlusSmall: ImageVector? = null
