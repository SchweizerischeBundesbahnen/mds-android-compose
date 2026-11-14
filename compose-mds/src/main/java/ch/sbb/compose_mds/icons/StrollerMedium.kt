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

public val SBBIcons.StrollerMedium: ImageVector
    get() {
        if (_strollerMedium != null) {
            return _strollerMedium!!
        }
        _strollerMedium = Builder(name = "StrollerMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.25f, 27.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.499f, -0.001f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 15.25f, 27.0f)
                moveToRelative(10.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.499f, -0.001f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 25.75f, 27.0f)
                moveToRelative(-6.507f, -10.255f)
                horizontalLineToRelative(9.494f)
                arcToRelative(9.996f, 9.996f, 0.0f, false, false, -9.483f, -9.483f)
                close()
                moveTo(28.737f, 17.75f)
                lineTo(8.747f, 17.75f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 1.515f, 1.084f, 3.006f, 2.512f, 3.66f)
                arcToRelative(2.746f, 2.746f, 0.0f, false, true, 4.69f, 0.34f)
                horizontalLineToRelative(5.603f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, true, 4.687f, -0.343f)
                curveToRelative(1.422f, -0.652f, 2.498f, -2.14f, 2.498f, -3.657f)
                close()
                moveTo(29.737f, 21.75f)
                curveToRelative(0.0f, 1.95f, -1.34f, 3.766f, -3.076f, 4.566f)
                arcTo(2.748f, 2.748f, 0.0f, false, true, 24.0f, 29.75f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, -2.737f, -3.0f)
                horizontalLineToRelative(-5.026f)
                quadToRelative(0.012f, 0.124f, 0.013f, 0.25f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.411f, -0.685f)
                curveToRelative(-1.68f, -0.772f, -3.0f, -2.49f, -3.087f, -4.368f)
                lineToRelative(-0.005f, -0.197f)
                verticalLineToRelative(-8.5f)
                lineTo(3.0f, 13.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.747f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(9.496f)
                lineToRelative(0.012f, -10.001f)
                lineTo(18.255f, 6.25f)
                horizontalLineToRelative(0.5f)
                curveToRelative(6.072f, 0.0f, 10.995f, 4.923f, 10.995f, 10.995f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-0.013f)
                close()
            }
        }
        .build()
        return _strollerMedium!!
    }

private var _strollerMedium: ImageVector? = null
