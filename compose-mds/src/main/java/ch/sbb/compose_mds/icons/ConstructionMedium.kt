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

public val SBBIcons.ConstructionMedium: ImageVector
    get() {
        if (_constructionMedium != null) {
            return _constructionMedium!!
        }
        _constructionMedium = Builder(name = "ConstructionMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.75f, 7.25f)
                curveToRelative(0.523f, 0.0f, 1.0f, 0.477f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.477f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.477f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.477f, -1.0f, 1.0f, -1.0f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(1.076f, 0.0f, 2.0f, -0.924f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.924f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.924f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.924f, 2.0f, 2.0f, 2.0f)
                moveToRelative(-1.707f, 3.086f)
                lineTo(13.707f, 10.0f)
                lineTo(10.14f, 10.0f)
                lineToRelative(-0.115f, 0.342f)
                lineToRelative(-1.244f, 3.732f)
                lineToRelative(-2.428f, -2.427f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(2.879f, 2.878f)
                lineToRelative(0.71f, 5.68f)
                lineToRelative(-3.682f, 7.364f)
                lineToRelative(0.894f, 0.448f)
                lineToRelative(3.75f, -7.5f)
                lineToRelative(0.068f, -0.136f)
                lineToRelative(-0.019f, -0.15f)
                lineToRelative(-0.57f, -4.554f)
                lineToRelative(1.886f, 1.886f)
                lineToRelative(1.398f, 4.192f)
                lineToRelative(-2.907f, 5.814f)
                lineToRelative(0.894f, 0.448f)
                lineToRelative(3.093f, -6.186f)
                lineToRelative(-0.895f, -2.686f)
                lineToRelative(5.408f, 5.408f)
                lineToRelative(-0.962f, 2.885f)
                lineToRelative(-5.815f, 2.908f)
                lineToRelative(0.448f, 0.894f)
                lineToRelative(6.185f, -3.092f)
                lineToRelative(1.5f, -4.5f)
                lineToRelative(2.815f, -1.408f)
                lineToRelative(0.098f, -0.049f)
                lineToRelative(0.069f, -0.085f)
                lineToRelative(2.85f, -3.563f)
                horizontalLineToRelative(2.468f)
                lineToRelative(2.856f, 4.998f)
                lineToRelative(0.87f, -0.496f)
                lineToRelative(-3.0f, -5.25f)
                lineToRelative(-0.145f, -0.252f)
                horizontalLineToRelative(-3.53f)
                lineToRelative(-0.15f, 0.188f)
                lineToRelative(-2.932f, 3.664f)
                lineToRelative(-2.902f, 1.45f)
                lineToRelative(-0.185f, 0.093f)
                lineToRelative(-0.185f, 0.554f)
                lineToRelative(-3.363f, -3.363f)
                lineToRelative(1.447f, -7.238f)
                close()
                moveTo(15.793f, 13.5f)
                lineTo(12.0f, 17.293f)
                lineTo(9.707f, 15.0f)
                lineToRelative(3.793f, -3.793f)
                close()
                moveTo(12.293f, 11.0f)
                lineTo(10.144f, 13.149f)
                lineTo(10.86f, 11.0f)
                close()
                moveTo(15.686f, 15.021f)
                lineTo(12.707f, 18.0f)
                lineToRelative(1.986f, 1.986f)
                close()
                moveTo(27.464f, 23.436f)
                lineTo(25.964f, 27.186f)
                lineTo(25.906f, 27.33f)
                lineTo(21.277f, 30.416f)
                lineTo(20.723f, 29.584f)
                lineTo(25.093f, 26.669f)
                lineTo(26.536f, 23.064f)
                close()
            }
        }
        .build()
        return _constructionMedium!!
    }

private var _constructionMedium: ImageVector? = null
