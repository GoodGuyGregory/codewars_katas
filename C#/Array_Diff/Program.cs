using System;

namespace Array_Diff
{
    class Program
    {
        // Kata: https://www.codewars.com/kata/523f5d21c841566fde000009/train/csharp

          public static int[] ArrayDiff(int[] a, int[] b)
        {

        }


        static void Main(string[] args)
        {
            // Test Cases:

            // Returns [2] 
            ArrayDiff(new int[] {1, 2},    new int[] {1});
            
            // Returns [2,2] 
            ArrayDiff(new int[] {1, 2, 2}, new int[] {1});
            
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
