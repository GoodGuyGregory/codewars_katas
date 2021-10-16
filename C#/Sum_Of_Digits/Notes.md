## Sum of Digits

the main concern I have is converting from long to int data type and iterating through 
the conversion to accomodate the sumational math

[Convert to int from String](https://docs.microsoft.com/en-us/dotnet/csharp/programming-guide/types/how-to-convert-a-string-to-a-number)

there are many implementations that could be used to conquer this problem. My solution is to cast from a long to a string and then convert back to an int for the final return.

in order to iterate through the string of chars. the `Char.GetNumericValue(<char-value>)` must be implemented in order to return the proper string representation of the char and then convert it to an int with `Convert.ToInt32(<Char.GetNumericValue(<char-value>))`,

I also implemented recursion in order to handle cases where the values returned need to be iterated through an additional time. I had to convert the returned value for the recursive case into a **Long** with `Convert.ToInt64()` 

