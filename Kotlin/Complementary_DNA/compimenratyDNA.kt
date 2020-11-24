// Kata: https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/kotlin

fun makeComplement(dna: String): String {
    // iterate through sequence
    for (proteinBase in dna) {
        // Use When to sequence DNA
        when (proteinBase) {
            "A" -> "T"
            "C" -> "G"
            "G" -> "C"
            "T" -> "A"
        }
        print(proteinBase)
    }
    return dna
}

fun main() {
    // Examples Provided from Kata:

    makeComplement("ATTGC") // returns "TAACG"

    makeComplement("GTAT") // returns "CATA"
}
