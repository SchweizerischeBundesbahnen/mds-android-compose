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
                moveToRelative(18.5f, 2.0f)
                lineToRelative(-12.0f, -0.001f)
                lineTo(6.0f, 1.999f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(13.0f)
                lineTo(19.0f, 2.0f)
                close()
                moveTo(18.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(18.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 2.999f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(14.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.854f, 8.854f)
                lineTo(9.207f, 10.5f)
                lineToRelative(1.646f, 1.647f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(7.794f, 10.5f)
                lineToRelative(2.353f, -2.353f)
                close()
                moveTo(14.854f, 12.854f)
                lineTo(17.207f, 10.5f)
                lineTo(14.853f, 8.146f)
                lineTo(14.146f, 8.853f)
                lineTo(15.793f, 10.5f)
                lineTo(14.147f, 12.146f)
                close()
            }
        }
        .build()
        return _onboardingSmall!!
    }

private var _onboardingSmall: ImageVector? = null
