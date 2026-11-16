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

public val SBBIcons.ContactMedium: ImageVector
    get() {
        if (_contactMedium != null) {
            return _contactMedium!!
        }
        _contactMedium = Builder(name = "ContactMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(28.25f, 29.75f)
                lineTo(28.25f, 6.25f)
                lineTo(7.75f, 6.25f)
                verticalLineToRelative(6.0f)
                lineTo(6.0f, 12.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(5.0f)
                lineTo(6.0f, 24.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(8.75f, 25.25f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(18.5f)
                lineTo(27.25f, 7.25f)
                lineTo(8.75f, 7.25f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                lineTo(8.75f, 13.25f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                lineTo(8.75f, 19.25f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(15.25f, 14.25f)
                curveToRelative(0.0f, -1.81f, 1.072f, -3.5f, 2.75f, -3.5f)
                curveToRelative(0.828f, 0.0f, 1.529f, 0.437f, 2.006f, 1.08f)
                curveToRelative(0.475f, 0.641f, 0.744f, 1.503f, 0.744f, 2.435f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.353f, 1.74f)
                curveToRelative(2.02f, 1.282f, 3.354f, 4.08f, 3.354f, 7.245f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.167f, 1.331f, -5.963f, 3.353f, -7.245f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.354f, -1.755f)
                moveToRelative(0.884f, 2.602f)
                curveToRelative(-1.552f, 0.991f, -2.74f, 3.186f, -2.87f, 5.898f)
                horizontalLineToRelative(9.474f)
                curveToRelative(-0.131f, -2.708f, -1.319f, -4.902f, -2.868f, -5.895f)
                curveToRelative(-0.469f, 0.55f, -1.107f, 0.895f, -1.87f, 0.895f)
                curveToRelative(-0.749f, 0.0f, -1.395f, -0.354f, -1.866f, -0.898f)
                moveToRelative(0.116f, -2.602f)
                curveToRelative(0.0f, 0.747f, 0.217f, 1.388f, 0.547f, 1.83f)
                curveToRelative(0.328f, 0.44f, 0.752f, 0.67f, 1.203f, 0.67f)
                curveToRelative(0.877f, 0.0f, 1.75f, -0.94f, 1.75f, -2.485f)
                curveToRelative(0.0f, -0.747f, -0.217f, -1.393f, -0.548f, -1.84f)
                curveToRelative(-0.329f, -0.443f, -0.753f, -0.675f, -1.202f, -0.675f)
                curveToRelative(-0.875f, 0.0f, -1.75f, 0.951f, -1.75f, 2.5f)
            }
        }
        .build()
        return _contactMedium!!
    }

private var _contactMedium: ImageVector? = null
