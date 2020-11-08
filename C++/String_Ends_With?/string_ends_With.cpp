// Kata: https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/cpp
#include <cstring>

bool solution(std::string const &str, std::string const &ending)
{
    // if the string length is larger than a single char
    if (strlen(ending) == 1)
    {
        if ()
        {
            // found letter in string
            return true;
        }
        else
            // not found
            return false;
    }
    else
    {

        if (strstr(str, ending) != NULL))
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
    solution('abc', 'bc'); // returns true

    solution('abc', 'd'); // returns false
}