package interfaces

class B(override val prop: String) : MyInterface {
    override fun fun1() {
        println("B fun1")
    }

    override fun fun2() {
        print("B ${super.fun2()}")
    }
}