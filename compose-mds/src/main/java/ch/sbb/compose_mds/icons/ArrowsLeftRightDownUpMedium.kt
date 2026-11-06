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

public val SBBIcons.ArrowsLeftRightDownUpMedium: ImageVector
    get() {
        if (_arrowsLeftRightDownUpMedium != null) {
            return _arrowsLeftRightDownUpMedium!!
        }
        _arrowsLeftRightDownUpMedium = Builder(name = "ArrowsLeftRightDownUpMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.605f, 3.773f)
                lineToRelative(-0.356f, -0.36f)
                lineToRelative(-0.356f, 0.36f)
                lineToRelative(-5.763f, 5.845f)
                lineToRelative(0.712f, 0.702f)
                lineToRelative(4.908f, -4.977f)
                verticalLineToRelative(11.409f)
                lineTo(5.331f, 16.75f)
                lineToRelative(4.398f, -4.397f)
                lineToRelative(-0.708f, -0.708f)
                lineToRelative(-5.25f, 5.25f)
                lineToRelative(-0.353f, 0.354f)
                lineToRelative(0.353f, 0.354f)
                lineToRelative(5.25f, 5.25f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(-4.396f, -4.395f)
                horizontalLineTo(16.75f)
                verticalLineToRelative(11.403f)
                lineToRelative(-4.92f, -4.972f)
                lineToRelative(-0.711f, 0.703f)
                lineToRelative(5.78f, 5.84f)
                lineToRelative(0.355f, 0.36f)
                lineToRelative(0.356f, -0.36f)
                lineToRelative(5.763f, -5.845f)
                lineToRelative(-0.713f, -0.702f)
                lineToRelative(-4.91f, 4.98f)
                verticalLineTo(17.752f)
                lineToRelative(11.416f, 0.001f)
                lineToRelative(-4.395f, 4.394f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(5.25f, -5.25f)
                lineToRelative(0.354f, -0.354f)
                lineToRelative(-0.354f, -0.354f)
                lineToRelative(-5.25f, -5.25f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(4.399f, 4.398f)
                horizontalLineTo(17.75f)
                verticalLineTo(5.342f)
                lineToRelative(4.923f, 4.976f)
                lineToRelative(0.711f, -0.704f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightDownUpMedium!!
    }

private var _arrowsLeftRightDownUpMedium: ImageVector? = null
