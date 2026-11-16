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

public val SBBIcons.HandBriefcaseMedium: ImageVector
    get() {
        if (_handBriefcaseMedium != null) {
            return _handBriefcaseMedium!!
        }
        _handBriefcaseMedium = Builder(name = "HandBriefcaseMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.5f, 5.75f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(0.25f)
                horizontalLineToRelative(-8.0f)
                lineTo(16.25f, 7.5f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                close()
                moveTo(15.25f, 7.75f)
                lineTo(15.25f, 7.5f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 18.0f, 4.75f)
                horizontalLineToRelative(4.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(0.25f)
                lineTo(30.0f, 7.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, 2.75f)
                verticalLineToRelative(12.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 30.0f, 25.25f)
                horizontalLineToRelative(-1.496f)
                verticalLineToRelative(-1.0f)
                lineTo(30.0f, 24.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.75f, -1.75f)
                verticalLineToRelative(-7.75f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(1.35f)
                curveToRelative(0.0f, 0.911f, -0.739f, 1.65f, -1.65f, 1.65f)
                horizontalLineToRelative(-3.7f)
                arcToRelative(1.65f, 1.65f, 0.0f, false, true, -1.65f, -1.65f)
                verticalLineToRelative(-1.35f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.75f, -2.75f)
                close()
                moveTo(31.75f, 10.5f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-8.0f)
                lineTo(23.75f, 12.4f)
                curveToRelative(0.0f, -0.911f, -0.739f, -1.65f, -1.65f, -1.65f)
                horizontalLineToRelative(-3.7f)
                curveToRelative(-0.911f, 0.0f, -1.65f, 0.739f, -1.65f, 1.65f)
                verticalLineToRelative(1.35f)
                horizontalLineToRelative(-8.0f)
                lineTo(8.75f, 10.5f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                lineTo(30.0f, 8.75f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                moveToRelative(-9.0f, 1.9f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.65f, -0.65f)
                horizontalLineToRelative(-3.7f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.65f, 0.65f)
                verticalLineToRelative(1.35f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(22.75f, 16.1f)
                verticalLineToRelative(-1.35f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.35f)
                curveToRelative(0.0f, 0.36f, 0.29f, 0.65f, 0.65f, 0.65f)
                horizontalLineToRelative(3.7f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.65f, -0.65f)
                moveTo(6.475f, 20.17f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, false, -2.495f, 3.124f)
                lineToRelative(8.89f, 7.831f)
                lineToRelative(0.142f, 0.125f)
                horizontalLineToRelative(5.894f)
                lineToRelative(1.367f, 1.355f)
                lineToRelative(0.146f, 0.145f)
                horizontalLineToRelative(13.083f)
                lineToRelative(-0.907f, -0.862f)
                lineToRelative(-7.992f, -7.596f)
                curveToRelative(-1.759f, -1.68f, -4.04f, -2.962f, -6.422f, -3.042f)
                lineTo(15.0f, 21.25f)
                curveToRelative(-0.886f, 0.0f, -1.587f, 0.337f, -2.062f, 0.871f)
                curveToRelative(-0.466f, 0.525f, -0.688f, 1.21f, -0.688f, 1.879f)
                quadToRelative(0.0f, 0.105f, 0.009f, 0.21f)
                close()
                moveTo(12.869f, 31.125f)
                lineTo(13.2f, 30.749f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(5.876f, 20.97f)
                lineToRelative(0.013f, 0.01f)
                lineToRelative(0.013f, 0.01f)
                lineToRelative(7.104f, 4.962f)
                lineToRelative(0.002f, -0.004f)
                curveToRelative(0.472f, 0.492f, 1.147f, 0.802f, 1.992f, 0.802f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.614f, 0.0f, -1.038f, -0.225f, -1.313f, -0.535f)
                arcTo(1.83f, 1.83f, 0.0f, false, true, 13.25f, 24.0f)
                curveToRelative(0.0f, -0.456f, 0.153f, -0.896f, 0.437f, -1.215f)
                curveToRelative(0.275f, -0.31f, 0.699f, -0.535f, 1.313f, -0.535f)
                horizontalLineToRelative(3.148f)
                lineToRelative(0.384f, 0.025f)
                curveToRelative(1.925f, 0.186f, 3.832f, 1.261f, 5.38f, 2.74f)
                lineToRelative(0.001f, 0.002f)
                lineToRelative(7.085f, 6.733f)
                lineTo(20.831f, 31.75f)
                lineToRelative(-1.365f, -1.355f)
                lineToRelative(-0.147f, -0.145f)
                horizontalLineToRelative(-5.93f)
                lineToRelative(-8.747f, -7.705f)
                lineToRelative(-0.01f, -0.008f)
                lineToRelative(-0.008f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.169f, -1.62f)
                close()
            }
        }
        .build()
        return _handBriefcaseMedium!!
    }

private var _handBriefcaseMedium: ImageVector? = null
