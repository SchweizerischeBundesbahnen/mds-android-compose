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

public val SBBIcons.UserHeadsetDisplayLarge: ImageVector
    get() {
        if (_userHeadsetDisplayLarge != null) {
            return _userHeadsetDisplayLarge!!
        }
        _userHeadsetDisplayLarge = Builder(name = "UserHeadsetDisplayLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(43.0f, 40.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(1.0f)
                lineTo(27.0f, 44.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(24.0f, 27.0f)
                horizontalLineToRelative(19.0f)
                close()
                moveTo(33.0f, 43.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(25.0f, 39.0f)
                horizontalLineToRelative(17.0f)
                lineTo(42.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                close()
                moveTo(8.046f, 13.0f)
                curveToRelative(2.443f, -10.784f, 16.781f, -10.405f, 18.728f, 0.0f)
                horizontalLineToRelative(0.726f)
                curveToRelative(0.455f, 0.0f, 0.85f, 0.147f, 1.128f, 0.451f)
                curveToRelative(0.27f, 0.296f, 0.372f, 0.68f, 0.372f, 1.049f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.432f, -0.143f, 0.822f, -0.435f, 1.102f)
                curveToRelative(-0.288f, 0.276f, -0.671f, 0.398f, -1.065f, 0.398f)
                horizontalLineToRelative(-4.242f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -1.13f, 1.788f)
                arcToRelative(15.2f, 15.2f, 0.0f, false, true, 3.358f, 2.344f)
                lineToRelative(-0.338f, 0.368f)
                lineToRelative(-0.337f, 0.37f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -3.43f, -2.334f)
                curveTo(20.31f, 23.452f, 18.977f, 24.0f, 17.5f, 24.0f)
                curveToRelative(-1.48f, 0.0f, -2.814f, -0.549f, -3.885f, -1.467f)
                curveTo(8.44f, 24.96f, 5.17f, 30.553f, 5.008f, 37.0f)
                lineTo(22.0f, 37.0f)
                verticalLineToRelative(1.0f)
                lineTo(4.0f, 38.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -6.836f, 3.337f, -12.953f, 8.865f, -15.716f)
                curveTo(11.701f, 20.42f, 11.0f, 18.542f, 11.0f, 16.5f)
                curveToRelative(0.0f, -4.082f, 2.803f, -7.5f, 6.5f, -7.5f)
                reflectiveCurveToRelative(6.5f, 3.418f, 6.5f, 7.5f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, -0.367f, 2.5f)
                lineTo(24.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.756f)
                curveTo(23.89f, 3.956f, 11.412f, 3.521f, 9.07f, 13.0f)
                lineTo(11.0f, 13.0f)
                verticalLineToRelative(7.0f)
                lineTo(7.5f, 20.0f)
                curveToRelative(-0.391f, 0.0f, -0.76f, -0.177f, -1.027f, -0.432f)
                arcTo(1.49f, 1.49f, 0.0f, false, true, 6.0f, 18.5f)
                verticalLineToRelative(-3.988f)
                curveToRelative(0.0f, -0.43f, 0.198f, -0.806f, 0.465f, -1.068f)
                curveTo(6.729f, 13.185f, 7.1f, 13.0f, 7.5f, 13.0f)
                close()
                moveTo(36.0f, 36.0f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(40.0f, 32.0f)
                lineTo(27.0f, 32.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.0f)
                close()
                moveTo(17.5f, 10.0f)
                curveToRelative(-3.003f, 0.0f, -5.5f, 2.818f, -5.5f, 6.5f)
                reflectiveCurveToRelative(2.497f, 6.5f, 5.5f, 6.5f)
                curveToRelative(1.939f, 0.0f, 3.666f, -1.176f, 4.648f, -3.0f)
                lineTo(17.0f, 20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.586f)
                arcTo(7.6f, 7.6f, 0.0f, false, false, 23.0f, 16.5f)
                curveToRelative(0.0f, -3.682f, -2.498f, -6.5f, -5.5f, -6.5f)
                moveToRelative(-10.0f, 4.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.335f, 0.158f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.165f, 0.354f)
                lineTo(7.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.164f, 0.346f)
                arcTo(0.52f, 0.52f, 0.0f, false, false, 7.5f, 19.0f)
                lineTo(10.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(25.0f, 19.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.191f, 0.0f, 0.308f, -0.057f, 0.373f, -0.12f)
                curveToRelative(0.062f, -0.06f, 0.127f, -0.17f, 0.127f, -0.38f)
                verticalLineToRelative(-4.0f)
                curveToRelative(0.0f, -0.195f, -0.053f, -0.312f, -0.11f, -0.375f)
                curveToRelative(-0.05f, -0.055f, -0.155f, -0.125f, -0.39f, -0.125f)
                lineTo(25.0f, 14.0f)
                close()
            }
        }
        .build()
        return _userHeadsetDisplayLarge!!
    }

private var _userHeadsetDisplayLarge: ImageVector? = null
