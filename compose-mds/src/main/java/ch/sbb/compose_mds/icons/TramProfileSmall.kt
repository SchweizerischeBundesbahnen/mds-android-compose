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

public val SBBIcons.TramProfileSmall: ImageVector
    get() {
        if (_tramProfileSmall != null) {
            return _tramProfileSmall!!
        }
        _tramProfileSmall = Builder(name = "TramProfileSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 4.0f)
                lineTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(6.293f)
                lineToRelative(3.0f, 3.0f)
                lineTo(2.0f, 7.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.806f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.32f, 0.79f)
                lineToRelative(2.694f, 5.003f)
                curveToRelative(0.118f, 0.218f, 0.18f, 0.463f, 0.18f, 0.71f)
                lineTo(19.0f, 18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.5f, 0.5f)
                lineTo(2.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.05f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.45f, 1.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(0.222f, -0.296f, 0.376f, -0.638f, 0.45f, -1.0f)
                horizontalLineToRelative(4.55f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-3.996f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -0.299f, -1.185f)
                lineToRelative(-2.694f, -5.005f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.806f, 7.0f)
                horizontalLineToRelative(-2.099f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(9.5f, 21.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.45f, -1.0f)
                horizontalLineToRelative(1.1f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.45f, 1.0f)
                moveToRelative(0.586f, -1.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 2.828f, 0.0f)
                close()
                moveTo(4.086f, 20.0f)
                horizontalLineToRelative(2.828f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.828f, 0.0f)
                moveTo(5.0f, 9.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(12.0f, 15.0f)
                lineTo(12.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(14.809f, 9.0f)
                lineTo(14.947f, 9.276f)
                lineTo(18.0f, 15.382f)
                lineTo(18.0f, 17.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(14.0f, 16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.382f)
                lineTo(14.191f, 10.0f)
                lineTo(14.0f, 10.0f)
                close()
            }
        }
        .build()
        return _tramProfileSmall!!
    }

private var _tramProfileSmall: ImageVector? = null
