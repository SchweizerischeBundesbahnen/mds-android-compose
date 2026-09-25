package ch.sbb.compose_mds.composables.status

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import ch.sbb.compose_mds.sbbicons.SBBIcons
import ch.sbb.compose_mds.sbbicons.Small
import ch.sbb.compose_mds.sbbicons.small.CircleCrossSmall
import ch.sbb.compose_mds.sbbicons.small.CircleExclamationPointSmall
import ch.sbb.compose_mds.sbbicons.small.CircleInformationSmall
import ch.sbb.compose_mds.sbbicons.small.CircleTickSmall
import ch.sbb.compose_mds.theme.SBBColors

internal enum class SBBStatusType(
    val color: Color,
    val icon: ImageVector,
    val tint: Color? = null,
) {
    Alert(
        color = SBBColors.red,
        icon = SBBIcons.Small.CircleCrossSmall,
        tint = SBBColors.white,
    ),
    Warning(
        color = SBBColors.peach,
        icon = SBBIcons.Small.CircleExclamationPointSmall,
        tint = SBBColors.black,
    ),
    Success(
        color = SBBColors.green,
        icon = SBBIcons.Small.CircleTickSmall,
        tint = SBBColors.white,
    ),
    Information(
        color = SBBColors.smoke,
        icon = SBBIcons.Small.CircleInformationSmall,
        tint = SBBColors.white,
    ),
    ;

    @Composable
    fun Icon(modifier: Modifier = Modifier) {
        Icon(
            modifier =
                modifier
                    .background(color = color)
                    .padding(1.dp)
                    .padding(end = 1.dp),
            imageVector = icon,
            contentDescription = null,
            tint = tint ?: LocalContentColor.current,
        )
    }
}
