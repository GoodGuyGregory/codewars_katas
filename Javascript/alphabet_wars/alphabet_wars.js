// Kata: https://www.codewars.com/kata/59377c53e66267c8f6000027/train/javascript

function alphabetWar(fight) {
    fight.toLowerCase();
    let lefts = {
        "w": 4,
        "p": 3,
        "b": 2,
        "s": 1
    };

    let rights = {
        "m": 4,
        "q": 3,
        "d": 2,
        "z": 1
    };

    let leftSide = 0;
    let rightSide = 0;
    for (let letter of fight) {

        if (lefts[letter]) {
            leftSide += lefts[letter];
        }
        else if (rights[letter]) {

            rightSide += rights[letter];
        }
    }

    if (rightSide > leftSide) {
        return "Right side wins!";
    }
    else if (rightSide < leftSide) {
        return "Left side wins!";
    }


    return "Let's fight again!";
}

//  Test Values:
//  Right side wins!
console.log(alphabetWar("z"));
// Let's fight again!
console.log(alphabetWar("zdqmwpbs"));
//  Right side wins!
console.log(alphabetWar("zzzzs"));
//  Left side wins!
console.log(alphabetWar("wwwwwwz"));

