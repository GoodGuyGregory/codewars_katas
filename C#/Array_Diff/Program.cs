using System;
using System.Collections.Generic;

namespace Array_Diff
{
    class Program
    {
        // Kata: https://www.codewars.com/kata/523f5d21c841566fde000009/train/csharp

          public static int[] ArrayDiff(int[] a, int[] b)
        {
            List<int> foundDiffs = new List<int>();
            foreach(var element in a)
            {
                // check for contents of array b
                int index = Array.IndexOf(b, element);
               if(index == -1) 
               {
                   // add the element to a list of different 
                   foundDiffs.Add(element);
               }
            }
            // create an array of the found items
            int[] diffs = foundDiffs.ToArray();

            return diffs;
        }


        static void Main(string[] args)
        {
            // Test Cases:

            // Returns [2] 
            int[] returnedDiffs = ArrayDiff(new int[] {1, 2},    new int[] {1});
            // returns array of differences by using the string.Join method
            Console.WriteLine("[" +  string.Join(" ", returnedDiffs) + "]");
            
            // Returns [2,2] 
            Console.WriteLine(ArrayDiff(new int[] {1, 2, 2}, new int[] {1}));
            
            // Returns [1]   
            ArrayDiff(new int[] {1, 2, 2}, new int[] {2});
            
            // Returns [1,2,3]   
            ArrayDiff(new int[] {1, 2, 2}, new int[] {});
            
            // Return []   
            ArrayDiff(new int[] {},        new int[] {1, 2});
            
            // Return [3]   
            ArrayDiff(new int[] {1, 2, 3}, new int[] {1, 2});
        }
            
    }
}