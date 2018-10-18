package interfaces

class A : MyInterface {
    override val prop: String
    var prop1: String

    constructor(prop: String, prop1: String) {
        this.prop = prop
        this.prop1 = prop1
    }

    override fun fun1() {
        println("A fun1")
    }
}