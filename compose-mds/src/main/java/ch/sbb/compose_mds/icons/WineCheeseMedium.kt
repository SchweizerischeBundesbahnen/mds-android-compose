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

public val SBBIcons.WineCheeseMedium: ImageVector
    get() {
        if (_wineCheeseMedium != null) {
            return _wineCheeseMedium!!
        }
        _wineCheeseMedium = Builder(name = "WineCheeseMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.75f, 13.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 12.0f, 11.75f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.5f)
                lineTo(7.5f, 11.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, 1.75f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(5.75f, 24.25f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(8.0f)
                lineTo(13.75f, 18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 12.0f, 10.75f)
                horizontalLineToRelative(-0.25f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(7.5f)
                lineTo(7.5f, 10.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.75f, 2.75f)
                verticalLineToRelative(19.25f)
                lineTo(12.0f, 32.75f)
                verticalLineToRelative(-1.0f)
                lineTo(5.75f, 31.75f)
                verticalLineToRelative(-6.5f)
                lineTo(12.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(19.5f, 23.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, 0.0f, 3.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.0f, -3.5f)
                moveToRelative(0.0f, 4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, false, 0.0f, -5.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 0.0f, 5.5f)
                moveToRelative(7.75f, -0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 4.0f, 0.0f)
                moveToRelative(4.5f, -8.0f)
                horizontalLineToRelative(-5.5f)
                lineTo(27.25f, 21.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, true, -3.5f, 0.0f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(-4.203f)
                lineToRelative(-0.248f, -0.145f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, -1.252f, -2.152f)
                arcToRelative(2.49f, 2.49f, 0.0f, false, true, 1.252f, -2.152f)
                lineToRelative(0.248f, -0.145f)
                close()
                moveTo(25.5f, 23.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 28.25f, 21.0f)
                verticalLineToRelative(-0.25f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(2.644f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, false, -1.5f, 2.856f)
                curveToRelative(0.0f, 1.19f, 0.6f, 2.226f, 1.5f, 2.855f)
                verticalLineToRelative(2.645f)
                horizontalLineToRelative(-17.0f)
                verticalLineToRelative(-11.0f)
                horizontalLineToRelative(8.0f)
                lineTo(22.75f, 21.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, 2.75f)
            }
        }
        .build()
        return _wineCheeseMedium!!
    }

private var _wineCheeseMedium: ImageVector? = null
