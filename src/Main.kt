fun main(args: Array<String>) {
    mySecondFun(myFirstFun().toLong())
    myThirdFun(1, .2)
}

fun myFirstFun(): Int {
    return 1
}

fun mySecondFun(arg: Long): Int {
    return arg.toInt()
}

fun myThirdFun(a: Long, b: Double) = a + b