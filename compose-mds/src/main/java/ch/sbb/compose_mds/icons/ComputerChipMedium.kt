package ch.sbb.compose_mds.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val SBBIcons.ComputerChipMedium: ImageVector
    get() {
        if (_computerChipMedium != null) {
            return _computerChipMedium!!
        }
        _computerChipMedium = Builder(name = "ComputerChipMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 9.25f)
                horizontalLineToRelative(3.5f)
                lineTo(18.25f, 4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(3.5f)
                lineTo(22.75f, 4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(4.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(4.5f)
                lineTo(33.0f, 13.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(3.5f)
                lineTo(33.0f, 18.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(3.5f)
                lineTo(33.0f, 22.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.75f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-4.5f)
                lineTo(23.75f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(-3.5f)
                lineTo(19.25f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(-3.5f)
                lineTo(14.75f, 33.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-4.75f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-4.5f)
                lineTo(4.5f, 23.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(-3.5f)
                lineTo(4.5f, 19.25f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(-3.5f)
                lineTo(4.5f, 14.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.75f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(4.5f)
                lineTo(13.75f, 4.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(10.25f, 27.25f)
                horizontalLineToRelative(17.0f)
                verticalLineToRelative(-17.0f)
                horizontalLineToRelative(-17.0f)
                close()
                moveTo(23.75f, 23.75f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(-10.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(14.75f, 22.75f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _computerChipMedium!!
    }

private var _computerChipMedium: ImageVector? = null
