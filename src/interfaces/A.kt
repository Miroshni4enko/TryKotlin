package interfaces

class A(override val prop: String) : MyInterface {
    override fun fun1() {
        println("A fun1")
    }
}