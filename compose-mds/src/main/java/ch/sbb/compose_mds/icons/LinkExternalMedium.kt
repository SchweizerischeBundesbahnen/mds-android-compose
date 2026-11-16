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

public val SBBIcons.LinkExternalMedium: ImageVector
    get() {
        if (_linkExternalMedium != null) {
            return _linkExternalMedium!!
        }
        _linkExternalMedium = Builder(name = "LinkExternalMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(29.75f, 6.249f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(7.956f)
                lineToRelative(-5.896f, 5.896f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(5.896f, -5.896f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(19.5f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineTo(6.25f)
                verticalLineToRelative(19.0f)
                horizontalLineToRelative(19.0f)
                verticalLineTo(16.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(12.25f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(-17.0f)
                close()
            }
        }
        .build()
        return _linkExternalMedium!!
    }

private var _linkExternalMedium: ImageVector? = null
