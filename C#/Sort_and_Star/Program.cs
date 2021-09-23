using System;

namespace Sort_and_Star
{
    class Program
    {
        // Kata: https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/csharp

        // You should not remove or add elements from/to the array.
        public static string TwoSort(string[] s)
        {
            return "";
        }

        static void Main(string[] args)
        {
            // test cases:
            // passing returns "b***i***t***c***o***i***n"
            TwoSort(new[] { "bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps" });
            //  passing returns  "a***r***e"
            TwoSort(new[] { "turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones" });
        }
    }
}
