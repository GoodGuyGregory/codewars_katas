## Opposites Attract Notes:

because only one flower needs to be the opposite case, being either even or odd.
then return the case and type of the overall boolean operator.

```js
 return flower1 % 2 !== flower2 % 2;
```

this is the solution for checking the logic in the same fashion.
which is cleaner? you decide...

```js
  //  both even
    if ((flower1 % 2 == 0 && flower2 % 2 == 0) ||
        ((flower1 % 2 == 0) == false && (flower2 % 2 == 0) == false)) {
        return false;
    }
    //  either one is even or odd
    else if (((flower1 % 2 == 0) == false && (flower2 % 2 == 0) == true) ||
        ((flower1 % 2 == 0) == true && (flower2 % 2 == 0) == false)) {
        return true;
    }
```