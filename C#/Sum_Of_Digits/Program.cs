using System;

namespace Sum_Of_Digits
{
    class Program
    {
        // Kata: https://www.codewars.com/kata/541c8630095125aba6000c00/train/csharp

        public int DigitalRoot(long n)
        {
            if (n >= 10) 
            {
                string NumbersToIterate = n.ToString();
                int sumOfDigits = 0;
                foreach (char number in NumbersToIterate)
                {
                    sumOfDigits += Convert.ToInt32(Char.GetNumericValue(number));

                }

                if (sumOfDigits > 10) 
                {
                   return DigitalRoot(Convert.ToInt64(sumOfDigits));

                }
                else {

                    return sumOfDigits;
                }
            }
            else 
            {
                return Convert.ToInt32(n);
            }
            
        }

        static void Main(string[] args)
        {
            Program testClass = new Program();
            // returns 7
            Console.WriteLine(testClass.DigitalRoot(16));
            // returns 6 
            Console.WriteLine(testClass.DigitalRoot(456)); 
        }
    }
}
