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

public val SBBIcons.AirplaneTrainSmall: ImageVector
    get() {
        if (_airplaneTrainSmall != null) {
            return _airplaneTrainSmall!!
        }
        _airplaneTrainSmall = Builder(name = "AirplaneTrainSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.434f, 2.0f)
                horizontalLineToRelative(3.448f)
                lineToRelative(0.1f, 0.368f)
                lineToRelative(1.5f, 5.5f)
                lineToRelative(-0.964f, 0.264f)
                lineTo(11.118f, 3.0f)
                lineTo(9.566f, 3.0f)
                lineToRelative(0.93f, 7.438f)
                lineToRelative(0.07f, 0.562f)
                lineTo(5.69f, 11.0f)
                lineToRelative(-0.137f, -0.276f)
                lineTo(4.69f, 9.0f)
                horizontalLineToRelative(-0.933f)
                lineToRelative(1.202f, 2.803f)
                lineToRelative(0.084f, 0.197f)
                lineToRelative(-0.084f, 0.197f)
                lineTo(3.758f, 15.0f)
                horizontalLineToRelative(0.933f)
                lineToRelative(0.862f, -1.724f)
                lineTo(5.69f, 13.0f)
                lineTo(8.0f, 13.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.309f, 14.0f)
                lineToRelative(-0.862f, 1.724f)
                lineTo(5.31f, 16.0f)
                lineTo(2.242f, 16.0f)
                lineToRelative(0.298f, -0.697f)
                lineTo(3.956f, 12.0f)
                lineTo(2.54f, 8.697f)
                lineTo(2.242f, 8.0f)
                horizontalLineToRelative(3.067f)
                lineToRelative(0.138f, 0.276f)
                lineTo(6.31f, 10.0f)
                horizontalLineToRelative(3.125f)
                lineToRelative(-0.93f, -7.438f)
                close()
                moveTo(3.646f, 19.646f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(0.707f, 0.708f)
                lineToRelative(-15.0f, 15.0f)
                close()
                moveTo(16.5f, 12.0f)
                lineTo(16.0f, 12.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.637f)
                lineToRelative(0.252f, 0.708f)
                lineToRelative(0.01f, 0.028f)
                lineToRelative(0.014f, 0.027f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.087f, 0.377f)
                curveToRelative(0.0f, 0.48f, -0.383f, 0.86f, -0.84f, 0.86f)
                lineTo(10.0f, 19.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.076f, 0.369f, 0.233f, 0.709f, 0.453f, 1.0f)
                lineTo(10.0f, 21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.503f)
                curveToRelative(0.22f, -0.291f, 0.377f, -0.631f, 0.453f, -1.0f)
                horizontalLineToRelative(2.21f)
                arcTo(1.85f, 1.85f, 0.0f, false, false, 22.0f, 18.14f)
                curveToRelative(0.0f, -0.287f, -0.063f, -0.553f, -0.178f, -0.794f)
                lineToRelative(-1.87f, -5.24f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -2.557f, -2.746f)
                lineToRelative(-0.39f, 0.92f)
                arcTo(3.6f, 3.6f, 0.0f, false, true, 18.828f, 12.0f)
                close()
                moveTo(15.5f, 21.0f)
                curveToRelative(0.649f, 0.0f, 1.206f, -0.42f, 1.414f, -1.0f)
                horizontalLineToRelative(-2.828f)
                curveToRelative(0.208f, 0.58f, 0.765f, 1.0f, 1.414f, 1.0f)
                moveToRelative(3.71f, -8.0f)
                lineToRelative(1.07f, 3.0f)
                lineTo(17.0f, 16.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(15.0f, 16.5f)
                lineTo(15.0f, 12.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _airplaneTrainSmall!!
    }

private var _airplaneTrainSmall: ImageVector? = null
