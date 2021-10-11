using System.Collections.Generic;
using System;

namespace Sort_and_Star
{
    class Program
    {
        // Kata: https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/csharp

        // You should not remove or add elements from/to the array.
        public static string TwoSort(string[] s)
        {
            string firstElement = "";
            string joinedElement = "";
            string[] sortedElements = s;
            // StringComparer.Ordinal will compare ASCII values too.
            Array.Sort(sortedElements, StringComparer.Ordinal);
            firstElement = sortedElements[0];
            List<char> lettersFromElement = new List<char>();
            foreach (var letter in firstElement)
            {
                lettersFromElement.Add(letter);
            }
            joinedElement = String.Join("***", lettersFromElement);
            return joinedElement;

        }

        static void Main(string[] args)
        {
            // test cases:
            // passing returns "b***i***t***c***o***i***n"
            Console.WriteLine(TwoSort(new[] { "bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps" }));
            //  passing returns  "a***r***e"
            Console.WriteLine(TwoSort(new[] { "turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones" }));

            Console.WriteLine(TwoSort(new[] { "Lets", "all", "go", "on", "holiday", "somewhere", "very", "cold" }));
        }
    }
}
