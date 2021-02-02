# Kata: https://www.codewars.com/kata/554ca54ffa7d91b236000023


def delete_nth(order, max_e):
    maxDuplicates = max_e
    removals = []
    for i in range(len(order)):
        duplicates = 0
        element = order[i]
        remainingElements = order[i+1:len(order)]
        for j in range(len(remainingElements)):
            if element == remainingElements[j]:
                duplicates += 1
            if duplicates >= max_e:
                # append the index of the value right after the current index
                removals.append(order.index(
                    remainingElements[j], j))
                duplicates = 0

    # prepare the list
    # removal sort?
    for k in removals:
        order.pop(k)
    return order


def main():
    #  provided examples:

    #  delete_nth ([1,1,1,1],2) # return [1,1]
    print(delete_nth([1, 1, 1, 1], 2))

    #   delete_nth ([20,37,20,21],1) # return [20,37,21]
    print(delete_nth([20, 37, 20, 21], 1))

    #  additional examples:

    #  delete_nth([1,1,3,3,7,2,2,2,2], 3) # return [1, 1, 3, 3, 7, 2, 2, 2]
    print(delete_nth([1, 1, 3, 3, 7, 2, 2, 2, 2], 3))

    #  delete_nth([1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1],3)
    # # return [1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5]
    print(delete_nth([1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1], 3))


main()
