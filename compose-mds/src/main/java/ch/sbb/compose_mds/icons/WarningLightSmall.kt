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

public val SBBIcons.WarningLightSmall: ImageVector
    get() {
        if (_warningLightSmall != null) {
            return _warningLightSmall!!
        }
        _warningLightSmall = Builder(name = "WarningLightSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 5.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(9.354f, 5.646f)
                lineTo(7.354f, 3.646f)
                lineTo(6.647f, 4.353f)
                lineTo(8.647f, 6.353f)
                close()
                moveTo(18.354f, 4.353f)
                lineTo(16.354f, 6.353f)
                lineTo(15.647f, 5.646f)
                lineTo(17.647f, 3.646f)
                close()
                moveTo(9.0f, 11.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 7.0f, 0.0f)
                lineTo(16.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                close()
                moveTo(8.0f, 17.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 9.0f, 0.0f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(1.86f)
                lineToRelative(0.115f, 0.342f)
                lineToRelative(1.0f, 3.0f)
                lineToRelative(0.22f, 0.658f)
                lineTo(4.806f, 21.0f)
                lineToRelative(0.219f, -0.658f)
                lineToRelative(1.0f, -3.0f)
                lineTo(6.14f, 17.0f)
                lineTo(8.0f, 17.0f)
                moveToRelative(3.0f, -6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(6.194f, 20.0f)
                lineTo(6.861f, 18.0f)
                lineTo(18.14f, 18.0f)
                lineToRelative(0.667f, 2.0f)
                close()
            }
        }
        .build()
        return _warningLightSmall!!
    }

private var _warningLightSmall: ImageVector? = null
