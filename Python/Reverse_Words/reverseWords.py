# Kata: https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/python
import re


def reverse_words(s):
    reversedWords = ""
    # Groups of Capital or lowercase letters with special chars included
    wordRegex = re.compile('([A-z|a-z|\S]+)')
    #  list of all the words found
    foundWords = wordRegex.findall(s)
    reversedWords = " ".join(reversed(foundWords))
    return reversedWords


def main():
    # "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The"
    print(reverse_words("The greatest victory is that which requires no battle"))


main()
