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

public val SBBIcons.BanknotesDollarSmall: ImageVector
    get() {
        if (_banknotesDollarSmall != null) {
            return _banknotesDollarSmall!!
        }
        _banknotesDollarSmall = Builder(name = "BanknotesDollarSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 6.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(20.0f, 8.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.0f)
                lineTo(21.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(3.0f, 17.0f)
                horizontalLineToRelative(16.0f)
                lineTo(19.0f, 9.0f)
                lineTo(3.0f, 9.0f)
                close()
                moveTo(11.887f, 13.99f)
                quadToRelative(0.0f, 0.551f, -0.683f, 0.634f)
                verticalLineToRelative(-1.272f)
                quadToRelative(0.344f, 0.108f, 0.417f, 0.152f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, true, 0.266f, 0.487f)
                moveToRelative(-1.693f, -2.161f)
                quadToRelative(0.0f, -0.51f, 0.618f, -0.564f)
                verticalLineToRelative(1.127f)
                quadToRelative(-0.344f, -0.085f, -0.482f, -0.21f)
                quadToRelative(-0.136f, -0.123f, -0.136f, -0.354f)
                moveToRelative(1.01f, 0.652f)
                verticalLineToRelative(-1.207f)
                quadToRelative(0.554f, 0.073f, 0.566f, 0.662f)
                horizontalLineToRelative(0.877f)
                quadToRelative(-0.012f, -0.623f, -0.382f, -0.97f)
                quadToRelative(-0.373f, -0.348f, -1.06f, -0.383f)
                verticalLineToRelative(-0.584f)
                horizontalLineToRelative(-0.393f)
                verticalLineToRelative(0.583f)
                quadToRelative(-0.446f, 0.03f, -0.715f, 0.15f)
                arcToRelative(1.33f, 1.33f, 0.0f, false, false, -0.58f, 0.474f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, false, -0.203f, 0.697f)
                quadToRelative(0.0f, 0.353f, 0.146f, 0.6f)
                quadToRelative(0.145f, 0.248f, 0.46f, 0.43f)
                quadToRelative(0.245f, 0.14f, 0.892f, 0.322f)
                verticalLineToRelative(1.37f)
                quadToRelative(-0.698f, -0.075f, -0.692f, -0.845f)
                horizontalLineToRelative(-0.919f)
                quadToRelative(0.007f, 0.784f, 0.543f, 1.213f)
                quadToRelative(0.386f, 0.307f, 1.068f, 0.346f)
                lineTo(10.812f, 16.0f)
                horizontalLineToRelative(0.392f)
                verticalLineToRelative(-0.657f)
                quadToRelative(0.43f, -0.021f, 0.713f, -0.136f)
                reflectiveQuadToRelative(0.516f, -0.364f)
                quadToRelative(0.367f, -0.39f, 0.367f, -0.962f)
                quadToRelative(0.0f, -0.564f, -0.357f, -0.89f)
                quadToRelative(-0.287f, -0.262f, -0.983f, -0.444f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.256f, -0.064f)
            }
        }
        .build()
        return _banknotesDollarSmall!!
    }

private var _banknotesDollarSmall: ImageVector? = null
