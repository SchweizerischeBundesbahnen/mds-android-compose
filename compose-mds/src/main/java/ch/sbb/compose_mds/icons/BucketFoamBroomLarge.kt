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

public val SBBIcons.BucketFoamBroomLarge: ImageVector
    get() {
        if (_bucketFoamBroomLarge != null) {
            return _bucketFoamBroomLarge!!
        }
        _bucketFoamBroomLarge = Builder(name = "BucketFoamBroomLarge", defaultWidth = 48.0.dp,
                defaultHeight = 48.0.dp, viewportWidth = 48.0f, viewportHeight = 48.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(37.996f, 3.395f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.993f, 0.015f)
                lineTo(35.0f, 3.41f)
                verticalLineToRelative(26.753f)
                curveToRelative(-2.835f, 0.627f, -5.0f, 2.985f, -5.0f, 5.837f)
                verticalLineToRelative(9.5f)
                lineToRelative(1.0f, 0.01f)
                curveToRelative(-0.149f, 0.344f, -0.495f, 0.488f, -0.5f, 0.49f)
                lineTo(43.0f, 46.0f)
                lineTo(43.0f, 36.0f)
                curveToRelative(0.0f, -2.852f, -2.165f, -5.21f, -5.0f, -5.837f)
                lineTo(38.0f, 3.395f)
                close()
                moveTo(36.5f, 30.0f)
                quadToRelative(-0.252f, 0.0f, -0.5f, 0.018f)
                lineTo(36.0f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(26.518f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -0.5f, -0.018f)
                moveTo(11.0f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                moveToRelative(6.0f, 1.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -4.0f)
                moveToRelative(0.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                moveToRelative(-6.5f, 1.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.478f, 5.0f)
                horizontalLineToRelative(9.19f)
                lineToRelative(-0.188f, 0.64f)
                lineToRelative(-5.0f, 17.0f)
                lineToRelative(-0.106f, 0.36f)
                lineTo(8.126f, 46.0f)
                lineToRelative(-0.105f, -0.36f)
                lineToRelative(-5.0f, -17.0f)
                lineToRelative(-0.189f, -0.64f)
                horizontalLineToRelative(3.19f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, 5.478f, -5.0f)
                moveToRelative(0.0f, 1.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.473f, 4.0f)
                lineTo(7.027f, 28.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 4.473f, -4.0f)
                moveTo(8.874f, 45.0f)
                horizontalLineToRelative(11.252f)
                lineToRelative(2.059f, -7.0f)
                lineTo(13.0f, 38.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.479f)
                lineToRelative(0.588f, -2.0f)
                lineTo(14.0f, 35.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(9.361f)
                lineToRelative(1.471f, -5.0f)
                lineTo(4.168f, 29.0f)
                close()
                moveTo(16.014f, 10.0f)
                curveToRelative(0.553f, 0.0f, 0.986f, 0.44f, 0.986f, 1.0f)
                reflectiveCurveToRelative(-0.433f, 1.0f, -0.985f, 1.0f)
                arcTo(1.01f, 1.01f, 0.0f, false, true, 15.0f, 11.0f)
                curveToRelative(0.0f, -0.548f, 0.45f, -1.0f, 1.015f, -1.0f)
                moveToRelative(0.0f, 3.0f)
                curveToRelative(1.12f, 0.0f, 1.986f, -0.904f, 1.986f, -2.0f)
                reflectiveCurveToRelative(-0.865f, -2.0f, -1.985f, -2.0f)
                arcTo(2.01f, 2.01f, 0.0f, false, false, 14.0f, 11.0f)
                curveToRelative(0.0f, 1.109f, 0.907f, 2.0f, 2.015f, 2.0f)
                moveTo(12.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -1.0f, 0.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                moveToRelative(1.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                moveTo(42.0f, 36.0f)
                curveToRelative(0.0f, -2.705f, -2.434f, -5.0f, -5.5f, -5.0f)
                reflectiveCurveTo(31.0f, 33.295f, 31.0f, 36.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bucketFoamBroomLarge!!
    }

private var _bucketFoamBroomLarge: ImageVector? = null
