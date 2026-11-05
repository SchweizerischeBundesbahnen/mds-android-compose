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
                moveToRelative(9.25f, 2.867f)
                lineToRelative(0.757f, 0.454f)
                lineToRelative(3.415f, 2.05f)
                lineToRelative(1.974f, -1.975f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(0.354f, 0.353f)
                lineTo(18.0f, 5.293f)
                lineToRelative(1.896f, -1.897f)
                lineToRelative(0.354f, -0.353f)
                lineToRelative(0.354f, 0.353f)
                lineToRelative(1.973f, 1.974f)
                lineToRelative(3.416f, -2.049f)
                lineToRelative(0.757f, -0.454f)
                verticalLineToRelative(9.683f)
                arcToRelative(11.22f, 11.22f, 0.0f, false, true, 3.0f, 8.468f)
                arcToRelative(11.75f, 11.75f, 0.0f, false, true, -23.5f, 0.0f)
                arcToRelative(11.23f, 11.23f, 0.0f, false, true, 3.0f, -8.468f)
                lineTo(9.25f, 2.867f)
                moveToRelative(0.714f, 10.383f)
                arcToRelative(10.22f, 10.22f, 0.0f, false, false, -2.715f, 7.714f)
                lineTo(7.249f, 21.0f)
                arcToRelative(10.75f, 10.75f, 0.0f, true, false, 21.5f, 0.0f)
                verticalLineToRelative(-0.018f)
                lineToRelative(0.002f, -0.018f)
                arcToRelative(10.22f, 10.22f, 0.0f, false, false, -2.716f, -7.714f)
                close()
                moveTo(10.25f, 4.633f)
                verticalLineToRelative(7.617f)
                horizontalLineToRelative(15.5f)
                lineTo(25.75f, 4.633f)
                lineTo(22.757f, 6.43f)
                lineToRelative(-0.335f, 0.2f)
                lineToRelative(-0.276f, -0.275f)
                lineToRelative(-1.896f, -1.897f)
                lineToRelative(-1.896f, 1.897f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-0.354f, -0.353f)
                lineToRelative(-1.896f, -1.897f)
                lineToRelative(-1.896f, 1.897f)
                lineToRelative(-0.277f, 0.276f)
                lineToRelative(-0.334f, -0.201f)
                close()
                moveTo(22.095f, 18.845f)
                arcToRelative(0.52f, 0.52f, 0.0f, true, false, 0.0f, 1.04f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.0f, -1.04f)
                moveToRelative(-1.52f, 0.52f)
                arcToRelative(1.52f, 1.52f, 0.0f, true, true, 3.04f, 0.0f)
                arcToRelative(1.52f, 1.52f, 0.0f, false, true, -3.04f, 0.0f)
                moveToRelative(-7.19f, 0.0f)
                arcToRelative(0.52f, 0.52f, 0.0f, true, true, 1.04f, 0.0f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, -1.04f, 0.0f)
                moveToRelative(0.52f, -1.52f)
                arcToRelative(1.52f, 1.52f, 0.0f, true, false, 0.0f, 3.04f)
                arcToRelative(1.52f, 1.52f, 0.0f, false, false, 0.0f, -3.04f)
                moveToRelative(0.68f, 9.546f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, true, -2.61f, -2.363f)
                lineToRelative(0.83f, -0.556f)
                arcToRelative(6.25f, 6.25f, 0.0f, false, false, 10.39f, 0.0f)
                lineToRelative(0.83f, 0.556f)
                arcToRelative(7.25f, 7.25f, 0.0f, false, true, -9.44f, 2.363f)
            }
        }
        .build()
        return _faceKingMedium!!
    }

private var _faceKingMedium: ImageVector? = null
