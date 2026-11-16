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

public val SBBIcons.FilterXSmall: ImageVector
    get() {
        if (_filterXSmall != null) {
            return _filterXSmall!!
        }
        _filterXSmall = Builder(name = "FilterXSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(20.587f, 4.0f)
                lineToRelative(-0.707f, 0.825f)
                lineToRelative(-5.88f, 6.86f)
                verticalLineToRelative(1.397f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.767f)
                lineToRelative(0.12f, -0.14f)
                lineTo(18.413f, 5.0f)
                horizontalLineTo(5.587f)
                lineToRelative(5.293f, 6.175f)
                lineToRelative(0.12f, 0.14f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.316f)
                lineToRelative(-5.88f, -6.86f)
                lineTo(3.413f, 4.0f)
                close()
                moveTo(15.5f, 18.207f)
                lineToRelative(-2.146f, 2.146f)
                lineToRelative(-0.708f, -0.707f)
                lineToRelative(2.147f, -2.146f)
                lineToRelative(-2.147f, -2.147f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(2.147f, 2.147f)
                lineToRelative(2.146f, -2.147f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(-2.146f, 2.147f)
                lineToRelative(2.146f, 2.146f)
                lineToRelative(-0.707f, 0.707f)
                close()
            }
        }
        .build()
        return _filterXSmall!!
    }

private var _filterXSmall: ImageVector? = null
