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

public val SBBIcons.PercentMedium: ImageVector
    get() {
        if (_percentMedium != null) {
            return _percentMedium!!
        }
        _percentMedium = Builder(name = "PercentMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.746f, 14.996f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.5f, 0.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 3.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.5f, 0.0f)
                moveTo(22.75f, 24.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, true, false, -3.502f, 0.001f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 22.75f, 24.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, true, true, -5.5f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 5.5f, 0.0f)
                moveToRelative(-12.146f, 2.603f)
                lineToRelative(13.5f, -13.5f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-13.5f, 13.5f)
                close()
            }
        }
        .build()
        return _percentMedium!!
    }

private var _percentMedium: ImageVector? = null
