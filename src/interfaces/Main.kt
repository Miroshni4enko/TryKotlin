package interfaces

fun main(args: Array<String>) {
    var a: MyInterface = A("A", "")
    var b: MyInterface = B("B")
    a.fun1()
    b.fun1()
    a.fun2()
    b.fun2()
}
