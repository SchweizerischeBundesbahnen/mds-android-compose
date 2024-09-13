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

public val MediumGroup.OnboardingMedium: ImageVector
    get() {
        if (_onboardingMedium != null) {
            return _onboardingMedium!!
        }
        _onboardingMedium = Builder(name = "OnboardingMedium", defaultWidth = 36.0.dp, defaultHeight
                = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.75f, 3.248f)
                horizontalLineToRelative(-0.5f)
                lineTo(9.25f, 32.75f)
                horizontalLineToRelative(19.0f)
                lineTo(28.25f, 3.25f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(10.25f, 25.75f)
                lineTo(10.25f, 4.248f)
                lineToRelative(17.0f, 0.001f)
                verticalLineToRelative(21.5f)
                close()
                moveTo(10.25f, 26.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-5.0f)
                close()
                moveTo(21.0f, 29.75f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1.0f)
                lineTo(21.0f, 28.75f)
                close()
                moveTo(12.396f, 15.397f)
                lineTo(15.396f, 12.397f)
                lineTo(16.104f, 13.104f)
                lineTo(13.457f, 15.75f)
                lineTo(16.104f, 18.397f)
                lineTo(15.396f, 19.104f)
                lineTo(12.396f, 16.104f)
                lineTo(12.043f, 15.75f)
                close()
                moveTo(25.104f, 15.397f)
                lineTo(22.104f, 12.397f)
                lineTo(21.396f, 13.103f)
                lineTo(24.043f, 15.75f)
                lineTo(21.396f, 18.396f)
                lineTo(22.104f, 19.103f)
                lineTo(25.104f, 16.103f)
                lineTo(25.457f, 15.75f)
                close()
            }
        }
        .build()
        return _onboardingMedium!!
    }

private var _onboardingMedium: ImageVector? = null
