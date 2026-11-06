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

public val SBBIcons.DocumentPptMedium: ImageVector
    get() {
        if (_documentPptMedium != null) {
            return _documentPptMedium!!
        }
        _documentPptMedium = Builder(name = "DocumentPptMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.75f, 14.044f)
                lineTo(26.75f, 29.75f)
                lineTo(9.25f, 29.75f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.013f, -22.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(9.693f)
                close()
                moveTo(10.25f, 28.75f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(-14.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-7.987f)
                close()
                moveTo(24.0f, 23.336f)
                horizontalLineToRelative(-1.395f)
                verticalLineToRelative(3.666f)
                horizontalLineToRelative(-1.002f)
                verticalLineToRelative(-3.666f)
                horizontalLineToRelative(-1.388f)
                verticalLineToRelative(-0.83f)
                lineTo(24.0f, 22.506f)
                close()
                moveTo(13.853f, 22.504f)
                quadToRelative(0.467f, 0.001f, 0.736f, 0.056f)
                quadToRelative(0.267f, 0.06f, 0.486f, 0.203f)
                quadToRelative(0.598f, 0.394f, 0.6f, 1.188f)
                quadToRelative(-0.001f, 0.705f, -0.497f, 1.107f)
                quadToRelative(-0.211f, 0.171f, -0.482f, 0.247f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.663f, 0.075f)
                horizontalLineToRelative(-1.03f)
                lineTo(13.003f, 27.0f)
                lineTo(12.0f, 27.0f)
                verticalLineToRelative(-4.497f)
                close()
                moveTo(18.076f, 22.504f)
                quadToRelative(0.468f, 0.001f, 0.737f, 0.056f)
                quadToRelative(0.267f, 0.06f, 0.486f, 0.203f)
                quadToRelative(0.6f, 0.394f, 0.6f, 1.188f)
                quadToRelative(0.0f, 0.705f, -0.496f, 1.107f)
                quadToRelative(-0.212f, 0.172f, -0.482f, 0.247f)
                reflectiveQuadToRelative(-0.665f, 0.075f)
                horizontalLineToRelative(-1.03f)
                lineTo(17.226f, 27.0f)
                horizontalLineToRelative(-1.002f)
                verticalLineToRelative(-4.497f)
                close()
                moveTo(13.002f, 24.609f)
                horizontalLineToRelative(0.896f)
                quadToRelative(0.396f, -0.001f, 0.572f, -0.139f)
                quadToRelative(0.219f, -0.172f, 0.218f, -0.508f)
                quadToRelative(0.0f, -0.338f, -0.25f, -0.503f)
                quadToRelative(-0.183f, -0.124f, -0.595f, -0.123f)
                horizontalLineToRelative(-0.84f)
                close()
                moveTo(17.226f, 24.609f)
                horizontalLineToRelative(0.895f)
                quadToRelative(0.397f, 0.0f, 0.574f, -0.139f)
                quadToRelative(0.217f, -0.172f, 0.216f, -0.508f)
                quadToRelative(0.0f, -0.338f, -0.25f, -0.503f)
                quadToRelative(-0.183f, -0.124f, -0.593f, -0.123f)
                horizontalLineToRelative(-0.842f)
                close()
                moveTo(19.25f, 13.75f)
                horizontalLineToRelative(5.792f)
                lineTo(19.25f, 7.959f)
                close()
            }
        }
        .build()
        return _documentPptMedium!!
    }

private var _documentPptMedium: ImageVector? = null
