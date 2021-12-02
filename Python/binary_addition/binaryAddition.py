# Kata https://www.codewars.com/kata/551f37452ff852b7bd000139/train/python


def add_binary(a, b):
    # replace removes the formatting from bin method
    return bin(a+b).replace("0b", "")


def main():
    # Test Cases:
    # "10"
    print(add_binary(1, 1))
    # "1"
    print(add_binary(0, 1))
    # "1"
    print(add_binary(1, 0))
    # "100"
    print(add_binary(2, 2))
    # "111111"
    print(add_binary(51, 12))


main()
