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

public val SBBIcons.WashingMachineSmall: ImageVector
    get() {
        if (_washingMachineSmall != null) {
            return _washingMachineSmall!!
        }
        _washingMachineSmall = Builder(
            name = "WashingMachineSmall",
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
                moveTo(4.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(20.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 2.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 3.0f)
                close()
                moveTo(19.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(8.012f, 15.318f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.891f, 0.56f)
                curveToRelative(-0.31f, -0.137f, -0.513f, -0.362f, -0.659f, -0.524f)
                lineToRelative(-0.017f, -0.02f)
                curveToRelative(-0.228f, -0.252f, -0.32f, -0.334f, -0.53f, -0.334f)
                reflectiveCurveToRelative(-0.302f, 0.082f, -0.53f, 0.335f)
                lineToRelative(-0.017f, 0.018f)
                curveToRelative(-0.224f, 0.25f, -0.582f, 0.647f, -1.256f, 0.647f)
                reflectiveCurveToRelative(-1.031f, -0.398f, -1.255f, -0.647f)
                lineToRelative(-0.016f, -0.018f)
                curveToRelative(-0.228f, -0.254f, -0.32f, -0.335f, -0.529f, -0.335f)
                curveToRelative(-0.207f, 0.0f, -0.298f, 0.08f, -0.526f, 0.334f)
                lineToRelative(-0.017f, 0.019f)
                curveToRelative(-0.222f, 0.248f, -0.58f, 0.647f, -1.253f, 0.647f)
                reflectiveCurveToRelative(-1.03f, -0.398f, -1.254f, -0.647f)
                lineToRelative(-0.017f, -0.019f)
                close()
                moveTo(15.988f, 14.685f)
                lineTo(15.97f, 14.665f)
                lineTo(15.953f, 14.647f)
                curveToRelative(-0.224f, -0.25f, -0.582f, -0.647f, -1.256f, -0.647f)
                reflectiveCurveToRelative(-1.032f, 0.398f, -1.256f, 0.646f)
                lineToRelative(-0.017f, 0.02f)
                curveToRelative(-0.228f, 0.252f, -0.32f, 0.334f, -0.53f, 0.334f)
                curveToRelative(-0.209f, 0.0f, -0.3f, -0.081f, -0.528f, -0.335f)
                lineToRelative(-0.017f, -0.018f)
                curveToRelative(-0.223f, -0.249f, -0.58f, -0.647f, -1.255f, -0.647f)
                curveToRelative(-0.673f, 0.0f, -1.03f, 0.399f, -1.253f, 0.647f)
                lineToRelative(-0.017f, 0.019f)
                curveToRelative(-0.227f, 0.253f, -0.318f, 0.334f, -0.526f, 0.334f)
                reflectiveCurveToRelative(-0.3f, -0.081f, -0.527f, -0.334f)
                lineToRelative(-0.017f, -0.02f)
                curveToRelative(-0.145f, -0.161f, -0.348f, -0.387f, -0.657f, -0.524f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, 7.89f, 0.563f)
                moveTo(6.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(9.0f, 0.0f)
                horizontalLineToRelative(3.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(12.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 0.0f, 10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, -10.0f)
            }
        }
            .build()
        return _washingMachineSmall!!
    }

private var _washingMachineSmall: ImageVector? = null
