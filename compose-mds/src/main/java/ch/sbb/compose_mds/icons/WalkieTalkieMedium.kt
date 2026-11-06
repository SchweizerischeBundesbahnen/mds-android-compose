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

public val SBBIcons.WalkieTalkieMedium: ImageVector
    get() {
        if (_walkieTalkieMedium != null) {
            return _walkieTalkieMedium!!
        }
        _walkieTalkieMedium = Builder(name = "WalkieTalkieMedium", defaultWidth = 36.0.dp,
                defaultHeight = 36.0.dp, viewportWidth = 36.0f, viewportHeight = 36.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.25f, 9.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(19.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-11.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-12.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(9.0f)
                lineTo(21.25f, 4.5f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(12.25f, 10.25f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-19.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                close()
                moveTo(22.5f, 28.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(22.5f, 25.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(22.5f, 22.25f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.0f)
                close()
                moveTo(18.0f, 12.25f)
                curveToRelative(0.735f, 0.0f, 1.419f, 0.344f, 1.912f, 0.838f)
                curveToRelative(0.494f, 0.494f, 0.838f, 1.178f, 0.838f, 1.912f)
                reflectiveCurveToRelative(-0.343f, 1.418f, -0.836f, 1.912f)
                reflectiveCurveToRelative(-1.177f, 0.838f, -1.911f, 0.838f)
                reflectiveCurveToRelative(-1.419f, -0.344f, -1.913f, -0.838f)
                curveToRelative(-0.494f, -0.493f, -0.84f, -1.177f, -0.84f, -1.912f)
                reflectiveCurveToRelative(0.344f, -1.418f, 0.838f, -1.912f)
                curveToRelative(0.493f, -0.494f, 1.177f, -0.838f, 1.912f, -0.838f)
                moveToRelative(-7.75f, 4.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(18.0f, 13.25f)
                curveToRelative(-0.422f, 0.0f, -0.863f, 0.203f, -1.205f, 0.545f)
                reflectiveCurveToRelative(-0.545f, 0.783f, -0.545f, 1.205f)
                reflectiveCurveToRelative(0.203f, 0.863f, 0.546f, 1.205f)
                reflectiveCurveToRelative(0.785f, 0.545f, 1.207f, 0.545f)
                reflectiveCurveToRelative(0.862f, -0.203f, 1.203f, -0.545f)
                reflectiveCurveToRelative(0.544f, -0.782f, 0.544f, -1.205f)
                curveToRelative(0.0f, -0.422f, -0.203f, -0.863f, -0.545f, -1.205f)
                reflectiveCurveToRelative(-0.783f, -0.545f, -1.205f, -0.545f)
            }
        }
        .build()
        return _walkieTalkieMedium!!
    }

private var _walkieTalkieMedium: ImageVector? = null
