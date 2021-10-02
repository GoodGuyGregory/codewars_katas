# Kata: https://www.codewars.com/kata/57eae65a4321032ce000002d/train/python


def fake_bin(x):
    fake_binary = ""
    for i in range(len(x)):
        if int(x[i]) < 5:
            fake_binary += "0"
        else:
            fake_binary += "1"
    return fake_binary


def main():

    # test cases:
    #  "01011110001100111"
    print(fake_bin("45385593107843568"))
    #   "101000111101101"
    print(fake_bin("509321967506747"))
    #  "011011110000101010000011011"
    print(fake_bin("366058562030849490134388085"))
    # "01111100",
    print(fake_bin("15889923"))
    # "100111001111"
    print(fake_bin("800857237867"))


main()
