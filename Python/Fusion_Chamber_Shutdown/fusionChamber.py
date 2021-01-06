# Kata: https://www.codewars.com/kata/5fde1ea66ba4060008ea5bd9/train/python

# Make sure you follow the order of reaction
# output should be H2O,CO2,CH4

#  Reaction Affinity:
# 1. Hydrogen reacts with Oxygen   = H2O
# 2. Carbon   reacts with Oxygen   = CO2
# 3. Carbon   reacts with Hydrogen = CH4


def burner(c, h, o):
    water = 0
    co2 = 0
    methane = 0
    while (h > 1 and o > 0):
        h -= 2
        o -= 1
        water += 1
    if (o > 2):
        while (c > 0 and o > 0):
            c -= 1
            o -= 2
            co2 += 1
    if (c > 1 and h > 4):
        while (c > 0 and h > 4):
            c -= 1
            h -= 4
            methane += 1
    print(water, co2, methane)

    #  co2, methane


def main():

    #  Example Provided:
    # (C,H,O) = (45,11,100) => (5,45,0)
    burner(45, 11, 100)

    #  Test Cases:


main()
