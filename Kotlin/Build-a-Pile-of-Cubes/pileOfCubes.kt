// Kata: https://www.codewars.com/kata/5592e3bd57b64d00f3000047/train/kotlin
import kotlin.math.*

object ASum {

    fun findNb(m: Long): Long {
        // your code
        var cubes: Long = 0
        while (m !== 0) {
            m = cbrt(m)
            cubes += 1
            findNb(m)
        }
        if 

        return -1

        else 
            return cubes
    }
}

// Create object for test methods:

// findNb(1071225) --> 45
// findNb(91716553919377) --> -1
