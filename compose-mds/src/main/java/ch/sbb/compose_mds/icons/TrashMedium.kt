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

public val SBBIcons.TrashMedium: ImageVector
    get() {
        if (_trashMedium != null) {
            return _trashMedium!!
        }
        _trashMedium = Builder(name = "TrashMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.544f, 7.764f)
                curveToRelative(1.15f, -1.8f, 3.15f, -3.014f, 5.456f, -3.014f)
                curveToRelative(2.305f, 0.0f, 4.306f, 1.213f, 5.456f, 3.013f)
                lineTo(30.0f, 7.763f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.75f)
                lineTo(28.25f, 29.75f)
                lineTo(7.75f, 29.75f)
                lineTo(7.75f, 8.764f)
                lineTo(6.0f, 8.764f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(13.777f, 7.764f)
                horizontalLineToRelative(8.446f)
                arcTo(5.44f, 5.44f, 0.0f, false, false, 18.0f, 5.75f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, -4.223f, 2.013f)
                moveToRelative(-5.027f, 1.0f)
                lineTo(8.75f, 28.75f)
                horizontalLineToRelative(18.5f)
                lineTo(27.25f, 8.764f)
                close()
                moveTo(12.25f, 12.0f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(1.0f)
                lineTo(13.25f, 12.0f)
                close()
                moveTo(17.5f, 25.5f)
                lineTo(17.5f, 12.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(22.75f, 12.0f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(1.0f)
                lineTo(23.75f, 12.0f)
                close()
            }
        }
        .build()
        return _trashMedium!!
    }

private var _trashMedium: ImageVector? = null
