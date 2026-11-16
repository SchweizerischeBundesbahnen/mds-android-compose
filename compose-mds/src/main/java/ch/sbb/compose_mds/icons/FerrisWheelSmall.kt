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
        _ferrisWheelSmall = Builder(name = "FerrisWheelSmall", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 4.0f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, 0.5f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.5f, 0.5f)
                moveToRelative(-1.368f, 0.116f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 2.736f, 0.0f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 3.234f, 1.34f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.943f, 1.942f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 1.346f, 3.28f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.016f, 2.736f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, -1.331f, 3.188f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.943f, 1.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.004f, 0.603f)
                lineToRelative(0.867f, 2.17f)
                lineToRelative(0.274f, 0.685f)
                lineTo(7.262f, 22.0f)
                lineToRelative(0.274f, -0.686f)
                lineToRelative(0.866f, -2.169f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.003f, -0.602f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -1.943f, -1.941f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, -1.347f, -3.28f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.016f, -2.736f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 1.33f, -3.188f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 1.943f, -1.943f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, true, 3.234f, -1.339f)
                moveTo(6.427f, 6.261f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.166f, 0.166f)
                close()
                moveTo(6.265f, 17.576f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.159f, 0.159f)
                close()
                moveTo(17.577f, 17.733f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.157f, -0.157f)
                close()
                moveTo(17.739f, 6.427f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.166f, -0.166f)
                quadToRelative(0.084f, 0.082f, 0.166f, 0.166f)
                moveToRelative(2.407f, 5.27f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, 0.0f, 0.707f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, -0.707f)
                moveToRelative(-7.086f, -0.757f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -2.121f, 2.12f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.121f, -2.12f)
                moveToRelative(1.026f, 2.439f)
                curveToRelative(0.261f, -0.396f, 0.414f, -0.87f, 0.414f, -1.379f)
                curveToRelative(0.0f, -0.51f, -0.153f, -0.983f, -0.414f, -1.379f)
                lineToRelative(3.203f, -3.203f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 19.0f, 12.0f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, true, -1.71f, 4.582f)
                close()
                moveTo(9.914f, 13.379f)
                lineTo(6.71f, 16.582f)
                arcTo(6.97f, 6.97f, 0.0f, false, true, 5.0f, 12.0f)
                curveToRelative(0.0f, -1.753f, 0.645f, -3.355f, 1.71f, -4.583f)
                lineToRelative(3.204f, 3.204f)
                curveToRelative(-0.262f, 0.396f, -0.414f, 0.87f, -0.414f, 1.379f)
                curveToRelative(0.0f, 0.51f, 0.152f, 0.983f, 0.414f, 1.379f)
                moveToRelative(0.707f, -3.465f)
                curveToRelative(0.396f, -0.262f, 0.87f, -0.414f, 1.379f, -0.414f)
                curveToRelative(0.51f, 0.0f, 0.983f, 0.153f, 1.379f, 0.414f)
                lineToRelative(3.203f, -3.203f)
                arcTo(6.97f, 6.97f, 0.0f, false, false, 12.0f, 5.0f)
                arcToRelative(6.97f, 6.97f, 0.0f, false, false, -4.583f, 1.71f)
                close()
                moveTo(3.854f, 12.304f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, false, 0.0f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 0.707f)
                moveTo(8.738f, 21.0f)
                lineToRelative(0.769f, -1.92f)
                lineToRelative(1.83f, -4.58f)
                horizontalLineToRelative(1.325f)
                lineToRelative(1.831f, 4.58f)
                lineToRelative(0.769f, 1.92f)
                close()
                moveTo(8.775f, 18.214f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.358f, -0.925f)
                lineToRelative(2.88f, -2.88f)
                close()
                moveTo(16.582f, 17.289f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -1.358f, 0.925f)
                lineTo(13.7f, 14.408f)
                close()
            }
        }
        .build()
        return _ferrisWheelSmall!!
    }

private var _ferrisWheelSmall: ImageVector? = null
