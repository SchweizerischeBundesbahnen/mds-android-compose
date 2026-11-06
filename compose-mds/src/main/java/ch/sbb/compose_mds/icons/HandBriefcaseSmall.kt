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

public val SBBIcons.HandBriefcaseSmall: ImageVector
    get() {
        if (_handBriefcaseSmall != null) {
            return _handBriefcaseSmall!!
        }
        _handBriefcaseSmall = Builder(name = "HandBriefcaseSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(7.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(0.734f)
                curveToRelative(0.0f, 0.7f, 0.567f, 1.266f, 1.266f, 1.266f)
                horizontalLineToRelative(2.468f)
                curveToRelative(0.7f, 0.0f, 1.266f, -0.567f, 1.266f, -1.266f)
                lineTo(16.0f, 10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-0.998f)
                verticalLineToRelative(1.0f)
                lineTo(20.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(22.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(16.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(7.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-0.734f)
                curveToRelative(0.0f, -0.7f, 0.567f, -1.266f, 1.266f, -1.266f)
                horizontalLineToRelative(2.468f)
                curveToRelative(0.7f, 0.0f, 1.266f, 0.567f, 1.266f, 1.266f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(12.266f, 8.0f)
                arcToRelative(0.266f, 0.266f, 0.0f, false, false, -0.266f, 0.266f)
                lineTo(12.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-0.734f)
                arcTo(0.266f, 0.266f, 0.0f, false, false, 14.734f, 8.0f)
                close()
                moveTo(15.0f, 10.734f)
                lineTo(15.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(0.734f)
                curveToRelative(0.0f, 0.147f, 0.12f, 0.266f, 0.266f, 0.266f)
                horizontalLineToRelative(2.468f)
                curveToRelative(0.147f, 0.0f, 0.266f, -0.12f, 0.266f, -0.266f)
                moveToRelative(-6.993f, 5.088f)
                lineToRelative(-3.582f, -2.503f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.874f, 2.343f)
                lineToRelative(5.919f, 5.213f)
                lineToRelative(0.141f, 0.125f)
                horizontalLineToRelative(3.925f)
                lineToRelative(0.862f, 0.855f)
                lineToRelative(0.146f, 0.145f)
                horizontalLineToRelative(9.208f)
                lineToRelative(-0.907f, -0.862f)
                lineToRelative(-5.328f, -5.063f)
                curveToRelative(-1.19f, -1.138f, -2.748f, -2.02f, -4.39f, -2.075f)
                lineTo(10.0f, 14.0f)
                curveToRelative(-0.636f, 0.0f, -1.15f, 0.243f, -1.499f, 0.637f)
                curveToRelative(-0.299f, 0.336f, -0.459f, 0.76f, -0.494f, 1.185f)
                moveTo(3.84f, 14.13f)
                lineToRelative(4.723f, 3.3f)
                curveToRelative(0.347f, 0.354f, 0.838f, 0.57f, 1.437f, 0.57f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.364f, 0.0f, -0.6f, -0.132f, -0.751f, -0.3f)
                arcTo(1.05f, 1.05f, 0.0f, false, true, 9.0f, 16.0f)
                curveToRelative(0.0f, -0.268f, 0.09f, -0.52f, 0.249f, -0.699f)
                curveToRelative(0.15f, -0.17f, 0.387f, -0.301f, 0.751f, -0.301f)
                horizontalLineToRelative(2.1f)
                curveToRelative(1.313f, 0.047f, 2.646f, 0.765f, 3.726f, 1.798f)
                horizontalLineToRelative(0.002f)
                lineTo(20.248f, 21.0f)
                horizontalLineToRelative(-6.292f)
                lineToRelative(-0.862f, -0.855f)
                lineToRelative(-0.146f, -0.145f)
                lineTo(8.99f, 20.0f)
                lineToRelative(-5.784f, -5.095f)
                lineToRelative(-0.009f, -0.008f)
                lineToRelative(-0.009f, -0.007f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.626f, -0.78f)
                lineToRelative(0.013f, 0.01f)
                close()
            }
        }
        .build()
        return _handBriefcaseSmall!!
    }

private var _handBriefcaseSmall: ImageVector? = null
