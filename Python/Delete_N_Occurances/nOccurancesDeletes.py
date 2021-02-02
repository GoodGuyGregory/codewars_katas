# Kata: https://www.codewars.com/kata/554ca54ffa7d91b236000023


def delete_nth(order, max_e):
    maxDuplicates = max_e
    removals = []
    duplicates = 0
    for i in range(len(order)):
        element = order[i]
        remainingElements = order[i+1:len(order)]
        for j in range(len(remainingElements)):
            if element == remainingElements[j]:
                duplicates += 1
            if duplicates >= max_e:
                removals.append(1 + j)
                duplicates = 0
                break
    # prepare the list
    for k in removals:
        order.pop(k)
    return order


def main():
    #  provided examples:

    #  delete_nth ([1,1,1,1],2) # return [1,1]
    print(delete_nth([1, 1, 1, 1], 2))

    #   delete_nth ([20,37,20,21],1) # return [20,37,21]
    print(delete_nth([20, 37, 20, 21], 1))


main()
