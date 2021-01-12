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
    if (o > 2 and c > 0):
        while (c > 0 and o >= 1):
            c -= 1
            o -= 2
            co2 += 1
    if (c > 1 and h >= 4):
        while (c > 0 and h > 3):
            c -= 1
            h -= 4
            methane += 1
    print(water, co2, methane)

    #  co2, methane


def main():

    #  Example Provided:
    # (C,H,O) = burner(45,11,100) => (5,45,0)
    burner(45, 11, 100)

    #  Test Cases:
    # (C,H,O) = burner(354,1023230,0) => (0,0,354)
    burner(354, 1023230, 0)

    # (C,H,O) = burner(939,3,694) => (1,346,0)
    burner(939, 3, 694)

    #  Trouble cases:
    # When C02 was incorrect
    # (C,H,O) = burner(50,0,25) => (0,25,0)
    burner(26, 0, 52)

    # (C,H,O) = burner() => (199,0,22)
    burner(22, 486, 199)

    # (C,H,O) = burner() => (12,0,38)
    burner(38, 176, 12)


main()
