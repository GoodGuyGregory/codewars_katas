[Split Method in Java](https://www.geeksforgeeks.org/split-string-java-examples/) Requires a regex to split on, and a specified limit to split a string, here I split the string coming in by the spaces, to allow for the negative signs on the incoming strings

[Integer Parseing](https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/) this allows user data to be tested and exceptions thrown if the wrong input is added to the method for best practices in making the method fool proof, but 

```java
    String str = "25";
        try{
            //  this is all I used on this kata.
            int number = Integer.parseInt(str);
            System.out.println(number); // output = 25
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
```

[Parse to String](https://www.javatpoint.com/java-int-to-string) I mainly used this to print the formatted strings of high and low values

```java
    // public static String toString(int i)  
    String number = Integer.toString(42);
    String anotherNum = "56";
    //  Can now be printed and concatenated
    System.out.println(number.concat(" " + anotherNum));


```    