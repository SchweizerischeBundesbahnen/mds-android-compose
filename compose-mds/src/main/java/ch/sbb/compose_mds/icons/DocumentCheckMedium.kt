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
                moveToRelative(19.103f, 6.396f)
                lineToRelative(-0.147f, -0.146f)
                lineTo(9.243f, 6.25f)
                verticalLineToRelative(0.5f)
                lineToRelative(0.006f, 22.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-0.003f, -15.009f)
                verticalLineToRelative(-0.207f)
                lineToRelative(-0.146f, -0.146f)
                close()
                moveTo(25.749f, 28.75f)
                horizontalLineToRelative(-15.5f)
                lineToRelative(-0.006f, -21.5f)
                horizontalLineToRelative(8.007f)
                verticalLineToRelative(7.501f)
                lineToRelative(0.5f, -0.001f)
                lineToRelative(6.996f, -0.008f)
                close()
                moveTo(25.04f, 13.743f)
                lineTo(19.25f, 7.957f)
                verticalLineToRelative(5.792f)
                close()
                moveTo(16.5f, 20.75f)
                verticalLineToRelative(-1.0f)
                lineTo(12.0f, 19.75f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.5f, 24.25f)
                verticalLineToRelative(1.0f)
                lineTo(12.0f, 25.25f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(19.5f, 21.707f)
                lineTo(24.353f, 16.854f)
                lineTo(23.646f, 16.147f)
                lineTo(19.5f, 20.293f)
                lineTo(18.353f, 19.147f)
                lineTo(17.646f, 19.854f)
                close()
                moveTo(24.353f, 21.353f)
                lineTo(19.5f, 26.208f)
                lineToRelative(-1.854f, -1.854f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(1.147f, 1.147f)
                lineToRelative(4.146f, -4.146f)
                close()
            }
        }
        .build()
        return _documentCheckMedium!!
    }

private var _documentCheckMedium: ImageVector? = null
