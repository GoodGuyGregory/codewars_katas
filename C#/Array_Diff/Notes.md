[Array Methods](https://docs.microsoft.com/en-us/dotnet/api/system.array.indexof?view=net-5.0)
[Array and Generic List Stackoverflow](https://stackoverflow.com/questions/27788156/attempting-to-write-an-array-but-it-results-in-system32-int)

## Implementation

Creating a Generic List eliminates the need for a defined size of differences 
data structure capacity. this allows for the generic to be utilized to store 
the differences and then converted to the Array type on returning to the method.


```c#
int[] terms = new int[400];
for (int runs = 0; runs < 400; runs++)
{
    terms[runs] = value;
}

Alternatively, you can use Lists - the advantage with lists being, you don't need to know the array size when instantiating the list.

List<int> termsList = new List<int>();
for (int runs = 0; runs < 400; runs++)
{
    termsList.Add(value);
}

// You can convert it back to an array if you would like to
int[] terms = termsList.ToArray();
```

