# Kata: https://www.codewars.com/kata/5663f5305102699bad000056?utm_source=newsletter


def mxdiflg(a1, a2):
    # return -1 if either is empty
    if len(a1) == 0 or len(a2) == 0:
        return -1
    else:
        maxDifference = 0
        # iterate through the elements
        # determine the max difference
        for element_One in a1:
            for element_Two in a2:
                newMaxDifference = abs(len(element_One) - len(element_Two))
                if newMaxDifference > maxDifference:
                    maxDifference = newMaxDifference
    return maxDifference


def main():
    # example expressions
    # intial example:
    a1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa",
          "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
    a2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]

    #  the result should be 13
    print(mxdiflg(a1, a2))


main()
