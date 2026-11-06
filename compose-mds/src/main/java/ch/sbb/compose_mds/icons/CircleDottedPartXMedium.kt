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

public val SBBIcons.CircleDottedPartXMedium: ImageVector
    get() {
        if (_circleDottedPartXMedium != null) {
            return _circleDottedPartXMedium!!
        }
        _circleDottedPartXMedium = Builder(name = "CircleDottedPartXMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(18.511f, 4.26f)
                lineToRelative(-0.011f, -0.001f)
                verticalLineToRelative(12.844f)
                lineToRelative(10.923f, -6.76f)
                arcToRelative(13.832f, 13.832f, 0.0f, false, false, -2.91f, -3.142f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 18.51f, 4.26f)
                moveToRelative(0.363f, -0.985f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, true, 8.258f, 3.141f)
                curveToRelative(0.91f, 0.719f, 1.733f, 1.542f, 2.452f, 2.452f)
                quadToRelative(0.517f, 0.656f, 0.96f, 1.368f)
                lineToRelative(0.264f, 0.426f)
                lineToRelative(-0.426f, 0.263f)
                lineToRelative(-12.119f, 7.5f)
                lineToRelative(-0.763f, 0.472f)
                lineTo(17.499f, 4.26f)
                quadToRelative(-0.566f, 0.02f, -1.118f, 0.085f)
                lineToRelative(-0.116f, -0.993f)
                quadToRelative(0.61f, -0.072f, 1.234f, -0.093f)
                lineTo(17.499f, 3.25f)
                horizontalLineToRelative(0.5f)
                quadToRelative(0.44f, 0.0f, 0.874f, 0.025f)
                moveTo(11.28f, 6.001f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, 2.985f, -1.238f)
                lineToRelative(-0.271f, -0.963f)
                arcTo(14.7f, 14.7f, 0.0f, false, false, 10.79f, 5.13f)
                close()
                moveTo(7.2f, 9.487f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, 2.286f, -2.286f)
                lineToRelative(-0.62f, -0.785f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, -2.45f, 2.452f)
                close()
                moveTo(30.0f, 11.281f)
                curveToRelative(0.524f, 0.933f, 0.942f, 1.933f, 1.238f, 2.985f)
                lineToRelative(0.963f, -0.271f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, -1.329f, -3.204f)
                close()
                moveTo(4.763f, 14.266f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, 1.238f, -2.985f)
                lineToRelative(-0.872f, -0.49f)
                arcTo(14.7f, 14.7f, 0.0f, false, false, 3.8f, 13.995f)
                close()
                moveTo(31.656f, 16.382f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 3.236f)
                lineToRelative(0.993f, 0.116f)
                arcToRelative(15.0f, 15.0f, 0.0f, false, false, 0.0f, -3.468f)
                close()
                moveTo(4.25f, 18.0f)
                quadToRelative(0.0f, -0.821f, 0.094f, -1.618f)
                lineToRelative(-0.993f, -0.116f)
                quadToRelative(-0.1f, 0.854f, -0.101f, 1.734f)
                close()
                moveTo(31.237f, 21.734f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -1.238f, 2.985f)
                lineToRelative(0.872f, 0.49f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 1.329f, -3.204f)
                close()
                moveTo(28.799f, 26.513f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, true, -2.286f, 2.286f)
                lineToRelative(0.62f, 0.785f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, 2.45f, -2.452f)
                close()
                moveTo(24.719f, 29.999f)
                curveToRelative(-0.933f, 0.524f, -1.933f, 0.942f, -2.985f, 1.238f)
                lineToRelative(0.271f, 0.963f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 3.204f, -1.329f)
                close()
                moveTo(19.618f, 31.656f)
                quadToRelative(-0.796f, 0.094f, -1.618f, 0.094f)
                verticalLineToRelative(1.0f)
                quadToRelative(0.88f, 0.0f, 1.734f, -0.1f)
                close()
                moveTo(9.0f, 27.706f)
                lineToRelative(-4.146f, 4.147f)
                lineToRelative(-0.708f, -0.707f)
                lineTo(8.293f, 27.0f)
                lineToRelative(-4.147f, -4.147f)
                lineToRelative(0.708f, -0.707f)
                lineTo(9.0f, 26.293f)
                lineToRelative(4.146f, -4.147f)
                lineToRelative(0.708f, 0.707f)
                lineTo(9.707f, 27.0f)
                lineToRelative(4.147f, 4.146f)
                lineToRelative(-0.708f, 0.707f)
                close()
            }
        }
        .build()
        return _circleDottedPartXMedium!!
    }

private var _circleDottedPartXMedium: ImageVector? = null
