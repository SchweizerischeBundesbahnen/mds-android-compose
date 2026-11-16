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

public val SBBIcons.CloudSnowflakeMedium: ImageVector
    get() {
        if (_cloudSnowflakeMedium != null) {
            return _cloudSnowflakeMedium!!
        }
        _cloudSnowflakeMedium = Builder(name = "CloudSnowflakeMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.406f, 11.717f)
                curveToRelative(1.329f, -2.37f, 3.804f, -2.955f, 5.802f, -2.23f)
                curveToRelative(1.064f, 0.385f, 2.0f, 1.144f, 2.556f, 2.203f)
                curveToRelative(0.482f, 0.92f, 0.661f, 2.041f, 0.415f, 3.296f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, true, 1.657f, 0.877f)
                curveToRelative(0.54f, 0.583f, 0.833f, 1.367f, 0.895f, 2.166f)
                curveToRelative(0.123f, 1.587f, -0.666f, 3.406f, -2.547f, 4.022f)
                lineToRelative(-0.31f, -0.95f)
                curveToRelative(1.337f, -0.438f, 1.957f, -1.747f, 1.86f, -2.994f)
                curveToRelative(-0.048f, -0.617f, -0.271f, -1.175f, -0.632f, -1.564f)
                curveToRelative(-0.35f, -0.378f, -0.852f, -0.62f, -1.53f, -0.594f)
                lineToRelative(-0.021f, -0.5f)
                lineToRelative(-0.48f, -0.142f)
                curveToRelative(0.379f, -1.274f, 0.233f, -2.339f, -0.193f, -3.153f)
                arcToRelative(3.67f, 3.67f, 0.0f, false, false, -2.012f, -1.728f)
                curveToRelative(-1.686f, -0.611f, -3.8f, -0.064f, -4.81f, 2.225f)
                lineToRelative(-0.457f, -0.202f)
                lineToRelative(-0.317f, 0.388f)
                curveToRelative(-1.626f, -1.333f, -4.28f, -0.07f, -3.984f, 2.403f)
                lineToRelative(0.066f, 0.56f)
                horizontalLineToRelative(-0.563f)
                curveToRelative(-1.065f, 0.0f, -1.86f, 0.956f, -1.986f, 2.231f)
                curveToRelative(-0.122f, 1.24f, 0.433f, 2.538f, 1.85f, 3.019f)
                lineToRelative(-0.321f, 0.947f)
                curveToRelative(-1.96f, -0.665f, -2.68f, -2.479f, -2.524f, -4.064f)
                curveToRelative(0.138f, -1.392f, 0.991f, -2.81f, 2.455f, -3.085f)
                curveToRelative(0.008f, -2.801f, 2.94f, -4.356f, 5.131f, -3.131f)
                moveToRelative(-0.124f, 1.12f)
                lineToRelative(0.509f, 0.417f)
                lineToRelative(0.266f, -0.603f)
                lineToRelative(-0.457f, -0.2f)
                close()
                moveTo(23.072f, 15.307f)
                lineTo(23.551f, 15.45f)
                lineTo(23.571f, 15.95f)
                lineTo(22.873f, 15.977f)
                close()
                moveTo(21.316f, 25.109f)
                lineTo(18.457f, 22.249f)
                horizontalLineToRelative(4.064f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-4.044f)
                lineToRelative(2.86f, -2.859f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(-2.88f, 2.88f)
                lineTo(17.75f, 16.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.043f)
                lineToRelative(-2.86f, -2.86f)
                lineToRelative(-0.706f, 0.708f)
                lineToRelative(2.859f, 2.859f)
                horizontalLineToRelative(-4.022f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.042f)
                lineToRelative(-2.858f, 2.858f)
                lineToRelative(0.707f, 0.707f)
                lineToRelative(2.838f, -2.838f)
                lineTo(16.75f, 27.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.043f)
                lineToRelative(2.859f, 2.859f)
                close()
            }
        }
        .build()
        return _cloudSnowflakeMedium!!
    }

private var _cloudSnowflakeMedium: ImageVector? = null
