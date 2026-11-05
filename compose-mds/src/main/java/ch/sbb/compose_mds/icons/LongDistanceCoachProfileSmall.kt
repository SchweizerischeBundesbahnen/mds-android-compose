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

public val SBBIcons.LongDistanceCoachProfileSmall: ImageVector
    get() {
        if (_longDistanceCoachProfileSmall != null) {
            return _longDistanceCoachProfileSmall!!
        }
        _longDistanceCoachProfileSmall = Builder(
            name = "LongDistanceCoachProfileSmall",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
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
                moveTo(2.0f, 4.02f)
                horizontalLineToRelative(14.851f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.365f, 0.885f)
                verticalLineToRelative(0.001f)
                lineToRelative(0.042f, 0.094f)
                lineTo(20.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 6.5f)
                lineTo(22.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.795f)
                lineToRelative(3.082f, 6.906f)
                lineToRelative(0.002f, 0.005f)
                curveToRelative(0.137f, 0.318f, 0.21f, 0.66f, 0.211f, 1.007f)
                lineTo(22.0f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-4.541f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.917f, 0.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.041f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.918f, 0.0f)
                lineTo(20.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-2.579f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.128f, -0.61f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-3.568f, -7.994f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.455f, -0.295f)
                lineTo(2.0f, 5.02f)
                close()
                moveTo(2.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(13.5f, 6.0f)
                horizontalLineToRelative(-0.663f)
                lineToRelative(0.182f, 0.637f)
                lineToRelative(2.0f, 7.0f)
                lineToRelative(0.104f, 0.363f)
                horizontalLineToRelative(5.145f)
                lineToRelative(-0.31f, -0.703f)
                lineToRelative(-3.1f, -7.0f)
                lineTo(16.724f, 6.0f)
                lineTo(13.5f, 6.0f)
                moveToRelative(5.232f, 7.0f)
                horizontalLineToRelative(-2.855f)
                lineToRelative(-1.714f, -6.0f)
                horizontalLineToRelative(1.912f)
                close()
                moveTo(13.0f, 15.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                moveTo(6.5f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.314f)
                lineToRelative(-0.184f, -0.638f)
                lineToRelative(-1.15f, -4.0f)
                lineTo(11.877f, 6.0f)
                lineTo(6.5f, 6.0f)
                moveToRelative(0.5f, 4.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(4.124f)
                lineToRelative(0.862f, 3.0f)
                close()
                moveTo(13.0f, 13.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(11.0f)
                close()
            }
        }
            .build()
        return _longDistanceCoachProfileSmall!!
    }

private var _longDistanceCoachProfileSmall: ImageVector? = null
