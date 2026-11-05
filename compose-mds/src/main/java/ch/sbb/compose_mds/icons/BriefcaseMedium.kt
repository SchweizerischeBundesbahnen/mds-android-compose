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

public val SBBIcons.BriefcaseMedium: ImageVector
    get() {
        if (_briefcaseMedium != null) {
            return _briefcaseMedium!!
        }
        _briefcaseMedium = Builder(
            name = "BriefcaseMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(13.25f, 9.044f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.805f, -1.794f)
                horizontalLineToRelative(4.39f)
                curveToRelative(0.999f, 0.0f, 1.805f, 0.806f, 1.805f, 1.793f)
                verticalLineToRelative(0.206f)
                horizontalLineToRelative(-8.0f)
                close()
                moveTo(12.25f, 9.249f)
                verticalLineToRelative(-0.206f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.805f, -2.793f)
                horizontalLineToRelative(4.39f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.805f, 2.794f)
                verticalLineToRelative(0.205f)
                horizontalLineToRelative(6.206f)
                arcToRelative(2.794f, 2.794f, 0.0f, false, true, 2.793f, 2.795f)
                verticalLineToRelative(16.037f)
                arcToRelative(2.793f, 2.793f, 0.0f, false, true, -2.793f, 2.793f)
                lineTo(6.044f, 30.874f)
                arcToRelative(2.795f, 2.795f, 0.0f, false, true, -2.795f, -2.793f)
                lineTo(3.249f, 12.044f)
                arcTo(2.795f, 2.795f, 0.0f, false, true, 6.044f, 9.25f)
                close()
                moveTo(4.249f, 12.044f)
                curveToRelative(0.0f, -0.991f, 0.804f, -1.795f, 1.795f, -1.795f)
                horizontalLineToRelative(22.412f)
                curveToRelative(0.99f, 0.0f, 1.793f, 0.803f, 1.793f, 1.795f)
                verticalLineToRelative(4.706f)
                horizontalLineToRelative(-9.5f)
                lineTo(20.749f, 15.4f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.648f, -1.65f)
                horizontalLineToRelative(-3.702f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.65f, 1.65f)
                verticalLineToRelative(1.35f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(13.749f, 17.75f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(10.33f)
                curveToRelative(0.0f, 0.99f, 0.803f, 1.794f, 1.795f, 1.794f)
                horizontalLineToRelative(22.412f)
                curveToRelative(0.99f, 0.0f, 1.793f, -0.803f, 1.793f, -1.793f)
                lineTo(30.249f, 17.75f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(1.35f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, -1.648f, 1.65f)
                horizontalLineToRelative(-3.702f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, -1.65f, -1.65f)
                close()
                moveTo(19.749f, 17.75f)
                verticalLineToRelative(1.35f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, -0.648f, 0.65f)
                horizontalLineToRelative(-3.702f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, -0.65f, -0.65f)
                verticalLineToRelative(-1.35f)
                close()
                moveTo(19.749f, 16.75f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.749f, 15.4f)
                curveToRelative(0.0f, -0.36f, 0.292f, -0.65f, 0.65f, -0.65f)
                lineTo(19.1f, 14.75f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, 0.649f, 0.65f)
                close()
            }
        }
            .build()
        return _briefcaseMedium!!
    }

private var _briefcaseMedium: ImageVector? = null
