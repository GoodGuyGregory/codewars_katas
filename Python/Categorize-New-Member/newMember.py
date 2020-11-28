# Kata: https://www.codewars.com/kata/5502c9e7b3216ec63c0001aa/train/python


def open_or_senior(data):
    memberRank = []
    for i in range(len(data)):
        # print(data[i][0])
        if data[i][0] >= 55 and data[i][1] > 7:
            memberRank.append("Senior")
        else:
            memberRank.append("Open")
    return memberRank

# Very Nice Solution


def openOrSeniorDefinedKeys(data):
    return ["Senior" if age >= 55 and handicap >= 8 else "Open" for (age, handicap) in data]


def main():
    # Examples
    # Input: [[18, 20],[45, 2],[61, 12],[37, 6],[21, 21],[78, 9]]
    print(open_or_senior(
        [[18, 20], [45, 2], [61, 12], [37, 6], [21, 21], [78, 9]]))

    # Expected Output:
    # ["Open", "Open", "Senior", "Open", "Open", "Senior"]


main()
