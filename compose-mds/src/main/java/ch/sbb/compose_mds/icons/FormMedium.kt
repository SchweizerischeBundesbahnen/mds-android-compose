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

public val SBBIcons.FormMedium: ImageVector
    get() {
        if (_formMedium != null) {
            return _formMedium!!
        }
        _formMedium = Builder(name = "FormMedium", defaultWidth = 36.0.dp, defaultHeight = 36.0.dp,
                viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.34f, 5.694f)
                curveToRelative(-0.398f, -0.517f, -1.119f, -0.944f, -2.34f, -0.944f)
                reflectiveCurveToRelative(-1.942f, 0.427f, -2.34f, 0.944f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.305f, 0.556f)
                lineTo(12.25f, 6.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(-25.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.105f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.304f, -0.556f)
                moveToRelative(3.41f, 3.056f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(23.0f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-23.0f)
                close()
                moveTo(16.452f, 6.306f)
                curveToRelative(0.18f, -0.233f, 0.583f, -0.556f, 1.549f, -0.556f)
                reflectiveCurveToRelative(1.37f, 0.323f, 1.549f, 0.556f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, true, 0.199f, 0.452f)
                verticalLineToRelative(0.008f)
                lineToRelative(0.001f, 0.005f)
                horizontalLineToRelative(0.001f)
                lineToRelative(0.02f, 0.479f)
                horizontalLineToRelative(2.98f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-9.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.98f)
                lineToRelative(0.02f, -0.48f)
                lineToRelative(0.002f, -0.012f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, true, 0.2f, -0.452f)
                moveTo(25.5f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.5f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.5f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(18.0f, 27.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _formMedium!!
    }

private var _formMedium: ImageVector? = null
