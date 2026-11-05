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
        _increaseSizeSmall = Builder(
            name = "IncreaseSizeSmall",
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
                moveTo(17.0f, 4.0f)
                horizontalLineToRelative(2.293f)
                lineToRelative(-3.647f, 3.646f)
                lineToRelative(0.708f, 0.707f)
                lineTo(20.0f, 4.706f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(2.0f, 10.0f)
                horizontalLineToRelative(0.52f)
                lineTo(2.52f, 9.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(3.563f, 10.0f)
                horizontalLineToRelative(1.041f)
                lineTo(4.604f, 9.0f)
                lineTo(3.563f, 9.0f)
                close()
                moveTo(5.646f, 10.0f)
                horizontalLineToRelative(1.042f)
                lineTo(6.688f, 9.0f)
                lineTo(5.646f, 9.0f)
                close()
                moveTo(7.729f, 10.0f)
                horizontalLineToRelative(1.042f)
                lineTo(8.771f, 9.0f)
                lineTo(7.729f, 9.0f)
                close()
                moveTo(9.813f, 10.0f)
                horizontalLineToRelative(1.041f)
                lineTo(10.854f, 9.0f)
                lineTo(9.813f, 9.0f)
                close()
                moveTo(11.896f, 10.0f)
                horizontalLineToRelative(1.041f)
                lineTo(12.937f, 9.0f)
                horizontalLineToRelative(-1.041f)
                close()
                moveTo(13.979f, 10.0f)
                lineTo(14.0f, 10.0f)
                verticalLineToRelative(0.021f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.02f)
                horizontalLineToRelative(-1.02f)
                close()
                moveTo(14.0f, 11.063f)
                verticalLineToRelative(1.041f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.041f)
                close()
                moveTo(14.0f, 13.146f)
                verticalLineToRelative(1.042f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.042f)
                close()
                moveTo(14.0f, 15.229f)
                verticalLineToRelative(1.042f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.042f)
                close()
                moveTo(14.0f, 17.313f)
                verticalLineToRelative(1.041f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.041f)
                close()
                moveTo(14.0f, 19.396f)
                verticalLineToRelative(1.042f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-1.042f)
                close()
                moveTo(14.0f, 21.479f)
                lineTo(14.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.52f)
                close()
            }
        }
            .build()
        return _increaseSizeSmall!!
    }

private var _increaseSizeSmall: ImageVector? = null
