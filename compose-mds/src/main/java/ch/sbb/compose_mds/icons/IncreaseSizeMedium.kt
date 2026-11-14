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

public val SBBIcons.IncreaseSizeMedium: ImageVector
    get() {
        if (_increaseSizeMedium != null) {
            return _increaseSizeMedium!!
        }
        _increaseSizeMedium = Builder(name = "IncreaseSizeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.25f, 4.749f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(-1.0f)
                lineTo(30.25f, 6.456f)
                lineToRelative(-5.896f, 5.896f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(5.896f, -5.896f)
                lineTo(25.5f, 5.749f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(22.25f, 33.0f)
                verticalLineToRelative(-0.52f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.25f, 33.0f)
                close()
                moveTo(22.25f, 31.438f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 29.355f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 27.271f)
                lineTo(22.25f, 26.23f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.04f)
                close()
                moveTo(22.25f, 25.188f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 23.105f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 21.021f)
                lineTo(22.25f, 19.98f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.04f)
                close()
                moveTo(22.25f, 18.938f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 16.855f)
                verticalLineToRelative(-1.042f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.042f)
                close()
                moveTo(22.25f, 14.771f)
                verticalLineToRelative(-1.02f)
                horizontalLineToRelative(-1.02f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.02f)
                verticalLineToRelative(0.02f)
                close()
                moveTo(3.52f, 14.751f)
                verticalLineToRelative(-1.0f)
                lineTo(3.0f, 13.751f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(5.604f, 14.751f)
                verticalLineToRelative(-1.0f)
                lineTo(4.563f, 13.751f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(7.688f, 14.751f)
                verticalLineToRelative(-1.0f)
                lineTo(6.646f, 13.751f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(9.771f, 14.751f)
                verticalLineToRelative(-1.0f)
                lineTo(8.729f, 13.751f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(11.854f, 14.751f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.041f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.938f, 14.751f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.043f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.02f, 14.751f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.04f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.105f, 14.751f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.043f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(20.187f, 14.751f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-1.042f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _increaseSizeMedium!!
    }

private var _increaseSizeMedium: ImageVector? = null
