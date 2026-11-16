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

public val SBBIcons.AppIconLarge: ImageVector
    get() {
        if (_appIconLarge != null) {
            return _appIconLarge!!
        }
        _appIconLarge = Builder(name = "AppIconLarge", defaultWidth = 48.0.dp, defaultHeight =
                48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(37.45f, 5.0f)
                arcTo(5.55f, 5.55f, 0.0f, false, true, 43.0f, 10.55f)
                verticalLineToRelative(26.9f)
                arcTo(5.55f, 5.55f, 0.0f, false, true, 37.45f, 43.0f)
                horizontalLineToRelative(-26.9f)
                arcTo(5.55f, 5.55f, 0.0f, false, true, 5.0f, 37.45f)
                verticalLineToRelative(-26.9f)
                arcTo(5.55f, 5.55f, 0.0f, false, true, 10.55f, 5.0f)
                close()
                moveTo(37.45f, 44.0f)
                arcTo(6.55f, 6.55f, 0.0f, false, false, 44.0f, 37.45f)
                verticalLineToRelative(-26.9f)
                arcTo(6.55f, 6.55f, 0.0f, false, false, 37.45f, 4.0f)
                horizontalLineToRelative(-26.9f)
                arcTo(6.55f, 6.55f, 0.0f, false, false, 4.0f, 10.55f)
                verticalLineToRelative(26.9f)
                arcTo(6.55f, 6.55f, 0.0f, false, false, 10.55f, 44.0f)
                close()
                moveTo(31.84f, 22.02f)
                lineTo(26.74f, 17.0f)
                horizontalLineToRelative(3.79f)
                lineTo(37.0f, 23.5f)
                lineTo(30.53f, 30.0f)
                horizontalLineToRelative(-3.79f)
                lineToRelative(5.1f, -4.99f)
                lineTo(25.5f, 25.01f)
                lineTo(25.5f, 30.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.99f)
                horizontalLineToRelative(-6.3f)
                lineTo(21.3f, 30.0f)
                horizontalLineToRelative(-3.79f)
                lineTo(11.0f, 23.5f)
                lineToRelative(6.51f, -6.5f)
                horizontalLineToRelative(3.79f)
                lineToRelative(-5.1f, 5.02f)
                horizontalLineToRelative(6.3f)
                lineTo(22.5f, 17.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(5.02f)
                close()
            }
        }
        .build()
        return _appIconLarge!!
    }

private var _appIconLarge: ImageVector? = null
