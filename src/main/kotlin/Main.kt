package adventOfCode

fun main(args: Array<String>) {
    try {
        when (args[0]) {
            "1" -> dayOne()
            else -> dayOne()
        }
    } catch (exception: ArrayIndexOutOfBoundsException) {
        dayOne()
    }
}
