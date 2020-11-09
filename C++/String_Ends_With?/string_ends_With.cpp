// Kata: https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/cpp
#include <iostream>

using namespace std;

// uses standard string header file
bool containsLetters(std::string const &str, std::string const &ending)
{
    //  see documentation for std:string::npos
    if (str.find(ending) != std::string::npos)
    {
        return true;
    }
    else
    {
        return false;
    }
}

bool solution(std::string const &str, std::string const &ending)
{
    if (str.find(ending, (str.length() - ending.length())) != std::string::npos)
    {
        return true;
    }
    else
    {
        return false;
    }
}
}

int main()
{
    // Examples:
    cout << solution("abcde", "cde") << endl; // returns true

    cout << solution("abcde", "abc") << endl; // returns false

    // Test for ending values of the strings:

    cout << solution("abc", "") << endl; // returns true
}