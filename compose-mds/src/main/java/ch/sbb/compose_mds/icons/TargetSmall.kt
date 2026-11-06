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

public val SBBIcons.TargetSmall: ImageVector
    get() {
        if (_targetSmall != null) {
            return _targetSmall!!
        }
        _targetSmall = Builder(name = "TargetSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.293f)
                lineToRelative(-1.0f, 1.0f)
                lineTo(18.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.293f)
                lineToRelative(-0.126f, 0.126f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -0.707f, -0.707f)
                lineTo(14.0f, 9.293f)
                lineTo(14.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.293f)
                lineToRelative(1.0f, -1.0f)
                lineTo(16.0f, 4.0f)
                close()
                moveTo(10.0f, 9.0f)
                curveToRelative(1.2f, 0.0f, 2.302f, 0.423f, 3.164f, 1.129f)
                lineToRelative(-1.426f, 1.426f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.707f, 0.707f)
                lineToRelative(1.426f, -1.426f)
                arcTo(5.0f, 5.0f, 0.0f, true, true, 10.0f, 9.0f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(0.371f, 0.0f, 0.718f, 0.1f, 1.016f, 0.277f)
                lineToRelative(-0.757f, 0.757f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.707f, 0.707f)
                lineToRelative(0.757f, -0.757f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 10.0f, 12.0f)
            }
        }
        .build()
        return _targetSmall!!
    }

private var _targetSmall: ImageVector? = null
