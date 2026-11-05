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

public val SBBIcons.KRMedium: ImageVector
    get() {
        if (_kRMedium != null) {
            return _kRMedium!!
        }
        _kRMedium = Builder(name = "KRMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.504f, 28.251f)
                lineTo(4.502f, 28.251f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(27.002f)
                close()
                moveTo(7.12f, 16.963f)
                lineToRelative(4.704f, -4.967f)
                horizontalLineToRelative(3.317f)
                lineToRelative(-4.704f, 4.746f)
                lineToRelative(5.146f, 7.256f)
                horizontalLineToRelative(-3.308f)
                lineToRelative(-3.644f, -5.385f)
                lineToRelative(-1.51f, 1.51f)
                verticalLineToRelative(3.875f)
                lineTo(4.5f, 23.998f)
                lineTo(4.5f, 11.996f)
                horizontalLineToRelative(2.62f)
                close()
                moveTo(26.732f, 11.996f)
                quadToRelative(1.724f, 0.001f, 2.643f, 0.542f)
                quadToRelative(0.762f, 0.444f, 1.165f, 1.182f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, 0.404f, 1.667f)
                quadToRelative(-0.001f, 1.05f, -0.505f, 1.83f)
                quadToRelative(-0.507f, 0.781f, -1.409f, 1.117f)
                quadToRelative(0.796f, 0.197f, 1.247f, 0.887f)
                quadToRelative(0.288f, 0.435f, 0.386f, 0.912f)
                quadToRelative(0.1f, 0.475f, 0.255f, 2.175f)
                quadToRelative(0.116f, 1.246f, 0.353f, 1.55f)
                lineToRelative(0.114f, 0.14f)
                lineTo(28.65f, 23.998f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.2f, -0.65f)
                quadToRelative(-0.06f, -0.392f, -0.159f, -1.823f)
                quadToRelative(-0.099f, -1.271f, -0.621f, -1.758f)
                quadToRelative(-0.521f, -0.49f, -1.777f, -0.49f)
                horizontalLineToRelative(-2.356f)
                verticalLineToRelative(4.721f)
                lineTo(20.92f, 23.998f)
                lineTo(20.92f, 11.996f)
                close()
                moveTo(17.659f, 18.157f)
                horizontalLineToRelative(2.322f)
                verticalLineToRelative(1.324f)
                horizontalLineToRelative(-2.322f)
                verticalLineToRelative(2.313f)
                horizontalLineToRelative(-1.325f)
                lineTo(16.334f, 19.48f)
                horizontalLineToRelative(-2.313f)
                verticalLineToRelative(-1.324f)
                horizontalLineToRelative(2.313f)
                verticalLineToRelative(-2.313f)
                horizontalLineToRelative(1.325f)
                close()
                moveTo(23.539f, 17.357f)
                horizontalLineToRelative(2.503f)
                quadToRelative(1.205f, 0.0f, 1.7f, -0.344f)
                quadToRelative(0.623f, -0.435f, 0.623f, -1.315f)
                quadToRelative(0.0f, -0.853f, -0.534f, -1.246f)
                quadToRelative(-0.533f, -0.395f, -1.682f, -0.394f)
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
        return _kRMedium!!
    }

private var _kRMedium: ImageVector? = null
