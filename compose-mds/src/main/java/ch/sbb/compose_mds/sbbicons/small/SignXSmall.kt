package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.SignXSmall: ImageVector
    get() {
        if (_signXSmall != null) {
            return _signXSmall!!
        }
        _signXSmall = Builder(name = "SignXSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(11.5f, 1.877f)
                lineToRelative(0.448f, 0.9f)
                lineToRelative(8.7f, 17.5f)
                lineToRelative(0.36f, 0.723f)
                lineTo(1.992f, 21.0f)
                lineToRelative(0.36f, -0.723f)
                lineToRelative(8.7f, -17.5f)
                close()
                moveTo(3.607f, 20.0f)
                horizontalLineToRelative(15.786f)
                lineTo(11.5f, 4.123f)
                close()
                moveTo(10.793f, 15.5f)
                lineTo(8.647f, 13.354f)
                lineTo(9.354f, 12.646f)
                lineTo(11.5f, 14.793f)
                lineTo(13.647f, 12.646f)
                lineTo(14.354f, 13.354f)
                lineTo(12.207f, 15.5f)
                lineTo(14.354f, 17.646f)
                lineTo(13.647f, 18.354f)
                lineTo(11.5f, 16.207f)
                lineTo(9.354f, 18.354f)
                lineTo(8.647f, 17.646f)
                close()
            }
        }
        .build()
        return _signXSmall!!
    }

private var _signXSmall: ImageVector? = null
