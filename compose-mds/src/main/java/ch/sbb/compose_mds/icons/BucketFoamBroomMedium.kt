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
        _bucketFoamBroomMedium = Builder(name = "BucketFoamBroomMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(26.75f, 18.275f)
                lineTo(26.75f, 4.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(13.775f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.5f, 4.975f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-6.5f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -4.5f, -4.975f)
                moveToRelative(-5.86f, -1.525f)
                lineToRelative(-3.25f, 13.0f)
                lineTo(7.86f, 29.75f)
                lineToRelative(-3.25f, -13.0f)
                horizontalLineToRelative(1.675f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.465f, -3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.464f, 3.0f)
                close()
                moveTo(9.75f, 14.75f)
                curveToRelative(1.209f, 0.0f, 2.218f, 0.86f, 2.45f, 2.0f)
                lineTo(7.3f, 16.75f)
                curveToRelative(0.232f, -1.14f, 1.241f, -2.0f, 2.45f, -2.0f)
                moveToRelative(-1.11f, 14.0f)
                horizontalLineToRelative(8.22f)
                lineToRelative(1.624f, -6.5f)
                lineTo(13.5f, 22.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.234f)
                lineToRelative(0.875f, -3.5f)
                lineTo(5.891f, 17.75f)
                close()
                moveTo(25.25f, 28.75f)
                lineTo(25.25f, 25.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.25f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2.0f)
                lineTo(28.25f, 24.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.75f)
                close()
                moveTo(15.75f, 11.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.001f, 2.001f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.001f, -2.001f)
                moveToRelative(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -0.001f, -4.001f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.001f, 4.001f)
                moveToRelative(-6.5f, -4.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, -0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
            }
        }
        .build()
        return _bucketFoamBroomMedium!!
    }

private var _bucketFoamBroomMedium: ImageVector? = null
