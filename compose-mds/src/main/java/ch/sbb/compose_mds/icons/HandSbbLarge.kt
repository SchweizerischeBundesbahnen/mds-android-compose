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

public val SBBIcons.HandSbbLarge: ImageVector
    get() {
        if (_handSbbLarge != null) {
            return _handSbbLarge!!
        }
        _handSbbLarge = Builder(
            name = "HandSbbLarge",
            defaultWidth = 48.0.dp,
            defaultHeight =
                48.0.dp,
            viewportWidth = 48.0f,
            viewportHeight = 48.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = NonZero,
            ) {
                moveTo(6.236f, 26.059f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.793f, 0.467f)
                lineToRelative(8.681f, 5.864f)
                curveToRelative(0.026f, -0.59f, 0.264f, -1.176f, 0.719f, -1.622f)
                curveToRelative(0.487f, -0.479f, 1.193f, -0.768f, 2.071f, -0.768f)
                horizontalLineToRelative(4.229f)
                curveToRelative(3.887f, 0.063f, 6.378f, 2.3f, 8.422f, 3.978f)
                lineToRelative(10.653f, 8.124f)
                lineTo(43.98f, 43.0f)
                horizontalLineTo(27.293f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineToRelative(-7.977f)
                lineToRelative(-0.14f, -0.12f)
                lineToRelative(-12.25f, -10.44f)
                lineToRelative(-0.177f, -0.166f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 1.487f, -4.215f)
                moveToRelative(0.125f, 0.992f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.305f, 1.63f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.52f, 0.999f)
                horizontalLineToRelative(-0.002f)
                lineTo(17.684f, 40.0f)
                horizontalLineToRelative(8.023f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(41.02f)
                lineToRelative(-9.483f, -7.232f)
                lineToRelative(-0.008f, -0.006f)
                lineToRelative(-0.006f, -0.005f)
                curveToRelative(-2.03f, -1.667f, -4.184f, -3.577f, -7.488f, -3.746f)
                lineTo(23.712f, 31.0f)
                horizontalLineTo(19.5f)
                curveToRelative(-0.651f, 0.0f, -1.094f, 0.21f, -1.371f, 0.482f)
                arcToRelative(1.42f, 1.42f, 0.0f, false, false, -0.424f, 1.018f)
                curveToRelative(0.0f, 0.373f, 0.143f, 0.742f, 0.424f, 1.018f)
                curveToRelative(0.277f, 0.271f, 0.72f, 0.482f, 1.371f, 0.482f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.878f, 0.0f, -1.584f, -0.29f, -2.071f, -0.768f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.29f, -0.346f)
                lineToRelative(-9.67f, -6.532f)
                lineToRelative(-0.009f, -0.006f)
                lineToRelative(-0.01f, -0.008f)
                lineToRelative(-0.12f, -0.082f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -0.969f, -0.207f)
                moveTo(9.6f, 13.41f)
                horizontalLineToRelative(6.79f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(3.22f)
                verticalLineToRelative(5.41f)
                horizontalLineToRelative(6.83f)
                lineTo(20.95f, 8.0f)
                horizontalLineToRelative(4.08f)
                lineTo(32.0f, 15.0f)
                lineToRelative(-6.97f, 7.0f)
                horizontalLineToRelative(-4.08f)
                lineToRelative(5.49f, -5.37f)
                horizontalLineToRelative(-6.83f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-3.22f)
                verticalLineToRelative(-5.37f)
                horizontalLineTo(9.6f)
                lineTo(15.09f, 22.0f)
                horizontalLineToRelative(-4.08f)
                lineTo(4.0f, 15.0f)
                lineToRelative(7.01f, -7.0f)
                horizontalLineToRelative(4.08f)
                close()
            }
        }
            .build()
        return _handSbbLarge!!
    }

private var _handSbbLarge: ImageVector? = null
