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

public val SBBIcons.SuitcaseDisabledMedium: ImageVector
    get() {
        if (_suitcaseDisabledMedium != null) {
            return _suitcaseDisabledMedium!!
        }
        _suitcaseDisabledMedium = Builder(name = "SuitcaseDisabledMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.25f, 4.764f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(9.0f)
                lineTo(31.25f, 30.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(30.25f, 10.263f)
                lineTo(14.248f, 10.263f)
                lineToRelative(-3.75f, -0.013f)
                lineToRelative(0.004f, -1.0f)
                lineToRelative(3.248f, 0.012f)
                lineTo(13.75f, 4.764f)
                close()
                moveTo(21.25f, 5.764f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(5.09f, 9.264f)
                lineTo(3.16f, 7.337f)
                lineToRelative(0.707f, -0.707f)
                lineTo(29.376f, 32.12f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-3.08f, -3.078f)
                lineTo(4.75f, 29.749f)
                lineTo(4.75f, 9.264f)
                close()
                moveTo(24.588f, 28.75f)
                lineTo(6.09f, 10.264f)
                horizontalLineToRelative(-0.34f)
                lineTo(5.75f, 28.75f)
                close()
            }
        }
        .build()
        return _suitcaseDisabledMedium!!
    }

private var _suitcaseDisabledMedium: ImageVector? = null
