# Kata - https://www.codewars.com/kata/5262119038c0985a5b00029f/train/python
# Ternary Operator - https://www.tutorialspoint.com/ternary-operator-in-python


def is_prime(num):
    if num <= 1:
        return False
    i = 2
    while i < num-1:
        if num == i:
            return True
        if num % i == 0:
            return False
        i += 1
    else:
        return True


def main():
    #   Examples:

    # is_prime(0) / * false * /
    print(is_prime(0))

    # is_prime(1) / * false * /
    print(is_prime(1))

    # is_prime(2) / * true * /
    print(is_prime(2))

    # is_prime(73) / * true * /
    print(is_prime(73))

    # is_prime(75) / * false * /
    print(is_prime(75))

    # is_prime(-1) / * false * /
    print(is_prime(-1))

    # is_primt(5099) /* true */
    print(is_prime(5099))

    # is_primt(5099) /* false */
    print(is_prime(1194159317))


main()
