# Kata: https://www.codewars.com/kata/514a024011ea4fb54200004b/train/python
import re

def domain_name(url):
    # create webRegex
    webRegex = re.compile(r'[(http://|https://)?(\w{3}|\w).(\w).(a-z)]')


# Test Cases:
# =======================================
# passing tests will return "google"
domain_name("http://google.com"), "google")

# passing tests will return "google"
domain_name("http://google.co.jp"), "google")

# passing tests will return "xakep"
domain_name("www.xakep.ru"), "xakep")

# passing tests will return "youtube"
domain_name("https://youtube.com"), "youtube")