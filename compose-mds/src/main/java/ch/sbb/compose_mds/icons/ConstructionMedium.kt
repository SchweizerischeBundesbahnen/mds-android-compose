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
                moveTo(17.75f, 8.25f)
                curveToRelative(0.0f, -0.523f, 0.477f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.477f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.477f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.477f, -1.0f, -1.0f)
                moveToRelative(1.0f, -2.0f)
                curveToRelative(-1.076f, 0.0f, -2.0f, 0.924f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.924f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.924f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.924f, -2.0f, -2.0f, -2.0f)
                moveTo(10.5f, 10.0f)
                horizontalLineToRelative(-0.36f)
                lineToRelative(-0.114f, 0.342f)
                lineToRelative(-1.245f, 3.732f)
                lineToRelative(-2.427f, -2.428f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(2.88f, 2.878f)
                lineToRelative(0.709f, 5.68f)
                lineToRelative(-3.682f, 7.364f)
                lineToRelative(0.894f, 0.448f)
                lineToRelative(3.75f, -7.5f)
                lineToRelative(0.068f, -0.136f)
                lineToRelative(-0.019f, -0.15f)
                lineToRelative(-0.57f, -4.554f)
                lineToRelative(1.887f, 1.886f)
                lineToRelative(1.397f, 4.192f)
                lineToRelative(-2.907f, 5.814f)
                lineToRelative(0.894f, 0.448f)
                lineToRelative(3.0f, -6.0f)
                lineToRelative(0.093f, -0.186f)
                lineToRelative(-0.066f, -0.196f)
                lineToRelative(-0.83f, -2.49f)
                lineToRelative(5.409f, 5.408f)
                lineToRelative(-0.962f, 2.885f)
                lineToRelative(-5.815f, 2.908f)
                lineToRelative(0.448f, 0.894f)
                lineToRelative(6.0f, -3.0f)
                lineToRelative(0.185f, -0.092f)
                lineToRelative(0.065f, -0.197f)
                lineToRelative(1.435f, -4.303f)
                lineToRelative(2.815f, -1.408f)
                lineToRelative(0.098f, -0.049f)
                lineToRelative(0.068f, -0.086f)
                lineToRelative(2.85f, -3.562f)
                horizontalLineToRelative(2.47f)
                lineToRelative(2.856f, 4.998f)
                lineToRelative(0.868f, -0.496f)
                lineToRelative(-3.0f, -5.25f)
                lineToRelative(-0.144f, -0.252f)
                horizontalLineToRelative(-3.53f)
                lineToRelative(-0.15f, 0.188f)
                lineToRelative(-2.932f, 3.664f)
                lineToRelative(-2.902f, 1.45f)
                lineToRelative(-0.185f, 0.093f)
                lineToRelative(-0.065f, 0.197f)
                lineToRelative(-0.12f, 0.357f)
                lineToRelative(-3.363f, -3.363f)
                lineToRelative(1.447f, -7.238f)
                lineToRelative(0.053f, -0.262f)
                lineToRelative(-0.19f, -0.19f)
                lineToRelative(-3.0f, -3.0f)
                lineToRelative(-0.146f, -0.146f)
                lineTo(10.5f, 10.0f)
                moveToRelative(5.293f, 3.5f)
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
                lineTo(25.907f, 27.33f)
                lineTo(25.777f, 27.416f)
                lineTo(21.277f, 30.416f)
                lineTo(20.723f, 29.584f)
                lineTo(25.093f, 26.67f)
                lineTo(26.536f, 23.064f)
                close()
            }
        }
        .build()
        return _constructionMedium!!
    }

private var _constructionMedium: ImageVector? = null
