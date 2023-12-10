package everypin.app.feature.my

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

fun NavController.navigateMy(navOptions: NavOptions) {
    navigate(MyRoute.route, navOptions)
}

fun NavGraphBuilder.myNavGraph(
    padding: PaddingValues
) {
    composable(
        route = MyRoute.route,
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None },
        popEnterTransition = { EnterTransition.None },
        popExitTransition = { ExitTransition.None }
    ) {
        MyRoute(
            padding = padding,
        )
    }
}

object MyRoute {
    const val route = "my"
}