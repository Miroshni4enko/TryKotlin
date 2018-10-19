package `object`.classes

fun main(args: Array<String>){
    val person1 = Person
    person1.prop = 11

    val person2 = Person // don't create new object, return existed
    person2.prop = 23

    println("person1 prop = ${person1.prop}")
    println("person1 prop = ${person2.prop}")
}
