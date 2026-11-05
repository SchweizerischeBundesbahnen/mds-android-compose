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

public val SBBIcons.ListArrowLeftMedium: ImageVector
    get() {
        if (_listArrowLeftMedium != null) {
            return _listArrowLeftMedium!!
        }
        _listArrowLeftMedium = Builder(name = "ListArrowLeftMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 7.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                verticalLineToRelative(17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(-1.0f)
                lineTo(14.0f, 28.75f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 8.75f)
                lineTo(8.0f, 8.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(20.703f, 18.262f)
                horizontalLineToRelative(10.032f)
                verticalLineToRelative(1.0f)
                lineTo(20.708f, 19.262f)
                lineToRelative(5.131f, 5.134f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-5.985f, -5.988f)
                lineToRelative(-0.353f, -0.353f)
                lineToRelative(0.352f, -0.353f)
                lineToRelative(5.985f, -6.012f)
                lineToRelative(0.709f, 0.705f)
                close()
            }
        }
        .build()
        return _listArrowLeftMedium!!
    }

private var _listArrowLeftMedium: ImageVector? = null
