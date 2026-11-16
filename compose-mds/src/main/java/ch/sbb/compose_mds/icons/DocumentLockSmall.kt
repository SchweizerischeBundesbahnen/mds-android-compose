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

public val SBBIcons.DocumentLockSmall: ImageVector
    get() {
        if (_documentLockSmall != null) {
            return _documentLockSmall!!
        }
        _documentLockSmall = Builder(name = "DocumentLockSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 9.293f)
                lineTo(12.707f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.293f, 9.0f)
                lineTo(13.0f, 5.707f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(14.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(11.998f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 16.0f)
                verticalLineToRelative(1.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(16.5f, 13.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(17.0f, 15.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(-1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                lineTo(18.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(17.0f, 16.969f)
                lineTo(17.0f, 19.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(16.0f, 16.97f)
                close()
                moveTo(19.0f, 20.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _documentLockSmall!!
    }

private var _documentLockSmall: ImageVector? = null
