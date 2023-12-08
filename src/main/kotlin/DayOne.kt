package adventOfCode

import java.io.File
import kotlin.io.path.Path
import kotlin.io.path.absolutePathString

fun dayOne() {
    val calibrations: Int = File(Path("src/main/resources/day-one.txt").absolutePathString()).useLines { lines ->
        lines
            .map {
                val digits = it.filter { ch -> ch.isDigit() }

                "${digits[0]}${digits[digits.length - 1]}".toInt()
            }
            .sum()
    }

    println(calibrations)
}
