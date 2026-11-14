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

public val SBBIcons.BrochureMedium: ImageVector
    get() {
        if (_brochureMedium != null) {
            return _brochureMedium!!
        }
        _brochureMedium = Builder(name = "BrochureMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(31.25f, 28.11f)
                lineToRelative(-0.342f, 0.114f)
                lineToRelative(-13.658f, 4.553f)
                lineToRelative(-13.658f, -4.553f)
                lineToRelative(-0.342f, -0.114f)
                lineTo(3.25f, 4.557f)
                lineToRelative(0.658f, 0.218f)
                lineTo(17.25f, 9.223f)
                lineToRelative(13.342f, -4.448f)
                lineToRelative(0.658f, -0.218f)
                close()
                moveTo(17.75f, 10.11f)
                verticalLineToRelative(21.446f)
                lineToRelative(12.5f, -4.167f)
                lineTo(30.25f, 5.942f)
                close()
                moveTo(16.75f, 31.556f)
                lineTo(16.75f, 10.11f)
                lineTo(4.25f, 5.943f)
                lineTo(4.25f, 27.39f)
                close()
                moveTo(15.158f, 13.026f)
                lineTo(14.842f, 13.975f)
                lineTo(5.842f, 10.975f)
                lineTo(6.158f, 10.025f)
                close()
                moveTo(19.658f, 13.975f)
                lineTo(28.658f, 10.975f)
                lineTo(28.342f, 10.025f)
                lineTo(19.342f, 13.025f)
                close()
                moveTo(19.658f, 18.475f)
                lineTo(28.658f, 15.475f)
                lineTo(28.342f, 14.525f)
                lineTo(19.342f, 17.525f)
                close()
                moveTo(28.658f, 19.974f)
                lineTo(19.658f, 22.974f)
                lineTo(19.342f, 22.024f)
                lineTo(28.342f, 19.024f)
                close()
                moveTo(19.658f, 27.474f)
                lineTo(28.658f, 24.474f)
                lineTo(28.342f, 23.524f)
                lineTo(19.342f, 26.524f)
                close()
                moveTo(14.842f, 18.474f)
                lineTo(15.158f, 17.525f)
                lineTo(6.158f, 14.525f)
                lineTo(5.842f, 15.475f)
                close()
                moveTo(15.158f, 22.025f)
                lineTo(14.842f, 22.975f)
                lineTo(5.842f, 19.975f)
                lineTo(6.158f, 19.025f)
                close()
                moveTo(14.842f, 27.474f)
                lineTo(15.158f, 26.524f)
                lineTo(6.158f, 23.524f)
                lineTo(5.842f, 24.474f)
                close()
            }
        }
        .build()
        return _brochureMedium!!
    }

private var _brochureMedium: ImageVector? = null
