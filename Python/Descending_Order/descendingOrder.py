# Kata: https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/python


def descending_order(num):
    # Bust a move right here
    if num == 0:
        return num
    else:
        sortValues = []
        slicing = True
        while slicing == True:
            value = num % 10
            if num >= 10:
                num //= 10
                sortValues.append(value)
            else:
                sortValues.append(value)
                slicing = False

        sortValues.sort(reverse=True)
        desNumber = ''
        for i in range(len(sortValues)):
            desNumber += str(sortValues[i])
        return int(desNumber)


def main():
    # Test Cases:
    descending_order(0)

    descending_order(42145)

    descending_order(145263)

    descending_order(7164920)


main()
