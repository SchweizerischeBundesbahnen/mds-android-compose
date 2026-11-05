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

public val SBBIcons.MagnifyingGlassSparklesMedium: ImageVector
    get() {
        if (_magnifyingGlassSparklesMedium != null) {
            return _magnifyingGlassSparklesMedium!!
        }
        _magnifyingGlassSparklesMedium = Builder(
            name = "MagnifyingGlassSparklesMedium",
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
                moveToRelative(8.994f, 6.658f)
                lineToRelative(0.25f, 0.433f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 4.25f, 15.75f)
                curveToRelative(0.0f, 5.524f, 4.476f, 10.0f, 10.0f, 10.0f)
                arcToRelative(9.99f, 9.99f, 0.0f, false, false, 8.174f, -4.236f)
                lineToRelative(0.408f, 0.288f)
                lineToRelative(0.408f, 0.289f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, true, -0.764f, 0.962f)
                lineToRelative(9.351f, 8.07f)
                lineToRelative(-0.327f, 0.377f)
                lineToRelative(-0.326f, 0.379f)
                lineToRelative(-9.397f, -8.109f)
                arcToRelative(10.96f, 10.96f, 0.0f, false, true, -7.527f, 2.98f)
                curveToRelative(-6.076f, 0.0f, -11.0f, -4.924f, -11.0f, -11.0f)
                curveToRelative(0.0f, -4.069f, 2.21f, -7.622f, 5.493f, -9.524f)
                close()
                moveTo(25.25f, 4.5f)
                arcTo(7.75f, 7.75f, 0.0f, false, false, 33.0f, 12.25f)
                verticalLineToRelative(1.0f)
                arcTo(7.75f, 7.75f, 0.0f, false, false, 25.25f, 21.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, false, -7.75f, -7.75f)
                verticalLineToRelative(-1.0f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, false, 7.75f, -7.75f)
                close()
                moveTo(24.75f, 7.416f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, -5.334f, 5.334f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, 5.334f, 5.333f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, 5.333f, -5.333f)
                arcToRelative(8.77f, 8.77f, 0.0f, false, true, -5.333f, -5.334f)
                moveTo(16.25f, 3.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 3.25f, 3.25f)
                verticalLineToRelative(1.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, -3.25f, 3.25f)
                horizontalLineToRelative(-1.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 12.0f, 7.25f)
                verticalLineToRelative(-1.0f)
                arcTo(3.25f, 3.25f, 0.0f, false, false, 15.25f, 3.0f)
                close()
                moveTo(15.75f, 5.0f)
                arcTo(4.27f, 4.27f, 0.0f, false, true, 14.0f, 6.75f)
                arcToRelative(4.27f, 4.27f, 0.0f, false, true, 1.75f, 1.749f)
                arcToRelative(4.27f, 4.27f, 0.0f, false, true, 1.749f, -1.749f)
                arcTo(4.27f, 4.27f, 0.0f, false, true, 15.75f, 5.0f)
            }
        }
            .build()
        return _magnifyingGlassSparklesMedium!!
    }

private var _magnifyingGlassSparklesMedium: ImageVector? = null
