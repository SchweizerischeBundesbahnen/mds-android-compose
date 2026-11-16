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
        _washingMachineSmall = Builder(name = "WashingMachineSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.0f, 2.0f)
                verticalLineToRelative(20.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 2.0f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 8.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(5.0f, 7.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                close()
                moveTo(14.697f, 14.0f)
                curveToRelative(0.675f, 0.0f, 1.032f, 0.398f, 1.256f, 0.646f)
                lineToRelative(0.017f, 0.019f)
                lineToRelative(0.018f, 0.02f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.891f, -0.563f)
                curveToRelative(0.309f, 0.137f, 0.51f, 0.363f, 0.656f, 0.524f)
                lineToRelative(0.018f, 0.02f)
                curveToRelative(0.227f, 0.253f, 0.32f, 0.334f, 0.528f, 0.334f)
                curveToRelative(0.207f, 0.0f, 0.298f, -0.08f, 0.525f, -0.334f)
                lineToRelative(0.017f, -0.019f)
                curveToRelative(0.223f, -0.248f, 0.58f, -0.647f, 1.253f, -0.647f)
                curveToRelative(0.675f, 0.0f, 1.033f, 0.399f, 1.257f, 0.648f)
                lineToRelative(0.015f, 0.017f)
                curveToRelative(0.228f, 0.253f, 0.32f, 0.335f, 0.529f, 0.335f)
                reflectiveCurveToRelative(0.3f, -0.082f, 0.529f, -0.335f)
                lineToRelative(0.016f, -0.018f)
                curveToRelative(0.224f, -0.249f, 0.582f, -0.647f, 1.257f, -0.647f)
                moveToRelative(-6.685f, 1.317f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.891f, 0.562f)
                curveToRelative(-0.31f, -0.138f, -0.513f, -0.363f, -0.659f, -0.525f)
                lineToRelative(-0.017f, -0.019f)
                curveToRelative(-0.228f, -0.253f, -0.32f, -0.335f, -0.53f, -0.335f)
                reflectiveCurveToRelative(-0.302f, 0.082f, -0.53f, 0.335f)
                lineToRelative(-0.017f, 0.018f)
                curveToRelative(-0.223f, 0.25f, -0.581f, 0.647f, -1.255f, 0.647f)
                curveToRelative(-0.675f, 0.0f, -1.034f, -0.399f, -1.257f, -0.648f)
                lineToRelative(-0.016f, -0.017f)
                curveToRelative(-0.228f, -0.253f, -0.32f, -0.335f, -0.528f, -0.335f)
                curveToRelative(-0.207f, 0.0f, -0.298f, 0.08f, -0.526f, 0.334f)
                lineToRelative(-0.017f, 0.019f)
                curveTo(10.33f, 15.6f, 9.971f, 16.0f, 9.3f, 16.0f)
                curveToRelative(-0.674f, 0.0f, -1.032f, -0.399f, -1.255f, -0.647f)
                lineToRelative(-0.017f, -0.019f)
                close()
                moveTo(6.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                moveToRelative(12.0f, 0.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.0f, 4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(12.0f, 20.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
            }
        }
        .build()
        return _washingMachineSmall!!
    }

private var _washingMachineSmall: ImageVector? = null
