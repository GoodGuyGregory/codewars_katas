using System.Collections.Generic;
using System;


namespace Replace_with_Alphabet_Position
{
    class Kata
    {
        // Kata: https://www.codewars.com/kata/546f922b54af40e1e90001da/train/csharp

        public static string AlphabetPosition(string text)
        {
            //  create dictionary to parse through the text variable
            Dictionary<char, string> alphabet = new Dictionary<char, string>(){

            // Add all letters from the alphabet to the Dictionary
            {'a',"1"},
            {'b',"2"},
            {'c',"3"},
            {'d',"4"},
            {'e',"5"},
            {'f',"6"},
            {'g',"7"},
            {'h',"8"},
            {'i',"9"},
            {'j',"10"},
            {'k',"11"},
            {'l',"12"},
            {'m',"13"},
            {'n',"14"},
            {'o',"15"},
            {'p', "16"},
            {'q', "17"},
            {'r', "18"},
            {'s', "19"},
            {'t', "20"},
            {'u', "21"},
            {'v', "22"},
            {'w', "23"},
            {'x', "24"},
            {'y', "25"},
            {'z', "26"}
            };

            //  Confirm Dictionary:
            // foreach(KeyValuePair<char, string> element in alphabet)
            // {
            //     Console.WriteLine("{0} = {1}", element.Key, element.Value);
            // }

            //  check the contents of the incoming string
            List<string> elementsFound = new List<string>();
            foreach (char letter in text)
            {
                char currentLetter = Char.ToLower(letter);
                if (Char.IsLetter(currentLetter))
                {

                    if (alphabet.ContainsKey(currentLetter))
                    {
                        elementsFound.Add(alphabet[currentLetter]);
                    }
                }
            }
            //  concatenate the found letters from the generic String list

            string textFound = String.Join(" ", elementsFound);
            // Console.WriteLine(textFound);
            return textFound;
        }

        static void Main(string[] args)
        {

            // "20 8 5 19 21 14 19 5 20 19 5 20 19 1 20 20 23 5 12 22 5 15 3 12 15 3 11"
            AlphabetPosition("The sunset sets at twelve o' clock.");
        }
    }
}
