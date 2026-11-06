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

public val SBBIcons.LongDistanceCoachProfileLarge: ImageVector
    get() {
        if (_longDistanceCoachProfileLarge != null) {
            return _longDistanceCoachProfileLarge!!
        }
        _longDistanceCoachProfileLarge = Builder(name = "LongDistanceCoachProfileLarge",
                defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 48.0f,
                viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.38f, 8.047f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.096f, 1.468f)
                verticalLineToRelative(0.002f)
                lineToRelative(0.216f, 0.483f)
                lineTo(41.5f, 10.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.5f, 2.5f)
                lineTo(44.0f, 18.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-5.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-4.361f)
                lineToRelative(6.477f, 14.517f)
                lineToRelative(0.002f, 0.003f)
                curveToRelative(0.25f, 0.574f, 0.379f, 1.193f, 0.382f, 1.817f)
                lineTo(44.0f, 32.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, 2.5f)
                horizontalLineToRelative(-9.523f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -10.954f, 0.0f)
                lineTo(4.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(17.023f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 10.954f, 0.0f)
                lineTo(41.5f, 34.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, -1.5f)
                verticalLineToRelative(-5.157f)
                lineToRelative(-0.006f, -0.184f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -0.29f, -1.235f)
                lineToRelative(-7.14f, -16.0f)
                verticalLineToRelative(-0.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.257f, -0.879f)
                lineToRelative(-0.109f, -0.004f)
                lineTo(4.0f, 9.04f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(30.201f)
                close()
                moveTo(26.5f, 30.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, false, 0.001f, 9.001f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 26.5f, 30.0f)
                moveToRelative(7.257f, -17.702f)
                lineToRelative(6.2f, 14.0f)
                lineToRelative(0.312f, 0.702f)
                horizontalLineToRelative(-9.146f)
                lineTo(27.02f, 12.638f)
                lineTo(26.837f, 12.0f)
                horizontalLineToRelative(6.788f)
                close()
                moveTo(31.877f, 26.0f)
                horizontalLineToRelative(6.855f)
                lineToRelative(-5.757f, -13.0f)
                horizontalLineToRelative(-4.812f)
                close()
                moveTo(27.0f, 25.0f)
                lineTo(4.0f, 25.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(23.0f)
                close()
                moveTo(10.0f, 21.0f)
                lineTo(4.0f, 21.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-7.0f)
                lineTo(4.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(23.98f, 12.362f)
                lineTo(26.28f, 20.362f)
                lineTo(26.464f, 21.0f)
                lineTo(13.0f, 21.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(10.877f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(11.136f)
                lineToRelative(-2.012f, -7.0f)
                lineTo(14.0f, 13.0f)
                close()
            }
        }
        .build()
        return _longDistanceCoachProfileLarge!!
    }

private var _longDistanceCoachProfileLarge: ImageVector? = null
