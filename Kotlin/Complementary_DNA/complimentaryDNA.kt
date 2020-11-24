// Kata: https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/kotlin

fun makeComplement(dna: String): String {
    var correspondingProtein = String()
    // iterate through sequence
    for (proteinBase in dna) {
        // Use When to sequence DNA
        when (proteinBase) {
            'A' -> correspondingProtein += "T"
            'C' -> correspondingProtein += "G"
            'G' -> correspondingProtein += "C"
            'T' -> correspondingProtein += "A"
        }
    }
    return correspondingProtein
}

fun main() {
    // Examples Provided from Kata:

    makeComplement("ATTGC") // returns "TAACG"

    makeComplement("GTAT") // returns "CATA"
}
