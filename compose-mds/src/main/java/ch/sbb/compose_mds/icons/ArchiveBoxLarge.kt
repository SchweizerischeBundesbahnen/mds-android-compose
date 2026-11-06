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
                lineTo(29.5f, 4.7f)
                lineToRelative(-0.39f, 0.488f)
                lineTo(26.86f, 8.0f)
                horizontalLineToRelative(-2.32f)
                lineToRelative(-0.65f, -0.812f)
                lineToRelative(-0.39f, -0.488f)
                lineToRelative(-0.39f, 0.488f)
                lineToRelative(-0.65f, 0.812f)
                horizontalLineToRelative(-8.205f)
                lineToRelative(-0.15f, 0.193f)
                lineToRelative(-7.0f, 9.0f)
                lineToRelative(-0.105f, 0.135f)
                lineTo(7.0f, 42.0f)
                horizontalLineToRelative(28.75f)
                lineToRelative(0.15f, -0.2f)
                lineToRelative(6.0f, -8.0f)
                lineToRelative(0.1f, -0.133f)
                lineTo(42.0f, 8.0f)
                horizontalLineToRelative(-9.86f)
                close()
                moveTo(14.746f, 9.0f)
                horizontalLineToRelative(6.915f)
                lineToRelative(-6.4f, 8.0f)
                lineTo(8.522f, 17.0f)
                close()
                moveTo(8.0f, 41.0f)
                lineTo(8.0f, 18.0f)
                horizontalLineToRelative(27.0f)
                verticalLineToRelative(23.0f)
                close()
                moveTo(41.0f, 33.333f)
                lineTo(36.0f, 40.0f)
                lineTo(36.0f, 17.652f)
                lineToRelative(5.0f, -7.5f)
                close()
                moveTo(32.94f, 9.0f)
                horizontalLineToRelative(7.626f)
                lineTo(37.1f, 14.2f)
                close()
                moveTo(25.34f, 9.0f)
                lineTo(25.7f, 9.45f)
                lineTo(26.06f, 9.0f)
                close()
                moveTo(36.518f, 15.072f)
                lineTo(35.232f, 17.0f)
                lineTo(31.74f, 17.0f)
                lineToRelative(-5.4f, -6.75f)
                lineTo(29.5f, 6.3f)
                close()
                moveTo(23.5f, 8.3f)
                lineToRelative(6.96f, 8.7f)
                lineTo(16.54f, 17.0f)
                close()
                moveTo(17.0f, 24.32f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.32f, -0.32f)
                horizontalLineToRelative(8.36f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, 0.32f, 0.32f)
                verticalLineToRelative(1.36f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.32f, 0.32f)
                horizontalLineToRelative(-8.36f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, true, -0.32f, -0.32f)
                close()
                moveTo(17.32f, 23.0f)
                arcTo(1.32f, 1.32f, 0.0f, false, false, 16.0f, 24.32f)
                verticalLineToRelative(1.36f)
                curveToRelative(0.0f, 0.73f, 0.591f, 1.32f, 1.32f, 1.32f)
                horizontalLineToRelative(8.36f)
                arcTo(1.32f, 1.32f, 0.0f, false, false, 27.0f, 25.68f)
                verticalLineToRelative(-1.36f)
                arcTo(1.32f, 1.32f, 0.0f, false, false, 25.68f, 23.0f)
                close()
            }
        }
        .build()
        return _archiveBoxLarge!!
    }

private var _archiveBoxLarge: ImageVector? = null
