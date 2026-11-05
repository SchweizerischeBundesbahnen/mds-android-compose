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

public val SBBIcons.SuitcaseQuestionMarkSmall: ImageVector
    get() {
        if (_suitcaseQuestionMarkSmall != null) {
            return _suitcaseQuestionMarkSmall!!
        }
        _suitcaseQuestionMarkSmall = Builder(
            name = "SuitcaseQuestionMarkSmall",
            defaultWidth =
                24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight =
            24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(15.0f, 7.009f)
                horizontalLineToRelative(6.0f)
                lineTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 7.009f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 8.009f)
                lineTo(4.0f, 8.009f)
                close()
                moveTo(12.571f, 18.783f)
                horizontalLineToRelative(-1.266f)
                verticalLineToRelative(-1.219f)
                horizontalLineToRelative(1.266f)
                close()
                moveTo(12.015f, 10.018f)
                quadToRelative(1.189f, 0.0f, 1.892f, 0.673f)
                quadToRelative(0.657f, 0.622f, 0.656f, 1.635f)
                quadToRelative(0.0f, 0.838f, -0.445f, 1.442f)
                quadToRelative(-0.199f, 0.275f, -0.955f, 1.013f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -0.466f, 0.536f)
                quadToRelative(-0.133f, 0.215f, -0.184f, 0.53f)
                quadToRelative(-0.06f, 0.317f, -0.059f, 0.821f)
                horizontalLineToRelative(-0.996f)
                quadToRelative(0.012f, -0.897f, 0.158f, -1.33f)
                quadToRelative(0.106f, -0.317f, 0.302f, -0.568f)
                quadToRelative(0.197f, -0.252f, 0.87f, -0.944f)
                quadToRelative(0.435f, -0.445f, 0.568f, -0.803f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 0.112f, -0.62f)
                quadToRelative(0.0f, -0.586f, -0.322f, -0.985f)
                quadToRelative(-0.388f, -0.486f, -1.143f, -0.486f)
                quadToRelative(-1.565f, 0.0f, -1.688f, 1.922f)
                lineTo(9.308f, 12.854f)
                quadToRelative(0.041f, -1.09f, 0.427f, -1.688f)
                quadToRelative(0.36f, -0.55f, 0.95f, -0.85f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 1.33f, -0.298f)
                moveTo(10.0f, 7.008f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
            .build()
        return _suitcaseQuestionMarkSmall!!
    }

private var _suitcaseQuestionMarkSmall: ImageVector? = null
