# Kata: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/python


def duplicate_count(text):
     # for case insensitive
    text = text.lower()
    duplicates = []
    for i in range(len(text)):
        letter = text[i]
        textRemaining = text[i+1:len(text)]
        for k in textRemaining:
            if letter == k:
                if letter not in duplicates:
                    duplicates.append(letter)
    return len(duplicates)


def main():
    # TEST:
    # print(duplicate_count('Words'))

    # Kata Examples:
    print(duplicate_count("abcde"))
    print(duplicate_count("aabbcde"))
    print(duplicate_count("aabBcde"))
    print(duplicate_count("indivisibility"))
    print(duplicate_count("Indivisibilities"))
    print(duplicate_count("aA11"))
    print(duplicate_count("ABBA"))


main()
