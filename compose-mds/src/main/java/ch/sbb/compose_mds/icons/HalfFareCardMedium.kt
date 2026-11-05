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

public val SBBIcons.HalfFareCardMedium: ImageVector
    get() {
        if (_halfFareCardMedium != null) {
            return _halfFareCardMedium!!
        }
        _halfFareCardMedium = Builder(name = "HalfFareCardMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.25f, 11.25f)
                curveToRelative(0.0f, -1.932f, 1.568f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(22.5f)
                curveToRelative(1.932f, 0.0f, 3.5f, 1.568f, 3.5f, 3.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.932f, -1.568f, 3.5f, -3.5f, 3.5f)
                lineTo(6.75f, 29.75f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.5f, -3.5f)
                close()
                moveTo(6.75f, 8.75f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(22.5f)
                curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-15.0f)
                curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(12.0f, 18.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(-1.35f)
                quadToRelative(-0.164f, 0.753f, -0.64f, 1.072f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.728f, 0.319f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 8.25f, 12.0f)
                verticalLineToRelative(1.09f)
                horizontalLineToRelative(2.031f)
                lineTo(10.281f, 18.0f)
                close()
                moveTo(21.292f, 20.082f)
                quadToRelative(-0.73f, -0.581f, -1.821f, -0.582f)
                quadToRelative(-1.23f, 0.0f, -2.003f, 0.714f)
                quadToRelative(-0.795f, 0.728f, -0.795f, 2.063f)
                verticalLineToRelative(0.159f)
                horizontalLineToRelative(1.499f)
                quadToRelative(0.039f, -1.63f, 1.245f, -1.628f)
                quadToRelative(0.49f, 0.0f, 0.792f, 0.297f)
                quadToRelative(0.303f, 0.3f, 0.303f, 0.78f)
                quadToRelative(0.0f, 0.415f, -0.225f, 0.73f)
                curveToRelative(-0.149f, 0.212f, -0.41f, 0.437f, -0.785f, 0.683f)
                quadToRelative(-1.153f, 0.761f, -1.539f, 1.047f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.676f, 0.585f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.58f, 0.931f)
                quadToRelative(-0.207f, 0.54f, -0.206f, 1.139f)
                horizontalLineToRelative(5.625f)
                verticalLineToRelative(-1.303f)
                lineTo(18.46f, 25.697f)
                quadToRelative(0.273f, -0.332f, 0.59f, -0.587f)
                quadToRelative(0.319f, -0.255f, 1.056f, -0.736f)
                quadToRelative(0.774f, -0.505f, 0.955f, -0.64f)
                quadToRelative(0.183f, -0.13f, 0.389f, -0.352f)
                quadToRelative(0.637f, -0.674f, 0.636f, -1.6f)
                quadToRelative(0.0f, -1.071f, -0.795f, -1.7f)
                moveToRelative(-11.918f, 5.75f)
                lineToRelative(12.0f, -13.5f)
                lineToRelative(-0.748f, -0.664f)
                lineToRelative(-12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _halfFareCardMedium!!
    }

private var _halfFareCardMedium: ImageVector? = null
