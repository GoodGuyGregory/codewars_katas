## Create a Dictionary 

Hold the key values pairs for each of the letters,

```csharp
 //  create dictionary to parse through the text variable
            Dictionary<char, string> alphabet = new Dictionary<char, string>(){
```

utilize the `String.Join()` method to add the found items from the Generic List of strings to the empty string that represents the textFound, 

```csharp
         //  concatenate the found letters from the generic String list

            string textFound = String.Join(" ", elementsFound);
```