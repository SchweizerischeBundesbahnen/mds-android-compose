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
                moveTo(5.5f, 10.25f)
                verticalLineToRelative(17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.5f, 2.5f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(-1.0f)
                lineTo(14.0f, 28.75f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(11.5f)
                verticalLineToRelative(-1.0f)
                lineTo(8.0f, 7.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.5f, 2.5f)
                moveToRelative(7.5f, -1.5f)
                lineTo(8.0f, 8.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                verticalLineToRelative(17.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(20.704f, 18.262f)
                lineTo(25.84f, 13.102f)
                lineTo(25.13f, 12.397f)
                lineTo(19.147f, 18.409f)
                lineTo(18.794f, 18.762f)
                lineTo(19.146f, 19.115f)
                lineTo(25.132f, 25.103f)
                lineTo(25.839f, 24.396f)
                lineTo(20.708f, 19.262f)
                horizontalLineToRelative(10.027f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _listArrowLeftMedium!!
    }

private var _listArrowLeftMedium: ImageVector? = null
