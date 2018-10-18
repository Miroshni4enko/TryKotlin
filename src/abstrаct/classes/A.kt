package abstrаct.classes

class A: MyAbstractClass {
    override fun fun1() {
        println("A fun1")
    }

    constructor(prop: String) : super(prop) {
        this.prop = prop
    }

}