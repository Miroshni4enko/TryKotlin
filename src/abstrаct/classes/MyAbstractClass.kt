package abstrаct.classes

abstract class MyAbstractClass {
    var prop: String

    abstract fun fun1()

    open fun fun2(): String {
        return " usual function fun2"
    }

    constructor(prop: String){
        this.prop = prop
    }
}