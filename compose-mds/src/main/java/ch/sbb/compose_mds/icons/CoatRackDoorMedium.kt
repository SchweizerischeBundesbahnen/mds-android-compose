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

public val SBBIcons.CoatRackDoorMedium: ImageVector
    get() {
        if (_coatRackDoorMedium != null) {
            return _coatRackDoorMedium!!
        }
        _coatRackDoorMedium = Builder(
            name = "CoatRackDoorMedium",
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
                moveTo(29.75f, 28.75f)
                lineTo(33.0f, 28.75f)
                verticalLineToRelative(1.0f)
                lineTo(3.001f, 29.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.285f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.964f, -2.965f)
                verticalLineToRelative(-8.821f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.0f, -3.464f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, 2.45f)
                verticalLineToRelative(-4.986f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.0f, -3.464f)
                horizontalLineToRelative(1.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, 2.45f)
                verticalLineToRelative(-3.2f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.2f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, -2.45f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.0f, 3.464f)
                verticalLineToRelative(4.985f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.0f, -2.449f)
                horizontalLineToRelative(1.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.0f, 3.464f)
                verticalLineToRelative(5.821f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 2.964f, 2.965f)
                horizontalLineToRelative(5.036f)
                lineTo(18.25f, 6.25f)
                horizontalLineToRelative(11.5f)
                close()
                moveTo(9.75f, 26.75f)
                curveToRelative(-1.21f, 0.0f, -2.219f, 0.859f, -2.45f, 2.0f)
                horizontalLineToRelative(4.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.45f, -2.0f)
                moveToRelative(9.5f, 2.0f)
                horizontalLineToRelative(9.5f)
                lineTo(28.75f, 7.25f)
                horizontalLineToRelative(-9.5f)
                close()
                moveTo(27.0f, 19.25f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(27.0f, 18.25f)
                close()
            }
        }
            .build()
        return _coatRackDoorMedium!!
    }

private var _coatRackDoorMedium: ImageVector? = null
