using System;

namespace Remove_First_and_Last_Character
{
    class Program
    {


            public static string Remove_charSubstring(string s)
            {
                //  substring start position to start
                //  includes value to traverse to and end without touching the string
                return s.Substring(1,(s.Length - 2));
            }

        //  Without Substring Mehtod:
            public static string Remove_char(string s)
            {
                // Removes First character
                s = s.Remove(0,1);
                // removes last character
                s = s.Remove(s.Length - 1, 1);
                return s;
            }

        static void Main(string[] args)
        {
            Console.WriteLine("Remove First and Last Characters from a String:");

            // TESTS:
            Console.WriteLine(Remove_char("eloquent"));
            Console.WriteLine(Remove_char("country"));
            Console.WriteLine(Remove_char("person"));
            Console.WriteLine(Remove_char("place"));
            Console.WriteLine(Remove_char("ok"));

        }
    }
}
