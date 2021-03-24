# Kata: https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/python


def descending_order(num):
    # Bust a move right here
    while num % 10 != 0:
        value = num % 10
        num //= 10
        largest = 0
        if value > largest:
            largest = value


def main():
    # Test Cases:
    descending_order(42145)


main()
