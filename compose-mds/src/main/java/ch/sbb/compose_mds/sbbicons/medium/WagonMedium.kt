package ch.sbb.compose_mds.sbbicons.medium

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.MediumGroup

public val MediumGroup.WagonMedium: ImageVector
    get() {
        if (_wagonMedium != null) {
            return _wagonMedium!!
        }
        _wagonMedium = Builder(name = "WagonMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(6.745f, 15.252f)
                lineToRelative(22.505f, -0.002f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(0.002f)
                verticalLineToRelative(7.0f)
                lineTo(33.0f, 24.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.748f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.515f)
                quadToRelative(0.012f, 0.122f, 0.013f, 0.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.488f, -0.25f)
                lineTo(11.737f, 26.75f)
                quadToRelative(0.012f, 0.122f, 0.013f, 0.25f)
                arcToRelative(2.749f, 2.749f, 0.0f, true, true, -5.488f, -0.25f)
                lineTo(4.75f, 26.75f)
                verticalLineToRelative(-1.5f)
                lineTo(3.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.749f)
                lineToRelative(-0.004f, -6.998f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                moveTo(25.271f, 26.75f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.021f, 0.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, 3.5f, 0.0f)
                quadToRelative(0.0f, -0.126f, -0.021f, -0.25f)
                close()
                moveTo(7.271f, 26.75f)
                horizontalLineToRelative(3.458f)
                quadToRelative(0.02f, 0.124f, 0.02f, 0.25f)
                arcToRelative(1.749f, 1.749f, 0.0f, true, true, -3.478f, -0.25f)
                moveToRelative(21.979f, -10.5f)
                lineToRelative(-22.504f, 0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                lineToRelative(0.004f, 8.498f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(17.002f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(-0.002f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                moveToRelative(-17.0f, 9.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(3.5f)
                close()
                moveTo(15.75f, 19.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(13.002f)
                verticalLineToRelative(-4.0f)
                lineTo(15.75f, 19.75f)
                moveToRelative(0.5f, 3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(11.002f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _wagonMedium!!
    }

private var _wagonMedium: ImageVector? = null
