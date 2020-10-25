# Kata: https://www.codewars.com/kata/523f5d21c841566fde000009/train/python


def array_diff(a, b):
    c = []
    for i in range(len(a)):
        if a[i] not in b:
            c.append(a[i])
    return c


def main():

    #   Examples:

    # It should remove all values from list a, which are present in list b.
    # array_diff([1, 2], [1]) == [2]
    print(array_diff([1, 2], [1]))

    # If a value is present in b, all of its occurrences must be removed from the other:
    # array_diff([1, 2, 2, 2, 3], [2]) == [1, 3]

    print(array_diff([1, 2, 2, 2, 3], [2]))

    # If a value is present in b, all of its occurrences must be removed from the other:
    #array_diff([1,2,2], [1]) == [2, 2]

    print(array_diff([1, 2, 2], [1]))


main()
