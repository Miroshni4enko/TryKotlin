package sealed.classes

import sealed.classes.ScreamState.ViewData

fun main(args: Array<String>){
    val viewData = ViewData("view data for stream")
    isStreamState(viewData)
}

fun isStreamState(streamState: ScreamState) = when (streamState) {
    is ScreamState.Error -> println("Error")
    is ScreamState.Loading -> println("Loading")
    is ViewData -> println(streamState.message)
}