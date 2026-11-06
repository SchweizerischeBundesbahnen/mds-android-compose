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

public val SBBIcons.ParkAndRailMedium: ImageVector
    get() {
        if (_parkAndRailMedium != null) {
            return _parkAndRailMedium!!
        }
        _parkAndRailMedium = Builder(name = "ParkAndRailMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.504f, 28.251f)
                lineTo(4.502f, 28.251f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.002f)
                close()
                moveTo(26.844f, 11.996f)
                quadToRelative(1.722f, 0.001f, 2.642f, 0.542f)
                quadToRelative(0.764f, 0.444f, 1.166f, 1.182f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 0.403f, 1.667f)
                quadToRelative(-0.001f, 1.052f, -0.505f, 1.83f)
                quadToRelative(-0.507f, 0.781f, -1.408f, 1.117f)
                quadToRelative(0.795f, 0.197f, 1.248f, 0.887f)
                quadToRelative(0.286f, 0.435f, 0.384f, 0.912f)
                quadToRelative(0.1f, 0.475f, 0.256f, 2.175f)
                quadToRelative(0.116f, 1.246f, 0.353f, 1.55f)
                lineToRelative(0.113f, 0.14f)
                horizontalLineToRelative(-2.732f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.202f, -0.65f)
                quadToRelative(-0.06f, -0.392f, -0.159f, -1.823f)
                quadToRelative(-0.1f, -1.271f, -0.62f, -1.758f)
                quadToRelative(-0.522f, -0.49f, -1.778f, -0.49f)
                horizontalLineToRelative(-2.356f)
                verticalLineToRelative(4.721f)
                horizontalLineToRelative(-2.618f)
                lineTo(21.031f, 11.996f)
                close()
                moveTo(9.328f, 11.996f)
                quadToRelative(1.224f, 0.0f, 1.926f, 0.152f)
                quadToRelative(0.702f, 0.151f, 1.267f, 0.537f)
                quadToRelative(1.57f, 1.052f, 1.57f, 3.17f)
                quadToRelative(0.0f, 1.88f, -1.298f, 2.956f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, -1.256f, 0.66f)
                quadToRelative(-0.706f, 0.202f, -1.741f, 0.202f)
                lineTo(7.103f, 19.673f)
                verticalLineToRelative(4.324f)
                lineTo(4.484f, 23.997f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(17.758f, 18.157f)
                horizontalLineToRelative(2.322f)
                verticalLineToRelative(1.324f)
                horizontalLineToRelative(-2.322f)
                verticalLineToRelative(2.313f)
                horizontalLineToRelative(-1.326f)
                lineTo(16.432f, 19.48f)
                horizontalLineToRelative(-2.313f)
                verticalLineToRelative(-1.324f)
                horizontalLineToRelative(2.313f)
                verticalLineToRelative(-2.313f)
                horizontalLineToRelative(1.326f)
                close()
                moveTo(7.103f, 17.611f)
                horizontalLineToRelative(2.34f)
                quadToRelative(1.043f, 0.0f, 1.503f, -0.369f)
                quadToRelative(0.566f, -0.46f, 0.566f, -1.354f)
                quadToRelative(0.0f, -0.905f, -0.658f, -1.347f)
                quadToRelative(-0.475f, -0.328f, -1.55f, -0.328f)
                horizontalLineToRelative(-2.2f)
                close()
                moveTo(23.649f, 17.357f)
                horizontalLineToRelative(2.504f)
                quadToRelative(1.205f, 0.0f, 1.7f, -0.344f)
                quadToRelative(0.623f, -0.435f, 0.623f, -1.315f)
                quadToRelative(0.001f, -0.853f, -0.533f, -1.246f)
                quadToRelative(-0.533f, -0.395f, -1.683f, -0.394f)
                horizontalLineToRelative(-2.61f)
                close()
                moveTo(31.504f, 8.75f)
                lineTo(4.502f, 8.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.002f)
                close()
            }
        }
        .build()
        return _parkAndRailMedium!!
    }

private var _parkAndRailMedium: ImageVector? = null
