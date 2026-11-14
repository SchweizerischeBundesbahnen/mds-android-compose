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

public val SBBIcons.LongDistanceCoachProfileSmall: ImageVector
    get() {
        if (_longDistanceCoachProfileSmall != null) {
            return _longDistanceCoachProfileSmall!!
        }
        _longDistanceCoachProfileSmall = Builder(name = "LongDistanceCoachProfileSmall",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(21.0f, 16.5f)
                verticalLineToRelative(-2.578f)
                lineToRelative(-0.009f, -0.157f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.118f, -0.451f)
                lineToRelative(-3.57f, -8.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.382f, -0.29f)
                lineToRelative(-0.072f, -0.004f)
                lineTo(2.0f, 5.02f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(14.85f)
                lineToRelative(0.109f, 0.004f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.257f, 0.88f)
                verticalLineToRelative(0.003f)
                lineTo(18.008f, 5.0f)
                lineToRelative(0.21f, -0.093f)
                lineToRelative(0.041f, 0.093f)
                lineTo(20.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 22.0f, 6.5f)
                lineTo(22.0f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(21.0f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1.795f)
                lineToRelative(3.081f, 6.907f)
                lineToRelative(0.003f, 0.004f)
                curveToRelative(0.138f, 0.317f, 0.21f, 0.66f, 0.211f, 1.007f)
                lineToRelative(-0.6f, 0.002f)
                horizontalLineToRelative(0.1f)
                lineToRelative(0.5f, -0.002f)
                lineTo(22.0f, 16.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-4.542f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.917f, 0.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(8.041f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.918f, 0.0f)
                lineTo(20.5f, 17.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                moveTo(18.0f, 5.003f)
                lineToRelative(-0.24f, 0.107f)
                lineToRelative(-0.189f, 0.085f)
                close()
                moveTo(5.0f, 11.0f)
                lineTo(5.0f, 6.0f)
                lineTo(2.0f, 6.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 10.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(16.857f, 6.298f)
                lineTo(16.726f, 6.0f)
                horizontalLineToRelative(-3.89f)
                lineToRelative(0.184f, 0.638f)
                lineTo(15.123f, 14.0f)
                horizontalLineToRelative(5.146f)
                lineToRelative(-0.312f, -0.702f)
                close()
                moveTo(18.732f, 13.0f)
                horizontalLineToRelative(-2.855f)
                lineToRelative(-1.714f, -6.0f)
                horizontalLineToRelative(1.911f)
                close()
                moveTo(15.0f, 17.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                moveTo(11.98f, 6.362f)
                lineTo(11.878f, 6.0f)
                lineTo(6.0f, 6.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(7.315f)
                lineToRelative(-0.184f, -0.638f)
                close()
                moveTo(11.987f, 10.0f)
                lineTo(7.0f, 10.0f)
                lineTo(7.0f, 7.0f)
                horizontalLineToRelative(4.124f)
                close()
                moveTo(13.0f, 12.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _longDistanceCoachProfileSmall!!
    }

private var _longDistanceCoachProfileSmall: ImageVector? = null
