# Kata: https://www.codewars.com/kata/5547cc7dcad755e480000004?utm_source=newsletter


def remov_nb(n):
    values = []
    # your code
    #  sum all numbers to n
    summation = 0
    i = 1
    for i in range(1, n+1):
        summation += i
        print(summation)

    # determine divisors: 1 is implied to work and not be selected:
    for i in range(2, n):
        #  check if the two values work:
        for j in range(1, n):
            if i * j == summation - (i * j):
                # append to list:
                values.append((i, j))
                values.append((j, i))

    return values


def main():
    print(remov_nb(26))


main()
