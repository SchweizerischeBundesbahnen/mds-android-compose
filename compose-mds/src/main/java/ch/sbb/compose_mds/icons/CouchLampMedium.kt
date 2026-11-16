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

public val SBBIcons.CouchLampMedium: ImageVector
    get() {
        if (_couchLampMedium != null) {
            return _couchLampMedium!!
        }
        _couchLampMedium = Builder(name = "CouchLampMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.75f, 19.815f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.23f, 2.935f)
                horizontalLineToRelative(0.27f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-1.499f)
                lineTo(23.751f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(-17.0f)
                lineTo(5.751f, 30.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.75f)
                lineTo(3.25f, 28.25f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(0.27f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, 1.23f, -2.935f)
                lineTo(4.75f, 16.75f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(32.89f, 14.75f)
                horizontalLineToRelative(-3.139f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-3.142f)
                lineToRelative(1.75f, -7.0f)
                horizontalLineToRelative(3.782f)
                close()
                moveTo(4.25f, 27.25f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-20.0f)
                close()
                moveTo(5.25f, 20.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(0.5f, -0.935f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.23f, 2.935f)
                horizontalLineToRelative(14.54f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, 1.23f, -2.935f)
                lineTo(22.75f, 17.75f)
                horizontalLineToRelative(-17.0f)
                close()
                moveTo(23.25f, 20.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(3.64f, -7.0f)
                horizontalLineToRelative(4.72f)
                lineToRelative(-1.25f, -5.0f)
                horizontalLineToRelative(-2.22f)
                close()
            }
        }
        .build()
        return _couchLampMedium!!
    }

private var _couchLampMedium: ImageVector? = null
