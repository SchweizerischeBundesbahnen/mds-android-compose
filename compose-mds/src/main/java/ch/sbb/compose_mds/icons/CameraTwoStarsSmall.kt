package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.CameraTwoStarsSmall: ImageVector
    get() {
        if (_cameraTwoStarsSmall != null) {
            return _cameraTwoStarsSmall!!
        }
        _cameraTwoStarsSmall = Builder(name = "CameraTwoStarsSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.89f, 11.0f)
                lineTo(14.0f, 11.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.108f)
                lineToRelative(0.403f, -1.62f)
                lineToRelative(0.093f, -0.38f)
                horizontalLineToRelative(4.787f)
                close()
                moveTo(11.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.0f, 2.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, -3.0f)
                close()
                moveTo(17.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(16.5f, 12.656f)
                curveToRelative(-0.222f, 0.335f, -0.51f, 0.622f, -0.844f, 0.844f)
                curveToRelative(0.335f, 0.222f, 0.622f, 0.508f, 0.844f, 0.843f)
                curveToRelative(0.222f, -0.334f, 0.509f, -0.621f, 0.843f, -0.843f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.843f, -0.844f)
                moveTo(8.14f, 11.0f)
                horizontalLineToRelative(3.72f)
                lineToRelative(-0.25f, -1.0f)
                lineTo(8.387f, 10.0f)
                close()
                moveTo(19.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                lineTo(15.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                close()
                moveTo(18.5f, 4.937f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.936f, 6.5f)
                curveToRelative(0.657f, 0.364f, 1.2f, 0.906f, 1.564f, 1.563f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.063f, 6.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 18.5f, 4.937f)
            }
        }
        .build()
        return _cameraTwoStarsSmall!!
    }

private var _cameraTwoStarsSmall: ImageVector? = null
