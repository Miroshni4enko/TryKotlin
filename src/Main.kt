import Color.*

fun main(args: Array<String>) {
    println(getFavoriteColor(RED))
    println(getFavoriteColor(WHITE))

    var a = 1
    var b = 2
    val s: String = when {
        (a > b) -> "true"
        (b > a) -> "false"
        else -> "none"
    }
    println(s)
}

fun getFavoriteColor(color: Color) = when (color) {
    WHITE, BLACK -> "WHITE or BLACK"
    GREEN -> "#GREEN)"
    RED -> "#RED)"
}