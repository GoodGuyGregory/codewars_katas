#  Kata: https://www.codewars.com/kata/514b92a657cdc65150000006/train/python


def multipleThreeFive(number):
    if number <= 0:
        return 0
    else:
        sumOfMultiples = 0
        n = 1
        while n < number:
            if n % 3 == 0 or n % 5 == 0:
                sumOfMultiples += n
                n += 1
            else:
                n += 1
        return sumOfMultiples

#  Very Clever Solution:


def solution(number):
    return sum(x for x in range(number) if x % 3 == 0 or x % 5 == 0)


def main():
    #  Test Data:

    # should return the sum of it's multiples: 27
    print(multipleThreeFive(10))


main()
