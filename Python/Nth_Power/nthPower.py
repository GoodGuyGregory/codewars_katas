# Kata: https://www.codewars.com/kata/57d814e4950d8489720008db/train/python


def index(array, n):
    if len(array)-1 >= n and n >= 0:
        i = n
        NthPower = 1
        while(i > 0):
            if n != 0:
                NthPower *= array[n]
            i -= 1
        return NthPower
    else:
        return -1


def clever(array, n):
    #  use of Exceptions and Exponent Operator:
    try:
        return array[n]**n
    except:
        return -1


def main():
    #  Sample Tests:

    #  Should return 9
    print(index([1, 2, 3, 4], 2))
    #  Should return 1000000
    print(index([1, 3, 10, 100], 3))

    print(index([1, 2], 2))


main()
