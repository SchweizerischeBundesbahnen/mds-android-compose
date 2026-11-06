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

public val SBBIcons.DocumentCheckMedium: ImageVector
    get() {
        if (_documentCheckMedium != null) {
            return _documentCheckMedium!!
        }
        _documentCheckMedium = Builder(name = "DocumentCheckMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.743f, 6.25f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(0.5f)
                lineToRelative(0.006f, 22.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.003f, -15.01f)
                verticalLineToRelative(-0.206f)
                lineToRelative(-0.146f, -0.147f)
                lineToRelative(-7.497f, -7.49f)
                lineToRelative(-0.147f, -0.147f)
                lineTo(9.743f, 6.25f)
                moveToRelative(0.506f, 22.5f)
                lineToRelative(-0.006f, -21.5f)
                horizontalLineToRelative(8.007f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(0.5f)
                lineToRelative(6.996f, -0.008f)
                lineToRelative(0.003f, 14.008f)
                close()
                moveTo(25.04f, 13.742f)
                lineToRelative(-5.79f, -5.785f)
                verticalLineToRelative(5.792f)
                close()
                moveTo(12.0f, 20.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 19.75f)
                close()
                moveTo(16.5f, 25.25f)
                lineTo(12.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(19.853f, 21.354f)
                lineTo(24.353f, 16.854f)
                lineTo(23.646f, 16.146f)
                lineTo(19.5f, 20.293f)
                lineTo(18.353f, 19.146f)
                lineTo(17.646f, 19.854f)
                lineTo(19.146f, 21.354f)
                lineTo(19.5f, 21.707f)
                close()
                moveTo(24.353f, 21.354f)
                lineTo(19.853f, 25.854f)
                lineTo(19.5f, 26.207f)
                lineTo(19.146f, 25.854f)
                lineTo(17.646f, 24.354f)
                lineTo(18.353f, 23.646f)
                lineTo(19.5f, 24.793f)
                lineTo(23.646f, 20.646f)
                close()
            }
        }
        .build()
        return _documentCheckMedium!!
    }

private var _documentCheckMedium: ImageVector? = null
