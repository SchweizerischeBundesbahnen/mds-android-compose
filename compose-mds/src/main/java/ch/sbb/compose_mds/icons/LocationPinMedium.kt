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

public val SBBIcons.LocationPinMedium: ImageVector
    get() {
        if (_locationPinMedium != null) {
            return _locationPinMedium!!
        }
        _locationPinMedium = Builder(name = "LocationPinMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.977f, 4.771f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -8.75f, 8.75f)
                verticalLineToRelative(0.02f)
                curveToRelative(0.06f, 1.51f, 0.508f, 2.781f, 1.22f, 3.967f)
                lineToRelative(0.006f, 0.01f)
                lineToRelative(7.125f, 11.247f)
                lineToRelative(0.423f, 0.667f)
                lineToRelative(0.422f, -0.667f)
                lineToRelative(7.125f, -11.247f)
                lineToRelative(0.006f, -0.01f)
                lineToRelative(0.006f, -0.01f)
                curveToRelative(0.694f, -1.216f, 1.154f, -2.512f, 1.167f, -3.972f)
                verticalLineToRelative(-0.005f)
                arcToRelative(8.75f, 8.75f, 0.0f, false, false, -8.75f, -8.75f)
                moveTo(11.3f, 16.988f)
                curveToRelative(-0.635f, -1.06f, -1.021f, -2.165f, -1.074f, -3.476f)
                arcToRelative(7.75f, 7.75f, 0.0f, false, true, 15.5f, 0.008f)
                curveToRelative(-0.012f, 1.238f, -0.399f, 2.362f, -1.03f, 3.473f)
                lineTo(18.0f, 27.563f)
                close()
                moveTo(13.237f, 13.51f)
                arcToRelative(4.75f, 4.75f, 0.0f, true, true, 9.5f, 0.0f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, true, -9.5f, 0.0f)
                moveToRelative(4.75f, -5.75f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 0.0f, 11.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, false, false, 0.0f, -11.5f)
            }
        }
        .build()
        return _locationPinMedium!!
    }

private var _locationPinMedium: ImageVector? = null
