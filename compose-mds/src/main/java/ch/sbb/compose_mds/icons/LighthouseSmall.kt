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

public val SBBIcons.LighthouseSmall: ImageVector
    get() {
        if (_lighthouseSmall != null) {
            return _lighthouseSmall!!
        }
        _lighthouseSmall = Builder(name = "LighthouseSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                moveTo(9.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 9.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(0.91f)
                lineTo(7.077f, 21.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.076f)
                lineTo(15.09f, 10.0f)
                lineTo(16.0f, 10.0f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(15.0f, 6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -6.0f, 0.0f)
                moveToRelative(5.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 6.0f)
                close()
                moveTo(8.09f, 21.0f)
                lineToRelative(1.833f, -11.0f)
                horizontalLineToRelative(4.153f)
                lineToRelative(1.834f, 11.0f)
                close()
                moveTo(20.0f, 8.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 7.0f)
                close()
                moveTo(18.248f, 5.934f)
                lineTo(21.748f, 3.934f)
                lineTo(21.252f, 3.065f)
                lineTo(17.752f, 5.065f)
                close()
                moveTo(21.748f, 11.065f)
                lineTo(21.252f, 11.935f)
                lineTo(17.752f, 9.935f)
                lineTo(18.248f, 9.065f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(6.0f, 7.0f)
                lineTo(4.0f, 7.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(3.0f, 7.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(5.752f, 5.934f)
                lineTo(6.248f, 5.065f)
                lineTo(2.748f, 3.065f)
                lineTo(2.252f, 3.935f)
                close()
                moveTo(6.248f, 9.934f)
                lineTo(2.748f, 11.934f)
                lineTo(2.252f, 11.065f)
                lineTo(5.752f, 9.065f)
                close()
            }
        }
        .build()
        return _lighthouseSmall!!
    }

private var _lighthouseSmall: ImageVector? = null
