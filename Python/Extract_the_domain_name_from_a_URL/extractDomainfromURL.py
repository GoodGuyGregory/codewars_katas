# Kata: https://www.codewars.com/kata/514a024011ea4fb54200004b/train/python
import re

def domain_name(url):
    # create webRegex
    webRegex = re.compile(r'(http\s?)?(w{3})?(\w+)')
    # search the provided url
    mo = webRegex.findall(url)
    if len(mo) == 2:
        return mo[0][2]
    elif mo[1][2] != 'www':
        return mo[1][2]
    # case of www.<url>.<co|com|net|org>
    else:
        return mo[2][2]

# Test Cases:
# =======================================
# passing tests will return "google"
print(domain_name("http://www.google.com"))

# passing tests will return "google"
print(domain_name("http://google.com"))

# passing tests will return "google"
print(domain_name("http://google.co.jp"))

# passing tests will return "xakep"
print(domain_name("www.xakep.ru"))

# passing tests will return "youtube"
print(domain_name("https://youtube.com"))