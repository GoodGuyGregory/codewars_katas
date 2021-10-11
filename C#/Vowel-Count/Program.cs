using System;

namespace Vowel_Count
{
    class Program
    {

        public static int GetVowelCount(string str)
        {
            
            char[] vowels = {'a','e','i','o','u'};
            int vowelCount = 0;
            // Console.WriteLine(str);

            foreach(char letter in str) {
                // Console.WriteLine(letter);
                if (Array.IndexOf(vowels, letter) > -1) {
                    vowelCount++;
                } 
            }

            Console.WriteLine(vowelCount);

            return vowelCount;
        }

        static void Main(string[] args)
        {
            // Should Return 5 "abracadabra"
            GetVowelCount("abracadabra");
        }
    }
}
