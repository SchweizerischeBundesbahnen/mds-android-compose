package ch.sbb.compose_mds.composables.header

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import ch.sbb.compose_mds.R
import ch.sbb.compose_mds.icons.ChevronLeftSmall
import ch.sbb.compose_mds.icons.SBBIcons
import ch.sbb.compose_mds.theme.SBBColors
import ch.sbb.compose_mds.theme.SBBSpacing
import ch.sbb.compose_mds.theme.SBBTheme

object SBBHeader

private val Int.asImageVector
    @Composable get() = ImageVector.vectorResource(id = this)

/***
 * The default version of the SBB Header.
 * @see [SBBHeaderInternal]
 */
@Composable
fun SBBHeader.Default(
    title: String,
    navController: NavController,
    modifier: Modifier = Modifier,
    navigation: @Composable (() -> Unit)? = null,
    navigationType: NavigationType? = null,
    onNavigationClick: (() -> Unit)? = null,
    actions: @Composable (RowScope.() -> Unit)? = {
        Icon(
            imageVector = R.drawable.logo_sbb.asImageVector,
            contentDescription = "SBB logo",
            tint = SBBColors.white,
        )
    },
) {
    SBBHeaderInternal(
        title = title,
        navController = navController,
        navigationType = navigationType,
        navigation = navigation,
        onNavigationClick = onNavigationClick,
        actions = actions,
        modifier = modifier
            .background(SBBTheme.colorScheme.primary)
            .padding(horizontal = 14.dp)
            .padding(bottom = 30.dp),
    )
}

/***
 * The small version of the SBB Header.
 * @see [SBBHeaderInternal]
 */
@Composable
fun SBBHeader.Small(
    title: String,
    navController: NavController,
    modifier: Modifier = Modifier,
    navigation: @Composable (() -> Unit)? = null,
    navigationType: NavigationType? = null,
    onNavigationClick: (() -> Unit)? = null,
    actions: @Composable (RowScope.() -> Unit)? = {
        Icon(
            imageVector = R.drawable.logo_sbb.asImageVector,
            contentDescription = "SBB logo",
            tint = SBBColors.white,
        )
    },
) {
    SBBHeaderInternal(
        title = title,
        navController = navController,
        navigationType = navigationType,
        navigation = navigation,
        onNavigationClick = onNavigationClick,
        actions = actions,
        modifier = modifier
            .background(SBBTheme.colorScheme.primary)
            .padding(horizontal = 14.dp),
    )
}

/***
 * Implementation of the SBB Header in its default size.
 *
 * @param title The currently displayed Title.
 * @param navController The navigation controller of the Jetpack Compose app. This is used to properly display the navigation button on a subpage.
 * @param navigation Overrideable navigationIcon. For further information, check the [CenterAlignedTopAppBar]'s navigationIcon.
 * @param navigationType Select the navigation style:
 * - [NavigationType.Back] or null will display a [ChevronLeftSmall]
 * - [NavigationType.Cancel] will display the text "cancel"
 * @param onNavigationClick Overrideable back button click action. By default, [navController]'s popBackStack will be invoked.
 * @param actions Overridable actions. By default, a static SBB Logo is shown.
 *
 * For a complete definition of the component, please visit [digital.sbb.ch](https://digital.sbb.ch/de/design-system/mobile/components/header/)
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun SBBHeaderInternal(
    title: String,
    navController: NavController,
    navigationType: NavigationType?,
    navigation: @Composable (() -> Unit)?,
    onNavigationClick: (() -> Unit)?,
    actions: @Composable (RowScope.() -> Unit)?,
    modifier: Modifier = Modifier,
) {
    val currentBackStackEntry by navController.currentBackStackEntryAsState()

    val showBackButton by remember(currentBackStackEntry) {
        derivedStateOf {
            navController.previousBackStackEntry != null
        }
    }

    CenterAlignedTopAppBar(
        modifier = modifier,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = SBBTheme.colorScheme.primary,
            titleContentColor = SBBColors.white,
        ),
        title = {
            Text(
                text = title,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = SBBColors.white,
                style = MaterialTheme.typography.bodyLarge,
            )
        },
        navigationIcon = {
            if (navigation != null) {
                navigation()
            } else if (showBackButton) {
                val back = { onNavigationClick?.invoke() ?: navController.popBackStack() }
                when (navigationType) {
                    NavigationType.Cancel -> {
                        TextButton(
                            contentPadding = PaddingValues(all = SBBSpacing.Zero),
                            onClick = { back() },
                        ) {
                            Text(
                                text = stringResource(android.R.string.cancel),
                                color = SBBColors.white,
                                style = MaterialTheme.typography.bodySmall,
                            )
                        }
                    }

                    else -> {
                        // Todo: translation
                        Icon(
                            modifier = Modifier.clickable { back() },
                            imageVector = SBBIcons.ChevronLeftSmall,
                            contentDescription = "back",
                            tint = SBBColors.white,
                        )
                    }
                }
            }
        },
        actions = actions ?: {},
    )
}
