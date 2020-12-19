# Kata: https://www.codewars.com/kata/5556282156230d0e5e000089/python

# Solution:


def dna_to_rna(dna):
    rna = ''
    for letter in dna:
        if letter == 'T':
            rna += 'U'
        else:
            rna += letter
    return rna

#  Favorite Community Solution


def dna_RNA_FAV(dna):
    return dna.replace('T', 'U')


def main():
    #  TEST CASES:

    # "GCAT" => "GCAU"
    print(dna_to_rna("GCAT"))

    #  "TTTT" => "UUUU"
    print(dna_to_rna("TTTT"))

    # "GCAT" => "GCAU"
    print(dna_to_rna("GCAT"))

    # GACCGCCGCC => GACCGCCGCC
    print(dna_to_rna("GACCGCCGCC"))


main()
