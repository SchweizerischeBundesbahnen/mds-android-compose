package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.OnboardingLarge: ImageVector
    get() {
        if (_onboardingLarge != null) {
            return _onboardingLarge!!
        }
        _onboardingLarge = Builder(name = "OnboardingLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.5f, 4.999f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(39.0f)
                lineTo(12.0f, 43.999f)
                lineTo(12.0f, 4.997f)
                horizontalLineToRelative(0.5f)
                close()
                moveTo(13.0f, 42.999f)
                horizontalLineToRelative(23.0f)
                verticalLineToRelative(-7.0f)
                lineTo(13.0f, 35.999f)
                close()
                moveTo(28.0f, 39.999f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(7.0f)
                close()
                moveTo(13.0f, 34.999f)
                horizontalLineToRelative(23.0f)
                lineTo(36.0f, 5.999f)
                lineToRelative(-23.0f, -0.001f)
                close()
                moveTo(20.854f, 17.853f)
                lineTo(17.207f, 21.5f)
                lineToRelative(3.646f, 3.646f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-4.353f, -4.353f)
                lineToRelative(4.354f, -4.354f)
                close()
                moveTo(33.207f, 21.5f)
                lineToRelative(-4.353f, 4.353f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(3.646f, -3.646f)
                lineToRelative(-3.646f, -3.647f)
                lineToRelative(0.707f, -0.707f)
                close()
            }
        }
        .build()
        return _onboardingLarge!!
    }

private var _onboardingLarge: ImageVector? = null
