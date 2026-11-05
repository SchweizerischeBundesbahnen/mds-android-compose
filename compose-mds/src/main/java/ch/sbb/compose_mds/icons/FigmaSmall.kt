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

public val SBBIcons.FigmaSmall: ImageVector
    get() {
        if (_figmaSmall != null) {
            return _figmaSmall!!
        }
        _figmaSmall = Builder(
            name = "FigmaSmall",
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
                moveTo(8.5f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.734f, 6.541f)
                arcToRelative(3.466f, 3.466f, 0.0f, false, false, -1.688f, 2.995f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, false, 1.752f, 2.993f)
                arcToRelative(3.76f, 3.76f, 0.0f, false, false, -1.545f, 1.786f)
                arcTo(3.75f, 3.75f, 0.0f, true, false, 12.5f, 17.75f)
                verticalLineToRelative(-3.8f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 4.53f, -5.3f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.53f, -6.65f)
                close()
                moveTo(12.55f, 9.0f)
                lineTo(12.5f, 9.05f)
                lineTo(12.5f, 9.0f)
                close()
                moveTo(12.5f, 8.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, -5.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(11.5f, 3.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 9.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -2.5f, 2.502f)
                verticalLineToRelative(-0.004f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 15.0f, 9.0f)
                moveToRelative(-3.5f, 0.033f)
                lineTo(11.5f, 14.0f)
                lineTo(8.594f, 14.0f)
                arcToRelative(2.54f, 2.54f, 0.0f, false, true, -1.776f, -0.725f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, true, -0.74f, -1.745f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, true, 0.72f, -1.752f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, true, 1.766f, -0.745f)
                close()
                moveTo(11.5f, 15.0f)
                lineTo(8.75f, 15.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 2.75f, 2.75f)
                close()
            }
        }
            .build()
        return _figmaSmall!!
    }

private var _figmaSmall: ImageVector? = null
