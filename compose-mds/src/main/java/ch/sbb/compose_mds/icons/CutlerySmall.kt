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

public val SBBIcons.CutlerySmall: ImageVector
    get() {
        if (_cutlerySmall != null) {
            return _cutlerySmall!!
        }
        _cutlerySmall = Builder(name = "CutlerySmall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 3.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.413f, 0.12f, 1.022f, 0.494f, 1.542f)
                curveToRelative(0.32f, 0.445f, 0.813f, 0.802f, 1.506f, 0.918f)
                lineTo(5.0f, 21.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 9.96f)
                arcToRelative(2.26f, 2.26f, 0.0f, false, false, 1.506f, -0.918f)
                curveTo(7.88f, 8.522f, 8.0f, 7.913f, 8.0f, 7.5f)
                lineTo(8.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.253f, -0.08f, 0.644f, -0.306f, 0.958f)
                curveTo(6.487f, 8.746f, 6.137f, 9.0f, 5.5f, 9.0f)
                reflectiveCurveToRelative(-0.987f, -0.254f, -1.194f, -0.542f)
                arcTo(1.74f, 1.74f, 0.0f, false, true, 4.0f, 7.5f)
                lineTo(4.0f, 3.0f)
                close()
                moveTo(5.0f, 3.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(1.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(10.5f, 3.0f)
                lineTo(10.0f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2.0f)
                lineTo(13.0f, 6.0f)
                curveToRelative(0.0f, -1.002f, -0.116f, -1.795f, -0.553f, -2.32f)
                curveToRelative(-0.465f, -0.558f, -1.17f, -0.68f, -1.947f, -0.68f)
                moveToRelative(1.5f, 9.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(11.0f, 4.027f)
                curveToRelative(0.373f, 0.047f, 0.562f, 0.153f, 0.678f, 0.293f)
                curveToRelative(0.188f, 0.225f, 0.322f, 0.682f, 0.322f, 1.68f)
                close()
                moveTo(16.502f, 4.656f)
                curveToRelative(-0.3f, 0.45f, -0.502f, 1.1f, -0.502f, 1.844f)
                curveToRelative(0.0f, 0.743f, 0.202f, 1.394f, 0.502f, 1.844f)
                curveToRelative(0.302f, 0.453f, 0.665f, 0.656f, 0.998f, 0.656f)
                reflectiveCurveToRelative(0.696f, -0.203f, 0.998f, -0.656f)
                curveToRelative(0.3f, -0.45f, 0.502f, -1.1f, 0.502f, -1.844f)
                curveToRelative(0.0f, -0.743f, -0.202f, -1.394f, -0.502f, -1.844f)
                curveTo(18.196f, 4.203f, 17.833f, 4.0f, 17.5f, 4.0f)
                reflectiveCurveToRelative(-0.696f, 0.203f, -0.998f, 0.656f)
                moveToRelative(-0.832f, -0.555f)
                curveTo(16.09f, 3.47f, 16.729f, 3.0f, 17.5f, 3.0f)
                reflectiveCurveToRelative(1.409f, 0.469f, 1.83f, 1.101f)
                curveToRelative(0.424f, 0.636f, 0.67f, 1.486f, 0.67f, 2.399f)
                reflectiveCurveToRelative(-0.246f, 1.763f, -0.67f, 2.399f)
                curveToRelative(-0.326f, 0.49f, -0.782f, 0.881f, -1.33f, 1.033f)
                lineTo(18.0f, 21.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(17.0f, 9.932f)
                curveToRelative(-0.548f, -0.152f, -1.004f, -0.543f, -1.33f, -1.033f)
                curveTo(15.246f, 8.263f, 15.0f, 7.413f, 15.0f, 6.5f)
                reflectiveCurveToRelative(0.246f, -1.763f, 0.67f, -2.399f)
            }
        }
        .build()
        return _cutlerySmall!!
    }

private var _cutlerySmall: ImageVector? = null
