package ranges

fun main(args: Array<String>){
    val numbs = 1..10
    val chars = 'a'..'z'
    println(isChar('i', chars))
    println(1 in numbs)
}

fun isChar(char: Char, chars: CharRange) = char in chars