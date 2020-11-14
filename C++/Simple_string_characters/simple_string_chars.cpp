// Kata: https://www.codewars.com/kata/5a29a0898f27f2d9c9000058/train/cpp

#include <iostream>
#include <string>
#include <regex>

using namespace std;

std::vector<int> solveWithREGEX(std::string s)
{
    // unsliced Version of incoming string
    string inputToSlice = s;
    // create vector to store matches
    std::vector<int> matches;

    // REGEXs for kata:
    regex caps("[A-Z]+");
    regex lower("[a-z]+");
    regex numbers("[0-9]+");
    regex spchars("[\\W]+");

    // Search string for values
    smatch sm;

    int uppers = 0;
    while (regex_search(s, sm, caps))
    {
        uppers += sm.str().size();
        s = sm.suffix().str();
    };
    // reassign inputValue
    s = inputToSlice;

    int lowers = 0;
    while (regex_search(s, sm, lower))
    {
        lowers += sm.str().size();
        s = sm.suffix().str();
    };
    // reassign inputValue
    s = inputToSlice;
    // sm.suffix() : returns the remaining string sliced from regex results

    int nums = 0;
    while (regex_search(s, sm, numbers))
    {
        nums += sm.str().size();
        s = sm.suffix().str();
    };
    s = inputToSlice;

    int specials = 0;
    while (regex_search(s, sm, spchars))
    {
        specials += sm.str().size();
        s = sm.suffix().str();
    };
    s = inputToSlice;

    // append values to vector
    matches.push_back(uppers);
    matches.push_back(lowers);
    matches.push_back(nums);
    matches.push_back(specials);

    // return the vector
    return matches;
}

std::vector<int> solve(std::string s)
{
    std::vector<int> v = {0, 0, 0, 0};
    for (char &ch : s)
    {
        // using Basic methods from the string class
        if (isupper(ch))
            v[0]++;
        else if (islower(ch))
            v[1]++;
        else if (isdigit(ch))
            v[2]++;
        else
            v[3]++;
    }
    return v;
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