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

public val SBBIcons.DocumentPdfMedium: ImageVector
    get() {
        if (_documentPdfMedium != null) {
            return _documentPdfMedium!!
        }
        _documentPdfMedium = Builder(name = "DocumentPdfMedium", defaultWidth = 36.0.dp,
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
                moveTo(13.81f, 22.502f)
                quadToRelative(0.457f, 0.0f, 0.723f, 0.057f)
                quadToRelative(0.262f, 0.06f, 0.475f, 0.201f)
                quadToRelative(0.586f, 0.396f, 0.586f, 1.189f)
                quadToRelative(0.0f, 0.706f, -0.485f, 1.106f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -0.472f, 0.248f)
                quadToRelative(-0.263f, 0.076f, -0.652f, 0.076f)
                horizontalLineToRelative(-1.008f)
                lineTo(12.977f, 27.0f)
                horizontalLineToRelative(-0.98f)
                verticalLineToRelative(-4.497f)
                close()
                moveTo(17.951f, 22.502f)
                quadToRelative(0.506f, 0.001f, 0.869f, 0.118f)
                quadToRelative(0.361f, 0.116f, 0.637f, 0.37f)
                quadToRelative(0.675f, 0.614f, 0.674f, 1.706f)
                curveToRelative(0.0f, 0.772f, -0.212f, 1.365f, -0.637f, 1.787f)
                quadToRelative(-0.278f, 0.28f, -0.63f, 0.397f)
                quadToRelative(-0.35f, 0.12f, -0.892f, 0.12f)
                horizontalLineToRelative(-1.839f)
                verticalLineToRelative(-4.498f)
                close()
                moveTo(23.974f, 23.334f)
                horizontalLineToRelative(-2.185f)
                verticalLineToRelative(1.043f)
                horizontalLineToRelative(1.903f)
                verticalLineToRelative(0.772f)
                horizontalLineToRelative(-1.903f)
                verticalLineToRelative(1.85f)
                horizontalLineToRelative(-0.98f)
                verticalLineToRelative(-4.497f)
                horizontalLineToRelative(3.165f)
                close()
                moveTo(17.114f, 26.169f)
                horizontalLineToRelative(0.756f)
                quadToRelative(0.349f, 0.0f, 0.555f, -0.068f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, false, 0.358f, -0.237f)
                quadToRelative(0.358f, -0.386f, 0.358f, -1.134f)
                quadToRelative(0.0f, -0.688f, -0.33f, -1.043f)
                quadToRelative(-0.33f, -0.352f, -0.978f, -0.354f)
                horizontalLineToRelative(-0.718f)
                close()
                moveTo(12.977f, 24.607f)
                horizontalLineToRelative(0.876f)
                quadToRelative(0.39f, 0.0f, 0.562f, -0.138f)
                quadToRelative(0.214f, -0.172f, 0.213f, -0.509f)
                quadToRelative(0.0f, -0.337f, -0.246f, -0.504f)
                quadToRelative(-0.177f, -0.122f, -0.582f, -0.122f)
                horizontalLineToRelative(-0.823f)
                close()
                moveTo(19.25f, 13.75f)
                horizontalLineToRelative(5.792f)
                lineTo(19.25f, 7.959f)
                close()
            }
        }
        .build()
        return _documentPdfMedium!!
    }

private var _documentPdfMedium: ImageVector? = null
