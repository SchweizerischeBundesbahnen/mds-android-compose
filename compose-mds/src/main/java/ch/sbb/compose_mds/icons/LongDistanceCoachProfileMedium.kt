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

public val SBBIcons.LongDistanceCoachProfileMedium: ImageVector
    get() {
        if (_longDistanceCoachProfileMedium != null) {
            return _longDistanceCoachProfileMedium!!
        }
        _longDistanceCoachProfileMedium = Builder(
            name = "LongDistanceCoachProfileMedium",
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
                moveTo(3.0f, 6.28f)
                horizontalLineToRelative(22.276f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.82f, 1.18f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.13f, 0.288f)
                horizontalLineToRelative(3.524f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(-1.0f)
                lineTo(31.75f, 9.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-3.078f)
                lineToRelative(4.78f, 10.712f)
                lineToRelative(0.002f, 0.004f)
                curveToRelative(0.193f, 0.446f, 0.294f, 0.926f, 0.296f, 1.412f)
                verticalLineToRelative(3.872f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-7.03f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, -8.44f, 0.0f)
                lineTo(3.0f, 26.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.28f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 8.44f, 0.0f)
                horizontalLineToRelative(7.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-3.869f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -0.213f, -1.014f)
                verticalLineToRelative(-0.003f)
                lineTo(26.183f, 7.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.91f, -0.59f)
                lineTo(3.0f, 7.28f)
                close()
                moveTo(3.0f, 10.25f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 15.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.25f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 9.25f)
                close()
                moveTo(20.25f, 9.25f)
                horizontalLineToRelative(-0.663f)
                lineToRelative(0.182f, 0.638f)
                lineToRelative(3.0f, 10.5f)
                lineToRelative(0.104f, 0.362f)
                horizontalLineToRelative(7.145f)
                lineToRelative(-0.31f, -0.702f)
                lineToRelative(-4.65f, -10.5f)
                lineToRelative(-0.133f, -0.298f)
                lineTo(20.25f, 9.25f)
                moveToRelative(3.377f, 10.5f)
                lineToRelative(-2.714f, -9.5f)
                horizontalLineToRelative(3.362f)
                lineToRelative(4.207f, 9.5f)
                close()
                moveTo(19.5f, 23.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, 0.0f, 6.5f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 0.0f, -6.5f)
                moveTo(9.75f, 9.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(10.389f)
                lineToRelative(-0.183f, -0.638f)
                lineToRelative(-1.726f, -6.0f)
                lineToRelative(-0.104f, -0.362f)
                lineTo(9.75f, 9.25f)
                moveToRelative(0.5f, 6.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.624f)
                lineToRelative(1.437f, 5.0f)
                close()
                moveTo(19.5f, 19.25f)
                lineTo(3.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(16.5f)
                close()
            }
        }
            .build()
        return _longDistanceCoachProfileMedium!!
    }

private var _longDistanceCoachProfileMedium: ImageVector? = null
