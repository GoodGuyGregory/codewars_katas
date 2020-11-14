// Kata: https://www.codewars.com/kata/5a29a0898f27f2d9c9000058/train/cpp

#include <iostream>
#include <string>
#include <regex>
using namespace std;

std::vector<int> solve(std::string s)
{
    // create vector to store matches
    std::vector<int> matches;

    // REGEXs for kata:
    regex caps("[A-Z]+");
    regex lower("[a-z]+");
    regex numbers("[0-9]+");
    regex spchars("[\\W]+");

    // Search string for values
    smatch sm;

    regex_search(s, sm, caps);
    int uppers = sm.str().size();

    regex_search(s, sm, lower);
    int lowers = sm.str().size();

    // sm.suffix() : returns the remaining string sliced from regex results

    regex_search(s, sm, numbers);
    int nums = sm.str().size();

    regex_search(s, sm, spchars);
    int specials = sm.str().size();

    // append to vector
    matches.push_back(uppers);
    matches.push_back(lowers);
    matches.push_back(nums);
    matches.push_back(specials);

    // return the vector
    return matches;
}

int main()
{
    //  EXAMPLE:

    // Example 1:
    // solve("*'&ABCDabcde12345"); // = [ 4, 5, 5, 3 ]
    // --the order is : uppercase letters, lowercase, numbers and special characters.

    vector<int> example1 = solve("*'&ABCDabcde12345");
    cout << "The vector elements are: ";
    for (int i = 0; i < example1.size(); i++)
        cout << example1[i] << " ";
    cout << endl;

    // Example 2:
    // solve("Codewars@codewars123.com"); // = [ 1, 18, 3, 2 ]
    // --the order is : uppercase letters, lowercase, numbers and special characters.

    vector<int> example2 = solve("Codewars@codewars123.com");
    cout << "The vector elements are: ";
    for (int i = 0; i < example2.size(); i++)
        cout << example2[i] << " ";
    return 0;
}