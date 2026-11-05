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

public val SBBIcons.BellMedium: ImageVector
    get() {
        if (_bellMedium != null) {
            return _bellMedium!!
        }
        _bellMedium = Builder(
            name = "BellMedium",
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
                moveTo(15.25f, 4.75f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1.853f)
                curveToRelative(1.943f, 0.54f, 3.318f, 1.647f, 4.256f, 2.949f)
                curveToRelative(1.312f, 1.822f, 1.744f, 3.993f, 1.744f, 5.448f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.545f, 0.168f, 1.374f, 0.656f, 2.052f)
                curveToRelative(0.47f, 0.652f, 1.257f, 1.198f, 2.594f, 1.198f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.78f)
                curveToRelative(-0.12f, 0.946f, -0.58f, 1.679f, -1.275f, 2.181f)
                curveToRelative(-0.792f, 0.573f, -1.844f, 0.819f, -2.945f, 0.819f)
                reflectiveCurveToRelative(-2.153f, -0.246f, -2.945f, -0.819f)
                curveToRelative(-0.695f, -0.502f, -1.155f, -1.235f, -1.274f, -2.181f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.545f, 0.0f, 1.374f, -0.168f, 2.052f, -0.656f)
                curveToRelative(0.652f, -0.47f, 1.198f, -1.257f, 1.198f, -2.594f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.455f, 0.432f, -3.626f, 1.744f, -5.448f)
                curveToRelative(0.938f, -1.302f, 2.313f, -2.409f, 4.256f, -2.949f)
                verticalLineTo(4.75f)
                moveToRelative(1.0f, 1.635f)
                arcTo(11.0f, 11.0f, 0.0f, false, true, 18.0f, 6.25f)
                quadToRelative(0.934f, 0.002f, 1.75f, 0.135f)
                verticalLineTo(5.75f)
                horizontalLineToRelative(-3.5f)
                close()
                moveTo(14.791f, 28.25f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, 0.85f, 1.371f)
                curveToRelative(0.566f, 0.41f, 1.388f, 0.629f, 2.359f, 0.629f)
                curveToRelative(0.97f, 0.0f, 1.793f, -0.22f, 2.359f, -0.629f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, 0.85f, -1.371f)
                horizontalLineTo(14.79f)
                moveTo(10.25f, 15.0f)
                curveToRelative(0.0f, -1.295f, 0.393f, -3.249f, 1.556f, -4.864f)
                curveTo(12.95f, 8.546f, 14.863f, 7.25f, 18.0f, 7.25f)
                reflectiveCurveToRelative(5.05f, 1.296f, 6.194f, 2.886f)
                curveTo(25.357f, 11.75f, 25.75f, 13.705f, 25.75f, 15.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.705f, 0.207f, 1.751f, 0.844f, 2.636f)
                quadToRelative(0.236f, 0.33f, 0.55f, 0.614f)
                horizontalLineTo(8.838f)
                curveToRelative(0.81f, -0.667f, 1.412f, -1.712f, 1.412f, -3.25f)
                verticalLineToRelative(-9.0f)
            }
        }
            .build()
        return _bellMedium!!
    }

private var _bellMedium: ImageVector? = null
