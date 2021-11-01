# Number of People in the Bus:

[Static Method Implementation](https://www.intertech.com/a-static-method-should-be-accessed-in-a-static-way/) Here static methods are illustrated to prevent *Dynamic Method Binding* through the reference of the Object type at runtime and not the refence of the Class Implementation at Runtime.

* [Lambda Expression Creation](https://www.youtube.com/watch?v=nUIAvs4OEkM) refer to this video if the lines in the Bus function are confusing.

There is also a way to implement this method by using a *"stream"* [Stream Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html) which is very similar in behavior to the `Linq` modules in C#

```java
  public static int countPassengers(ArrayList<int[]> stops) {
      
  return stops.stream()
                .mapToInt(x -> x[0] - x[1])
                .sum();
  }
```