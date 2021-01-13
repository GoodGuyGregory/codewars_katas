#  kata: https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/python


def get_count(input_str):
    num_vowels = 0
    vowels = ['a', 'e', 'i', 'o', 'u']
    for i in input_str:
        if i in vowels:
            num_vowels += 1
    return num_vowels


def main():
    print(get_count("abracadabra"))


main()
