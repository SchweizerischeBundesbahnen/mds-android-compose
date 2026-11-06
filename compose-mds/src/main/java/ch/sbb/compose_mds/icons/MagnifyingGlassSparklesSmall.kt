package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.MagnifyingGlassSparklesSmall: ImageVector
    get() {
        if (_magnifyingGlassSparklesSmall != null) {
            return _magnifyingGlassSparklesSmall!!
        }
        _magnifyingGlassSparklesSmall = Builder(name = "MagnifyingGlassSparklesSmall", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.996f, 4.44f)
                lineToRelative(0.25f, 0.432f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 8.566f, 9.375f)
                lineToRelative(0.409f, 0.288f)
                lineToRelative(0.409f, 0.29f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.413f, 0.525f)
                lineToRelative(6.11f, 5.272f)
                lineToRelative(-0.327f, 0.379f)
                lineToRelative(-0.326f, 0.378f)
                lineToRelative(-6.153f, -5.31f)
                arcTo(7.47f, 7.47f, 0.0f, false, true, 9.5f, 18.001f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 5.745f, 4.007f)
                close()
                moveTo(17.0f, 3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, 5.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.0f, -5.0f)
                lineTo(11.0f, 8.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 5.0f, -5.0f)
                close()
                moveTo(16.5f, 5.398f)
                arcTo(6.02f, 6.02f, 0.0f, false, true, 13.398f, 8.5f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, 3.102f, 3.1f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, 3.1f, -3.1f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, -3.1f, -3.102f)
                moveTo(11.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(8.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(10.5f, 3.656f)
                curveToRelative(-0.222f, 0.335f, -0.51f, 0.622f, -0.844f, 0.844f)
                curveToRelative(0.335f, 0.222f, 0.622f, 0.508f, 0.844f, 0.843f)
                curveToRelative(0.222f, -0.334f, 0.509f, -0.621f, 0.843f, -0.843f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.843f, -0.844f)
            }
        }
        .build()
        return _magnifyingGlassSparklesSmall!!
    }

private var _magnifyingGlassSparklesSmall: ImageVector? = null
