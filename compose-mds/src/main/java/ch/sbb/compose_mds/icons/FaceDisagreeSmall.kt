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

public val SBBIcons.FaceDisagreeSmall: ImageVector
    get() {
        if (_faceDisagreeSmall != null) {
            return _faceDisagreeSmall!!
        }
        _faceDisagreeSmall = Builder(
            name = "FaceDisagreeSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(4.0f, 12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                moveToRelative(8.0f, -9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, true, false, 0.0f, 18.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.0f, -18.0f)
                moveToRelative(-4.146f, 8.354f)
                lineTo(9.0f, 10.207f)
                lineToRelative(1.146f, 1.147f)
                lineToRelative(0.708f, -0.708f)
                lineTo(9.707f, 9.5f)
                lineToRelative(1.147f, -1.146f)
                lineToRelative(-0.708f, -0.708f)
                lineTo(9.0f, 8.793f)
                lineTo(7.854f, 7.646f)
                lineToRelative(-0.708f, 0.708f)
                lineTo(8.293f, 9.5f)
                lineToRelative(-1.147f, 1.146f)
                close()
                moveTo(13.854f, 11.354f)
                lineTo(15.0f, 10.207f)
                lineToRelative(1.146f, 1.147f)
                lineToRelative(0.708f, -0.708f)
                lineTo(15.707f, 9.5f)
                lineToRelative(1.147f, -1.146f)
                lineToRelative(-0.708f, -0.708f)
                lineTo(15.0f, 8.793f)
                lineToRelative(-1.146f, -1.147f)
                lineToRelative(-0.708f, 0.708f)
                lineTo(14.293f, 9.5f)
                lineToRelative(-1.147f, 1.146f)
                close()
                moveTo(12.06f, 12.0f)
                curveToRelative(-2.279f, 0.0f, -4.174f, 1.357f, -5.01f, 3.303f)
                lineToRelative(0.92f, 0.394f)
                arcTo(4.41f, 4.41f, 0.0f, false, true, 12.06f, 13.0f)
                arcToRelative(4.41f, 4.41f, 0.0f, false, true, 4.09f, 2.697f)
                lineToRelative(0.92f, -0.394f)
                curveTo(16.233f, 13.357f, 14.337f, 12.0f, 12.06f, 12.0f)
            }
        }
            .build()
        return _faceDisagreeSmall!!
    }

private var _faceDisagreeSmall: ImageVector? = null
