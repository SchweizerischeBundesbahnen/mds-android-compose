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
                moveTo(15.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(10.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-0.998f)
                verticalLineToRelative(-1.0f)
                lineTo(20.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(0.734f)
                curveToRelative(0.0f, 0.7f, -0.567f, 1.266f, -1.266f, 1.266f)
                horizontalLineToRelative(-2.468f)
                arcTo(1.266f, 1.266f, 0.0f, false, true, 11.0f, 10.734f)
                lineTo(11.0f, 10.0f)
                lineTo(6.0f, 10.0f)
                verticalLineToRelative(3.0f)
                lineTo(5.0f, 13.0f)
                lineTo(5.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                close()
                moveTo(20.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-0.734f)
                curveTo(16.0f, 7.566f, 15.433f, 7.0f, 14.734f, 7.0f)
                horizontalLineToRelative(-2.468f)
                curveTo(11.566f, 7.0f, 11.0f, 7.567f, 11.0f, 8.266f)
                lineTo(11.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(15.0f, 8.266f)
                arcTo(0.266f, 0.266f, 0.0f, false, false, 14.734f, 8.0f)
                horizontalLineToRelative(-2.468f)
                arcToRelative(0.266f, 0.266f, 0.0f, false, false, -0.266f, 0.266f)
                lineTo(12.0f, 9.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(15.0f, 10.734f)
                lineTo(15.0f, 10.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(0.734f)
                curveToRelative(0.0f, 0.147f, 0.12f, 0.266f, 0.266f, 0.266f)
                horizontalLineToRelative(2.468f)
                arcToRelative(0.266f, 0.266f, 0.0f, false, false, 0.266f, -0.266f)
                moveTo(4.411f, 13.312f)
                arcToRelative(1.498f, 1.498f, 0.0f, false, false, -1.867f, 2.342f)
                verticalLineToRelative(0.001f)
                lineToRelative(5.926f, 5.22f)
                lineToRelative(0.141f, 0.125f)
                horizontalLineToRelative(3.925f)
                lineToRelative(0.862f, 0.855f)
                lineToRelative(0.146f, 0.145f)
                horizontalLineToRelative(9.208f)
                lineToRelative(-0.907f, -0.862f)
                lineToRelative(-5.328f, -5.064f)
                curveToRelative(-1.19f, -1.137f, -2.749f, -2.019f, -4.391f, -2.074f)
                lineTo(10.0f, 14.0f)
                curveToRelative(-0.636f, 0.0f, -1.15f, 0.243f, -1.499f, 0.637f)
                curveToRelative(-0.3f, 0.336f, -0.46f, 0.76f, -0.494f, 1.184f)
                lineToRelative(-3.595f, -2.51f)
                moveToRelative(-0.598f, 0.798f)
                lineToRelative(0.013f, 0.01f)
                lineToRelative(0.014f, 0.01f)
                lineToRelative(4.735f, 3.309f)
                curveToRelative(0.347f, 0.347f, 0.832f, 0.561f, 1.425f, 0.561f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.364f, 0.0f, -0.6f, -0.132f, -0.751f, -0.3f)
                arcTo(1.06f, 1.06f, 0.0f, false, true, 9.0f, 16.0f)
                curveToRelative(0.0f, -0.268f, 0.09f, -0.52f, 0.249f, -0.7f)
                curveToRelative(0.15f, -0.168f, 0.387f, -0.3f, 0.751f, -0.3f)
                horizontalLineToRelative(2.093f)
                lineToRelative(0.246f, 0.016f)
                curveToRelative(1.234f, 0.119f, 2.472f, 0.812f, 3.487f, 1.782f)
                horizontalLineToRelative(0.001f)
                lineTo(20.248f, 21.0f)
                horizontalLineToRelative(-6.292f)
                lineToRelative(-0.861f, -0.855f)
                lineToRelative(-0.147f, -0.145f)
                lineTo(8.99f, 20.0f)
                lineToRelative(-5.784f, -5.096f)
                lineToRelative(-0.009f, -0.006f)
                lineToRelative(-0.008f, -0.008f)
                lineToRelative(-0.073f, -0.07f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.614f, -0.765f)
                close()
                moveTo(3.206f, 14.903f)
                lineTo(2.877f, 15.277f)
                horizontalLineToRelative(-0.001f)
                close()
            }
        }
        .build()
        return _handBriefcaseSmall!!
    }

private var _handBriefcaseSmall: ImageVector? = null
