# Kata: https://www.codewars.com/kata/54e6533c92449cc251001667/train/python


def unique_in_order(iterable):
    unique = []
    if type(iterable) != list:
        iterableList = []
        #  adds items to a list
        for element in iterable:
            iterableList.append(element)
        value = ""
        for i in range(len(iterableList)):
            if value != iterableList[i]:
                value = iterableList[i]
                unique.append(iterableList[i])
    else:
        value = ""
        for i in range(len(iterable)):
            if value != iterable[i]:
                value = iterable[i]
                unique.append(iterable[i])

    return print(unique)


def main():
    #  TEST CASES:
    # 'AAAABBBCCDAABBB' => ['A', 'B', 'C', 'D', 'A', 'B']
    unique_in_order('AAAABBBCCDAABBB')

    # 'ABBCcAD' => ['A', 'B', 'C', 'c', 'A', 'D']
    unique_in_order('ABBCcAD')

    # [1,2,2,3,3] => [1,2,3]
    unique_in_order([1, 2, 2, 3, 3])


main()
