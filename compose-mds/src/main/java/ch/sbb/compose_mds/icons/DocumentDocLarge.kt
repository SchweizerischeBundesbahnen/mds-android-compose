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

public val SBBIcons.DocumentDocLarge: ImageVector
    get() {
        if (_documentDocLarge != null) {
            return _documentDocLarge!!
        }
        _documentDocLarge = Builder(name = "DocumentDocLarge", defaultWidth = 48.0.dp, defaultHeight
                = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.0f, 18.293f)
                lineTo(35.0f, 39.0f)
                lineTo(12.0f, 39.0f)
                verticalLineToRelative(-0.5f)
                lineToRelative(0.02f, -30.0f)
                lineTo(12.02f, 8.0f)
                horizontalLineToRelative(12.687f)
                close()
                moveTo(13.0f, 38.0f)
                horizontalLineToRelative(21.0f)
                lineTo(34.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 9.0f)
                lineTo(13.02f, 9.0f)
                close()
                moveTo(29.12f, 29.28f)
                arcToRelative(2.275f, 2.275f, 0.0f, false, true, 1.78f, 0.74f)
                curveToRelative(0.31f, 0.31f, 0.496f, 0.722f, 0.52f, 1.16f)
                horizontalLineToRelative(-1.14f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.4f, -0.68f)
                arcToRelative(1.302f, 1.302f, 0.0f, false, false, -2.0f, 0.38f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, false, -0.28f, 1.18f)
                curveToRelative(-0.021f, 0.417f, 0.076f, 0.834f, 0.28f, 1.2f)
                arcToRelative(1.22f, 1.22f, 0.0f, false, false, 1.12f, 0.62f)
                arcToRelative(1.07f, 1.07f, 0.0f, false, false, 0.82f, -0.32f)
                curveToRelative(0.236f, -0.242f, 0.371f, -0.563f, 0.38f, -0.9f)
                lineToRelative(1.3f, 0.02f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, true, -0.56f, 1.42f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, true, -1.82f, 0.76f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -2.0f, -0.88f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.6f, -1.9f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 0.72f, -2.0f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, true, 1.88f, -0.8f)
                moveToRelative(-5.62f, 0.02f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.78f, 0.7f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 0.78f, 2.0f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -0.6f, 1.88f)
                curveToRelative(-0.24f, 0.296f, -0.547f, 0.531f, -0.895f, 0.687f)
                curveToRelative(-0.346f, 0.157f, -0.725f, 0.23f, -1.105f, 0.213f)
                arcToRelative(2.48f, 2.48f, 0.0f, false, true, -2.0f, -0.92f)
                arcToRelative(2.93f, 2.93f, 0.0f, false, true, -0.58f, -1.86f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, true, 0.76f, -2.0f)
                arcToRelative(2.53f, 2.53f, 0.0f, false, true, 1.86f, -0.7f)
                moveToRelative(-5.86f, 0.2f)
                curveToRelative(0.345f, -0.011f, 0.69f, 0.036f, 1.02f, 0.14f)
                curveToRelative(0.284f, 0.075f, 0.545f, 0.22f, 0.76f, 0.42f)
                arcToRelative(2.564f, 2.564f, 0.0f, false, true, 0.8f, 2.0f)
                arcToRelative(2.84f, 2.84f, 0.0f, false, true, -0.76f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.74f, 0.48f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -1.06f, 0.14f)
                lineTo(15.5f, 34.68f)
                lineTo(15.5f, 29.5f)
                close()
                moveTo(23.38f, 30.26f)
                horizontalLineToRelative(0.12f)
                arcToRelative(1.303f, 1.303f, 0.0f, false, false, -1.04f, 0.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.4f, 1.32f)
                curveToRelative(-0.033f, 0.48f, 0.109f, 0.956f, 0.4f, 1.34f)
                curveToRelative(0.126f, 0.146f, 0.283f, 0.262f, 0.46f, 0.34f)
                curveToRelative(0.192f, 0.096f, 0.405f, 0.144f, 0.62f, 0.14f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, false, 1.0f, -0.44f)
                curveToRelative(0.298f, -0.396f, 0.447f, -0.885f, 0.42f, -1.38f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.4f, -1.32f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, false, -1.18f, -0.5f)
                moveToRelative(-6.72f, 3.56f)
                horizontalLineToRelative(0.84f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 0.66f, 0.0f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.46f, -0.32f)
                curveToRelative(0.297f, -0.381f, 0.447f, -0.857f, 0.42f, -1.34f)
                arcToRelative(1.78f, 1.78f, 0.0f, false, false, -0.38f, -1.24f)
                arcToRelative(1.58f, 1.58f, 0.0f, false, false, -1.16f, -0.4f)
                lineToRelative(-0.84f, -0.04f)
                close()
                moveTo(25.0f, 18.0f)
                horizontalLineToRelative(8.293f)
                lineTo(25.0f, 9.707f)
                close()
            }
        }
        .build()
        return _documentDocLarge!!
    }

private var _documentDocLarge: ImageVector? = null
