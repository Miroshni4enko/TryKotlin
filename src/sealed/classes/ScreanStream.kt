package sealed.classes

sealed class ScreamState {
    object Error: ScreamState()
    object Loading: ScreamState()
    data class ViewData(val message: String): ScreamState()
}