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
        _circleDottedPartMedium = Builder(
            name = "CircleDottedPartMedium",
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
                pathFillType = EvenOdd,
            ) {
                moveTo(17.5f, 3.258f)
                quadToRelative(-0.624f, 0.021f, -1.234f, 0.093f)
                lineToRelative(0.116f, 0.993f)
                quadToRelative(0.552f, -0.065f, 1.118f, -0.085f)
                lineTo(17.5f, 18.16f)
                lineToRelative(0.092f, 0.13f)
                lineToRelative(8.25f, 11.62f)
                lineToRelative(0.29f, 0.408f)
                lineToRelative(0.408f, -0.29f)
                quadToRelative(0.302f, -0.215f, 0.592f, -0.444f)
                arcToRelative(14.77f, 14.77f, 0.0f, false, false, 3.74f, -4.375f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 0.205f, -0.38f)
                arcTo(14.7f, 14.7f, 0.0f, false, false, 32.75f, 18.0f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, -3.44f, -9.47f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, -1.926f, -1.91f)
                arcTo(14.68f, 14.68f, 0.0f, false, false, 18.0f, 3.25f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(18.765f, 4.271f)
                lineTo(18.511f, 4.259f)
                lineTo(18.5f, 4.259f)
                lineTo(18.5f, 17.84f)
                lineToRelative(7.863f, 11.074f)
                lineToRelative(0.15f, -0.116f)
                arcTo(13.778f, 13.778f, 0.0f, false, false, 30.0f, 24.719f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 0.19f, -0.353f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 1.554f, -6.775f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -3.132f, -8.335f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -1.785f, -1.8f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -8.062f, -3.185f)
                moveToRelative(-4.77f, -0.47f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, -3.204f, 1.328f)
                lineToRelative(0.49f, 0.872f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, 2.985f, -1.238f)
                close()
                moveTo(8.868f, 6.415f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, -2.452f, 2.452f)
                lineToRelative(0.785f, 0.62f)
                arcTo(13.8f, 13.8f, 0.0f, false, true, 9.487f, 7.2f)
                close()
                moveTo(5.128f, 10.79f)
                arcTo(14.7f, 14.7f, 0.0f, false, false, 3.8f, 13.995f)
                lineToRelative(0.963f, 0.27f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, 1.238f, -2.984f)
                close()
                moveTo(3.351f, 16.265f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 0.0f, 3.468f)
                lineToRelative(0.993f, -0.116f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -3.236f)
                close()
                moveTo(3.801f, 22.005f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 1.328f, 3.203f)
                lineToRelative(0.872f, -0.49f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -1.238f, -2.985f)
                close()
                moveTo(6.416f, 27.131f)
                curveToRelative(0.719f, 0.91f, 1.542f, 1.733f, 2.452f, 2.452f)
                lineToRelative(0.62f, -0.785f)
                arcTo(13.8f, 13.8f, 0.0f, false, true, 7.2f, 26.513f)
                close()
                moveTo(10.791f, 30.871f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 3.204f, 1.328f)
                lineToRelative(0.27f, -0.963f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -2.984f, -1.238f)
                close()
                moveTo(22.005f, 32.2f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 3.204f, -1.329f)
                lineToRelative(-0.49f, -0.872f)
                curveToRelative(-0.933f, 0.524f, -1.933f, 0.942f, -2.985f, 1.238f)
                close()
                moveTo(16.265f, 32.65f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 3.47f, 0.0f)
                lineToRelative(-0.117f, -0.994f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -3.236f, 0.0f)
                close()
            }
        }
            .build()
        return _circleDottedPartMedium!!
    }

private var _circleDottedPartMedium: ImageVector? = null
