# Kata: https://www.codewars.com/kata/58a6568827f9546931000027/train/python


def number_of_carries(a, b):
    # coding and coding..
    carries = 0
    if (len(str(a)) > len(str(b))):
        longest = str(a)
        shorter = str(b)[::-1]
        while len(shorter) < len(longest):
            shorter += '0'
    else:
        longest = str(b)
        shorter = str(a)[::-1]
        while len(shorter) < len(longest):
            shorter += '0'
    k = 0
    for n in reversed(longest):
        while k < len(shorter):
            print("n: %s k: %s" % (n, shorter[k]))
            if int(n) + int(shorter[k]) > 9:
                carries += 1
                prevCarried = True
            elif (carries > 0 and prevCarried == True):
                if int(n) + int(shorter[k]) + int(1) > 9:
                    carries += 1
                    prevCarried = True
                else:
                    prevCarried = False
            else:
                prevCarried = False
            k += 1
            break
    print("carries: %s" % carries)


def main():
    # Test Cases:
    # returns 0
    number_of_carries(543, 3456)
    # # returns 2
    number_of_carries(1927, 6426)
    # #  returns 4
    number_of_carries(9999, 1)
    # # returns 2
    number_of_carries(1234, 5678)
    # # returns 3
    number_of_carries(5234575, 2725716)


main()
