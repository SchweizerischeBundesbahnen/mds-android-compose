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

public val SBBIcons.ArchiveBoxSmall: ImageVector
    get() {
        if (_archiveBoxSmall != null) {
            return _archiveBoxSmall!!
        }
        _archiveBoxSmall = Builder(name = "ArchiveBoxSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(14.5f, 2.0f)
                lineToRelative(0.39f, 0.488f)
                lineTo(16.34f, 4.3f)
                lineTo(21.0f, 4.3f)
                verticalLineToRelative(12.667f)
                lineToRelative(-0.1f, 0.133f)
                lineToRelative(-3.0f, 4.0f)
                lineToRelative(-0.15f, 0.2f)
                lineTo(3.0f, 21.3f)
                lineTo(3.0f, 8.634f)
                lineToRelative(0.1f, -0.134f)
                lineToRelative(3.0f, -4.0f)
                lineToRelative(0.15f, -0.2f)
                horizontalLineToRelative(4.21f)
                lineToRelative(0.65f, -0.812f)
                lineTo(11.5f, 3.0f)
                lineToRelative(0.39f, 0.488f)
                lineToRelative(0.71f, 0.887f)
                lineToRelative(1.509f, -1.887f)
                close()
                moveTo(18.358f, 6.823f)
                lineTo(17.14f, 5.3f)
                horizontalLineToRelative(2.36f)
                close()
                moveTo(17.738f, 7.649f)
                lineTo(14.499f, 3.601f)
                lineTo(13.239f, 5.175f)
                lineTo(15.74f, 8.3f)
                horizontalLineToRelative(1.51f)
                close()
                moveTo(17.0f, 9.3f)
                lineTo(4.0f, 9.3f)
                verticalLineToRelative(11.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(18.0f, 19.3f)
                lineTo(20.0f, 16.634f)
                lineTo(20.0f, 6.3f)
                lineToRelative(-2.0f, 2.667f)
                close()
                moveTo(14.46f, 8.3f)
                lineTo(11.5f, 4.6f)
                lineTo(8.54f, 8.3f)
                close()
                moveTo(7.26f, 8.3f)
                lineTo(9.66f, 5.3f)
                lineTo(6.75f, 5.3f)
                lineToRelative(-2.25f, 3.0f)
                close()
                moveTo(8.0f, 12.3f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 11.3f)
                close()
            }
        }
        .build()
        return _archiveBoxSmall!!
    }

private var _archiveBoxSmall: ImageVector? = null
