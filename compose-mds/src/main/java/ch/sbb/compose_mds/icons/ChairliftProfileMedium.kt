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

public val SBBIcons.ChairliftProfileMedium: ImageVector
    get() {
        if (_chairliftProfileMedium != null) {
            return _chairliftProfileMedium!!
        }
        _chairliftProfileMedium = Builder(name = "ChairliftProfileMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(33.248f, 4.226f)
                lineTo(11.9f, 8.496f)
                verticalLineToRelative(1.5f)
                lineToRelative(-0.004f, 0.174f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.596f, 1.825f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-0.097f, -0.49f)
                lineToRelative(-0.019f, -0.089f)
                lineToRelative(0.116f, 0.58f)
                lineToRelative(-5.1f, 1.02f)
                verticalLineToRelative(-0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.798f, 1.0f)
                lineToRelative(-0.524f, 0.01f)
                horizontalLineTo(3.9f)
                lineToRelative(0.5f, -0.01f)
                verticalLineToRelative(13.72f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-7.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.4f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(5.783f)
                lineToRelative(0.146f, 0.244f)
                lineToRelative(2.25f, 3.75f)
                lineToRelative(-0.857f, 0.513f)
                lineToRelative(-2.105f, -3.507f)
                horizontalLineTo(5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-13.71f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.6f, -1.99f)
                horizontalLineToRelative(0.002f)
                lineToRelative(5.098f, -1.02f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, -1.0f)
                verticalLineToRelative(-1.32f)
                lineToRelative(-7.652f, 1.53f)
                lineToRelative(-0.195f, -0.98f)
                lineToRelative(30.0f, -6.0f)
                close()
                moveTo(8.4f, 16.236f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
            }
        }
        .build()
        return _chairliftProfileMedium!!
    }

private var _chairliftProfileMedium: ImageVector? = null
