package abstrаct.classes

class B(prop: String): MyAbstractClass(prop) {
    override fun fun1() {
        println("B fun1")
    }

    override fun fun2(): String {
        println("B + ${super.fun2()}")
        return ""
    }
}