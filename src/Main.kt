fun main(args: Array<String>) {
    val st: String? = getSt()
    //st = null -- don't work
    val size = st!!.length
    println(size)
}

fun getSt():String? {
    return "Hello"
}