package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.ConstructionSmall: ImageVector
    get() {
        if (_constructionSmall != null) {
            return _constructionSmall!!
        }
        _constructionSmall = Builder(name = "ConstructionSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 5.5f)
                curveToRelative(0.0f, -0.257f, 0.243f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.243f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.243f, 0.5f, -0.5f, 0.5f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.5f, -0.5f)
                moveToRelative(0.5f, -1.5f)
                curveToRelative(-0.81f, 0.0f, -1.5f, 0.69f, -1.5f, 1.5f)
                reflectiveCurveTo(11.69f, 7.0f, 12.5f, 7.0f)
                reflectiveCurveTo(14.0f, 6.31f, 14.0f, 5.5f)
                reflectiveCurveTo(13.31f, 4.0f, 12.5f, 4.0f)
                moveTo(7.0f, 6.5f)
                horizontalLineToRelative(-0.36f)
                lineToRelative(-0.114f, 0.342f)
                lineToRelative(-0.745f, 2.232f)
                lineToRelative(-1.427f, -1.428f)
                lineToRelative(-0.708f, 0.708f)
                lineToRelative(1.88f, 1.878f)
                lineToRelative(0.459f, 3.68f)
                lineToRelative(-2.432f, 4.864f)
                lineToRelative(0.894f, 0.448f)
                lineToRelative(2.5f, -5.0f)
                lineToRelative(0.068f, -0.136f)
                lineToRelative(-0.019f, -0.15f)
                lineToRelative(-0.32f, -2.554f)
                lineToRelative(0.887f, 0.886f)
                lineToRelative(0.897f, 2.692f)
                lineToRelative(-1.907f, 3.814f)
                lineToRelative(0.894f, 0.448f)
                lineToRelative(2.0f, -4.0f)
                lineToRelative(0.093f, -0.186f)
                lineToRelative(-0.066f, -0.196f)
                lineToRelative(-0.33f, -0.99f)
                lineToRelative(3.034f, 3.033f)
                lineToRelative(-0.587f, 1.76f)
                lineToRelative(-3.815f, 1.908f)
                lineToRelative(0.448f, 0.894f)
                lineToRelative(4.0f, -2.0f)
                lineToRelative(0.185f, -0.092f)
                lineToRelative(0.065f, -0.197f)
                lineToRelative(0.935f, -2.803f)
                lineToRelative(1.815f, -0.908f)
                lineToRelative(0.098f, -0.049f)
                lineToRelative(0.068f, -0.086f)
                lineTo(17.24f, 13.0f)
                horizontalLineToRelative(1.47f)
                lineToRelative(1.856f, 3.248f)
                lineToRelative(0.868f, -0.496f)
                lineToRelative(-2.0f, -3.5f)
                lineTo(19.29f, 12.0f)
                horizontalLineToRelative(-2.53f)
                lineToRelative(-0.15f, 0.188f)
                lineToRelative(-1.932f, 2.414f)
                lineToRelative(-1.902f, 0.95f)
                lineToRelative(-0.185f, 0.093f)
                lineToRelative(-0.06f, 0.18f)
                lineToRelative(-1.988f, -1.99f)
                lineToRelative(0.947f, -4.737f)
                lineToRelative(0.053f, -0.262f)
                lineToRelative(-0.19f, -0.19f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-0.146f, -0.146f)
                lineTo(7.0f, 6.5f)
                moveTo(10.293f, 9.0f)
                lineTo(8.0f, 11.293f)
                lineTo(6.707f, 10.0f)
                lineTo(9.0f, 7.707f)
                close()
                moveTo(7.793f, 7.5f)
                lineTo(7.144f, 8.149f)
                lineTo(7.36f, 7.5f)
                close()
                moveTo(10.186f, 10.521f)
                lineTo(8.707f, 12.0f)
                lineToRelative(0.986f, 0.986f)
                close()
                moveTo(18.464f, 15.686f)
                lineTo(17.464f, 18.186f)
                lineTo(17.407f, 18.33f)
                lineTo(17.277f, 18.416f)
                lineTo(14.277f, 20.416f)
                lineTo(13.723f, 19.584f)
                lineTo(16.593f, 17.67f)
                lineTo(17.536f, 15.314f)
                close()
            }
        }
        .build()
        return _constructionSmall!!
    }

private var _constructionSmall: ImageVector? = null
