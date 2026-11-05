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
                moveTo(3.25f, 3.25f)
                horizontalLineToRelative(14.809f)
                lineToRelative(-0.362f, 0.724f)
                lineToRelative(-2.947f, 5.894f)
                verticalLineToRelative(2.39f)
                curveToRelative(7.335f, 0.258f, 13.234f, 6.157f, 13.491f, 13.492f)
                horizontalLineToRelative(4.509f)
                verticalLineToRelative(7.0f)
                lineTo(3.25f, 32.75f)
                lineTo(3.25f, 3.25f)
                moveToRelative(1.0f, 7.0f)
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
                moveTo(18.75f, 25.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                moveToRelative(-1.016f, -0.723f)
                arcToRelative(1.999f, 1.999f, 0.0f, false, true, 3.016f, 1.723f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -3.723f, -1.016f)
                lineToRelative(-3.681f, -3.681f)
                arcToRelative(3.501f, 3.501f, 0.0f, true, true, -2.096f, -6.303f)
                arcToRelative(3.501f, 3.501f, 0.0f, false, true, 2.803f, 5.596f)
                close()
                moveTo(8.75f, 18.75f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, 5.0f, 0.0f)
                arcToRelative(2.501f, 2.501f, 0.0f, false, true, -5.0f, 0.0f)
                moveToRelative(20.792f, 2.733f)
                lineToRelative(-0.513f, -1.41f)
                lineToRelative(0.94f, -0.342f)
                lineToRelative(0.513f, 1.41f)
                close()
                moveTo(27.732f, 17.6f)
                lineTo(28.482f, 18.9f)
                lineTo(29.348f, 18.4f)
                lineTo(28.598f, 17.1f)
                close()
                moveTo(26.99f, 16.54f)
                lineTo(26.025f, 15.39f)
                lineTo(26.791f, 14.748f)
                lineTo(27.756f, 15.897f)
                close()
                moveTo(23.96f, 13.512f)
                lineTo(25.11f, 14.476f)
                lineTo(25.753f, 13.71f)
                lineTo(24.603f, 12.745f)
                close()
            }
        }
        .build()
        return _cashRegisterMedium!!
    }

private var _cashRegisterMedium: ImageVector? = null
