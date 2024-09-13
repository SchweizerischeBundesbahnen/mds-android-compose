package ch.sbb.compose_mds.sbbicons.small

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SmallGroup

public val SmallGroup.GeneralDisplaySmall: ImageVector
    get() {
        if (_generalDisplaySmall != null) {
            return _generalDisplaySmall!!
        }
        _generalDisplaySmall = Builder(name = "GeneralDisplaySmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 5.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(20.0f)
                lineTo(22.0f, 5.0f)
                horizontalLineToRelative(-1.999f)
                lineTo(20.001f, 4.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(17.0f, 8.082f)
                curveToRelative(-0.587f, 0.203f, -1.0f, 0.754f, -1.0f, 1.418f)
                curveToRelative(0.0f, 0.84f, 0.661f, 1.5f, 1.5f, 1.5f)
                curveToRelative(0.84f, 0.0f, 1.5f, -0.66f, 1.5f, -1.5f)
                curveToRelative(0.0f, -0.664f, -0.412f, -1.216f, -1.0f, -1.418f)
                lineTo(18.0f, 10.0f)
                close()
                moveTo(15.0f, 9.5f)
                curveTo(15.0f, 8.107f, 16.109f, 7.0f, 17.5f, 7.0f)
                reflectiveCurveTo(20.0f, 8.108f, 20.0f, 9.5f)
                reflectiveCurveTo(18.892f, 12.0f, 17.5f, 12.0f)
                arcTo(2.486f, 2.486f, 0.0f, false, true, 15.0f, 9.5f)
                moveTo(3.0f, 19.0f)
                lineTo(3.0f, 6.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(13.0f)
                close()
                moveTo(14.0f, 8.0f)
                lineTo(4.0f, 8.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(4.0f, 10.0f)
                horizontalLineToRelative(10.0f)
                lineTo(14.0f, 9.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(14.0f, 12.0f)
                lineTo(4.0f, 12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(4.0f, 14.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(14.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(4.0f, 18.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-1.0f)
                lineTo(4.0f, 17.0f)
                close()
            }
        }
        .build()
        return _generalDisplaySmall!!
    }

private var _generalDisplaySmall: ImageVector? = null
