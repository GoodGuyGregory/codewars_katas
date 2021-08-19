using System;

namespace Remove_String_Spaces
{
    class Program
    {
        // Kata: https://www.codewars.com/kata/57eae20f5500ad98e50002c5/train/csharp

        public static string NoSpace(string input)
        {
            string formatedinput = "";
            formatedinput = input.Replace(" ","");
            return formatedinput;
        }  

        static void Main(string[] args)
        {
            Console.WriteLine(NoSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
            Console.WriteLine(NoSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
            Console.WriteLine(NoSpace("8aaaaa dddd r     "));

        }
    }
}
