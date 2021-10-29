# Kata: https://www.codewars.com/kata/514a024011ea4fb54200004b/train/python
import re

def domain_name(url):
    # create webRegex
    webRegex = re.compile(r'(https|http)?(w{3})?(\w+\-\w+|\w+)')
    # search the provided url
    mo = webRegex.findall(url)
    # <something>.com/<something>.org etc...
    if len(mo) == 2:
        # <something>.<something>
        # checking for accidental "www" finding
        if len(mo[0][2]) >= 3:
            return mo[0][2]
    # case of <somethingweird>.com/<somethingSubHeader>/<Subheader>
    elif mo[0][2] not in ['http','https','www','s']:
        return mo[0][2]
    # <http\s><something>.com|.org|.net 
    elif mo[1][2] != 'www':
        return mo[1][2]
    
    # case of www.<url>.<co|com|net|org>
    else:
        return mo[2][2]


def urlSubtractive(url):
    # uses a subtractive method to remove the elements
    # that match and will add them to a list
    return url.split("//")[-1].split("www.")[-1].split(".")[0]

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
print("Edge Cases:")
print("====================================")
# passsing value will return "hypeh-site"
print(domain_name("https://hyphen-site.org"))

# passing value will return "czyr0xejbmfqwy"
print(domain_name("czyr0xejbmfqwy.pro/warez/"))

# passing value will return "45sz411yv3y"
print(domain_name("45sz411yv3y.net/warez/"))

# passing value will return "msatdpeh5fv"
print(domain_name("msatdpeh5fv.de/error"))

# passing value wil return "37q0lk6p7yn1hce69ffxl4gqocsn"
print(domain_name("37q0lk6p7yn1hce69ffxl4gqocsn.jp/img/"))

print(domain_name("icann.org"))

print(domain_name("vlcjjv3r2t18w4cphkgwuzjdjfp1a.de"))

print(domain_name("sj5b3qm.br"))


# Subtractive Implementation 
# ================================

print(urlSubtractive("37q0lk6p7yn1hce69ffxl4gqocsn.jp/img/"))

print(urlSubtractive("icann.org"))

print(urlSubtractive("vlcjjv3r2t18w4cphkgwuzjdjfp1a.de"))

print(urlSubtractive("https://hyphen-site.org"))

# passing value will return "czyr0xejbmfqwy"
print(urlSubtractive("czyr0xejbmfqwy.pro/warez/"))

# passing value will return "45sz411yv3y"
print(urlSubtractive("45sz411yv3y.net/warez/"))

# passing tests will return "google"
print(urlSubtractive("http://google.com"))

# passing tests will return "google"
print(urlSubtractive("http://google.co.jp"))

# passing tests will return "xakep"
print(urlSubtractive("www.xakep.ru"))
