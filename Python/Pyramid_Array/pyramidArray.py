#  Kata: https://www.codewars.com/kata/515f51d438015969f7000013/train/python


def pyramid(n):
    # base case
    if n == 0:
        return []
    else:
        # recursive case
        container = list()
        i = 1
        while n > 0:
            nestedContainer = []
            if n == 1:
                nestedContainer.append(i)
                container.append(nestedContainer)
                return container
            else:
                j = 0
                while j < n:
                    nestedContainer.append(i)
                    j += 1
                container.append(nestedContainer)
                pyramid(n-1)
        return container


def main():

    #  test values:
    #  should respond with []
    print(pyramid(0))
    #  should respond with [[1]]
    print(pyramid(1))
    # should respond with a list of arrays as [[1],[1,1]]
    print(pyramid(2))
    # should respond with three nested arrays [[1], [1, 1], [1, 1, 1]]
    print(pyramid(3))


main()
