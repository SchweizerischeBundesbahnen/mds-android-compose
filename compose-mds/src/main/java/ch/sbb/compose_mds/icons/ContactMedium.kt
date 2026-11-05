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
        _contactMedium = Builder(
            name = "ContactMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
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
                moveTo(8.25f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(5.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(20.5f)
                verticalLineTo(6.25f)
                horizontalLineToRelative(-20.0f)
                moveToRelative(0.5f, 19.0f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(18.5f)
                verticalLineTo(7.25f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.75f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 11.75f)
                curveToRelative(-0.875f, 0.0f, -1.75f, 0.951f, -1.75f, 2.5f)
                curveToRelative(0.0f, 0.747f, 0.217f, 1.388f, 0.547f, 1.83f)
                curveToRelative(0.328f, 0.44f, 0.752f, 0.67f, 1.203f, 0.67f)
                curveToRelative(0.877f, 0.0f, 1.75f, -0.939f, 1.75f, -2.485f)
                curveToRelative(0.0f, -0.747f, -0.217f, -1.393f, -0.548f, -1.84f)
                curveToRelative(-0.329f, -0.443f, -0.753f, -0.675f, -1.202f, -0.675f)
                moveToRelative(-2.75f, 2.5f)
                curveToRelative(0.0f, -1.81f, 1.072f, -3.5f, 2.75f, -3.5f)
                curveToRelative(0.828f, 0.0f, 1.528f, 0.436f, 2.005f, 1.08f)
                curveToRelative(0.475f, 0.641f, 0.745f, 1.503f, 0.745f, 2.435f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -0.353f, 1.74f)
                curveToRelative(2.021f, 1.282f, 3.354f, 4.08f, 3.354f, 7.246f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -3.168f, 1.331f, -5.964f, 3.354f, -7.247f)
                arcToRelative(4.35f, 4.35f, 0.0f, false, true, -0.355f, -1.754f)
                moveToRelative(0.885f, 2.602f)
                curveToRelative(-1.552f, 0.991f, -2.741f, 3.186f, -2.872f, 5.899f)
                horizontalLineToRelative(9.476f)
                curveToRelative(-0.131f, -2.709f, -1.32f, -4.904f, -2.869f, -5.896f)
                curveToRelative(-0.469f, 0.549f, -1.107f, 0.895f, -1.87f, 0.895f)
                curveToRelative(-0.749f, 0.0f, -1.395f, -0.354f, -1.865f, -0.898f)
            }
        }
            .build()
        return _contactMedium!!
    }

private var _contactMedium: ImageVector? = null
