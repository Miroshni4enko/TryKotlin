package data.classes

fun main(args: Array<String>){
    val person = Person(21, "Alex", "Sumy")
    var (age, name) = person
    println("person: $age, $name")
    var personCopy =  person.copy(age = 12)
    println("person: ${personCopy}")
}