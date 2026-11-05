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

public val SBBIcons.BanknotesDollarMedium: ImageVector
    get() {
        if (_banknotesDollarMedium != null) {
            return _banknotesDollarMedium!!
        }
        _banknotesDollarMedium = Builder(name = "BanknotesDollarMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.75f, 9.25f)
                horizontalLineToRelative(25.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.5f)
                lineTo(3.25f, 26.75f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-3.0f)
                moveToRelative(24.0f, 12.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(4.25f, 13.25f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(24.5f)
                verticalLineToRelative(-12.5f)
                close()
                moveTo(17.83f, 20.986f)
                quadToRelative(0.0f, 0.825f, -1.024f, 0.95f)
                lineTo(16.806f, 20.03f)
                quadToRelative(0.516f, 0.16f, 0.626f, 0.228f)
                quadToRelative(0.398f, 0.234f, 0.399f, 0.729f)
                moveToRelative(-2.539f, -3.243f)
                quadToRelative(0.0f, -0.763f, 0.927f, -0.845f)
                verticalLineToRelative(1.69f)
                quadToRelative(-0.518f, -0.128f, -0.723f, -0.314f)
                quadToRelative(-0.204f, -0.187f, -0.204f, -0.531f)
                moveToRelative(1.515f, 0.98f)
                verticalLineToRelative(-1.811f)
                quadToRelative(0.83f, 0.108f, 0.85f, 0.991f)
                horizontalLineToRelative(1.315f)
                quadToRelative(-0.019f, -0.933f, -0.573f, -1.455f)
                quadToRelative(-0.56f, -0.521f, -1.592f, -0.574f)
                verticalLineToRelative(-0.875f)
                horizontalLineToRelative(-0.588f)
                verticalLineToRelative(0.875f)
                quadToRelative(-0.669f, 0.044f, -1.072f, 0.223f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.87f, 0.711f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, false, -0.305f, 1.046f)
                quadToRelative(-0.001f, 0.53f, 0.22f, 0.901f)
                quadToRelative(0.217f, 0.372f, 0.688f, 0.644f)
                quadToRelative(0.37f, 0.211f, 1.34f, 0.484f)
                verticalLineToRelative(2.054f)
                quadToRelative(-1.048f, -0.112f, -1.039f, -1.268f)
                horizontalLineToRelative(-1.378f)
                quadToRelative(0.01f, 1.174f, 0.814f, 1.821f)
                quadToRelative(0.579f, 0.461f, 1.602f, 0.52f)
                lineTo(16.219f, 24.0f)
                horizontalLineToRelative(0.588f)
                verticalLineToRelative(-0.986f)
                quadToRelative(0.645f, -0.032f, 1.07f, -0.206f)
                quadToRelative(0.424f, -0.172f, 0.774f, -0.546f)
                quadToRelative(0.55f, -0.582f, 0.55f, -1.441f)
                quadToRelative(0.0f, -0.847f, -0.535f, -1.335f)
                quadToRelative(-0.431f, -0.395f, -1.475f, -0.666f)
                quadToRelative(-0.316f, -0.077f, -0.384f, -0.098f)
            }
        }
        .build()
        return _banknotesDollarMedium!!
    }

private var _banknotesDollarMedium: ImageVector? = null
