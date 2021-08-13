# Kata: https://www.codewars.com/kata/580a094553bd9ec5d800007d/train/python
import random


def apple(x):
    x = int(x)
    if x ** 2 > 1000:
        return "It's hotter than the sun!!"
    else:
        return 'Help yourself to a honeycomb Yorkie for the glovebox.'


def main():

    for i in range(5):
        x = random.randint(0, 100)
        print('x: ' + str(x) + ' ' + apple(x))
        i += 1


main()
