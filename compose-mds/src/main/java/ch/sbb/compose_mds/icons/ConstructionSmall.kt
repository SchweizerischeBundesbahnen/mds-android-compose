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

public val SBBIcons.ConstructionSmall: ImageVector
    get() {
        if (_constructionSmall != null) {
            return _constructionSmall!!
        }
        _constructionSmall = Builder(name = "ConstructionSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.5f, 5.0f)
                curveToRelative(0.257f, 0.0f, 0.5f, 0.243f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.243f, 0.5f, -0.5f, 0.5f)
                arcToRelative(0.527f, 0.527f, 0.0f, false, true, -0.5f, -0.5f)
                curveToRelative(0.0f, -0.257f, 0.243f, -0.5f, 0.5f, -0.5f)
                moveToRelative(0.0f, 2.0f)
                curveToRelative(0.81f, 0.0f, 1.5f, -0.69f, 1.5f, -1.5f)
                reflectiveCurveTo(13.31f, 4.0f, 12.5f, 4.0f)
                reflectiveCurveTo(11.0f, 4.69f, 11.0f, 5.5f)
                reflectiveCurveTo(11.69f, 7.0f, 12.5f, 7.0f)
                moveToRelative(-0.957f, 1.836f)
                lineTo(9.207f, 6.5f)
                lineTo(6.64f, 6.5f)
                lineToRelative(-0.115f, 0.342f)
                lineToRelative(-0.744f, 2.232f)
                lineToRelative(-1.428f, -1.428f)
                lineToRelative(-0.707f, 0.708f)
                lineToRelative(1.879f, 1.878f)
                lineToRelative(0.46f, 3.68f)
                lineToRelative(-2.432f, 4.864f)
                lineToRelative(0.894f, 0.448f)
                lineToRelative(2.5f, -5.0f)
                lineToRelative(0.068f, -0.136f)
                lineToRelative(-0.019f, -0.15f)
                lineToRelative(-0.32f, -2.554f)
                lineToRelative(0.886f, 0.886f)
                lineToRelative(0.898f, 2.692f)
                lineToRelative(-1.907f, 3.814f)
                lineToRelative(0.894f, 0.448f)
                lineToRelative(2.093f, -4.186f)
                lineToRelative(-0.396f, -1.186f)
                lineToRelative(3.034f, 3.033f)
                lineToRelative(-0.587f, 1.76f)
                lineToRelative(-3.815f, 1.908f)
                lineToRelative(0.448f, 0.894f)
                lineToRelative(4.185f, -2.092f)
                lineToRelative(1.0f, -3.0f)
                lineToRelative(1.815f, -0.908f)
                lineToRelative(0.098f, -0.049f)
                lineToRelative(0.069f, -0.085f)
                lineTo(17.24f, 13.0f)
                horizontalLineToRelative(1.468f)
                lineToRelative(1.856f, 3.248f)
                lineToRelative(0.87f, -0.496f)
                lineToRelative(-2.0f, -3.5f)
                lineTo(19.29f, 12.0f)
                horizontalLineToRelative(-2.53f)
                lineToRelative(-0.15f, 0.188f)
                lineToRelative(-1.932f, 2.414f)
                lineToRelative(-1.902f, 0.95f)
                lineToRelative(-0.185f, 0.094f)
                lineToRelative(-0.06f, 0.178f)
                lineToRelative(-1.988f, -1.988f)
                lineToRelative(0.947f, -4.738f)
                close()
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
                moveTo(18.464f, 15.685f)
                lineTo(17.464f, 18.185f)
                lineTo(17.406f, 18.33f)
                lineTo(14.277f, 20.416f)
                lineTo(13.723f, 19.584f)
                lineTo(16.593f, 17.669f)
                lineTo(17.536f, 15.315f)
                close()
            }
        }
        .build()
        return _constructionSmall!!
    }

private var _constructionSmall: ImageVector? = null
