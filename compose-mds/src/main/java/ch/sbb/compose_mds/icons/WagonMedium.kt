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

public val SBBIcons.WagonMedium: ImageVector
    get() {
        if (_wagonMedium != null) {
            return _wagonMedium!!
        }
        _wagonMedium = Builder(name = "WagonMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(30.25f, 17.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineToRelative(-22.505f, 0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineToRelative(0.005f, 8.498f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(17.001f)
                verticalLineToRelative(-8.5f)
                moveToRelative(-18.0f, 8.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(24.263f, 26.75f)
                lineTo(11.737f, 26.75f)
                quadToRelative(0.012f, 0.122f, 0.013f, 0.25f)
                arcToRelative(2.749f, 2.749f, 0.0f, true, true, -5.488f, -0.25f)
                lineTo(4.75f, 26.75f)
                verticalLineToRelative(-1.5f)
                lineTo(3.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.75f)
                lineToRelative(-0.005f, -6.998f)
                lineToRelative(0.011f, -0.205f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.99f, -1.795f)
                lineToRelative(22.504f, -0.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(0.001f)
                verticalLineToRelative(7.0f)
                lineTo(33.0f, 24.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.749f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.514f)
                quadToRelative(0.012f, 0.122f, 0.013f, 0.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.488f, -0.25f)
                moveToRelative(1.009f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.021f, 0.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                quadToRelative(0.0f, -0.126f, -0.021f, -0.25f)
                close()
                moveTo(7.271f, 26.75f)
                horizontalLineToRelative(3.458f)
                quadToRelative(0.02f, 0.124f, 0.02f, 0.25f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, true, -3.478f, -0.25f)
                moveToRelative(20.981f, -3.0f)
                verticalLineToRelative(-4.0f)
                lineTo(15.25f, 19.75f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(27.252f, 22.75f)
                lineTo(16.25f, 22.75f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.002f)
                close()
            }
        }
        .build()
        return _wagonMedium!!
    }

private var _wagonMedium: ImageVector? = null
