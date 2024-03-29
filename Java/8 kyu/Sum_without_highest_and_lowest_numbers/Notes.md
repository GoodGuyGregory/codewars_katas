## Implementation Notes:

**Parsing the Array for Max or Min**

instead of making multiple comparisons, just compare all of the values with one single value
from the given array and make a decision of highest or lowest based on that comparison value only.


```java
class MinMaxExample { 
 
  public static void main(String args[]){
    int array[] = new int[]{10, 11, 88, 2, 12, 120};
 
    // Calling getMax() method for getting max value
    int max = getMax(array);
    System.out.println("Maximum Value is: "+max);
 
    // Calling getMin() method for getting min value
    int min = getMin(array);
    System.out.println("Minimum Value is: "+min);
  }
 
  // Method for getting the maximum value
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  // Method for getting the minimum value
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}
```

**Creating an Arraylist from int[]**

There is no shortcut for converting from int[] to List<Integer> as Arrays.asList does not deal with boxing and will just create a List<int[]> which is not what you want. You have to make a utility method. 

Using this new arraylist with the `IndexOf()` : which *The indexOf(Object) method of the java.util.ArrayList class returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. Using this method, you can find the index of a given element.* this will allow the location of the first occurance of the high and lows to be discovered. [IndexOf Examples](https://www.geeksforgeeks.org/java-util-arraylist-indexof-java/)

```java
int[] ints = {1, 2, 3};
List<Integer> intList = new ArrayList<Integer>(ints.length);
for (int i : ints)
{
    intList.add(i);
}


// REMOVE ELEMENTS FROM A LIST:
// https://www.geeksforgeeks.org/remove-element-arraylist-java/

// remove the element at the index found, to ensure the remaining values remain inside of the list

  // This makes a call to remove(Object) and
        // removes element 1
        al.remove(intList.indexOf(highest || or Lowest));
```