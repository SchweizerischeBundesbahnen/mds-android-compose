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

public val SBBIcons.GeneralDisplayMedium: ImageVector
    get() {
        if (_generalDisplayMedium != null) {
            return _generalDisplayMedium!!
        }
        _generalDisplayMedium = Builder(
            name = "GeneralDisplayMedium",
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
                moveTo(7.25f, 7.75f)
                lineTo(7.25f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(29.5f)
                verticalLineToRelative(-22.0f)
                horizontalLineToRelative(-2.998f)
                lineTo(29.752f, 6.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.75f)
                close()
                moveTo(25.75f, 15.0f)
                verticalLineToRelative(-3.202f)
                arcToRelative(2.476f, 2.476f, 0.0f, false, false, -2.0f, 2.452f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, false, 2.5f, 2.5f)
                curveToRelative(1.398f, 0.0f, 2.5f, -1.102f, 2.5f, -2.5f)
                arcToRelative(2.475f, 2.475f, 0.0f, false, false, -2.0f, -2.452f)
                lineTo(26.75f, 15.0f)
                close()
                moveTo(22.75f, 14.25f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, 3.5f, -3.5f)
                curveToRelative(1.95f, 0.0f, 3.5f, 1.55f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.55f, 3.5f, -3.5f, 3.5f)
                arcToRelative(3.48f, 3.48f, 0.0f, false, true, -3.5f, -3.5f)
                moveToRelative(-18.5f, 14.5f)
                verticalLineToRelative(-20.0f)
                horizontalLineToRelative(27.5f)
                verticalLineToRelative(20.0f)
                close()
                moveTo(21.0f, 11.75f)
                lineTo(6.0f, 11.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(6.0f, 14.75f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 13.75f)
                close()
                moveTo(21.0f, 17.75f)
                lineTo(6.0f, 17.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(6.0f, 20.752f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 19.752f)
                close()
                moveTo(21.0f, 23.752f)
                lineTo(6.0f, 23.752f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(6.0f, 26.752f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                lineTo(6.0f, 25.752f)
                close()
            }
        }
            .build()
        return _generalDisplayMedium!!
    }

private var _generalDisplayMedium: ImageVector? = null
