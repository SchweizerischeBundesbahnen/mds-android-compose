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

public val SBBIcons.BucketFoamBroomSmall: ImageVector
    get() {
        if (_bucketFoamBroomSmall != null) {
            return _bucketFoamBroomSmall!!
        }
        _bucketFoamBroomSmall = Builder(name = "BucketFoamBroomSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 12.035f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(9.035f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.0f, 3.465f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -3.0f, -3.465f)
                moveTo(14.14f, 11.0f)
                lineToRelative(-2.25f, 9.0f)
                horizontalLineTo(5.11f)
                lineToRelative(-2.25f, -9.0f)
                horizontalLineToRelative(1.19f)
                arcToRelative(2.502f, 2.502f, 0.0f, false, true, 4.9f, 0.0f)
                close()
                moveTo(6.5f, 10.0f)
                curveToRelative(0.653f, 0.0f, 1.208f, 0.418f, 1.415f, 1.0f)
                horizontalLineToRelative(-2.83f)
                curveToRelative(0.207f, -0.582f, 0.762f, -1.0f, 1.415f, -1.0f)
                moveToRelative(-0.61f, 9.0f)
                horizontalLineToRelative(5.22f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.36f)
                lineToRelative(0.5f, -2.0f)
                horizontalLineTo(4.14f)
                close()
                moveTo(17.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(10.5f, 8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -1.0f)
                moveToRelative(0.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                moveTo(5.0f, 7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
            }
        }
        .build()
        return _bucketFoamBroomSmall!!
    }

private var _bucketFoamBroomSmall: ImageVector? = null
