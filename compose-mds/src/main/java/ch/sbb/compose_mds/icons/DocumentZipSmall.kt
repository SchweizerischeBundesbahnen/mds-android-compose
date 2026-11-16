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

public val SBBIcons.DocumentZipSmall: ImageVector
    get() {
        if (_documentZipSmall != null) {
            return _documentZipSmall!!
        }
        _documentZipSmall = Builder(name = "DocumentZipSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 9.293f)
                lineTo(12.707f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(17.0f, 10.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-0.464f)
                lineTo(9.0f, 18.536f)
                lineTo(9.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.464f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(16.293f, 9.0f)
                lineTo(13.0f, 5.707f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(9.0f, 17.608f)
                lineTo(9.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                verticalLineToRelative(-0.464f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.857f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(9.0f, 15.75f)
                verticalLineToRelative(0.858f)
                lineTo(8.0f, 16.608f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.857f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(9.0f, 13.893f)
                verticalLineToRelative(0.857f)
                lineTo(8.0f, 14.75f)
                verticalLineToRelative(-0.928f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.858f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(9.0f, 12.036f)
                verticalLineToRelative(0.857f)
                lineTo(8.0f, 12.893f)
                verticalLineToRelative(-0.929f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.856f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.928f)
                close()
                moveTo(9.0f, 10.179f)
                verticalLineToRelative(0.857f)
                lineTo(8.0f, 11.036f)
                verticalLineToRelative(-0.928f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 9.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(9.0f, 8.322f)
                verticalLineToRelative(0.857f)
                lineTo(8.0f, 9.179f)
                lineTo(8.0f, 8.25f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-0.857f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.929f)
                close()
                moveTo(9.0f, 6.464f)
                verticalLineToRelative(0.858f)
                lineTo(8.0f, 7.322f)
                verticalLineToRelative(-0.93f)
                horizontalLineToRelative(1.0f)
                lineTo(9.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(0.464f)
                close()
            }
        }
        .build()
        return _documentZipSmall!!
    }

private var _documentZipSmall: ImageVector? = null
