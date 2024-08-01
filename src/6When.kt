fun main () {
    val button = "Y"
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"

            else -> "there is no such button"


        }
    )
}