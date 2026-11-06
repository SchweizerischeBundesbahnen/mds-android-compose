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

public val SBBIcons.CableCarProfileLarge: ImageVector
    get() {
        if (_cableCarProfileLarge != null) {
            return _cableCarProfileLarge!!
        }
        _cableCarProfileLarge = Builder(name = "CableCarProfileLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.861f, 4.965f)
                lineTo(28.45f, 8.817f)
                lineToRelative(6.61f, 14.163f)
                horizontalLineToRelative(5.681f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-34.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                verticalLineToRelative(-16.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                horizontalLineToRelative(5.662f)
                lineToRelative(6.358f, -11.74f)
                lineTo(3.86f, 14.965f)
                lineToRelative(-0.242f, -0.97f)
                lineToRelative(40.0f, -10.0f)
                close()
                moveTo(5.24f, 40.001f)
                verticalLineToRelative(1.479f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(34.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                lineTo(42.24f, 40.0f)
                close()
                moveTo(6.74f, 23.98f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.5f)
                lineTo(5.24f, 39.0f)
                horizontalLineToRelative(37.0f)
                lineTo(42.24f, 25.48f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                close()
                moveTo(15.24f, 35.98f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(27.24f, 35.98f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(39.24f, 35.98f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(9.24f, 34.98f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(21.24f, 34.98f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(33.24f, 34.98f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(20.074f, 10.912f)
                lineTo(13.539f, 22.98f)
                horizontalLineToRelative(20.416f)
                lineTo(27.46f, 9.065f)
                close()
            }
        }
        .build()
        return _cableCarProfileLarge!!
    }

private var _cableCarProfileLarge: ImageVector? = null
