# Kata: https://www.codewars.com/kata/514a024011ea4fb54200004b/train/python
import re

def domain_name(url):
    # create webRegex
    webRegex = re.compile(r'[(http://|https://)?(\w{3}|\w).(\w).(a-z)]')

    # search the provided url
    for groups in webRegex.findall(url):
        

# Test Cases:
# =======================================
# passing tests will return "google"
domain_name("http://google.com")

# passing tests will return "google"
domain_name("http://google.co.jp")

# passing tests will return "xakep"
domain_name("www.xakep.ru")

# passing tests will return "youtube"
domain_name("https://youtube.com")