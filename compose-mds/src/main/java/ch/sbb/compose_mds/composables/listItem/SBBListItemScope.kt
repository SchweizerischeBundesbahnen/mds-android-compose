package ch.sbb.compose_mds.composables.listItem

import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow

class SBBListItemScopeInstance(
    val colors: SBBListItemColors,
    val style: SBBListItemStyle,
) : SBBListItemScope {
    @Composable
    override fun Icon(
        imageVector: ImageVector,
        contentDescription: String?,
        color: Color?,
    ) = Icon(
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint = color ?: colors.icon,
    )

    @Composable
    override fun Text(
        text: String,
        maxLines: Int,
        overflow: TextOverflow,
        textStyle: TextStyle?,
        color: Color?,
    ) = Text(
        text = text,
        maxLines = maxLines,
        overflow = overflow,
        style = textStyle ?: style.typography.subtext,
        color = color ?: colors.text,
    )

    @Composable
    override fun Subtext(
        text: String,
        maxLines: Int,
        overflow: TextOverflow,
        textStyle: TextStyle?,
        color: Color?,
    ) = Text(
        text = text,
        maxLines = maxLines,
        overflow = overflow,
        style = textStyle ?: style.typography.subtext,
        color = color ?: colors.subtext,
    )
}

interface SBBListItemScope {
    @Composable
    fun Icon(
        imageVector: ImageVector,
        contentDescription: String? = null,
        color: Color? = null,
    )

    @Composable
    fun Text(
        text: String,
        maxLines: Int = 1,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        textStyle: TextStyle? = null,
        color: Color? = null,
    )

    @Composable
    fun Subtext(
        text: String,
        maxLines: Int = Int.MAX_VALUE,
        overflow: TextOverflow = TextOverflow.Ellipsis,
        textStyle: TextStyle? = null,
        color: Color? = null,
    )
}
