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

public val SBBIcons.CircleDottedMedium: ImageVector
    get() {
        if (_circleDottedMedium != null) {
            return _circleDottedMedium!!
        }
        _circleDottedMedium = Builder(name = "CircleDottedMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.734f, 32.65f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, -3.468f, 0.0f)
                lineToRelative(0.116f, -0.994f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 3.236f, 0.0f)
                close()
                moveTo(11.28f, 29.999f)
                curveToRelative(0.934f, 0.524f, 1.934f, 0.942f, 2.986f, 1.238f)
                lineToRelative(-0.27f, 0.962f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -3.205f, -1.328f)
                close()
                moveTo(25.209f, 30.871f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -3.204f, 1.328f)
                lineToRelative(-0.27f, -0.962f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 24.72f, 30.0f)
                close()
                moveTo(7.201f, 26.513f)
                curveToRelative(0.67f, 0.848f, 1.438f, 1.616f, 2.286f, 2.286f)
                lineToRelative(-0.619f, 0.785f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, -2.452f, -2.452f)
                close()
                moveTo(29.584f, 27.132f)
                arcToRelative(14.9f, 14.9f, 0.0f, false, true, -2.452f, 2.452f)
                lineToRelative(-0.62f, -0.785f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 2.287f, -2.286f)
                close()
                moveTo(4.763f, 21.734f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 6.0f, 24.72f)
                lineToRelative(-0.872f, 0.489f)
                arcTo(14.7f, 14.7f, 0.0f, false, true, 3.8f, 22.005f)
                close()
                moveTo(32.199f, 22.004f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, -1.328f, 3.205f)
                lineToRelative(-0.872f, -0.49f)
                curveToRelative(0.524f, -0.933f, 0.942f, -1.933f, 1.238f, -2.985f)
                close()
                moveTo(3.25f, 18.0f)
                quadToRelative(0.0f, -0.88f, 0.1f, -1.734f)
                lineToRelative(0.994f, 0.116f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 3.236f)
                lineToRelative(-0.993f, 0.116f)
                quadTo(3.25f, 18.88f, 3.25f, 18.0f)
                moveToRelative(28.5f, 0.0f)
                quadToRelative(0.0f, -0.822f, -0.094f, -1.618f)
                lineToRelative(0.993f, -0.116f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, true, 0.0f, 3.468f)
                lineToRelative(-0.993f, -0.116f)
                quadToRelative(0.093f, -0.796f, 0.094f, -1.618f)
                moveTo(6.001f, 11.28f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -1.238f, 2.986f)
                lineToRelative(-0.962f, -0.27f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, 1.328f, -3.205f)
                close()
                moveTo(30.871f, 10.791f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, 1.328f, 3.204f)
                lineToRelative(-0.962f, 0.27f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 30.0f, 11.28f)
                close()
                moveTo(9.487f, 7.201f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -2.286f, 2.286f)
                lineToRelative(-0.785f, -0.619f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, true, 2.452f, -2.452f)
                close()
                moveTo(27.132f, 6.416f)
                curveToRelative(0.91f, 0.718f, 1.734f, 1.542f, 2.452f, 2.452f)
                lineToRelative(-0.785f, 0.62f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 26.513f, 7.2f)
                close()
                moveTo(14.266f, 4.763f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 11.28f, 6.0f)
                lineToRelative(-0.489f, -0.872f)
                arcTo(14.7f, 14.7f, 0.0f, false, true, 13.995f, 3.8f)
                close()
                moveTo(22.005f, 3.801f)
                curveToRelative(1.129f, 0.317f, 2.203f, 0.766f, 3.204f, 1.328f)
                lineToRelative(-0.49f, 0.872f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -2.985f, -1.238f)
                close()
                moveTo(18.0f, 3.25f)
                quadToRelative(0.88f, 0.0f, 1.734f, 0.1f)
                lineToRelative(-0.116f, 0.994f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -3.236f, 0.0f)
                lineToRelative(-0.116f, -0.993f)
                quadToRelative(0.854f, -0.1f, 1.734f, -0.101f)
            }
        }
        .build()
        return _circleDottedMedium!!
    }

private var _circleDottedMedium: ImageVector? = null
