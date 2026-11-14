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

public val SBBIcons.FaceKingMedium: ImageVector
    get() {
        if (_faceKingMedium != null) {
            return _faceKingMedium!!
        }
        _faceKingMedium = Builder(name = "FaceKingMedium", defaultWidth = 36.0.dp, defaultHeight =
                36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.25f, 12.55f)
                lineTo(9.25f, 2.867f)
                lineToRelative(0.757f, 0.454f)
                lineToRelative(3.415f, 2.05f)
                lineToRelative(1.974f, -1.975f)
                lineToRelative(0.354f, -0.353f)
                lineTo(18.0f, 5.293f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(2.327f, 2.327f)
                lineToRelative(3.416f, -2.049f)
                lineToRelative(0.757f, -0.454f)
                verticalLineToRelative(9.682f)
                arcToRelative(11.23f, 11.23f, 0.0f, false, true, 2.999f, 8.487f)
                arcToRelative(11.75f, 11.75f, 0.0f, false, true, -23.485f, 0.547f)
                lineTo(6.25f, 21.0f)
                arcToRelative(11.23f, 11.23f, 0.0f, false, true, 3.0f, -8.45f)
                moveToRelative(0.715f, 0.7f)
                arcToRelative(10.22f, 10.22f, 0.0f, false, false, -2.716f, 7.714f)
                lineTo(7.249f, 21.0f)
                arcToRelative(10.75f, 10.75f, 0.0f, true, false, 21.5f, 0.0f)
                verticalLineToRelative(-0.019f)
                lineToRelative(0.003f, -0.017f)
                lineToRelative(0.498f, 0.036f)
                lineToRelative(-0.498f, -0.036f)
                arcToRelative(10.23f, 10.23f, 0.0f, false, false, -2.717f, -7.714f)
                close()
                moveTo(18.0f, 6.707f)
                lineToRelative(-2.25f, -2.25f)
                lineToRelative(-2.173f, 2.173f)
                lineToRelative(-0.334f, -0.201f)
                lineToRelative(-2.993f, -1.796f)
                verticalLineToRelative(7.617f)
                horizontalLineToRelative(15.5f)
                lineTo(25.75f, 4.633f)
                lineToRelative(-2.993f, 1.796f)
                lineToRelative(-0.334f, 0.2f)
                lineToRelative(-2.173f, -2.172f)
                close()
                moveTo(22.615f, 19.364f)
                arcToRelative(0.52f, 0.52f, 0.0f, true, false, -1.04f, 0.002f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 1.04f, -0.002f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.52f, 1.52f, 0.0f, true, true, -3.042f, 0.0f)
                arcToRelative(1.52f, 1.52f, 0.0f, false, true, 3.042f, 0.0f)
                moveToRelative(-9.71f, -0.519f)
                arcToRelative(0.52f, 0.52f, 0.0f, true, true, 0.0f, 1.041f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.0f, -1.041f)
                moveToRelative(0.0f, 2.04f)
                arcToRelative(1.52f, 1.52f, 0.0f, true, false, -0.001f, -3.042f)
                arcToRelative(1.52f, 1.52f, 0.0f, false, false, 0.0f, 3.042f)
                moveToRelative(10.12f, 4.143f)
                arcToRelative(7.252f, 7.252f, 0.0f, false, true, -12.051f, 0.0f)
                lineToRelative(0.832f, -0.556f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 10.389f, 0.0f)
                close()
            }
        }
        .build()
        return _faceKingMedium!!
    }

private var _faceKingMedium: ImageVector? = null
