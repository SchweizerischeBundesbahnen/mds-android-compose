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

public val SBBIcons.FaceSadMedium: ImageVector
    get() {
        if (_faceSadMedium != null) {
            return _faceSadMedium!!
        }
        _faceSadMedium = Builder(
            name = "FaceSadMedium",
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
                moveTo(5.75f, 18.0f)
                curveToRelative(0.0f, -6.844f, 5.407f, -12.25f, 12.25f, -12.25f)
                reflectiveCurveTo(30.25f, 11.156f, 30.25f, 18.0f)
                curveToRelative(0.0f, 6.843f, -5.407f, 12.25f, -12.25f, 12.25f)
                reflectiveCurveTo(5.75f, 24.843f, 5.75f, 18.0f)
                moveTo(18.0f, 4.75f)
                curveTo(10.605f, 4.75f, 4.75f, 10.604f, 4.75f, 18.0f)
                curveToRelative(0.0f, 7.395f, 5.855f, 13.25f, 13.25f, 13.25f)
                reflectiveCurveTo(31.25f, 25.395f, 31.25f, 18.0f)
                curveToRelative(0.0f, -7.396f, -5.855f, -13.25f, -13.25f, -13.25f)
                moveToRelative(0.0f, 13.5f)
                curveToRelative(-3.315f, 0.0f, -6.07f, 1.973f, -7.289f, 4.802f)
                lineToRelative(0.918f, 0.395f)
                curveToRelative(1.068f, -2.478f, 3.473f, -4.197f, 6.37f, -4.197f)
                curveToRelative(2.9f, 0.0f, 5.303f, 1.719f, 6.371f, 4.197f)
                lineToRelative(0.918f, -0.395f)
                curveTo(24.07f, 20.223f, 21.316f, 18.25f, 18.0f, 18.25f)
                moveToRelative(-5.75f, -4.75f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, -2.5f, 0.0f)
                moveToRelative(1.25f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.0f, -0.5f)
                moveToRelative(9.0f, -1.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, 2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                moveToRelative(-0.25f, 1.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.5f, 0.0f)
            }
        }
            .build()
        return _faceSadMedium!!
    }

private var _faceSadMedium: ImageVector? = null
