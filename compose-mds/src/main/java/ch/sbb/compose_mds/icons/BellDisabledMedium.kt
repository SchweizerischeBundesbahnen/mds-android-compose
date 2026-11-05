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

public val SBBIcons.BellDisabledMedium: ImageVector
    get() {
        if (_bellDisabledMedium != null) {
            return _bellDisabledMedium!!
        }
        _bellDisabledMedium = Builder(
            name = "BellDisabledMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
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
                moveTo(15.75f, 4.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(1.853f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.813f, 1.422f)
                lineToRelative(0.626f, 0.78f)
                curveTo(14.205f, 7.89f, 15.796f, 7.25f, 18.0f, 7.25f)
                curveToRelative(3.137f, 0.0f, 5.05f, 1.296f, 6.194f, 2.886f)
                curveTo(25.357f, 11.75f, 25.75f, 13.705f, 25.75f, 15.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(1.0f)
                lineTo(26.75f, 15.0f)
                curveToRelative(0.0f, -1.455f, -0.432f, -3.626f, -1.744f, -5.448f)
                curveToRelative(-0.938f, -1.302f, -2.313f, -2.409f, -4.256f, -2.949f)
                lineTo(20.75f, 4.75f)
                horizontalLineToRelative(-5.0f)
                moveToRelative(4.0f, 1.635f)
                lineTo(19.75f, 5.75f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.635f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 18.0f, 6.25f)
                quadToRelative(0.934f, 0.002f, 1.75f, 0.135f)
                moveToRelative(-9.183f, 6.39f)
                arcTo(8.6f, 8.6f, 0.0f, false, false, 10.25f, 15.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.538f, -0.602f, 2.583f, -1.412f, 3.25f)
                horizontalLineToRelative(16.205f)
                close()
                moveTo(9.767f, 11.974f)
                arcTo(9.8f, 9.8f, 0.0f, false, false, 9.25f, 15.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.337f, -0.546f, 2.124f, -1.198f, 2.594f)
                curveToRelative(-0.678f, 0.488f, -1.507f, 0.656f, -2.052f, 0.656f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.78f)
                curveToRelative(0.12f, 0.946f, 0.58f, 1.679f, 1.275f, 2.181f)
                curveToRelative(0.792f, 0.573f, 1.844f, 0.819f, 2.945f, 0.819f)
                reflectiveCurveToRelative(2.154f, -0.246f, 2.945f, -0.819f)
                curveToRelative(0.695f, -0.502f, 1.155f, -1.235f, 1.274f, -2.181f)
                horizontalLineToRelative(3.824f)
                lineToRelative(2.104f, 2.104f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(-22.5f, -22.5f)
                lineToRelative(-0.708f, 0.707f)
                close()
                moveTo(21.163f, 28.25f)
                horizontalLineToRelative(0.046f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, -0.85f, 1.371f)
                curveToRelative(-0.566f, 0.41f, -1.388f, 0.629f, -2.359f, 0.629f)
                curveToRelative(-0.97f, 0.0f, -1.793f, -0.22f, -2.359f, -0.629f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, true, -0.85f, -1.371f)
                horizontalLineToRelative(6.372f)
            }
        }
            .build()
        return _bellDisabledMedium!!
    }

private var _bellDisabledMedium: ImageVector? = null
