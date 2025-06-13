package ch.sbb.compose_mds.composables.tabBar

import android.graphics.PointF
import androidx.compose.ui.graphics.Path
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.cos
import kotlin.math.sin

internal class TabCurves(
    val midX: Float,
    private val waveRadius: Float,
) {
    private val circleWaveRadius = 0.552284749831f * waveRadius
    private val twoWaveRadius = waveRadius * 2f
    private val piHalf = PI.toFloat() * 0.5f

    private val startP: Array<PointF> // points of bezier curve at start of animation
    private val endP: Array<PointF> // points of bezier curve at end of animation

    var p0: PointF = PointF(0f, 0f)
    var p1: PointF = PointF(0f, 0f)
    var p2: PointF = PointF(0f, 0f)
    var p3: PointF = PointF(0f, 0f)
    var p4: PointF = PointF(0f, 0f)

    var c01: PointF = PointF(0f, 0f)
    var c10: PointF = PointF(0f, 0f)
    var c12: PointF = PointF(0f, 0f)
    var c21: PointF = PointF(0f, 0f)
    var c23: PointF = PointF(0f, 0f)
    var c32: PointF = PointF(0f, 0f)
    var c34: PointF = PointF(0f, 0f)
    var c43: PointF = PointF(0f, 0f)

    private var progress = 0f
    private var leftProgress = 0f
    private var rightProgress = 0f

    var tight = false
        private set

    init {
        val startPos = arrayOf(
            PointF(-2f, 0f), PointF(-1f, 0f), PointF(0f, 0f), PointF(1f, 0f), PointF(2f, 0f)
        )
        startP = Array(5) {
            PointF(midX + startPos[it].x * waveRadius, startPos[it].y * waveRadius)
        }

        val endPos = arrayOf(
            PointF(-2f, 0f), PointF(-1f, 1f), PointF(0f, 2f), PointF(1f, 1f), PointF(2f, 0f)
        )
        endP = Array(5) {
            PointF(midX + endPos[it].x * waveRadius, endPos[it].y * waveRadius)
        }
    }

    fun setProgress(
        progress: Float,
        leftProgress: Float,
        leftMidX: Float,
        rightProgress: Float,
        rightMidX: Float,
    ) {
        this.leftProgress = leftProgress
        this.rightProgress = rightProgress
        this.progress = progress
        if (progress == 0f) return

        // p0 and p4 move only horizontally
        p0.x = startP[0].x + progress * (endP[0].x - startP[0].x)
        p0.y = startP[0].y
        p4.x = startP[4].x + progress * (endP[4].x - startP[4].x)
        p4.y = startP[4].y

        tight =
            (leftMidX != 0f && p0.x < leftMidX + twoWaveRadius) || (rightMidX != 0f && p4.x > rightMidX - twoWaveRadius)

        p2.x = startP[2].x
        if (tight) {
            if (leftProgress > progress) {
                p2.x -= (leftProgress - progress) * (startP[2].x - (leftMidX + twoWaveRadius))
            }
            if (rightProgress > progress) {
                p2.x += (rightProgress - progress) * ((rightMidX - twoWaveRadius) - startP[2].x)
            }
        }
        p2.y = startP[2].y + progress * (endP[2].y - startP[2].y)

        if (tight) {
            val p3LeftX = leftMidX + waveRadius
            val p2LeftY = leftProgress * twoWaveRadius

            val p1RightX = rightMidX - waveRadius
            val p2RightY = rightProgress * twoWaveRadius

            val leftProgressRelative = leftProgress / (leftProgress + progress)
            val rightProgressRelative = rightProgress / (rightProgress + progress)

            val p1X = startP[1].x + progress * (endP[1].x - startP[1].x)
            p1.x = p1X - leftProgressRelative * (p1X - p3LeftX)
            p1.y = p2LeftY + (p2.y - p2LeftY) * 0.5f

            val p3X = startP[3].x + progress * (endP[3].x - startP[3].x)
            p3.x = p3X - rightProgressRelative * (p3X - p1RightX)
            p3.y = p2RightY + (p2.y - p2RightY) * 0.5f
        } else {
            p1.x = startP[1].x + progress * (endP[1].x - startP[1].x)
            p1.y = startP[1].y + progress * (endP[1].y - startP[1].y)

            p3.x = startP[3].x + progress * (endP[3].x - startP[3].x)
            p3.y = startP[3].y + progress * (endP[3].y - startP[3].y)
        }

        c01.x = p0.x + circleWaveRadius
        c01.y = p0.y
        c43.x = p4.x - circleWaveRadius
        c43.y = p4.y

        c21.x = p2.x - circleWaveRadius
        c21.y = p2.y
        c23.x = p2.x + circleWaveRadius
        c23.y = p2.y

        if (tight) {
            val deltaLeft = progress - leftProgress
            val alphaLeft = (1f - deltaLeft) * piHalf

            val deltaRight = rightProgress - progress
            val alphaRight = (1f - deltaRight) * piHalf

            var cosLeft = cos(alphaLeft)
            var sinLeft = sin(alphaLeft)
            var cosRight = cos(alphaRight)
            var sinRight = sin(alphaRight)

            val rLeft = circleWaveRadius * abs(cosLeft)
            val rRight = circleWaveRadius * abs(cosRight)

            cosLeft *= rLeft
            sinLeft *= rLeft
            cosRight *= rRight
            sinRight *= rRight

            c10.x = p1.x - sinLeft
            c10.y = p1.y - cosLeft
            c12.x = p1.x + sinLeft
            c12.y = p1.y + cosLeft

            c32.x = p3.x - sinRight
            c32.y = p3.y - cosRight
            c34.x = p3.x + sinRight
            c34.y = p3.y + cosRight
        } else {
            val alpha = (1f - progress) * piHalf

            var cos = cos(alpha)
            var sin = sin(alpha)

            val r = circleWaveRadius * abs(cos)

            cos *= r
            sin *= r

            c10.x = p1.x - sin
            c10.y = p1.y - cos
            c12.x = p1.x + sin
            c12.y = p1.y + cos

            c32.x = p3.x - sin
            c32.y = p3.y + cos
            c34.x = p3.x + sin
            c34.y = p3.y - cos
        }
    }

    fun draw(wavePath: Path) {
        wavePath.apply {
            if (progress == 0f) {
                lineTo(midX.toFloat(), 0f)
            } else {
                if (tight.not() || leftProgress == 0f) {
                    lineTo(p0.x, p0.y)
                    cubicTo(c01.x, c01.y, c10.x, c10.y, p1.x, p1.y)
                }
                cubicTo(c12.x, c12.y, c21.x, c21.y, p2.x, p2.y)
                cubicTo(c23.x, c23.y, c32.x, c32.y, p3.x, p3.y)
                if (tight.not() || rightProgress == 0f) {
                    cubicTo(c34.x, c34.y, c43.x, c43.y, p4.x, p4.y)
                }
            }
        }
    }
}
