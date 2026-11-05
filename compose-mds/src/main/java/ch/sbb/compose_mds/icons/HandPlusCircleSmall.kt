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

public val SBBIcons.HandPlusCircleSmall: ImageVector
    get() {
        if (_handPlusCircleSmall != null) {
            return _handPlusCircleSmall!!
        }
        _handPlusCircleSmall = Builder(name = "HandPlusCircleSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 7.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 9.001f, 0.0f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 5.0f, 7.5f)
                moveTo(9.5f, 2.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.001f, 11.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 9.5f, 2.0f)
                moveToRelative(0.5f, 9.0f)
                lineTo(10.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(8.003f, 15.818f)
                lineTo(4.425f, 13.318f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.873f, 2.344f)
                lineToRelative(5.917f, 5.213f)
                lineToRelative(0.142f, 0.125f)
                horizontalLineToRelative(3.925f)
                lineToRelative(0.862f, 0.855f)
                lineToRelative(0.146f, 0.145f)
                horizontalLineToRelative(8.857f)
                lineToRelative(-0.846f, -0.852f)
                lineToRelative(-5.028f, -5.064f)
                lineToRelative(-0.008f, -0.008f)
                curveToRelative(-1.188f, -1.144f, -2.75f, -2.045f, -4.4f, -2.076f)
                lineTo(10.0f, 14.0f)
                curveToRelative(-0.633f, 0.0f, -1.145f, 0.244f, -1.495f, 0.635f)
                curveToRelative(-0.3f, 0.336f, -0.464f, 0.759f, -0.502f, 1.183f)
                moveTo(3.84f, 14.13f)
                lineToRelative(4.69f, 3.276f)
                curveToRelative(0.35f, 0.37f, 0.852f, 0.594f, 1.47f, 0.594f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.374f, 0.0f, -0.613f, -0.134f, -0.763f, -0.301f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, true, -0.243f, -0.695f)
                curveToRelative(0.002f, -0.268f, 0.094f, -0.522f, 0.256f, -0.702f)
                curveToRelative(0.153f, -0.171f, 0.39f, -0.302f, 0.75f, -0.302f)
                horizontalLineToRelative(2.105f)
                curveToRelative(1.304f, 0.026f, 2.633f, 0.751f, 3.717f, 1.792f)
                lineTo(19.999f, 21.0f)
                horizontalLineToRelative(-6.043f)
                lineToRelative(-0.861f, -0.855f)
                lineToRelative(-0.147f, -0.145f)
                horizontalLineToRelative(-3.96f)
                lineToRelative(-5.783f, -5.095f)
                lineToRelative(-0.009f, -0.008f)
                lineToRelative(-0.009f, -0.007f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.627f, -0.78f)
                lineToRelative(0.013f, 0.01f)
                close()
            }
        }
        .build()
        return _handPlusCircleSmall!!
    }

private var _handPlusCircleSmall: ImageVector? = null
