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

public val SBBIcons.BridgeLarge: ImageVector
    get() {
        if (_bridgeLarge != null) {
            return _bridgeLarge!!
        }
        _bridgeLarge = Builder(name = "BridgeLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(44.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(7.0f, 19.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(10.95f)
                curveToRelative(1.15f, 0.83f, 2.262f, 1.726f, 3.332f, 2.676f)
                lineToRelative(-0.664f, 0.748f)
                curveTo(38.068f, 28.399f, 31.381f, 25.0f, 24.0f, 25.0f)
                reflectiveCurveTo(9.932f, 28.4f, 4.332f, 33.374f)
                lineToRelative(-0.664f, -0.748f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 7.0f, 29.95f)
                close()
                moveTo(8.0f, 29.252f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 5.0f, -2.803f)
                lineTo(13.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                close()
                moveTo(14.0f, 26.02f)
                arcToRelative(27.6f, 27.6f, 0.0f, false, true, 5.004f, -1.52f)
                lineTo(19.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(20.004f, 24.32f)
                arcToRelative(25.2f, 25.2f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(28.0f, 19.0f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(29.004f, 24.501f)
                curveToRelative(1.715f, 0.345f, 3.382f, 0.86f, 4.996f, 1.519f)
                lineTo(34.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(35.0f, 26.45f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 5.0f, 2.803f)
                lineTo(40.0f, 19.0f)
                horizontalLineToRelative(-5.0f)
                close()
            }
        }
        .build()
        return _bridgeLarge!!
    }

private var _bridgeLarge: ImageVector? = null
