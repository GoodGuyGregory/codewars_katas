// Kata: https://www.codewars.com/kata/5592e3bd57b64d00f3000047/train/kotlin
object Asum {
    fun findNb(m: Long): Long {
        var volume: Long = 0
        var cubes: Long = 1
        while (volume < m) {
            volume += (cubes * cubes * cubes)
            cubes += 1
        }
        if (volume == m) {
                return cubes - 1
        } else {
            return -1.toLong()
        }
    }
}

// Create object for test methods:
fun main() {
    // findNb(1071225) --> 45
    println(Asum.findNb(1071225))

    // findNb(91716553919377) --> -1
    println(Asum.findNb(91716553919377))
}
