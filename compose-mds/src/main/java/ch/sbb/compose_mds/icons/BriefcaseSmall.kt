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

public val SBBIcons.BriefcaseSmall: ImageVector
    get() {
        if (_briefcaseSmall != null) {
            return _briefcaseSmall!!
        }
        _briefcaseSmall = Builder(name = "BriefcaseSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(3.97f)
                curveTo(20.092f, 6.0f, 21.0f, 6.91f, 21.0f, 8.03f)
                verticalLineToRelative(10.69f)
                arcToRelative(2.03f, 2.03f, 0.0f, false, true, -2.03f, 2.03f)
                lineTo(4.03f, 20.75f)
                arcTo(2.03f, 2.03f, 0.0f, false, true, 2.0f, 18.72f)
                lineTo(2.0f, 8.03f)
                curveTo(2.0f, 6.909f, 2.909f, 6.0f, 4.03f, 6.0f)
                lineTo(8.0f, 6.0f)
                curveToRelative(0.016f, -1.11f, 0.924f, -2.0f, 2.037f, -2.0f)
                horizontalLineToRelative(2.926f)
                curveToRelative(1.113f, 0.0f, 2.02f, 0.89f, 2.037f, 2.0f)
                moveToRelative(-1.0f, 0.0f)
                curveToRelative(-0.016f, -0.552f, -0.472f, -1.0f, -1.037f, -1.0f)
                horizontalLineToRelative(-2.926f)
                curveTo(9.472f, 5.0f, 9.017f, 5.448f, 9.0f, 6.0f)
                close()
                moveTo(18.97f, 7.0f)
                curveTo(19.54f, 7.0f, 20.0f, 7.46f, 20.0f, 8.03f)
                lineTo(20.0f, 11.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-0.734f)
                curveTo(14.0f, 9.566f, 13.434f, 9.0f, 12.734f, 9.0f)
                horizontalLineToRelative(-2.468f)
                curveTo(9.566f, 9.0f, 9.0f, 9.567f, 9.0f, 10.266f)
                lineTo(9.0f, 11.0f)
                lineTo(3.0f, 11.0f)
                lineTo(3.0f, 8.03f)
                curveTo(3.0f, 7.46f, 3.46f, 7.0f, 4.03f, 7.0f)
                close()
                moveTo(9.0f, 12.0f)
                lineTo(3.0f, 12.0f)
                verticalLineToRelative(6.72f)
                curveToRelative(0.0f, 0.568f, 0.46f, 1.03f, 1.03f, 1.03f)
                horizontalLineToRelative(14.94f)
                arcTo(1.03f, 1.03f, 0.0f, false, false, 20.0f, 18.72f)
                lineTo(20.0f, 12.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(0.734f)
                curveToRelative(0.0f, 0.699f, -0.567f, 1.265f, -1.266f, 1.265f)
                horizontalLineToRelative(-2.468f)
                arcTo(1.266f, 1.266f, 0.0f, false, true, 9.0f, 12.734f)
                close()
                moveTo(13.0f, 12.0f)
                verticalLineToRelative(0.734f)
                curveToRelative(0.0f, 0.146f, -0.12f, 0.265f, -0.266f, 0.265f)
                horizontalLineToRelative(-2.468f)
                arcToRelative(0.266f, 0.266f, 0.0f, false, true, -0.266f, -0.265f)
                lineTo(10.0f, 12.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.734f)
                curveToRelative(0.0f, -0.148f, 0.12f, -0.266f, 0.266f, -0.266f)
                horizontalLineToRelative(2.468f)
                curveToRelative(0.146f, 0.0f, 0.266f, 0.118f, 0.266f, 0.266f)
                close()
            }
        }
        .build()
        return _briefcaseSmall!!
    }

private var _briefcaseSmall: ImageVector? = null
