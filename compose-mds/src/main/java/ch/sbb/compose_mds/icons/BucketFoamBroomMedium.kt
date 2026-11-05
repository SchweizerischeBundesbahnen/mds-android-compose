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

public val SBBIcons.BucketFoamBroomMedium: ImageVector
    get() {
        if (_bucketFoamBroomMedium != null) {
            return _bucketFoamBroomMedium!!
        }
        _bucketFoamBroomMedium = Builder(
            name = "BucketFoamBroomMedium",
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
                moveTo(26.75f, 18.275f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.5f, 4.975f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-6.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.5f, -4.975f)
                lineTo(25.75f, 4.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(4.61f, 16.75f)
                horizontalLineToRelative(1.675f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, 3.0f)
                horizontalLineToRelative(7.676f)
                lineToRelative(-0.155f, 0.621f)
                lineToRelative(-3.0f, 12.0f)
                lineToRelative(-0.095f, 0.379f)
                lineTo(7.86f, 29.75f)
                lineToRelative(-0.095f, -0.379f)
                lineToRelative(-3.0f, -12.0f)
                close()
                moveTo(9.75f, 14.75f)
                curveToRelative(1.209f, 0.0f, 2.218f, 0.86f, 2.45f, 2.0f)
                lineTo(7.3f, 16.75f)
                curveToRelative(0.232f, -1.14f, 1.241f, -2.0f, 2.45f, -2.0f)
                moveToRelative(-3.86f, 3.0f)
                lineToRelative(2.75f, 11.0f)
                horizontalLineToRelative(8.22f)
                lineToRelative(1.625f, -6.5f)
                lineTo(13.5f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.235f)
                lineToRelative(0.875f, -3.5f)
                close()
                moveTo(24.25f, 28.75f)
                lineTo(24.25f, 25.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(2.0f)
                lineTo(27.25f, 24.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineToRelative(5.5f)
                close()
                moveTo(14.75f, 12.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.001f, 0.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.001f, -0.001f)
                moveToRelative(1.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.001f, 4.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.001f, -4.001f)
                moveTo(9.0f, 10.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(-1.25f, 0.25f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
            }
        }
            .build()
        return _bucketFoamBroomMedium!!
    }

private var _bucketFoamBroomMedium: ImageVector? = null
