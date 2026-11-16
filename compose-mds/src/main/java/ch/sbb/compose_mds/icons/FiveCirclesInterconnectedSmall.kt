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

public val SBBIcons.FiveCirclesInterconnectedSmall: ImageVector
    get() {
        if (_fiveCirclesInterconnectedSmall != null) {
            return _fiveCirclesInterconnectedSmall!!
        }
        _fiveCirclesInterconnectedSmall = Builder(name = "FiveCirclesInterconnectedSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 5.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveToRelative(0.5f, 5.05f)
                lineTo(13.0f, 6.915f)
                quadToRelative(0.076f, -0.027f, 0.147f, -0.061f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.062f, 0.146f)
                lineTo(14.95f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.0f, 10.05f)
                moveTo(14.95f, 13.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.0f, 14.95f)
                verticalLineToRelative(3.135f)
                quadToRelative(0.075f, 0.027f, 0.147f, 0.061f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.062f, -0.146f)
                close()
                moveTo(12.0f, 14.95f)
                verticalLineToRelative(3.136f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.147f, 0.06f)
                lineToRelative(-5.0f, -5.0f)
                quadToRelative(0.035f, -0.07f, 0.062f, -0.147f)
                horizontalLineToRelative(3.135f)
                curveToRelative(0.199f, 0.98f, 0.97f, 1.752f, 1.95f, 1.95f)
                moveTo(10.05f, 12.0f)
                curveToRelative(0.2f, -0.98f, 0.97f, -1.751f, 1.95f, -1.95f)
                lineTo(12.0f, 6.915f)
                quadToRelative(-0.076f, -0.027f, -0.147f, -0.061f)
                lineToRelative(-5.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.061f, 0.146f)
                close()
                moveTo(13.854f, 18.853f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.708f, 0.0f)
                lineToRelative(-5.0f, -5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -2.708f)
                lineToRelative(5.0f, -4.998f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.708f, 0.0f)
                lineToRelative(5.0f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 2.708f)
                close()
                moveTo(14.0f, 12.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                moveToRelative(6.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveTo(12.5f, 19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveTo(6.0f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
            }
        }
        .build()
        return _fiveCirclesInterconnectedSmall!!
    }

private var _fiveCirclesInterconnectedSmall: ImageVector? = null
