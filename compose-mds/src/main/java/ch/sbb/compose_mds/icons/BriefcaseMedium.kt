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
        _briefcaseMedium = Builder(name = "BriefcaseMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.444f, 7.25f)
                curveToRelative(1.0f, 0.0f, 1.806f, 0.806f, 1.806f, 1.794f)
                verticalLineToRelative(0.205f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-0.205f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.805f, -1.794f)
                close()
                moveTo(12.25f, 9.25f)
                verticalLineToRelative(-0.206f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.805f, -2.794f)
                horizontalLineToRelative(4.39f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 2.805f, 2.794f)
                verticalLineToRelative(0.205f)
                horizontalLineToRelative(6.205f)
                arcToRelative(2.794f, 2.794f, 0.0f, false, true, 2.794f, 2.795f)
                lineTo(31.249f, 28.08f)
                arcToRelative(2.794f, 2.794f, 0.0f, false, true, -2.794f, 2.794f)
                lineTo(6.044f, 30.874f)
                arcToRelative(2.795f, 2.795f, 0.0f, false, true, -2.795f, -2.794f)
                lineTo(3.249f, 12.044f)
                arcTo(2.795f, 2.795f, 0.0f, false, true, 6.044f, 9.25f)
                close()
                moveTo(28.455f, 10.25f)
                curveToRelative(0.991f, 0.0f, 1.794f, 0.802f, 1.794f, 1.794f)
                verticalLineToRelative(4.706f)
                horizontalLineToRelative(-9.5f)
                lineTo(20.749f, 15.4f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.649f, -1.65f)
                horizontalLineToRelative(-3.7f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, false, -1.65f, 1.65f)
                verticalLineToRelative(1.35f)
                lineTo(4.249f, 16.75f)
                verticalLineToRelative(-4.706f)
                curveToRelative(0.0f, -0.991f, 0.804f, -1.795f, 1.795f, -1.795f)
                close()
                moveTo(13.75f, 17.75f)
                lineTo(4.249f, 17.75f)
                verticalLineToRelative(10.33f)
                curveToRelative(0.0f, 0.99f, 0.803f, 1.794f, 1.795f, 1.794f)
                horizontalLineToRelative(22.411f)
                curveToRelative(0.991f, 0.0f, 1.794f, -0.804f, 1.794f, -1.794f)
                lineTo(30.249f, 17.75f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(1.35f)
                curveToRelative(0.0f, 0.91f, -0.738f, 1.65f, -1.649f, 1.65f)
                horizontalLineToRelative(-3.7f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, -1.65f, -1.65f)
                close()
                moveTo(19.75f, 17.75f)
                verticalLineToRelative(1.35f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, -0.65f, 0.65f)
                horizontalLineToRelative(-3.7f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, true, -0.65f, -0.65f)
                verticalLineToRelative(-1.35f)
                close()
                moveTo(19.75f, 16.75f)
                horizontalLineToRelative(-5.0f)
                lineTo(14.75f, 15.4f)
                curveToRelative(0.0f, -0.36f, 0.291f, -0.65f, 0.65f, -0.65f)
                horizontalLineToRelative(3.7f)
                curveToRelative(0.358f, 0.0f, 0.65f, 0.29f, 0.65f, 0.65f)
                close()
            }
        }
        .build()
        return _briefcaseMedium!!
    }

private var _briefcaseMedium: ImageVector? = null
