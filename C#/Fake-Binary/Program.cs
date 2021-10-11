using System;
using System.Text;

namespace Fake_Binary
{
    class Program
    {
        //  Kata: https://www.codewars.com/kata/57eae65a4321032ce000002d/train/csharp

        public static string FakeBin(string x)
        {
            StringBuilder sb = new StringBuilder(x.Length);
            foreach (var number in x)
            {
                if (int.Parse(char.ToString(number)) < 5)
                {
                    sb.Append("0");
                }
                else
                {
                    sb.Append("1");
                }
            }
            return sb.ToString();
        }

        static void Main(string[] args)
        {
            //  test cases:

            // return: "01011110001100111"
            Console.WriteLine(FakeBin("45385593107843568"));

            // return: "101000111101101"
            Console.WriteLine(FakeBin("509321967506747"));

            //  return: "011011110000101010000011011"
            Console.WriteLine(FakeBin("366058562030849490134388085"));
        }
    }
}
