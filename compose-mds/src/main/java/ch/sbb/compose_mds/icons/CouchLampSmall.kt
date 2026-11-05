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

public val SBBIcons.CouchLampSmall: ImageVector
    get() {
        if (_couchLampSmall != null) {
            return _couchLampSmall!!
        }
        _couchLampSmall = Builder(
            name = "CouchLampSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(16.0f, 13.087f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.913f, 15.0f)
                lineTo(17.0f, 15.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-0.999f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-11.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(0.087f)
                arcTo(1.495f, 1.495f, 0.0f, false, true, 3.0f, 13.087f)
                lineTo(3.0f, 11.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(22.14f, 10.0f)
                horizontalLineToRelative(-2.139f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-2.142f)
                lineToRelative(1.25f, -5.0f)
                horizontalLineToRelative(2.782f)
                close()
                moveTo(3.0f, 18.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 16.0f)
                close()
                moveTo(3.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(0.5f, -0.913f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.913f, 15.0f)
                horizontalLineToRelative(9.174f)
                arcTo(1.495f, 1.495f, 0.0f, false, true, 15.0f, 13.087f)
                lineTo(15.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                close()
                moveTo(15.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                moveToRelative(2.64f, -5.0f)
                horizontalLineToRelative(2.72f)
                lineToRelative(-0.75f, -3.0f)
                horizontalLineToRelative(-1.22f)
                close()
            }
        }
            .build()
        return _couchLampSmall!!
    }

private var _couchLampSmall: ImageVector? = null
