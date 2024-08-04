data class Name(var First : String , var Last : String)
data class Address (var street : String ,var city : City)
data class City (var state : String , var country : String)
data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
// Write your code here
// data class Name(...)

fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
    println(person)
}