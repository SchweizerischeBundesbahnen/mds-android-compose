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

public val SBBIcons.SignExclamationPointMedium: ImageVector
    get() {
        if (_signExclamationPointMedium != null) {
            return _signExclamationPointMedium!!
        }
        _signExclamationPointMedium = Builder(name = "SignExclamationPointMedium", defaultWidth =
                36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight =
                36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(17.698f, 4.277f)
                lineToRelative(13.05f, 26.25f)
                lineToRelative(0.359f, 0.723f)
                lineTo(3.393f, 31.25f)
                lineToRelative(0.36f, -0.723f)
                lineToRelative(13.05f, -26.25f)
                lineToRelative(0.446f, -0.9f)
                close()
                moveTo(5.006f, 30.25f)
                horizontalLineToRelative(24.487f)
                lineTo(17.249f, 5.623f)
                close()
                moveTo(17.75f, 24.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.75f, 21.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _signExclamationPointMedium!!
    }

private var _signExclamationPointMedium: ImageVector? = null
