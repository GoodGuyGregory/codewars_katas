using System;

namespace Create_Phone_Number
{
    class Program
    {
        //  Kata: https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/csharp

        public static string CreatePhoneNumber(int[] numbers)
        {   
            string phoneNum = "";
            int counter = 0;
            foreach (int k in numbers) 
            {
                //Console.WriteLine("int: + {0}", k);
                switch(counter) {
                    case 0:
                        phoneNum += "(";
                        break;
                    case 3:
                        phoneNum += ") ";
                        break;
                    case 6: 
                        phoneNum += "-";
                        break;
                    case 10: 
                        phoneNum += "-";
                        break;
                    
                }
                phoneNum += k;
                counter++;
            }

            return phoneNum;
        }

        public static string CreatePhoneNumber(int[] numbers)
        {
            //  super classy pinkys out
            return long.Parse(string.Concat(numbers)).ToString("(000) 000-0000");
        }

         public static string CreatePhoneNumber(int[] n) //KISS principle
        {
            return "(" + n[0] + n[1] + n[2] + ") " + n[3] + n[4] + n[5] + "-" + n[6] + n[7] + n[8] + n[9];
        }



        static void Main(string[] args)
        {
            int[] testOne = new int[] {1,2,3,4,5,6,7,8,9,0}; 
            string result = CreatePhoneNumber(testOne);
            Console.WriteLine(result);
        }
    }
}
