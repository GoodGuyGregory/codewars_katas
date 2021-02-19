# Kata: https://www.codewars.com/kata/554ca54ffa7d91b236000023


def delete_nth(order, max_e):
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
    removals.sort(reverse=True)

    for k in removals:
        order.pop(k)
    return order


def delete_nth_clever(order, max_e):
    ans = []
    for o in order:
        if ans.count(o) < max_e:
            ans.append(o)
    return ans


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

    print(delete_nth([8, 10, 10, 26, 8, 26, 10, 26, 26, 10, 8, 8, 26,
                      8, 26, 2, 10, 10, 8, 26, 8, 10, 26, 2, 26, 26], 2))

    #  should equal [19, 35, 19, 21, 19, 34, 35, 21, 21, 19, 35, 44, 19, 9, 39, 25, 35, 44, 44,
    #                   21, 25, 21, 39, 9, 35, 25, 39, 44, 44, 9, 39, 39, 9, 9, 25, 25, 34, 34]
    print(delete_nth([19, 35, 19, 21, 19, 34, 35, 21, 21, 19, 35, 44, 19, 9, 39, 25, 35, 19, 44, 44, 21, 25, 21, 39, 9, 35, 25, 39, 44,
                      44, 44, 44, 9, 35, 21, 21, 39, 44, 39, 9, 9, 25, 25, 44, 25, 19, 39, 19, 34, 34, 21, 39, 9, 25, 9, 39, 25, 21, 35, 9, 21, 19], 5))


main()
