# Kata: https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/python


def number_to_string(num):
    # Return a string of the number here!
    numberConverted = str(num)
    return numberConverted


def main():
    # provided example:
    print(number_to_string(123))
    numConversion = number_to_string(123)
    print(type(numConversion))

    # TEST CASE:
    print(number_to_string(999))
    numConversion = number_to_string(999)
    print(type(numConversion))


main()
