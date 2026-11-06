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

public val SBBIcons.ConstructionLarge: ImageVector
    get() {
        if (_constructionLarge != null) {
            return _constructionLarge!!
        }
        _constructionLarge = Builder(name = "ConstructionLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.043f, 17.336f)
                lineToRelative(-0.053f, 0.262f)
                lineToRelative(-1.948f, 9.737f)
                lineToRelative(4.74f, 4.74f)
                lineToRelative(0.309f, -0.93f)
                lineToRelative(0.185f, -0.092f)
                lineToRelative(3.902f, -1.951f)
                lineToRelative(3.931f, -4.914f)
                lineToRelative(0.15f, -0.188f)
                horizontalLineToRelative(4.531f)
                lineToRelative(0.145f, 0.252f)
                lineToRelative(4.0f, 7.0f)
                lineToRelative(-0.87f, 0.496f)
                lineTo(37.21f, 25.0f)
                lineTo(33.74f, 25.0f)
                lineToRelative(-3.85f, 4.813f)
                lineToRelative(-0.068f, 0.085f)
                lineToRelative(-0.098f, 0.05f)
                lineToRelative(-3.815f, 1.907f)
                lineToRelative(-2.0f, 6.0f)
                lineToRelative(-8.185f, 4.092f)
                lineToRelative(-0.448f, -0.894f)
                lineToRelative(7.815f, -3.907f)
                lineToRelative(1.337f, -4.011f)
                lineToRelative(-7.783f, -7.783f)
                lineToRelative(1.395f, 4.186f)
                lineToRelative(-4.093f, 8.186f)
                lineToRelative(-0.894f, -0.448f)
                lineToRelative(3.907f, -7.814f)
                lineToRelative(-1.898f, -5.692f)
                lineToRelative(-2.885f, -2.886f)
                lineToRelative(0.82f, 6.554f)
                lineToRelative(0.018f, 0.15f)
                lineToRelative(-0.068f, 0.136f)
                lineToRelative(-5.0f, 10.0f)
                lineToRelative(-0.894f, -0.448f)
                lineToRelative(4.931f, -9.865f)
                lineToRelative(-0.96f, -7.68f)
                lineToRelative(-3.878f, -3.878f)
                lineToRelative(0.708f, -0.707f)
                lineToRelative(3.427f, 3.428f)
                lineToRelative(1.744f, -5.232f)
                lineToRelative(0.115f, -0.342f)
                horizontalLineToRelative(4.567f)
                close()
                moveTo(35.963f, 30.686f)
                lineTo(33.963f, 35.686f)
                lineTo(33.906f, 35.83f)
                lineTo(27.777f, 39.916f)
                lineTo(27.223f, 39.084f)
                lineTo(33.093f, 35.169f)
                lineTo(35.036f, 30.315f)
                close()
                moveTo(16.208f, 23.5f)
                lineToRelative(2.985f, 2.985f)
                lineToRelative(1.493f, -7.463f)
                close()
                moveTo(12.208f, 19.5f)
                lineTo(15.501f, 22.793f)
                lineTo(20.794f, 17.5f)
                lineTo(17.501f, 14.207f)
                close()
                moveTo(12.644f, 17.65f)
                lineTo(16.294f, 14.0f)
                lineTo(13.86f, 14.0f)
                close()
                moveTo(24.5f, 8.0f)
                curveToRelative(1.342f, 0.0f, 2.5f, 1.158f, 2.5f, 2.5f)
                reflectiveCurveTo(25.842f, 13.0f, 24.5f, 13.0f)
                reflectiveCurveTo(22.0f, 11.842f, 22.0f, 10.5f)
                reflectiveCurveTo(23.158f, 8.0f, 24.5f, 8.0f)
                moveToRelative(0.0f, 1.0f)
                curveToRelative(-0.79f, 0.0f, -1.5f, 0.71f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.71f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.71f, 1.5f, -1.5f)
                reflectiveCurveTo(25.29f, 9.0f, 24.5f, 9.0f)
            }
        }
        .build()
        return _constructionLarge!!
    }

private var _constructionLarge: ImageVector? = null
