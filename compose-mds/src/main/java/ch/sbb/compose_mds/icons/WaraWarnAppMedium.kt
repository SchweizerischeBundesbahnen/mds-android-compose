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

public val SBBIcons.WaraWarnAppMedium: ImageVector
    get() {
        if (_waraWarnAppMedium != null) {
            return _waraWarnAppMedium!!
        }
        _waraWarnAppMedium = Builder(name = "WaraWarnAppMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(27.049f, 7.203f)
                lineToRelative(0.798f, 0.399f)
                lineToRelative(-0.756f, 0.472f)
                lineToRelative(-4.928f, 3.08f)
                horizontalLineToRelative(5.463f)
                verticalLineToRelative(1.0f)
                lineTo(11.31f, 12.154f)
                verticalLineToRelative(6.406f)
                lineTo(4.903f, 18.56f)
                verticalLineToRelative(7.009f)
                horizontalLineToRelative(14.651f)
                verticalLineToRelative(1.0f)
                lineTo(9.672f, 26.569f)
                arcToRelative(1.304f, 1.304f, 0.0f, false, true, -1.265f, 1.601f)
                arcTo(1.3f, 1.3f, 0.0f, false, true, 7.14f, 26.57f)
                lineTo(3.903f, 26.57f)
                verticalLineToRelative(-1.601f)
                lineTo(2.0f, 24.969f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.903f)
                lineTo(3.903f, 17.56f)
                horizontalLineToRelative(6.406f)
                verticalLineToRelative(-5.406f)
                lineTo(6.805f, 12.154f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(13.471f)
                lineToRelative(5.528f, -3.456f)
                lineToRelative(-5.609f, -2.804f)
                lineToRelative(0.447f, -0.894f)
                close()
                moveTo(8.396f, 26.57f)
                arcToRelative(0.3f, 0.3f, 0.0f, true, false, 0.021f, 0.0f)
                close()
                moveTo(13.513f, 14.359f)
                verticalLineToRelative(4.203f)
                horizontalLineToRelative(9.007f)
                verticalLineToRelative(-4.203f)
                close()
                moveTo(14.513f, 15.359f)
                horizontalLineToRelative(7.007f)
                verticalLineToRelative(2.203f)
                horizontalLineToRelative(-7.007f)
                close()
                moveTo(33.688f, 30.673f)
                lineTo(27.282f, 16.258f)
                lineTo(26.825f, 15.229f)
                lineTo(26.368f, 16.258f)
                lineTo(19.962f, 30.673f)
                lineTo(19.649f, 31.376f)
                horizontalLineToRelative(14.352f)
                close()
                moveTo(33.688f, 30.673f)
                lineTo(33.232f, 30.876f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(32.463f, 30.376f)
                lineTo(21.188f, 30.376f)
                lineToRelative(5.637f, -12.685f)
                close()
                moveTo(27.325f, 26.871f)
                verticalLineToRelative(1.602f)
                horizontalLineToRelative(-1.0f)
                lineTo(26.325f, 26.87f)
                close()
                moveTo(27.325f, 25.269f)
                verticalLineToRelative(-3.203f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(3.203f)
                close()
            }
        }
        .build()
        return _waraWarnAppMedium!!
    }

private var _waraWarnAppMedium: ImageVector? = null
