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

public val SBBIcons.HalfFareCardSmall: ImageVector
    get() {
        if (_halfFareCardSmall != null) {
            return _halfFareCardSmall!!
        }
        _halfFareCardSmall = Builder(name = "HalfFareCardSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 6.0f)
                horizontalLineToRelative(-15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 7.5f)
                verticalLineToRelative(10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 19.0f)
                horizontalLineToRelative(15.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                close()
                moveTo(22.0f, 17.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 2.0f, 17.5f)
                verticalLineToRelative(-10.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.5f, 5.0f)
                horizontalLineToRelative(15.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 22.0f, 7.5f)
                close()
                moveTo(8.0f, 12.0f)
                lineTo(8.0f, 7.0f)
                horizontalLineToRelative(-0.9f)
                quadToRelative(-0.11f, 0.502f, -0.427f, 0.715f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, -0.485f, 0.212f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -0.688f, 0.074f)
                verticalLineToRelative(0.726f)
                horizontalLineToRelative(1.354f)
                lineTo(6.854f, 12.0f)
                close()
                moveTo(14.195f, 13.388f)
                quadToRelative(-0.488f, -0.387f, -1.215f, -0.388f)
                quadToRelative(-0.82f, 0.0f, -1.335f, 0.476f)
                quadToRelative(-0.53f, 0.485f, -0.53f, 1.375f)
                verticalLineToRelative(0.106f)
                horizontalLineToRelative(1.0f)
                quadToRelative(0.026f, -1.086f, 0.83f, -1.085f)
                quadToRelative(0.327f, 0.0f, 0.527f, 0.198f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, true, 0.203f, 0.52f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.15f, 0.487f)
                quadToRelative(-0.15f, 0.21f, -0.524f, 0.455f)
                quadToRelative(-0.767f, 0.507f, -1.025f, 0.698f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -0.452f, 0.39f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, -0.385f, 0.621f)
                quadTo(11.0f, 17.601f, 11.0f, 18.0f)
                horizontalLineToRelative(3.75f)
                verticalLineToRelative(-0.869f)
                horizontalLineToRelative(-2.443f)
                quadToRelative(0.182f, -0.221f, 0.393f, -0.391f)
                reflectiveQuadToRelative(0.704f, -0.491f)
                quadToRelative(0.516f, -0.337f, 0.636f, -0.426f)
                quadToRelative(0.123f, -0.087f, 0.26f, -0.235f)
                quadToRelative(0.425f, -0.449f, 0.424f, -1.067f)
                quadToRelative(-0.001f, -0.713f, -0.53f, -1.133f)
                moveToRelative(-7.821f, 3.944f)
                lineToRelative(8.0f, -9.0f)
                lineToRelative(-0.748f, -0.664f)
                lineToRelative(-8.0f, 9.0f)
                close()
            }
        }
        .build()
        return _halfFareCardSmall!!
    }

private var _halfFareCardSmall: ImageVector? = null
