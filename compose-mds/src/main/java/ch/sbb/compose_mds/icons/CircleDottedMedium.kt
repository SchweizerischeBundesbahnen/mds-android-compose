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

public val SBBIcons.CircleDottedMedium: ImageVector
    get() {
        if (_circleDottedMedium != null) {
            return _circleDottedMedium!!
        }
        _circleDottedMedium = Builder(name = "CircleDottedMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.266f, 3.35f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 3.468f, 0.0f)
                lineToRelative(-0.116f, 0.994f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -3.236f, 0.0f)
                close()
                moveTo(10.79f, 5.13f)
                arcTo(14.7f, 14.7f, 0.0f, false, true, 13.995f, 3.8f)
                lineToRelative(0.27f, 0.963f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -2.984f, 1.238f)
                close()
                moveTo(22.005f, 3.8f)
                curveToRelative(1.129f, 0.318f, 2.202f, 0.767f, 3.204f, 1.329f)
                lineToRelative(-0.49f, 0.872f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -2.985f, -1.238f)
                close()
                moveTo(6.416f, 8.868f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, 2.452f, -2.452f)
                lineToRelative(0.62f, 0.785f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 7.2f, 9.487f)
                close()
                moveTo(27.132f, 6.416f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, 2.452f, 2.452f)
                lineToRelative(-0.785f, 0.62f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 26.513f, 7.2f)
                close()
                moveTo(3.8f, 13.995f)
                arcTo(14.7f, 14.7f, 0.0f, false, true, 5.13f, 10.79f)
                lineToRelative(0.872f, 0.49f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -1.238f, 2.985f)
                close()
                moveTo(30.871f, 10.791f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, 1.329f, 3.204f)
                lineToRelative(-0.963f, 0.27f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -1.238f, -2.984f)
                close()
                moveTo(3.25f, 18.0f)
                quadToRelative(0.0f, -0.88f, 0.1f, -1.734f)
                lineToRelative(0.994f, 0.116f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 3.236f)
                lineToRelative(-0.993f, 0.116f)
                quadTo(3.25f, 18.88f, 3.25f, 18.0f)
                moveToRelative(29.4f, -1.734f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 0.0f, 3.468f)
                lineToRelative(-0.994f, -0.116f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -3.236f)
                close()
                moveTo(5.128f, 25.209f)
                arcTo(14.7f, 14.7f, 0.0f, false, true, 3.8f, 22.005f)
                lineToRelative(0.963f, -0.27f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 1.238f, 2.984f)
                close()
                moveTo(32.198f, 22.005f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -1.328f, 3.204f)
                lineToRelative(-0.872f, -0.49f)
                curveToRelative(0.524f, -0.933f, 0.942f, -1.933f, 1.238f, -2.985f)
                close()
                moveTo(8.869f, 29.584f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, -2.452f, -2.452f)
                lineToRelative(0.785f, -0.62f)
                curveToRelative(0.67f, 0.85f, 1.438f, 1.617f, 2.286f, 2.287f)
                close()
                moveTo(29.585f, 27.132f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, -2.452f, 2.452f)
                lineToRelative(-0.62f, -0.785f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 2.287f, -2.286f)
                close()
                moveTo(13.994f, 32.2f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -3.203f, -1.329f)
                lineToRelative(0.49f, -0.872f)
                curveToRelative(0.933f, 0.524f, 1.933f, 0.942f, 2.985f, 1.238f)
                close()
                moveTo(25.21f, 30.87f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -3.204f, 1.329f)
                lineToRelative(-0.27f, -0.963f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 2.984f, -1.238f)
                close()
                moveTo(18.0f, 32.75f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -1.734f, -0.1f)
                lineToRelative(0.116f, -0.994f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 3.236f, 0.0f)
                lineToRelative(0.116f, 0.993f)
                quadToRelative(-0.854f, 0.1f, -1.734f, 0.101f)
            }
        }
        .build()
        return _circleDottedMedium!!
    }

private var _circleDottedMedium: ImageVector? = null
