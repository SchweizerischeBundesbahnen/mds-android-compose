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

public val SBBIcons.DocumentLockMedium: ImageVector
    get() {
        if (_documentLockMedium != null) {
            return _documentLockMedium!!
        }
        _documentLockMedium = Builder(
            name = "DocumentLockMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(9.75f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(23.5f)
                lineTo(18.0f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-7.75f)
                lineTo(10.25f, 7.25f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-2.457f)
                lineToRelative(-0.146f, -0.147f)
                lineToRelative(-7.5f, -7.5f)
                lineToRelative(-0.147f, -0.146f)
                lineTo(9.75f, 6.25f)
                moveToRelative(15.293f, 7.5f)
                lineTo(19.25f, 7.957f)
                verticalLineToRelative(5.793f)
                close()
                moveTo(21.0f, 19.25f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                lineTo(21.0f, 18.25f)
                close()
                moveTo(13.496f, 22.25f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(18.0f, 25.25f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.0f)
                lineTo(18.0f, 24.25f)
                close()
                moveTo(23.75f, 20.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(22.75f, 22.75f)
                verticalLineToRelative(-2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(3.0f)
                moveToRelative(2.5f, 2.703f)
                lineTo(25.25f, 28.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.047f)
                close()
                moveTo(20.75f, 30.25f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(6.5f)
                close()
            }
        }
            .build()
        return _documentLockMedium!!
    }

private var _documentLockMedium: ImageVector? = null
