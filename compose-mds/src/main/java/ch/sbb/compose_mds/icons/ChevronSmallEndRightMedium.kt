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

public val SBBIcons.ChevronSmallEndRightMedium: ImageVector
    get() {
        if (_chevronSmallEndRightMedium != null) {
            return _chevronSmallEndRightMedium!!
        }
        _chevronSmallEndRightMedium = Builder(
            name = "ChevronSmallEndRightMedium",
            defaultWidth =
                36.0.dp,
            defaultHeight = 36.0.dp,
            viewportWidth = 36.0f,
            viewportHeight =
            36.0f,
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
                moveToRelative(17.264f, 17.645f)
                lineToRelative(-5.923f, -5.856f)
                lineToRelative(-0.703f, 0.71f)
                lineTo(16.2f, 18.0f)
                lineToRelative(-5.565f, 5.5f)
                lineToRelative(0.703f, 0.712f)
                lineToRelative(5.925f, -5.856f)
                lineToRelative(0.36f, -0.356f)
                close()
                moveTo(24.0f, 13.5f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-9.0f)
                close()
            }
        }
            .build()
        return _chevronSmallEndRightMedium!!
    }

private var _chevronSmallEndRightMedium: ImageVector? = null
