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
                moveTo(18.0f, 4.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.75f, 2.75f)
                verticalLineToRelative(0.25f)
                lineTo(10.5f, 7.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.75f, 2.75f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.35f)
                curveToRelative(0.0f, 0.912f, 0.738f, 1.65f, 1.65f, 1.65f)
                horizontalLineToRelative(3.7f)
                curveToRelative(0.912f, 0.0f, 1.65f, -0.738f, 1.65f, -1.65f)
                verticalLineToRelative(-1.35f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(7.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 30.0f, 24.25f)
                horizontalLineToRelative(-1.496f)
                verticalLineToRelative(1.0f)
                lineTo(30.0f, 25.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, 2.75f, -2.75f)
                verticalLineToRelative(-12.0f)
                arcTo(2.75f, 2.75f, 0.0f, false, false, 30.0f, 7.75f)
                horizontalLineToRelative(-4.75f)
                lineTo(25.25f, 7.5f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, false, -2.75f, -2.75f)
                close()
                moveTo(24.25f, 7.75f)
                lineTo(24.25f, 7.5f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, -1.75f)
                lineTo(18.0f, 5.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, 1.75f)
                verticalLineToRelative(0.25f)
                close()
                moveTo(10.5f, 8.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, 1.75f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(8.0f)
                lineTo(16.75f, 12.4f)
                curveToRelative(0.0f, -0.912f, 0.738f, -1.65f, 1.65f, -1.65f)
                horizontalLineToRelative(3.7f)
                curveToRelative(0.912f, 0.0f, 1.65f, 0.738f, 1.65f, 1.65f)
                verticalLineToRelative(1.35f)
                horizontalLineToRelative(8.0f)
                lineTo(31.75f, 10.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 30.0f, 8.75f)
                close()
                moveTo(18.4f, 11.75f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.65f, 0.65f)
                verticalLineToRelative(1.35f)
                horizontalLineToRelative(5.0f)
                lineTo(22.75f, 12.4f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, -0.65f, -0.65f)
                close()
                moveTo(22.75f, 16.1f)
                verticalLineToRelative(-1.35f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(1.35f)
                curveToRelative(0.0f, 0.36f, 0.29f, 0.65f, 0.65f, 0.65f)
                horizontalLineToRelative(3.7f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.65f, -0.65f)
                moveToRelative(-10.493f, 8.11f)
                lineToRelative(-5.769f, -4.03f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.5f, 3.122f)
                lineToRelative(8.882f, 7.823f)
                lineToRelative(0.141f, 0.125f)
                horizontalLineToRelative(5.896f)
                lineToRelative(1.366f, 1.355f)
                lineToRelative(0.146f, 0.145f)
                horizontalLineToRelative(13.083f)
                lineToRelative(-0.908f, -0.862f)
                lineToRelative(-7.99f, -7.595f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-1.759f, -1.681f, -4.04f, -2.962f, -6.422f, -3.043f)
                lineTo(15.0f, 21.25f)
                curveToRelative(-0.886f, 0.0f, -1.587f, 0.337f, -2.061f, 0.871f)
                curveToRelative(-0.466f, 0.525f, -0.689f, 1.21f, -0.689f, 1.88f)
                quadToRelative(0.0f, 0.104f, 0.007f, 0.208f)
                moveToRelative(5.898f, -1.96f)
                curveToRelative(2.052f, 0.072f, 4.109f, 1.19f, 5.757f, 2.766f)
                horizontalLineToRelative(0.001f)
                lineToRelative(7.085f, 6.734f)
                lineTo(20.831f, 31.749f)
                lineToRelative(-1.366f, -1.355f)
                lineToRelative(-0.146f, -0.145f)
                horizontalLineToRelative(-5.93f)
                lineToRelative(-8.747f, -7.705f)
                lineToRelative(-0.009f, -0.008f)
                lineToRelative(-0.009f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.252f, -1.56f)
                lineToRelative(0.013f, 0.01f)
                lineToRelative(0.014f, 0.01f)
                lineToRelative(7.103f, 4.962f)
                curveToRelative(0.473f, 0.491f, 1.15f, 0.798f, 1.994f, 0.798f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.614f, 0.0f, -1.038f, -0.225f, -1.314f, -0.535f)
                curveToRelative(-0.283f, -0.32f, -0.436f, -0.759f, -0.436f, -1.215f)
                reflectiveCurveToRelative(0.153f, -0.895f, 0.436f, -1.215f)
                curveToRelative(0.276f, -0.31f, 0.7f, -0.535f, 1.314f, -0.535f)
                horizontalLineToRelative(3.155f)
            }
        }
        .build()
        return _handBriefcaseMedium!!
    }

private var _handBriefcaseMedium: ImageVector? = null
