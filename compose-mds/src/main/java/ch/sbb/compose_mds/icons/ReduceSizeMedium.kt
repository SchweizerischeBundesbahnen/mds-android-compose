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

public val SBBIcons.ReduceSizeMedium: ImageVector
    get() {
        if (_reduceSizeMedium != null) {
            return _reduceSizeMedium!!
        }
        _reduceSizeMedium = Builder(
            name = "ReduceSizeMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(22.25f, 3.521f)
                verticalLineToRelative(-0.52f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.52f)
                close()
                moveTo(22.25f, 5.604f)
                lineTo(22.25f, 4.563f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.041f)
                close()
                moveTo(22.25f, 7.688f)
                lineTo(22.25f, 6.646f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 9.771f)
                lineTo(22.25f, 8.73f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 11.854f)
                verticalLineToRelative(-1.041f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.041f)
                close()
                moveTo(22.25f, 13.938f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 16.021f)
                lineTo(22.25f, 14.98f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 18.105f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 20.188f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 21.75f)
                verticalLineToRelative(-0.52f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(0.02f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.02f)
                close()
                moveTo(3.0f, 22.25f)
                horizontalLineToRelative(0.52f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 21.25f)
                close()
                moveTo(4.563f, 22.25f)
                horizontalLineToRelative(1.041f)
                verticalLineToRelative(-1.0f)
                lineTo(4.563f, 21.25f)
                close()
                moveTo(6.646f, 22.25f)
                horizontalLineToRelative(1.042f)
                verticalLineToRelative(-1.0f)
                lineTo(6.646f, 21.25f)
                close()
                moveTo(8.729f, 22.25f)
                horizontalLineToRelative(1.042f)
                verticalLineToRelative(-1.0f)
                lineTo(8.729f, 21.25f)
                close()
                moveTo(10.813f, 22.25f)
                horizontalLineToRelative(1.041f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.041f)
                close()
                moveTo(12.896f, 22.25f)
                horizontalLineToRelative(1.041f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.041f)
                close()
                moveTo(14.979f, 22.25f)
                horizontalLineToRelative(1.042f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.042f)
                close()
                moveTo(17.063f, 22.25f)
                horizontalLineToRelative(1.041f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.041f)
                close()
                moveTo(19.146f, 22.25f)
                horizontalLineToRelative(1.041f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.041f)
                close()
                moveTo(24.25f, 24.25f)
                lineTo(30.0f, 24.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.043f)
                lineToRelative(5.897f, 5.896f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(-5.896f, -5.896f)
                lineTo(25.25f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.75f)
            }
        }
            .build()
        return _reduceSizeMedium!!
    }

private var _reduceSizeMedium: ImageVector? = null
