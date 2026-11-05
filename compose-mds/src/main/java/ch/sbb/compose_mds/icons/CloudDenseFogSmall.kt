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

public val SBBIcons.CloudDenseFogSmall: ImageVector
    get() {
        if (_cloudDenseFogSmall != null) {
            return _cloudDenseFogSmall!!
        }
        _cloudDenseFogSmall = Builder(
            name = "CloudDenseFogSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(17.503f, 10.602f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.19f, -0.746f)
                curveToRelative(0.124f, -0.804f, -0.005f, -1.532f, -0.323f, -2.14f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, -1.794f, -1.548f)
                curveToRelative(-1.363f, -0.495f, -3.042f, -0.116f, -3.988f, 1.422f)
                curveToRelative(-1.516f, -0.719f, -3.43f, 0.326f, -3.522f, 2.176f)
                curveToRelative(-0.481f, 0.129f, -0.87f, 0.432f, -1.144f, 0.815f)
                curveToRelative(-0.36f, 0.504f, -0.535f, 1.154f, -0.507f, 1.791f)
                curveToRelative(0.028f, 0.64f, 0.262f, 1.303f, 0.764f, 1.809f)
                curveToRelative(0.508f, 0.511f, 1.247f, 0.82f, 2.201f, 0.82f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.944f, 0.0f, 1.689f, -0.31f, 2.21f, -0.811f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, false, 0.822f, -1.793f)
                curveToRelative(0.043f, -0.639f, -0.13f, -1.295f, -0.529f, -1.795f)
                moveToRelative(-6.645f, -2.1f)
                curveToRelative(0.635f, -1.44f, 1.948f, -1.774f, 2.997f, -1.394f)
                curveToRelative(0.53f, 0.192f, 0.983f, 0.566f, 1.25f, 1.073f)
                curveToRelative(0.261f, 0.5f, 0.357f, 1.165f, 0.116f, 1.977f)
                lineToRelative(-0.2f, 0.67f)
                lineToRelative(0.7f, -0.028f)
                curveToRelative(0.465f, -0.019f, 0.789f, 0.161f, 1.0f, 0.426f)
                curveToRelative(0.223f, 0.279f, 0.342f, 0.679f, 0.313f, 1.103f)
                curveToRelative(-0.028f, 0.42f, -0.2f, 0.834f, -0.519f, 1.14f)
                curveToRelative(-0.313f, 0.302f, -0.799f, 0.531f, -1.515f, 0.531f)
                lineTo(8.0f, 14.0f)
                curveToRelative(-0.73f, 0.0f, -1.2f, -0.23f, -1.492f, -0.524f)
                curveToRelative(-0.298f, -0.3f, -0.455f, -0.713f, -0.474f, -1.148f)
                curveToRelative(-0.019f, -0.437f, 0.104f, -0.862f, 0.321f, -1.165f)
                curveToRelative(0.21f, -0.294f, 0.497f, -0.463f, 0.845f, -0.463f)
                horizontalLineToRelative(0.563f)
                lineToRelative(-0.066f, -0.56f)
                curveToRelative(-0.18f, -1.5f, 1.419f, -2.245f, 2.386f, -1.453f)
                lineToRelative(0.51f, 0.417f)
                close()
                moveTo(5.0f, 17.0f)
                horizontalLineToRelative(12.993f)
                verticalLineToRelative(-1.0f)
                lineTo(5.0f, 16.0f)
                close()
                moveTo(17.993f, 21.0f)
                lineTo(5.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.993f)
                close()
                moveTo(6.0f, 19.0f)
                horizontalLineToRelative(10.993f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 18.0f)
                close()
            }
        }
            .build()
        return _cloudDenseFogSmall!!
    }

private var _cloudDenseFogSmall: ImageVector? = null
