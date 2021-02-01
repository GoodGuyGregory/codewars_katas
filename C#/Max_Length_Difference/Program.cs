using System;

namespace Max_Length_Difference
{
    class Program
    {
        // Kata: https://www.codewars.com/kata/5663f5305102699bad000056/train/csharp

        public static int Mxdiflg(string[] a1, string[] a2)
        {
            if (a1.Length == 0 | a2.Length == 0)
            {
                return -1;
            }
            else
            {
                int maxDifference = 0;
                foreach (var elementOne in a1)
                {
                    foreach (var elementTwo in a2)
                    {
                        int newMaxDifference = Math.Abs(elementOne.Length - elementTwo.Length);
                        if (newMaxDifference > maxDifference)
                        {
                            maxDifference = newMaxDifference;
                        }
                    }
                }
                return maxDifference;
            }
        }

        static void Main(string[] args)
        {
            // Provided Example
            string[] s1 = new string[] { "hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz" };
            string[] s2 = new string[] { "cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww" };

            // Expected Result is 13:

            Console.WriteLine(Mxdiflg(s1, s2));

            string[] none = new string[] { };
            string[] s3 = new string[] { "moog", "korg", "roland" };

            Console.WriteLine(Mxdiflg(none, s3));

        }
    }
}
