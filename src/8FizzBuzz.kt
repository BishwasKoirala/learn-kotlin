fun main() {
//    for (num in 1..100) {
//        when {
//            (num % 5 == 0) && (num % 3 == 0) -> {
//                println("FizzBuzz")
//            }
//            (num % 3 == 0) -> {
//                println("Fizz")
//            }
//            (num % 5 == 0) -> {
//                println("Buzz")
//            }
//            else -> println(num)
//
//        }
//    }

    for (num in 1..100) {
        println(
            when {
                num % 15 == 0 -> "FizzBuzz"
                num % 5 == 0 -> "Buzz"
                num % 3 == 0 -> "Fizz"

                else -> "$num"
            }
        )
    }
}
