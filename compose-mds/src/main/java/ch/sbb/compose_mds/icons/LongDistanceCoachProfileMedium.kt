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

public val SBBIcons.LongDistanceCoachProfileMedium: ImageVector
    get() {
        if (_longDistanceCoachProfileMedium != null) {
            return _longDistanceCoachProfileMedium!!
        }
        _longDistanceCoachProfileMedium = Builder(name = "LongDistanceCoachProfileMedium",
                defaultWidth = 36.0.dp, defaultHeight = 36.0.dp, viewportWidth = 36.0f,
                viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(31.75f, 24.75f)
                verticalLineToRelative(-3.867f)
                lineToRelative(-0.015f, -0.262f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -0.197f, -0.752f)
                lineTo(26.184f, 7.87f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.767f, -0.579f)
                lineToRelative(-0.143f, -0.01f)
                lineTo(3.0f, 7.281f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(22.276f)
                lineToRelative(0.144f, 0.005f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.676f, 1.174f)
                verticalLineToRelative(0.002f)
                lineToRelative(-0.456f, 0.203f)
                lineToRelative(-0.176f, 0.08f)
                lineToRelative(0.633f, -0.283f)
                lineToRelative(0.128f, 0.288f)
                horizontalLineToRelative(3.525f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(3.75f)
                horizontalLineToRelative(-1.0f)
                lineTo(31.75f, 9.75f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                horizontalLineToRelative(-3.078f)
                lineToRelative(4.78f, 10.712f)
                lineToRelative(0.002f, 0.005f)
                lineToRelative(-0.44f, 0.19f)
                lineToRelative(-0.018f, 0.008f)
                lineToRelative(0.458f, -0.198f)
                curveToRelative(0.17f, 0.39f, 0.267f, 0.806f, 0.29f, 1.23f)
                lineToRelative(0.006f, 0.18f)
                verticalLineToRelative(3.873f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-7.03f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, -8.44f, 0.0f)
                lineTo(3.0f, 26.75f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.28f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 8.44f, 0.0f)
                horizontalLineToRelative(7.03f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                moveToRelative(-24.5f, -8.5f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 9.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.25f)
                verticalLineToRelative(5.0f)
                lineTo(3.0f, 15.25f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(25.058f, 9.548f)
                lineTo(24.926f, 9.25f)
                horizontalLineToRelative(-5.34f)
                lineToRelative(0.184f, 0.638f)
                lineToRelative(3.103f, 10.862f)
                horizontalLineToRelative(7.146f)
                lineToRelative(-0.312f, -0.702f)
                close()
                moveTo(28.482f, 19.75f)
                horizontalLineToRelative(-4.855f)
                lineToRelative(-2.714f, -9.5f)
                horizontalLineToRelative(3.361f)
                close()
                moveTo(22.75f, 26.25f)
                arcToRelative(3.25f, 3.25f, 0.0f, true, false, -6.5f, 0.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, false, 6.5f, 0.0f)
                moveTo(17.73f, 9.613f)
                lineToRelative(-0.103f, -0.363f)
                lineTo(9.25f, 9.25f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(10.389f)
                lineToRelative(-0.184f, -0.637f)
                close()
                moveTo(18.31f, 15.25f)
                horizontalLineToRelative(-8.06f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.624f)
                close()
                moveTo(19.5f, 18.25f)
                verticalLineToRelative(1.0f)
                lineTo(3.0f, 19.25f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _longDistanceCoachProfileMedium!!
    }

private var _longDistanceCoachProfileMedium: ImageVector? = null
