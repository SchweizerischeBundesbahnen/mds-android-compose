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

public val SBBIcons.CashRegisterMedium: ImageVector
    get() {
        if (_cashRegisterMedium != null) {
            return _cashRegisterMedium!!
        }
        _cashRegisterMedium = Builder(name = "CashRegisterMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.059f, 3.25f)
                lineToRelative(-0.362f, 0.724f)
                lineToRelative(-2.947f, 5.894f)
                verticalLineToRelative(2.392f)
                curveToRelative(7.335f, 0.257f, 13.234f, 6.155f, 13.491f, 13.49f)
                horizontalLineToRelative(4.509f)
                verticalLineToRelative(7.0f)
                lineTo(3.25f, 32.75f)
                lineTo(3.25f, 3.25f)
                close()
                moveTo(4.25f, 10.25f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(7.013f, 0.0f, 12.728f, 5.551f, 12.99f, 12.5f)
                lineTo(24.0f, 25.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(7.75f)
                verticalLineToRelative(5.0f)
                lineTo(4.25f, 31.75f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(9.25f)
                verticalLineToRelative(-1.0f)
                lineTo(4.25f, 25.75f)
                close()
                moveTo(13.941f, 9.25f)
                lineTo(4.25f, 9.25f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(12.191f)
                close()
                moveTo(19.75f, 26.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.723f, -1.016f)
                lineToRelative(-3.681f, -3.681f)
                arcToRelative(3.501f, 3.501f, 0.0f, true, true, -2.096f, -6.303f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, 2.803f, 5.596f)
                lineToRelative(3.68f, 3.68f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, 3.016f, 1.723f)
                moveToRelative(-9.5f, -10.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 0.0f, 5.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 0.0f, -5.0f)
                moveToRelative(19.232f, 4.89f)
                lineToRelative(-0.94f, 0.343f)
                lineToRelative(-0.513f, -1.41f)
                lineToRelative(0.94f, -0.342f)
                close()
                moveTo(28.481f, 18.899f)
                lineTo(29.346f, 18.399f)
                lineTo(28.596f, 17.099f)
                lineTo(27.731f, 17.599f)
                close()
                moveTo(27.755f, 15.896f)
                lineTo(26.989f, 16.538f)
                lineTo(26.024f, 15.39f)
                lineTo(26.79f, 14.747f)
                close()
                moveTo(25.109f, 14.475f)
                lineTo(25.752f, 13.708f)
                lineTo(24.602f, 12.744f)
                lineTo(23.959f, 13.511f)
                close()
            }
        }
        .build()
        return _cashRegisterMedium!!
    }

private var _cashRegisterMedium: ImageVector? = null
