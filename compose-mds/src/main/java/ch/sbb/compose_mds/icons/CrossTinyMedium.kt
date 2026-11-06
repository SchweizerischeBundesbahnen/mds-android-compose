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

public val SBBIcons.CrossTinyMedium: ImageVector
    get() {
        if (_crossTinyMedium != null) {
            return _crossTinyMedium!!
        }
        _crossTinyMedium = Builder(name = "CrossTinyMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.707f, 18.0f)
                lineToRelative(5.647f, -5.647f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(18.0f, 17.293f)
                lineToRelative(-5.646f, -5.647f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(17.293f, 18.0f)
                lineToRelative(-5.646f, 5.646f)
                lineToRelative(0.707f, 0.707f)
                lineTo(18.0f, 18.707f)
                lineToRelative(5.647f, 5.646f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _crossTinyMedium!!
    }

private var _crossTinyMedium: ImageVector? = null
