## Simple String Characters Reference Notes:

[Regex in C++](https://www.softwaretestinghelp.com/regex-in-cpp/)

[Review of Vectors in C++](https://www.geeksforgeeks.org/vector-in-cpp-stl/)

[Additional Tutorials for Vectors in C++](https://www.bitdegree.org/learn/c-plus-plus-vector)


**Proposed Solution**

```c++
std::vector<int> solve(std::string s)
{
    // create vector to store matches
    std::vector<int> matches;

    // REGEXs for kata:
    regex lower("[a-z]+");
    regex caps("[A-Z]+");
    regex numbers("[0-9]+");
    regex spchars("[\\W]+");

    // Search string
    smatch sm;
    regex_search(s, sm, lower);

    // Gets the sub_match substring's elements size
    cout << sm.str().size() << endl;
    int lowercases = sm.str().size();

    // append to vector
    matches.push_back(lowercases);
    // return the vector
    return matches;
```