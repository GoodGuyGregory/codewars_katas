# Kata: https://www.codewars.com/kata/514a024011ea4fb54200004b/train/python
import re

def domain_name(url):
    # create webRegex
    webRegex = re.compile(r'(http\s?)?(w{3})?(\w+)')
    # search the provided url
    mo = webRegex.findall(url)
    if len(mo) == 2:
        if len(mo[0][2]) <= 3:
            mo[0]
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

# Edge Case Failures:
# ======================================

# passsing value will return "hypeh-site"
print(domain_name("https://hyphen-site.org"))

# passing value will return "czyr0xejbmfqwy"
print(domain_name("czyr0xejbmfqwy.pro/warez/"))

# passing value will return "45sz411yv3y"
print(domain_name("45sz411yv3y.net/warez/"))

# passing value will return "msatdpeh5fv"
print(domain_name("msatdpeh5fv.de/error"))

# passing value wil return "37q0lk6p7yn1hce69ffxl4gqocsn"
print(domain_name(37q0lk6p7yn1hce69ffxl4gqocsn.jp/img/))