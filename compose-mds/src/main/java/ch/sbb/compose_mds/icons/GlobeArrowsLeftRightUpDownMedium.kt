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

public val SBBIcons.GlobeArrowsLeftRightUpDownMedium: ImageVector
    get() {
        if (_globeArrowsLeftRightUpDownMedium != null) {
            return _globeArrowsLeftRightUpDownMedium!!
        }
        _globeArrowsLeftRightUpDownMedium = Builder(
            name = "GlobeArrowsLeftRightUpDownMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveToRelative(21.354f, 31.147f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.397f, -3.397f)
                lineToRelative(-3.396f, 3.396f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(4.103f, -4.103f)
                close()
                moveTo(17.25f, 12.25f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 0.0f, -13.0f)
                moveToRelative(-1.89f, 7.0f)
                curveToRelative(0.048f, 1.406f, 0.295f, 2.65f, 0.658f, 3.557f)
                curveToRelative(0.203f, 0.507f, 0.432f, 0.885f, 0.66f, 1.128f)
                curveToRelative(0.229f, 0.24f, 0.422f, 0.315f, 0.572f, 0.315f)
                reflectiveCurveToRelative(0.343f, -0.074f, 0.571f, -0.315f)
                curveToRelative(0.23f, -0.243f, 0.458f, -0.62f, 0.661f, -1.128f)
                curveToRelative(0.363f, -0.907f, 0.61f, -2.151f, 0.658f, -3.557f)
                close()
                moveTo(11.773f, 19.25f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 3.688f, 4.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.372f, -0.771f)
                curveToRelative(-0.418f, -1.044f, -0.681f, -2.42f, -0.73f, -3.929f)
                close()
                moveTo(20.141f, 19.25f)
                curveToRelative(-0.049f, 1.51f, -0.312f, 2.885f, -0.73f, 3.929f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.373f, 0.771f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 3.689f, -4.7f)
                close()
                moveTo(8.957f, 18.75f)
                lineTo(4.854f, 22.854f)
                lineTo(4.146f, 22.147f)
                lineTo(7.543f, 18.75f)
                lineTo(4.146f, 15.354f)
                lineTo(4.854f, 14.647f)
                close()
                moveTo(30.354f, 15.354f)
                lineTo(26.957f, 18.75f)
                lineTo(30.353f, 22.146f)
                lineTo(29.646f, 22.853f)
                lineTo(25.543f, 18.75f)
                lineTo(29.647f, 14.647f)
                close()
                moveTo(15.46f, 13.549f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -3.688f, 4.701f)
                horizontalLineToRelative(2.586f)
                curveToRelative(0.049f, -1.51f, 0.312f, -2.885f, 0.73f, -3.929f)
                curveToRelative(0.11f, -0.277f, 0.235f, -0.537f, 0.372f, -0.772f)
                moveToRelative(1.789f, -0.299f)
                curveToRelative(-0.15f, 0.0f, -0.343f, 0.074f, -0.571f, 0.315f)
                curveToRelative(-0.23f, 0.243f, -0.458f, 0.62f, -0.661f, 1.128f)
                curveToRelative(-0.363f, 0.907f, -0.61f, 2.152f, -0.658f, 3.557f)
                horizontalLineToRelative(3.78f)
                curveToRelative(-0.048f, -1.405f, -0.295f, -2.65f, -0.658f, -3.557f)
                curveToRelative(-0.203f, -0.507f, -0.432f, -0.885f, -0.66f, -1.128f)
                curveToRelative(-0.229f, -0.24f, -0.422f, -0.315f, -0.572f, -0.315f)
                moveToRelative(1.788f, 0.299f)
                curveToRelative(0.137f, 0.235f, 0.262f, 0.495f, 0.373f, 0.772f)
                curveToRelative(0.418f, 1.044f, 0.681f, 2.42f, 0.73f, 3.929f)
                horizontalLineToRelative(2.586f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -3.689f, -4.701f)
                moveToRelative(2.316f, -7.195f)
                lineToRelative(-4.104f, 4.103f)
                lineToRelative(-4.103f, -4.103f)
                lineToRelative(0.707f, -0.708f)
                lineToRelative(3.396f, 3.397f)
                lineToRelative(3.396f, -3.397f)
                close()
            }
        }
            .build()
        return _globeArrowsLeftRightUpDownMedium!!
    }

private var _globeArrowsLeftRightUpDownMedium: ImageVector? = null
