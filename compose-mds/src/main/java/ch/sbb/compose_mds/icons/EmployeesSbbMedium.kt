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

public val SBBIcons.EmployeesSbbMedium: ImageVector
    get() {
        if (_employeesSbbMedium != null) {
            return _employeesSbbMedium!!
        }
        _employeesSbbMedium = Builder(
            name = "EmployeesSbbMedium",
            defaultWidth = 36.0.dp,
            defaultHeight = 36.0.dp,
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
                moveTo(18.0f, 8.749f)
                curveToRelative(0.73f, 0.0f, 1.388f, 0.287f, 1.931f, 0.779f)
                lineToRelative(0.025f, 0.023f)
                quadToRelative(0.094f, 0.085f, 0.182f, 0.18f)
                curveToRelative(0.675f, 0.721f, 1.111f, 1.787f, 1.111f, 3.021f)
                quadToRelative(0.0f, 0.113f, -0.011f, 0.227f)
                lineToRelative(-0.013f, 0.122f)
                lineToRelative(-0.009f, 0.077f)
                lineToRelative(-0.009f, 0.088f)
                verticalLineToRelative(0.001f)
                curveToRelative(-0.208f, 2.056f, -1.57f, 3.485f, -3.207f, 3.485f)
                curveToRelative(-0.66f, 0.0f, -1.26f, -0.235f, -1.77f, -0.642f)
                curveToRelative(0.011f, -0.112f, 0.02f, -0.236f, 0.02f, -0.36f)
                curveToRelative(0.0f, -1.2f, -0.348f, -2.3f, -0.948f, -3.166f)
                lineToRelative(-0.036f, -0.052f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -0.444f, -0.534f)
                curveToRelative(0.285f, -1.929f, 1.604f, -3.25f, 3.178f, -3.25f)
                moveToRelative(4.23f, 4.36f)
                curveToRelative(0.51f, 0.408f, 1.11f, 0.643f, 1.77f, 0.643f)
                curveToRelative(1.776f, 0.0f, 3.25f, -1.682f, 3.25f, -4.0f)
                curveToRelative(0.0f, -2.32f, -1.474f, -4.003f, -3.25f, -4.003f)
                curveToRelative(-1.573f, 0.0f, -2.893f, 1.321f, -3.178f, 3.25f)
                lineToRelative(0.044f, 0.046f)
                curveToRelative(0.865f, 0.921f, 1.384f, 2.24f, 1.384f, 3.707f)
                quadToRelative(-0.001f, 0.16f, -0.016f, 0.311f)
                close()
                moveTo(18.0f, 17.752f)
                curveToRelative(1.002f, 0.0f, 1.88f, -0.376f, 2.575f, -0.997f)
                curveToRelative(3.223f, 1.987f, 4.745f, 5.071f, 5.131f, 8.995f)
                horizontalLineToRelative(-5.535f)
                curveToRelative(-0.78f, -2.788f, -2.33f, -5.102f, -4.926f, -6.752f)
                curveToRelative(0.37f, -0.521f, 0.646f, -1.132f, 0.811f, -1.792f)
                arcToRelative(3.74f, 3.74f, 0.0f, false, false, 1.944f, 0.546f)
                moveToRelative(4.056f, -3.547f)
                curveToRelative(-0.165f, 0.66f, -0.44f, 1.27f, -0.809f, 1.79f)
                curveToRelative(2.597f, 1.65f, 4.145f, 3.966f, 4.924f, 6.755f)
                horizontalLineToRelative(5.535f)
                curveToRelative(-0.386f, -3.924f, -1.902f, -7.002f, -5.126f, -8.99f)
                arcToRelative(3.83f, 3.83f, 0.0f, false, true, -2.58f, 0.992f)
                arcToRelative(3.73f, 3.73f, 0.0f, false, true, -1.944f, -0.547f)
                moveToRelative(5.2f, -1.201f)
                curveToRelative(0.631f, -0.886f, 0.994f, -2.031f, 0.994f, -3.252f)
                curveToRelative(0.0f, -2.684f, -1.75f, -5.003f, -4.25f, -5.003f)
                curveToRelative(-2.028f, 0.0f, -3.554f, 1.541f, -4.056f, 3.546f)
                arcTo(3.73f, 3.73f, 0.0f, false, false, 18.0f, 7.75f)
                curveToRelative(-2.029f, 0.0f, -3.554f, 1.54f, -4.056f, 3.544f)
                arcTo(3.74f, 3.74f, 0.0f, false, false, 12.0f, 10.747f)
                curveToRelative(-2.498f, 0.0f, -4.25f, 2.32f, -4.25f, 5.003f)
                curveToRelative(0.0f, 1.21f, 0.357f, 2.347f, 0.978f, 3.23f)
                curveToRelative(-3.476f, 2.21f, -5.404f, 5.77f, -5.478f, 10.261f)
                lineToRelative(-0.008f, 0.509f)
                horizontalLineToRelative(17.545f)
                lineToRelative(-0.038f, -0.536f)
                quadToRelative(-0.089f, -1.28f, -0.335f, -2.464f)
                horizontalLineToRelative(6.373f)
                lineToRelative(-0.038f, -0.536f)
                quadToRelative(-0.089f, -1.28f, -0.335f, -2.464f)
                horizontalLineToRelative(6.373f)
                lineToRelative(-0.038f, -0.536f)
                curveToRelative(-0.31f, -4.345f, -1.886f, -7.916f, -5.493f, -10.21f)
                moveToRelative(-13.349f, -0.5f)
                curveToRelative(-0.538f, -0.478f, -1.187f, -0.757f, -1.907f, -0.757f)
                curveToRelative(-1.774f, 0.0f, -3.25f, 1.683f, -3.25f, 4.003f)
                curveToRelative(0.0f, 2.319f, 1.475f, 4.0f, 3.25f, 4.0f)
                curveToRelative(0.47f, 0.0f, 0.918f, -0.118f, 1.322f, -0.335f)
                lineToRelative(0.035f, -0.041f)
                lineToRelative(0.016f, 0.013f)
                curveToRelative(0.954f, -0.536f, 1.655f, -1.628f, 1.823f, -3.018f)
                lineToRelative(0.01f, -0.104f)
                lineToRelative(0.016f, -0.143f)
                lineToRelative(0.01f, -0.09f)
                curveToRelative(0.01f, -0.1f, 0.018f, -0.188f, 0.018f, -0.281f)
                curveToRelative(0.0f, -1.03f, -0.304f, -1.943f, -0.797f, -2.635f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -0.497f, -0.567f)
                close()
                moveTo(12.0f, 20.75f)
                quadToRelative(0.104f, 0.0f, 0.207f, -0.005f)
                lineToRelative(-0.148f, 0.176f)
                lineToRelative(0.132f, 0.288f)
                lineToRelative(0.487f, 1.06f)
                lineToRelative(-0.667f, 1.383f)
                lineToRelative(-0.657f, -1.43f)
                lineToRelative(0.495f, -1.0f)
                lineToRelative(0.149f, -0.303f)
                lineToRelative(-0.154f, -0.172f)
                close()
                moveTo(9.399f, 19.74f)
                quadToRelative(0.29f, 0.26f, 0.62f, 0.461f)
                lineToRelative(0.784f, 0.88f)
                lineToRelative(-0.451f, 0.913f)
                lineToRelative(-0.106f, 0.213f)
                lineToRelative(0.1f, 0.217f)
                lineToRelative(1.2f, 2.61f)
                lineToRelative(0.443f, 0.964f)
                lineToRelative(0.461f, -0.956f)
                lineToRelative(1.23f, -2.55f)
                lineToRelative(0.103f, -0.212f)
                lineToRelative(-0.098f, -0.213f)
                lineToRelative(-0.453f, -0.988f)
                lineToRelative(0.732f, -0.873f)
                quadToRelative(0.324f, -0.195f, 0.608f, -0.45f)
                curveToRelative(3.224f, 1.987f, 4.748f, 5.07f, 5.134f, 8.994f)
                lineTo(4.267f, 28.75f)
                curveToRelative(0.202f, -3.99f, 2.004f, -7.078f, 5.132f, -9.01f)
                moveTo(21.0f, 22.25f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.0f)
                lineTo(21.0f, 21.25f)
                close()
            }
        }
            .build()
        return _employeesSbbMedium!!
    }

private var _employeesSbbMedium: ImageVector? = null
