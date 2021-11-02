//  Kata: https://www.codewars.com/kata/55192f4ecd82ff826900089e/train/kotlin

    fun divide(weight: Int): Boolean {
        // check acceptable range of watermelons
        if (weight % 2 == 0) {
            return true
        }
        else 
            return false
        
    }


    fun main() {
        // Test Cases: 
        // ===================================
        divide(4)
        divide(2)
        divide(5)
        divide(88)
        divide(100)
        divide(67)
        divide(90)
        divide(10)
        divide(99)
        divide(32)
    }