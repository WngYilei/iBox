package navipose.navigation

import androidx.compose.runtime.Composable
import navipose.models.IScreen

interface INavigator {
    fun addScreen(screen: IScreen, screenProvider: @Composable () -> Unit)
    fun navigate(screen: IScreen)
    fun goBack()
}