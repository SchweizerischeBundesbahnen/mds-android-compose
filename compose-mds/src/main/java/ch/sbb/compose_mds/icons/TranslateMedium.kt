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

public val SBBIcons.TranslateMedium: ImageVector
    get() {
        if (_translateMedium != null) {
            return _translateMedium!!
        }
        _translateMedium = Builder(
            name = "TranslateMedium",
            defaultWidth = 36.0.dp,
            defaultHeight =
                36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight = 36.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = null,
                strokeLineWidth = 0.0f,
                strokeLineCap = Butt,
                strokeLineJoin = Miter,
                strokeLineMiter = 4.0f,
                pathFillType = EvenOdd,
            ) {
                moveTo(3.75f, 4.75f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(4.188f)
                lineToRelative(0.854f, -0.853f)
                lineToRelative(3.646f, -3.647f)
                lineTo(12.25f, 29.75f)
                horizontalLineToRelative(11.856f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(0.854f, 0.854f)
                lineTo(28.25f, 29.75f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-14.5f)
                horizontalLineToRelative(-9.0f)
                lineTo(23.75f, 4.75f)
                horizontalLineToRelative(-20.0f)
                moveToRelative(19.0f, 10.5f)
                verticalLineToRelative(-9.5f)
                lineTo(4.25f, 5.75f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(2.774f)
                lineToRelative(3.5f, -3.5f)
                lineTo(12.25f, 15.25f)
                horizontalLineToRelative(10.5f)
                moveToRelative(-9.5f, 1.0f)
                horizontalLineToRelative(18.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(2.73f)
                lineToRelative(-2.583f, -2.584f)
                lineToRelative(-0.146f, -0.146f)
                lineTo(13.25f, 28.75f)
                close()
                moveTo(6.0f, 9.25f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(1.0f)
                lineTo(6.0f, 10.25f)
                close()
                moveTo(18.0f, 12.25f)
                lineTo(6.0f, 12.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(15.0f, 19.75f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(1.0f)
                lineTo(15.0f, 20.75f)
                close()
                moveTo(30.0f, 22.75f)
                lineTo(15.0f, 22.75f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(15.0f)
                close()
                moveTo(3.25f, 29.25f)
                lineTo(3.25f, 22.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(3.982f)
                lineToRelative(-1.798f, -1.798f)
                lineToRelative(0.707f, -0.707f)
                lineToRelative(2.652f, 2.652f)
                lineToRelative(0.354f, 0.354f)
                lineToRelative(-0.354f, 0.353f)
                lineToRelative(-2.652f, 2.65f)
                lineToRelative(-0.707f, -0.706f)
                lineToRelative(1.798f, -1.798f)
                lineTo(3.25f, 29.75f)
                close()
                moveTo(27.767f, 7.75f)
                horizontalLineToRelative(4.983f)
                verticalLineToRelative(5.75f)
                horizontalLineToRelative(-1.0f)
                lineTo(31.75f, 8.75f)
                horizontalLineToRelative(-3.982f)
                lineToRelative(1.797f, 1.798f)
                lineToRelative(-0.707f, 0.707f)
                lineToRelative(-2.652f, -2.652f)
                lineToRelative(-0.353f, -0.354f)
                lineToRelative(0.353f, -0.353f)
                lineToRelative(2.652f, -2.65f)
                lineToRelative(0.707f, 0.706f)
                close()
            }
        }
            .build()
        return _translateMedium!!
    }

private var _translateMedium: ImageVector? = null
