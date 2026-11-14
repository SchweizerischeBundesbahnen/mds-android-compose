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

public val SBBIcons.ArchiveBoxMedium: ImageVector
    get() {
        if (_archiveBoxMedium != null) {
            return _archiveBoxMedium!!
        }
        _archiveBoxMedium = Builder(name = "ArchiveBoxMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.14f, 3.888f)
                lineTo(24.39f, 6.7f)
                horizontalLineToRelative(6.86f)
                verticalLineToRelative(18.667f)
                lineToRelative(-4.6f, 6.133f)
                lineToRelative(-0.15f, 0.2f)
                lineTo(4.75f, 31.7f)
                lineTo(4.75f, 13.033f)
                lineToRelative(4.6f, -6.132f)
                lineToRelative(0.15f, -0.2f)
                horizontalLineToRelative(6.31f)
                lineTo(17.25f, 4.9f)
                lineToRelative(1.65f, 2.062f)
                lineToRelative(2.46f, -3.074f)
                lineToRelative(0.39f, -0.488f)
                close()
                moveTo(27.543f, 10.643f)
                lineTo(25.19f, 7.7f)
                horizontalLineToRelative(4.56f)
                close()
                moveTo(26.923f, 11.469f)
                lineTo(21.75f, 5.0f)
                lineTo(19.54f, 7.762f)
                lineToRelative(3.95f, 4.938f)
                lineTo(26.0f, 12.7f)
                close()
                moveTo(25.75f, 13.7f)
                horizontalLineToRelative(-20.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(26.75f, 29.7f)
                lineTo(30.25f, 25.033f)
                lineTo(30.25f, 8.7f)
                lineToRelative(-3.5f, 4.667f)
                close()
                moveTo(22.21f, 12.7f)
                lineTo(17.25f, 6.501f)
                lineTo(12.29f, 12.701f)
                close()
                moveTo(11.01f, 12.7f)
                lineTo(15.01f, 7.7f)
                lineTo(10.0f, 7.7f)
                lineToRelative(-3.75f, 5.0f)
                close()
                moveTo(19.5f, 18.2f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 17.2f)
                verticalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _archiveBoxMedium!!
    }

private var _archiveBoxMedium: ImageVector? = null
