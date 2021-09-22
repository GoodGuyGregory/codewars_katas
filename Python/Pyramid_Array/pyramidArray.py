#  Kata: https://www.codewars.com/kata/515f51d438015969f7000013/train/python


def pyramid(n):
    container = list()
    i = 1
    if n == 0:
        return container
    j = 0
    while j != n:
        nestedContainer = []
        nestedContainer.append(i)
        for k in range(j):
            nestedContainer.append(i)
        container.append(nestedContainer)
        j += 1
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
    # should respond with three nested arrays [[1], [1, 1], [1, 1, 1], [1, 1, 1, 1]]
    print(pyramid(4))


main()
