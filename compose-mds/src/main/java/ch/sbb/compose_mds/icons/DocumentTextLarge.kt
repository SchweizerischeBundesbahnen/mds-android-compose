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

public val SBBIcons.DocumentTextLarge: ImageVector
    get() {
        if (_documentTextLarge != null) {
            return _documentTextLarge!!
        }
        _documentTextLarge = Builder(name = "DocumentTextLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 5.0f)
                horizontalLineToRelative(18.723f)
                lineToRelative(0.149f, 0.166f)
                lineToRelative(9.0f, 10.0f)
                lineToRelative(0.128f, 0.142f)
                lineTo(39.0f, 43.0f)
                lineTo(11.0f, 43.0f)
                lineTo(11.0f, 5.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(26.0f)
                lineTo(38.0f, 16.0f)
                horizontalLineToRelative(-9.0f)
                lineTo(29.0f, 6.0f)
                close()
                moveTo(30.0f, 6.803f)
                lineTo(30.0f, 15.0f)
                horizontalLineToRelative(7.377f)
                close()
                moveTo(34.0f, 29.0f)
                lineTo(15.0f, 29.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(15.0f, 25.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 24.0f)
                close()
                moveTo(22.0f, 10.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.0f)
                close()
                moveTo(22.0f, 16.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(15.0f, 33.0f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(-1.0f)
                lineTo(15.0f, 32.0f)
                close()
                moveTo(34.0f, 37.0f)
                lineTo(15.0f, 37.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(19.0f)
                close()
            }
        }
        .build()
        return _documentTextLarge!!
    }

private var _documentTextLarge: ImageVector? = null
