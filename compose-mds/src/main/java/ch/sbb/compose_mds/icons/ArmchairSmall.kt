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

public val SBBIcons.ArmchairSmall: ImageVector
    get() {
        if (_armchairSmall != null) {
            return _armchairSmall!!
        }
        _armchairSmall = Builder(
            name = "ArmchairSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
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
                pathFillType = NonZero,
            ) {
                moveTo(16.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.0f, 4.5f)
                verticalLineToRelative(4.543f)
                arcToRelative(2.498f, 2.498f, 0.0f, false, true, 1.03f, 4.454f)
                verticalLineToRelative(3.033f)
                curveToRelative(0.0f, 0.663f, -0.263f, 1.3f, -0.732f, 1.768f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.298f, 0.25f)
                verticalLineToRelative(2.017f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, -1.43f, 1.434f)
                lineTo(17.57f, 22.0f)
                horizontalLineToRelative(-0.14f)
                verticalLineToRelative(-0.001f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, -1.014f, -0.415f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, -0.416f, -1.02f)
                lineTo(16.0f, 19.03f)
                lineTo(8.0f, 19.03f)
                verticalLineToRelative(1.534f)
                arcTo(1.42f, 1.42f, 0.0f, false, true, 6.57f, 22.0f)
                lineTo(6.57f, 22.0f)
                horizontalLineToRelative(-0.14f)
                verticalLineToRelative(-0.001f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, true, -1.014f, -0.415f)
                arcTo(1.42f, 1.42f, 0.0f, false, true, 5.0f, 20.564f)
                verticalLineToRelative(-2.039f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -0.268f, -0.227f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 16.53f)
                verticalLineToRelative(-3.033f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 5.0f, 9.05f)
                lineTo(5.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 7.5f, 2.0f)
                close()
                moveTo(6.0f, 20.576f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.262f, 0.393f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.163f, 0.031f)
                horizontalLineToRelative(0.15f)
                arcTo(0.42f, 0.42f, 0.0f, false, false, 7.0f, 20.576f)
                lineTo(7.0f, 19.03f)
                horizontalLineToRelative(-0.5f)
                quadToRelative(-0.255f, 0.0f, -0.5f, -0.052f)
                close()
                moveTo(18.0f, 18.984f)
                quadToRelative(-0.23f, 0.046f, -0.47f, 0.046f)
                lineTo(17.0f, 19.03f)
                verticalLineToRelative(1.546f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.123f, 0.301f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.302f, 0.123f)
                horizontalLineToRelative(0.15f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.425f, -0.424f)
                close()
                moveTo(18.53f, 9.998f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, 1.502f)
                lineTo(17.0f, 11.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.0f, 14.5f)
                verticalLineToRelative(-3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.499f, -1.502f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.751f, 2.799f)
                lineToRelative(0.25f, 0.144f)
                verticalLineToRelative(3.59f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(11.03f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-3.59f)
                lineToRelative(0.25f, -0.144f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.75f, -2.799f)
                moveTo(8.0f, 14.0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                lineTo(16.0f, 14.0f)
                close()
                moveTo(7.5f, 3.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.0f, 4.5f)
                verticalLineToRelative(4.549f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.0f, 11.5f)
                lineTo(8.0f, 13.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(0.03f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.0f, 9.056f)
                lineTo(18.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 3.0f)
                close()
            }
        }
            .build()
        return _armchairSmall!!
    }

private var _armchairSmall: ImageVector? = null
