@file:SuppressLint("ComposableNaming")

package ch.sbb.compose_mds.composables.header

import SBBTheme
import android.annotation.SuppressLint
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBHeaderDefault() {
    SBBTheme {
        Surface {
            SBBHeader.Default(
                title = "SBB DSM Android",
                navController = rememberNavController(),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBHeaderDefaultWithNavigationBack() {
    val nav = rememberNavController()
    _Nav(nav)
    nav.navigate("test")

    SBBTheme {
        Surface {
            SBBHeader.Default(
                title = "SBB DSM Android",
                navController = nav,
                navigationType = NavigationType.Back,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBHeaderDefaultWithNavigationCancel() {
    val nav = rememberNavController()
    _Nav(nav)
    nav.navigate("test")

    SBBTheme {
        Surface {
            SBBHeader.Default(
                title = "SBB DSM Android",
                navController = nav,
                navigationType = NavigationType.Cancel,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBHeaderSmall() {
    SBBTheme {
        Surface {
            SBBHeader.Small(
                title = "SBB DSM Android",
                navController = rememberNavController(),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBHeaderSmallWithNavigationBack() {
    val nav = rememberNavController()
    _Nav(nav)
    nav.navigate("test")

    SBBTheme {
        Surface {
            SBBHeader.Small(
                title = "SBB DSM Android",
                navController = nav,
                navigationType = NavigationType.Back,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
internal fun _Preview_SBBHeaderSmallWithNavigationCancel() {
    val nav = rememberNavController()
    _Nav(nav)
    nav.navigate("test")

    SBBTheme {
        Surface {
            SBBHeader.Small(
                title = "SBB DSM Android",
                navController = nav,
                navigationType = NavigationType.Cancel,
            )
        }
    }
}

@Composable
private fun _Nav(nav: NavHostController) {
    NavHost(
        navController = nav,
        startDestination = "start",
    ) {
        composable("start") { }
        composable("test") { }
    }
}
