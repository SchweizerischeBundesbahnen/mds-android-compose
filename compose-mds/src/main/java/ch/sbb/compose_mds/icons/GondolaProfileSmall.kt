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

public val SBBIcons.GondolaProfileSmall: ImageVector
    get() {
        if (_gondolaProfileSmall != null) {
            return _gondolaProfileSmall!!
        }
        _gondolaProfileSmall = Builder(name = "GondolaProfileSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(9.0f, 6.422f)
                lineToRelative(13.144f, -3.943f)
                lineToRelative(-0.288f, -0.958f)
                lineToRelative(-20.0f, 6.0f)
                lineToRelative(0.288f, 0.958f)
                lineTo(8.0f, 6.722f)
                lineTo(8.0f, 10.0f)
                lineTo(5.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.0f, 11.5f)
                verticalLineToRelative(6.838f)
                curveToRelative(0.0f, 0.16f, 0.026f, 0.321f, 0.077f, 0.474f)
                lineToRelative(0.72f, 2.162f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 6.222f, 22.0f)
                horizontalLineToRelative(4.558f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.423f, -1.026f)
                lineToRelative(0.721f, -2.162f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.077f, -0.474f)
                lineTo(13.001f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                lineTo(9.0f, 10.0f)
                close()
                moveTo(6.0f, 12.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                moveToRelative(1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(5.0f, 11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(6.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(6.838f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.026f, 0.158f)
                lineToRelative(-0.72f, 2.162f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.475f, 0.342f)
                lineTo(6.221f, 21.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.475f, -0.342f)
                lineToRelative(-0.72f, -2.162f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.0f, 18.338f)
                close()
            }
        }
        .build()
        return _gondolaProfileSmall!!
    }

private var _gondolaProfileSmall: ImageVector? = null
