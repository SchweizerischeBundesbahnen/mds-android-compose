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

public val SBBIcons.ArrowsLeftRightMedium: ImageVector
    get() {
        if (_arrowsLeftRightMedium != null) {
            return _arrowsLeftRightMedium!!
        }
        _arrowsLeftRightMedium = Builder(name = "ArrowsLeftRightMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(5.331f, 15.25f)
                lineToRelative(4.398f, -4.397f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-5.604f, 5.603f)
                lineToRelative(5.603f, 5.604f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(-4.396f, -4.396f)
                lineToRelative(17.164f, 0.002f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(26.98f, 25.854f)
                lineToRelative(5.603f, -5.604f)
                lineToRelative(-5.603f, -5.603f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(4.395f, 4.396f)
                lineToRelative(-17.167f, -0.002f)
                verticalLineToRelative(1.0f)
                lineToRelative(17.169f, 0.002f)
                lineToRelative(-4.398f, 4.397f)
                close()
            }
        }
        .build()
        return _arrowsLeftRightMedium!!
    }

private var _arrowsLeftRightMedium: ImageVector? = null
