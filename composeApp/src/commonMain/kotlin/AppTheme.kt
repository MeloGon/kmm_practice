import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = MaterialTheme.colors.copy(primary = Color.Black),
        shapes = MaterialTheme.shapes.copy(
            small = AbsoluteCutCornerShape(0.dp),
            medium = AbsoluteCutCornerShape(0.dp),
            large = AbsoluteCutCornerShape(0.dp)
        )
    ) {
        content()
    }
}

//las funciones composables son con mayusculas
//pero hay excepciones en funciones de tipo composable
//que son funciones de utilidad (accion no vista)
//no dibujan en pantalla solo son usadas por otros composables

@Composable
fun getColorsTheme(): DarkModeColor {
    val isDarkMode = false

    val Purple = Color(0xfFF6A66FF)
    val ColorExpenseItem = if (isDarkMode) Color(0xFF090808) else Color(0xFFF1F1F1)
    val BackgroundColor = if (isDarkMode) Color(0xFF1E1C1C) else Color.White
    val TextColor = if (isDarkMode) Color.White else Color.Black
    val AddIconColor = if (isDarkMode) Purple else Color.Black
    val ColorArrowRound = if (isDarkMode) Purple else Color.Gray.copy(alpha = .2f)

    return DarkModeColor(
        purple = Purple,
        colorExpenseItem = ColorExpenseItem,
        backgroundColor = BackgroundColor,
        textColor = TextColor,
        addIconColor = AddIconColor,
        colorArrowRound = ColorArrowRound
    )

}

//hacemos referencia a un objeto que contiene datos que podemos usar
//para crear un objeto personalizado
data class DarkModeColor(
    val purple: Color,
    val colorExpenseItem: Color,
    val backgroundColor: Color,
    val textColor: Color,
    val addIconColor: Color,
    val colorArrowRound: Color
)