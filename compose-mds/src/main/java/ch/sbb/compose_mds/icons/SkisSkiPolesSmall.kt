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

public val SBBIcons.SkisSkiPolesSmall: ImageVector
    get() {
        if (_skisSkiPolesSmall != null) {
            return _skisSkiPolesSmall!!
        }
        _skisSkiPolesSmall = Builder(name = "SkisSkiPolesSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.267f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 9.0f)
                curveToRelative(-0.364f, 0.0f, -0.706f, 0.097f, -1.0f, 0.267f)
                lineTo(3.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveToRelative(0.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 15.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveTo(2.0f, 22.0f)
                lineTo(2.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                verticalLineToRelative(18.0f)
                close()
                moveTo(3.0f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(9.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(5.267f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 9.0f)
                curveToRelative(-0.364f, 0.0f, -0.706f, 0.097f, -1.0f, 0.267f)
                lineTo(8.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                moveToRelative(-1.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 15.0f)
                close()
                moveTo(11.0f, 11.0f)
                lineTo(11.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(8.0f, 21.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(21.469f, 21.827f)
                lineTo(20.531f, 22.173f)
                lineTo(20.152f, 21.143f)
                lineTo(19.158f, 21.475f)
                lineTo(18.842f, 20.525f)
                lineTo(19.806f, 20.204f)
                lineTo(17.5f, 13.945f)
                lineTo(15.194f, 20.204f)
                lineTo(16.158f, 20.525f)
                lineTo(15.842f, 21.475f)
                lineTo(14.848f, 21.143f)
                lineTo(14.468f, 22.173f)
                lineTo(13.531f, 21.827f)
                lineTo(13.9f, 20.827f)
                lineTo(12.842f, 20.475f)
                lineTo(13.158f, 19.525f)
                lineTo(14.246f, 19.888f)
                lineTo(16.968f, 12.5f)
                lineTo(15.448f, 8.378f)
                lineTo(14.684f, 8.633f)
                lineTo(13.526f, 5.158f)
                lineTo(13.367f, 4.685f)
                lineTo(13.842f, 4.526f)
                lineTo(14.009f, 4.47f)
                lineTo(13.531f, 3.173f)
                lineTo(14.469f, 2.827f)
                lineTo(17.5f, 11.055f)
                lineTo(20.531f, 2.827f)
                lineTo(21.469f, 3.173f)
                lineTo(20.991f, 4.47f)
                lineTo(21.158f, 4.526f)
                lineTo(21.633f, 4.685f)
                lineTo(21.474f, 5.158f)
                lineTo(20.316f, 8.633f)
                lineTo(19.551f, 8.378f)
                lineTo(18.032f, 12.5f)
                lineTo(20.754f, 19.888f)
                lineTo(21.842f, 19.525f)
                lineTo(22.158f, 20.475f)
                lineTo(21.1f, 20.827f)
                close()
            }
        }
        .build()
        return _skisSkiPolesSmall!!
    }

private var _skisSkiPolesSmall: ImageVector? = null
