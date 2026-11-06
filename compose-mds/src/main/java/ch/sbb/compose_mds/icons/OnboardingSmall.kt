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

public val SBBIcons.OnboardingSmall: ImageVector
    get() {
        if (_onboardingSmall != null) {
            return _onboardingSmall!!
        }
        _onboardingSmall = Builder(name = "OnboardingSmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 1.999f)
                lineTo(6.0f, 1.999f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(13.0f)
                lineTo(19.0f, 2.0f)
                lineTo(6.5f, 2.0f)
                moveToRelative(0.5f, 15.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(8.146f, 10.148f)
                lineTo(10.146f, 8.148f)
                lineTo(10.854f, 8.855f)
                lineTo(9.207f, 10.5f)
                lineToRelative(1.647f, 1.647f)
                lineToRelative(-0.708f, 0.707f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(-0.353f, -0.354f)
                close()
                moveTo(16.854f, 10.148f)
                lineTo(14.854f, 8.148f)
                lineTo(14.146f, 8.854f)
                lineTo(15.793f, 10.501f)
                lineTo(14.146f, 12.147f)
                lineTo(14.854f, 12.854f)
                lineTo(16.854f, 10.854f)
                lineTo(17.207f, 10.501f)
                close()
            }
        }
        .build()
        return _onboardingSmall!!
    }

private var _onboardingSmall: ImageVector? = null
