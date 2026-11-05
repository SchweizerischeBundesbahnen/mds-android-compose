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
                moveTo(18.0f, 4.75f)
                curveToRelative(-1.221f, 0.0f, -1.942f, 0.427f, -2.341f, 0.945f)
                curveToRelative(-0.15f, 0.194f, -0.245f, 0.39f, -0.304f, 0.555f)
                lineTo(12.25f, 6.25f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(25.0f)
                horizontalLineToRelative(23.5f)
                verticalLineToRelative(-25.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3.105f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.304f, -0.555f)
                curveToRelative(-0.4f, -0.518f, -1.12f, -0.945f, -2.341f, -0.945f)
                moveToRelative(5.75f, 4.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-11.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(23.0f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(-23.0f)
                close()
                moveTo(16.252f, 6.758f)
                lineTo(16.249f, 6.778f)
                lineTo(16.229f, 7.25f)
                lineTo(13.25f, 7.25f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-2.98f)
                lineToRelative(-0.02f, -0.473f)
                lineToRelative(-0.002f, -0.02f)
                arcToRelative(1.037f, 1.037f, 0.0f, false, false, -0.2f, -0.453f)
                curveToRelative(-0.178f, -0.23f, -0.582f, -0.554f, -1.548f, -0.554f)
                reflectiveCurveToRelative(-1.37f, 0.323f, -1.55f, 0.555f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, false, -0.198f, 0.453f)
                moveTo(10.5f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(25.5f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10.5f, 22.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(18.0f, 28.25f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-1.0f)
                lineTo(18.0f, 27.25f)
                close()
            }
        }
        .build()
        return _formMedium!!
    }

private var _formMedium: ImageVector? = null
