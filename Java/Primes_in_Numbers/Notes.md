## Prime Factor Decomposition:

[How to use Prime Factor Decomposition](https://www.youtube.com/watch?v=MmJHo8QXdew)




[Map Object Implementation](https://www.youtube.com/watch?v=H62Jfv1DJlU)

```java
import java.util.Hashmap

// Create a Hashmap
// in Java7 you do not need to include the type of the hashmap inside of the diamond operater 
    HashMap pizzaIds<Integer, String> = new HashMap<>();

    // Methods to add pizzaElements:
    //  if the value of 1 already exisits it will override the value with the new value 
    //  inside of that entry.
    pizzaIds.put(1, "Veggie Lovers");
    pizzaIds.put(2, "Margarita");
    pizzaIds.put(3, "BBQ Chicken" );

    // Prints out an element in the key-value pairs
    System.out.println(pizzaIds.get("BBQ Chicken"));

    // check to determine if there is a Meat lovers option available
    System.out.println(pizzaIds.containsKey("Meat Lovers"));

    // return the description value of the Veggie lovers pizza or name for ID 1:
    System.out.println(pizzaIds.containsValue("Veggie Lovers"));

```

**String Builder in Java**

because Strings are immutable the need to create and append a string will be required in order to create the final response string of our method. [GeekforGeeks Methods of StringBuilder](https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/). In order to get around this you have to create an object that allows for appending to the string object.. 

```java
// create an object to hold the string value 
StringBuilder str = new StringBuilder();
// add elements to the string builder object.
str.append("Added Elements to the string");
// display your creation
Syststem.out.println("Resulting Creation: " + str.toString()));

```

