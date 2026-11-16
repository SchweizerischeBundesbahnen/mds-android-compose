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
                moveToRelative(23.384f, 9.614f)
                lineToRelative(-5.78f, -5.84f)
                lineToRelative(-0.355f, -0.36f)
                lineToRelative(-0.356f, 0.36f)
                lineToRelative(-5.763f, 5.844f)
                lineToRelative(0.713f, 0.702f)
                lineToRelative(4.907f, -4.977f)
                verticalLineToRelative(11.409f)
                lineTo(5.331f, 16.75f)
                lineToRelative(4.397f, -4.398f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-5.603f, 5.604f)
                lineToRelative(5.603f, 5.604f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-4.395f, -4.396f)
                horizontalLineTo(16.75f)
                verticalLineToRelative(11.404f)
                lineToRelative(-4.92f, -4.974f)
                lineToRelative(-0.711f, 0.704f)
                lineToRelative(5.779f, 5.841f)
                lineToRelative(0.356f, 0.36f)
                lineToRelative(0.356f, -0.361f)
                lineToRelative(5.762f, -5.846f)
                lineToRelative(-0.711f, -0.7f)
                lineToRelative(-4.911f, 4.979f)
                verticalLineTo(17.751f)
                lineToRelative(11.416f, 0.001f)
                lineToRelative(-4.395f, 4.395f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(5.604f, -5.604f)
                lineToRelative(-5.603f, -5.603f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(4.4f, 4.398f)
                horizontalLineTo(17.75f)
                verticalLineTo(5.342f)
                lineToRelative(4.924f, 4.975f)
                close()
                moveTo(17.61f, 30.725f)
                lineToRelative(-0.356f, -0.35f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightDownUpMedium!!
    }

private var _arrowsLeftRightDownUpMedium: ImageVector? = null
