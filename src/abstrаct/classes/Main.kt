package abstrаct.classes

fun main(args: Array<String>) {
    var a: MyAbstractClass = A("A")
    var b: MyAbstractClass = B("B")
    a.fun1()
    b.fun1()
    a.fun2()
    b.fun2()
}
