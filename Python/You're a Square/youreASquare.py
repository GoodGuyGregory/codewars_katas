# Kata: https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/python

import math


def is_square(n):
    if n < 0:
        return False
    else:
        if math.sqrt(n) % 1 == 0.0:
            return True
        else:
            return False


def main():
    # Examples:
    # -1  =>  false
    print(is_square(-1))

    #  0  =>  true
    print(is_square(0))

    #  3  =>  false
    print(is_square(-1))

    #  4  =>  true
    print(is_square(4))

    # 25  =>  true
    print(is_square(25))

    # 26  =>  false
    print(is_square(26))


main()
