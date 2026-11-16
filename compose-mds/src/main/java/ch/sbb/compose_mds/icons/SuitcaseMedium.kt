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

public val SBBIcons.SuitcaseMedium: ImageVector
    get() {
        if (_suitcaseMedium != null) {
            return _suitcaseMedium!!
        }
        _suitcaseMedium = Builder(name = "SuitcaseMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.25f, 10.763f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-9.0f)
                lineTo(4.75f, 31.25f)
                horizontalLineToRelative(26.5f)
                lineTo(31.25f, 10.763f)
                close()
                moveTo(21.25f, 10.763f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(30.25f, 30.25f)
                lineTo(5.75f, 30.25f)
                lineTo(5.75f, 11.763f)
                horizontalLineToRelative(24.5f)
                close()
            }
        }
        .build()
        return _suitcaseMedium!!
    }

private var _suitcaseMedium: ImageVector? = null
