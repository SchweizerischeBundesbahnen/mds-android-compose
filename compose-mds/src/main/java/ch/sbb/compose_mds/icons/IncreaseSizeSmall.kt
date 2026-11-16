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

public val SBBIcons.IncreaseSizeSmall: ImageVector
    get() {
        if (_increaseSizeSmall != null) {
            return _increaseSizeSmall!!
        }
        _increaseSizeSmall = Builder(name = "IncreaseSizeSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(20.0f, 4.705f)
                lineToRelative(-3.646f, 3.647f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(3.646f, -3.647f)
                lineTo(17.0f, 3.998f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(15.0f, 22.0f)
                verticalLineToRelative(-0.52f)
                horizontalLineToRelative(-1.0f)
                lineTo(14.0f, 22.0f)
                close()
                moveTo(15.0f, 20.438f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 18.355f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 16.271f)
                lineTo(15.0f, 15.23f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.04f)
                close()
                moveTo(15.0f, 14.188f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 12.105f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(15.0f, 10.021f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(-1.02f)
                verticalLineToRelative(1.0f)
                lineTo(14.0f, 10.0f)
                verticalLineToRelative(0.02f)
                close()
                moveTo(2.52f, 10.0f)
                lineTo(2.52f, 9.0f)
                lineTo(2.0f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(4.604f, 10.0f)
                lineTo(4.604f, 9.0f)
                lineTo(3.563f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(6.688f, 10.0f)
                lineTo(6.688f, 9.0f)
                lineTo(5.646f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(8.771f, 10.0f)
                lineTo(8.771f, 9.0f)
                lineTo(7.729f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(10.854f, 10.0f)
                lineTo(10.854f, 9.0f)
                lineTo(9.814f, 9.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.938f, 10.0f)
                lineTo(12.938f, 9.0f)
                horizontalLineToRelative(-1.043f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _increaseSizeSmall!!
    }

private var _increaseSizeSmall: ImageVector? = null
