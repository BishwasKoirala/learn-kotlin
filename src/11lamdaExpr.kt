fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
//    bracket なくても行けるみたい
    val urls = actions.map { a -> "$prefix/$id/$a" }
    println(urls)
}


