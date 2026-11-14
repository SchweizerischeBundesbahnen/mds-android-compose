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

public val SBBIcons.ArchiveBoxLarge: ImageVector
    get() {
        if (_archiveBoxLarge != null) {
            return _archiveBoxLarge!!
        }
        _archiveBoxLarge = Builder(name = "ArchiveBoxLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.89f, 5.188f)
                lineTo(32.14f, 8.0f)
                lineTo(42.0f, 8.0f)
                verticalLineToRelative(25.667f)
                lineTo(35.9f, 41.8f)
                lineToRelative(-0.15f, 0.2f)
                lineTo(7.0f, 42.0f)
                lineTo(7.0f, 17.328f)
                lineToRelative(0.105f, -0.134f)
                lineTo(14.255f, 8.0f)
                horizontalLineToRelative(8.204f)
                lineTo(23.5f, 6.7f)
                lineTo(24.54f, 8.0f)
                horizontalLineToRelative(2.32f)
                lineToRelative(2.25f, -2.812f)
                lineToRelative(0.39f, -0.489f)
                close()
                moveTo(37.1f, 14.199f)
                lineTo(32.94f, 9.0f)
                horizontalLineToRelative(7.626f)
                close()
                moveTo(36.0f, 17.651f)
                lineToRelative(5.0f, -7.5f)
                verticalLineToRelative(23.182f)
                lineTo(36.0f, 40.0f)
                close()
                moveTo(35.0f, 18.001f)
                verticalLineToRelative(23.0f)
                lineTo(8.0f, 41.001f)
                lineTo(8.0f, 18.0f)
                close()
                moveTo(15.26f, 17.001f)
                lineTo(8.521f, 17.001f)
                lineToRelative(6.222f, -8.0f)
                horizontalLineToRelative(6.915f)
                close()
                moveTo(26.06f, 9.001f)
                horizontalLineToRelative(-0.72f)
                lineToRelative(0.36f, 0.448f)
                close()
                moveTo(31.74f, 17.001f)
                horizontalLineToRelative(3.492f)
                lineToRelative(1.286f, -1.929f)
                lineTo(29.5f, 6.3f)
                lineToRelative(-3.16f, 3.95f)
                close()
                moveTo(23.5f, 8.3f)
                lineToRelative(6.96f, 8.7f)
                lineTo(16.54f, 17.0f)
                close()
                moveTo(25.68f, 24.0f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.32f, 0.32f)
                verticalLineToRelative(1.359f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.32f, 0.32f)
                horizontalLineToRelative(-8.36f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.32f, -0.32f)
                verticalLineToRelative(-1.36f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.32f, -0.32f)
                close()
                moveTo(25.68f, 27.0f)
                arcTo(1.32f, 1.32f, 0.0f, false, false, 27.0f, 25.68f)
                verticalLineToRelative(-1.36f)
                arcTo(1.32f, 1.32f, 0.0f, false, false, 25.68f, 23.0f)
                horizontalLineToRelative(-8.36f)
                arcTo(1.32f, 1.32f, 0.0f, false, false, 16.0f, 24.32f)
                verticalLineToRelative(1.36f)
                curveToRelative(0.0f, 0.729f, 0.591f, 1.32f, 1.32f, 1.32f)
                close()
            }
        }
        .build()
        return _archiveBoxLarge!!
    }

private var _archiveBoxLarge: ImageVector? = null
