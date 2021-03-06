## Pile of Cubes notes

Equations for Building and calculating volume of Pile:

m = number of cubes

Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.

You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?

The parameter of the function findNb (find_nb, find-nb, findNb) will be an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.

[Recurrance Relations and Summations Review](https://math.stackexchange.com/questions/1569860/how-to-find-formula-for-recursive-sequence-sum)

[Use Faulhaber's Identities Wikipedia](https://en.wikipedia.org/wiki/Faulhaber's_formula#Examples)

[Using Kotlin's Math Functions](https://www.ict.social/kotlin/basics/mathematical-functions-in-kotlin)

[Referencing Object Decorators](https://kotlinlang.org/docs/reference/object-declarations.html)

[Kotlin Grammars](https://kotlinlang.org/docs/reference/grammar.html#expression)