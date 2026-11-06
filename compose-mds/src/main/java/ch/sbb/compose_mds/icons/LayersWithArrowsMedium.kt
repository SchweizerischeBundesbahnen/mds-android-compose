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

public val SBBIcons.LayersWithArrowsMedium: ImageVector
    get() {
        if (_layersWithArrowsMedium != null) {
            return _layersWithArrowsMedium!!
        }
        _layersWithArrowsMedium = Builder(name = "LayersWithArrowsMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.172f, 1.78f)
                lineToRelative(-0.173f, -0.063f)
                lineToRelative(-0.173f, 0.063f)
                lineToRelative(-14.25f, 5.25f)
                lineToRelative(-1.273f, 0.47f)
                lineToRelative(1.273f, 0.469f)
                lineToRelative(14.25f, 5.25f)
                lineToRelative(0.173f, 0.063f)
                lineToRelative(0.173f, -0.063f)
                lineToRelative(14.25f, -5.25f)
                lineToRelative(1.273f, -0.47f)
                lineToRelative(-1.273f, -0.469f)
                close()
                moveTo(17.999f, 12.217f)
                lineTo(5.195f, 7.499f)
                lineTo(18.0f, 2.782f)
                lineTo(30.803f, 7.5f)
                close()
                moveTo(18.173f, 22.781f)
                lineTo(18.0f, 22.717f)
                lineToRelative(-0.173f, 0.064f)
                lineToRelative(-14.25f, 5.25f)
                lineToRelative(-1.274f, 0.469f)
                lineToRelative(1.274f, 0.469f)
                lineToRelative(14.25f, 5.25f)
                lineToRelative(0.173f, 0.064f)
                lineToRelative(0.173f, -0.064f)
                lineToRelative(14.25f, -5.25f)
                lineToRelative(1.273f, -0.47f)
                lineToRelative(-1.273f, -0.468f)
                close()
                moveTo(18.0f, 33.217f)
                lineTo(5.196f, 28.5f)
                lineTo(18.0f, 23.783f)
                lineTo(30.804f, 28.5f)
                close()
                moveTo(10.25f, 14.344f)
                lineTo(13.672f, 17.817f)
                lineTo(14.384f, 17.115f)
                lineTo(10.106f, 12.774f)
                lineTo(9.749f, 12.412f)
                lineTo(9.393f, 12.775f)
                lineTo(5.129f, 17.119f)
                lineTo(5.842f, 17.819f)
                lineTo(9.25f, 14.349f)
                verticalLineToRelative(6.65f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(26.75f, 21.654f)
                lineTo(30.16f, 18.179f)
                lineTo(30.873f, 18.879f)
                lineTo(26.61f, 23.224f)
                lineTo(26.254f, 23.587f)
                lineTo(25.897f, 23.225f)
                lineTo(21.617f, 18.885f)
                lineTo(22.33f, 18.182f)
                lineTo(25.75f, 21.652f)
                lineTo(25.75f, 15.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _layersWithArrowsMedium!!
    }

private var _layersWithArrowsMedium: ImageVector? = null
