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

public val SBBIcons.FerrisWheelSmall: ImageVector
    get() {
        if (_ferrisWheelSmall != null) {
            return _ferrisWheelSmall!!
        }
        _ferrisWheelSmall = Builder(
            name = "FerrisWheelSmall",
            defaultWidth = 24.0.dp,
            defaultHeight =
                24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(12.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveTo(12.0f, 2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.368f, 2.116f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 3.234f, 1.34f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.943f, 1.942f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 1.346f, 3.28f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.016f, 2.736f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, -1.33f, 3.188f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.943f, 1.943f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.005f, 0.602f)
                lineToRelative(0.867f, 2.167f)
                lineToRelative(0.274f, 0.686f)
                lineTo(7.261f, 22.0f)
                lineToRelative(0.275f, -0.686f)
                lineToRelative(0.867f, -2.167f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.005f, -0.602f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.943f, -1.943f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, -1.346f, -3.28f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.016f, -2.736f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 1.33f, -3.188f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.943f, -1.943f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 3.234f, -1.339f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(6.427f, 6.26f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.166f, 0.166f)
                close()
                moveTo(6.26f, 17.575f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.165f, 0.165f)
                close()
                moveTo(17.573f, 17.74f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.165f, -0.165f)
                close()
                moveTo(17.738f, 6.428f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.166f, -0.166f)
                quadToRelative(0.084f, 0.082f, 0.166f, 0.166f)
                moveToRelative(2.407f, 5.977f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.708f, -0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, 0.707f)
                moveTo(13.5f, 12.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveToRelative(-3.586f, 1.379f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 9.5f, 12.0f)
                curveToRelative(0.0f, -0.51f, 0.152f, -0.983f, 0.414f, -1.379f)
                lineTo(6.71f, 7.416f)
                arcTo(6.97f, 6.97f, 0.0f, false, false, 5.0f, 12.0f)
                curveToRelative(0.0f, 1.753f, 0.644f, 3.355f, 1.71f, 4.584f)
                close()
                moveTo(10.621f, 9.914f)
                lineTo(7.416f, 6.71f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 12.0f, 5.0f)
                curveToRelative(1.753f, 0.0f, 3.356f, 0.645f, 4.584f, 1.71f)
                lineToRelative(-3.205f, 3.204f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 9.5f)
                curveToRelative(-0.51f, 0.0f, -0.983f, 0.152f, -1.379f, 0.414f)
                moveToRelative(3.465f, 0.708f)
                lineToRelative(3.205f, -3.205f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 19.0f, 12.0f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -1.71f, 4.584f)
                lineToRelative(-3.204f, -3.205f)
                curveToRelative(0.262f, -0.396f, 0.414f, -0.87f, 0.414f, -1.379f)
                curveToRelative(0.0f, -0.51f, -0.153f, -0.983f, -0.414f, -1.378f)
                moveToRelative(-10.232f, 0.974f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.707f)
                moveToRelative(9.848f, 2.813f)
                lineToRelative(2.882f, 2.882f)
                curveToRelative(-0.414f, 0.358f, -0.87f, 0.67f, -1.36f, 0.924f)
                close()
                moveTo(10.297f, 14.409f)
                lineTo(8.776f, 18.215f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.36f, -0.924f)
                close()
                moveTo(9.507f, 19.08f)
                lineTo(11.339f, 14.5f)
                horizontalLineToRelative(1.323f)
                lineToRelative(1.831f, 4.58f)
                lineToRelative(0.768f, 1.92f)
                lineTo(8.74f, 21.0f)
                close()
            }
        }
            .build()
        return _ferrisWheelSmall!!
    }

private var _ferrisWheelSmall: ImageVector? = null
