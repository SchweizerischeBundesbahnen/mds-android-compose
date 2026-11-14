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

public val SBBIcons.FingerprintMedium: ImageVector
    get() {
        if (_fingerprintMedium != null) {
            return _fingerprintMedium!!
        }
        _fingerprintMedium = Builder(name = "FingerprintMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.689f, 6.662f)
                arcToRelative(24.3f, 24.3f, 0.0f, false, false, -12.44f, -3.413f)
                curveToRelative(-0.923f, 0.0f, -1.83f, 0.058f, -2.72f, 0.16f)
                lineToRelative(0.113f, 0.993f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, true, 2.607f, -0.153f)
                curveToRelative(4.36f, 0.0f, 8.432f, 1.201f, 11.93f, 3.274f)
                close()
                moveTo(14.249f, 6.249f)
                curveToRelative(6.312f, 0.0f, 11.97f, 2.738f, 15.902f, 7.067f)
                lineToRelative(-0.74f, 0.672f)
                curveTo(25.66f, 9.857f, 20.265f, 7.249f, 14.25f, 7.249f)
                curveToRelative(-2.715f, 0.0f, -5.302f, 0.54f, -7.675f, 1.5f)
                lineTo(6.2f, 7.822f)
                arcToRelative(21.4f, 21.4f, 0.0f, false, true, 8.05f, -1.573f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(6.865f, 0.0f, 12.842f, 3.749f, 16.034f, 9.298f)
                lineToRelative(-0.867f, 0.498f)
                curveToRelative(-3.022f, -5.252f, -8.676f, -8.795f, -15.167f, -8.795f)
                arcToRelative(17.4f, 17.4f, 0.0f, false, false, -9.028f, 2.53f)
                lineToRelative(-0.518f, -0.856f)
                arcTo(18.4f, 18.4f, 0.0f, false, true, 14.25f, 9.25f)
                moveToRelative(12.496f, 18.408f)
                curveToRelative(-0.051f, -6.86f, -5.623f, -12.407f, -12.495f, -12.407f)
                curveToRelative(-3.952f, 0.0f, -7.47f, 1.84f, -9.759f, 4.7f)
                lineToRelative(0.781f, 0.625f)
                arcToRelative(11.47f, 11.47f, 0.0f, false, true, 8.978f, -4.325f)
                curveToRelative(6.322f, 0.0f, 11.448f, 5.103f, 11.495f, 11.414f)
                close()
                moveTo(14.25f, 12.25f)
                curveToRelative(7.052f, 0.0f, 12.992f, 4.714f, 14.871f, 11.156f)
                lineToRelative(-0.96f, 0.28f)
                curveTo(26.403f, 17.659f, 20.844f, 13.25f, 14.25f, 13.25f)
                arcToRelative(14.43f, 14.43f, 0.0f, false, false, -9.419f, 3.49f)
                lineToRelative(-0.65f, -0.76f)
                arcToRelative(15.43f, 15.43f, 0.0f, false, true, 10.069f, -3.73f)
                moveToRelative(0.0f, 10.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.5f, 5.5f)
                verticalLineToRelative(4.044f)
                horizontalLineToRelative(1.0f)
                lineTo(20.75f, 27.75f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -6.5f, -6.5f)
                curveToRelative(-3.559f, 0.0f, -6.44f, 2.862f, -6.491f, 6.406f)
                lineToRelative(1.0f, 0.015f)
                arcToRelative(5.495f, 5.495f, 0.0f, false, true, 5.491f, -5.421f)
                moveToRelative(8.499f, 5.5f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, -8.5f, -8.5f)
                curveToRelative(-3.442f, 0.0f, -6.402f, 2.052f, -7.738f, 4.999f)
                lineToRelative(-0.91f, -0.413f)
                curveToRelative(1.491f, -3.29f, 4.797f, -5.585f, 8.648f, -5.585f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, true, 9.5f, 9.5f)
                verticalLineToRelative(2.644f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(14.25f, 25.25f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
                verticalLineToRelative(2.645f)
                horizontalLineToRelative(1.0f)
                lineTo(11.75f, 27.75f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, -2.5f)
                moveToRelative(0.5f, 1.75f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1.0f)
                lineTo(13.75f, 27.0f)
                close()
            }
        }
        .build()
        return _fingerprintMedium!!
    }

private var _fingerprintMedium: ImageVector? = null
