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

public val SBBIcons.CircleDottedPartMedium: ImageVector
    get() {
        if (_circleDottedPartMedium != null) {
            return _circleDottedPartMedium!!
        }
        _circleDottedPartMedium = Builder(name = "CircleDottedPartMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 32.75f)
                quadToRelative(0.88f, 0.0f, 1.734f, -0.1f)
                lineToRelative(-0.116f, -0.994f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -3.236f, 0.0f)
                lineToRelative(-0.116f, 0.993f)
                quadToRelative(0.854f, 0.1f, 1.734f, 0.101f)
                moveToRelative(-3.734f, -1.513f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 11.28f, 30.0f)
                lineToRelative(-0.489f, 0.872f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 3.204f, 1.328f)
                close()
                moveTo(22.005f, 32.199f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 3.204f, -1.328f)
                lineToRelative(-0.49f, -0.872f)
                curveToRelative(-0.933f, 0.524f, -1.933f, 0.942f, -2.985f, 1.238f)
                close()
                moveTo(9.487f, 28.8f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, -2.286f, -2.286f)
                lineToRelative(-0.785f, 0.619f)
                curveToRelative(0.718f, 0.91f, 1.542f, 1.734f, 2.452f, 2.452f)
                close()
                moveTo(27.132f, 29.585f)
                arcToRelative(14.776f, 14.776f, 0.0f, false, false, 3.74f, -4.375f)
                lineToRelative(0.109f, -0.199f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 1.668f, -5.276f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 0.0f, -3.468f)
                curveToRelative(-0.792f, -6.76f, -6.155f, -12.123f, -12.915f, -12.915f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 18.0f, 3.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.008f)
                quadToRelative(-0.624f, 0.021f, -1.234f, 0.093f)
                lineToRelative(0.116f, 0.993f)
                quadToRelative(0.552f, -0.065f, 1.118f, -0.085f)
                verticalLineToRelative(13.9f)
                lineToRelative(0.093f, 0.13f)
                lineToRelative(8.25f, 11.621f)
                lineToRelative(0.289f, 0.407f)
                lineToRelative(0.408f, -0.29f)
                quadToRelative(0.301f, -0.214f, 0.592f, -0.443f)
                moveToRelative(4.618f, -11.687f)
                curveToRelative(-0.054f, -7.38f, -5.922f, -13.375f, -13.25f, -13.637f)
                verticalLineToRelative(13.58f)
                lineToRelative(7.861f, 11.074f)
                arcToRelative(13.73f, 13.73f, 0.0f, false, false, 5.389f, -11.017f)
                moveTo(6.0f, 24.72f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -1.238f, -2.986f)
                lineToRelative(-0.962f, 0.27f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 1.328f, 3.205f)
                close()
                moveTo(3.35f, 16.266f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 0.0f, 3.468f)
                lineToRelative(0.993f, -0.116f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -3.236f)
                close()
                moveTo(4.762f, 14.266f)
                arcTo(13.7f, 13.7f, 0.0f, false, true, 6.0f, 11.28f)
                lineToRelative(-0.872f, -0.489f)
                arcTo(14.7f, 14.7f, 0.0f, false, false, 3.8f, 13.995f)
                close()
                moveTo(7.2f, 9.487f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, 2.286f, -2.286f)
                lineToRelative(-0.619f, -0.785f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, -2.452f, 2.452f)
                close()
                moveTo(11.28f, 6.001f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, 2.985f, -1.238f)
                lineToRelative(-0.27f, -0.962f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, -3.205f, 1.328f)
                close()
            }
        }
        .build()
        return _circleDottedPartMedium!!
    }

private var _circleDottedPartMedium: ImageVector? = null
