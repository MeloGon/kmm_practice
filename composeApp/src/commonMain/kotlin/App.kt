import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import moe.tlaster.precompose.PreComposeApp

@Composable
fun App() {
    PreComposeApp {
        val colors = getColorsTheme()
        AppTheme {
            Column(modifier = Modifier.fillMaxSize()) {
                Text("Bienvenido", color = colors.textColor)
                Text("a la app de Compose")
                Text("a la app de Compose")
                Text("a la app de Compose")
                Text("a la app de Compose")
                Text("a la app de Composeeee")

            }
        }
    }
}