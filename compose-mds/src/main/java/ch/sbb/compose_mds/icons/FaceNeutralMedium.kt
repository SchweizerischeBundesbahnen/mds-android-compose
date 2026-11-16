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

public val SBBIcons.FaceNeutralMedium: ImageVector
    get() {
        if (_faceNeutralMedium != null) {
            return _faceNeutralMedium!!
        }
        _faceNeutralMedium = Builder(name = "FaceNeutralMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 5.75f)
                curveToRelative(6.843f, 0.0f, 12.25f, 5.406f, 12.25f, 12.25f)
                curveToRelative(0.0f, 6.843f, -5.407f, 12.25f, -12.25f, 12.25f)
                reflectiveCurveTo(5.75f, 24.843f, 5.75f, 18.0f)
                curveToRelative(0.0f, -6.844f, 5.407f, -12.25f, 12.25f, -12.25f)
                moveToRelative(0.0f, 25.5f)
                curveToRelative(7.395f, 0.0f, 13.25f, -5.855f, 13.25f, -13.25f)
                curveToRelative(0.0f, -7.396f, -5.855f, -13.25f, -13.25f, -13.25f)
                reflectiveCurveTo(4.75f, 10.604f, 4.75f, 18.0f)
                curveToRelative(0.0f, 7.395f, 5.855f, 13.25f, 13.25f, 13.25f)
                moveToRelative(7.5f, -9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-15.0f)
                verticalLineToRelative(1.0f)
                close()
                moveTo(13.75f, 13.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, false, -0.5f, 0.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.5f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, true, 2.5f, 0.0f)
                moveToRelative(7.75f, -0.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, true, true, 0.0f, 0.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.5f)
                moveToRelative(0.0f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
            }
        }
        .build()
        return _faceNeutralMedium!!
    }

private var _faceNeutralMedium: ImageVector? = null
